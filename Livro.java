import java.util.*;

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
    
    public void add(EmprestadoPara e)    // metodo para adicionar objetos ao ArrayList interno    
    {
        this.historico.add(e);
    }
    
    public EmprestadoPara get(int i)     // metodo para resgatar objetos do ArrayList interno    
    {
        return this.historico.get(i);
    }
    
    public void empresta()
    {
        // empresta, que não recebe parâmetros e acerta o campo Emprestados. Caso todas as cópias estejam emprestadas,
        // deve levantar a exceção confirmada CopiaNaoDisponivelEx
    }
    
    public void devolve()
    {
        // devolve, que não recebe parâmetros e acerta o campo Emprestados. Caso nenhuma cópia tenha sido emprestada,
        // deve levantar a exceção NenhumaCopiaEmprestadaEx
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
    }
}