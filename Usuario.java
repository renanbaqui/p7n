import java.util.*;

public class Usuario extends Pessoa
{
    String endereco;
    int codigoUsuario;
    
    public ArrayList<Emprestimo> historico = new ArrayList<Emprestimo>();
    
    Usuario(String n, int ano, int mes, int dia, String e, int c)
    {
        super(n, ano, mes, dia); 
        this.endereco = e;
        this.codigoUsuario = c;
    }
 
    public void add(Emprestimo e)    // metodo para adicionar objetos ao ArrayList interno    
    {
        this.historico.add(e);
    }
    
    
    public Emprestimo get(int i)     // metodo para resgatar objetos do ArrayList interno    
    {
        return this.historico.get(i);
    }
    
    public String getEndereco(){ return this.endereco; }
    
    public int getCodigoUsuario(){ return this.codigoUsuario; }
    
    public ArrayList<Emprestimo> getHistorico(){ return this.historico; }
    
    // recebe a data de locação e o código do Livro emprestado
    // cria um objeto Empréstimo com estas informações e adiciona o mesmo no Histórico.
    public void addLivroHist(int anoE, int mesE, int diaE, int anoD, int mesD, int diaD, String c)
    {
        Emprestimo objeto = new Emprestimo(anoE, mesE, diaE, anoD, mesD, diaD, c);   // VERIFICAR!
        add(objeto);
    }
    
    public String toString()
    {
        
        return  super.toString() + "\n" +
                "Endereco: " + this.endereco + "\n" + 
                "Codigo: "+ this.codigoUsuario + "\n" +
                "Historico: " + "\n" + 
                //this.historico.get(0);
                Arrays.toString(this.historico.toArray());
    }
    
}