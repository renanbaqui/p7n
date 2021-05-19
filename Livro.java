import java.util.*;
import java.lang.*;


class CopiaNaoDisponivelEx 
  extends RuntimeException {
    public CopiaNaoDisponivelEx(String errorMessage) {
        super(errorMessage);
    }
}

class NenhumaCopiaEmprestadaEx 
  extends RuntimeException {
    public NenhumaCopiaEmprestadaEx(String errorMessage) {
        super(errorMessage);
    }
}

public class Livro
{
    String codigoLivro, tituloLivro, categoria;
    int quantidade, emprestados;
    
    public ArrayList<EmprestadoPara> historico = new ArrayList<EmprestadoPara>();
    
    // Um construtor que inicializa todos os seus campos
    Livro(String cod, String t, String cat, int q, int e)
    {
        this.codigoLivro = cod;
        this.tituloLivro = t;
        this.categoria = cat;
        this.quantidade = q;
        this.emprestados = e;
    }
    
    //Um construtor que recebe como parâmetro um objeto String e inicializa o campo do Título do Livro.
    Livro(String t)
    {
        this.tituloLivro = t;
    }
    
    public String getCodigoLivro(){ return this.codigoLivro; }
    
    public String getTituloLivro(){ return this.tituloLivro; }
    
    public String getCategoria(){ return this.categoria; }
    
    public int getQuantidade(){ return this.quantidade; }
    
    public int getEmprestados(){ return this.emprestados; }
    
    public ArrayList<EmprestadoPara> getHistorico(){ return this.historico; }
    
    public void add(EmprestadoPara e)    // metodo para adicionar objetos ao ArrayList interno    
    {
        this.historico.add(e);
    }
    
    public EmprestadoPara get(int i)     // metodo para resgatar objetos do ArrayList interno    
    {
        return this.historico.get(i);
    }
    
    // empresta, que não recebe parâmetros e acerta o campo Emprestados. Caso todas as cópias estejam emprestadas,
    // deve levantar a exceção confirmada CopiaNaoDisponivelEx - OK!
    public void empresta()
    {
        if (this.quantidade == this.emprestados)
        {
            throw new CopiaNaoDisponivelEx("Todas as copias estao emprestadas.");
        }
    }
    
    // devolve, que não recebe parâmetros e acerta o campo Emprestados. Caso nenhuma cópia tenha sido emprestada,
    // deve levantar a exceção NenhumaCopiaEmprestadaEx
    public void devolve()
    {
        if (this.emprestados == 0)
        {
            throw new NenhumaCopiaEmprestadaEx("Nenhuma copia emprestada.");
        }
    }
    
    public void addUsuarioHist(int anoE, int mesE, int diaE, int anoD, int mesD, int diaD, int c)
    {
        EmprestadoPara objeto = new EmprestadoPara(anoE, mesE, diaE, anoD, mesD, diaD, c);
        add(objeto);
    }
    
    public String toString()
    {
        return  "Codigo do Livro: " + this.codigoLivro + "\n" + 
                "Titulo do Livro: "+ this.tituloLivro + "\n" +
                "Categoria: " + this.categoria + "\n" +
                "Quantidade: " + this.quantidade + "\n" +
                "Emprestados: "+ this.emprestados + "\n" +
                "Historico: " + "\n" + this.historico;
               // Arrays.toString(this.historico;.toArray());
    }
}