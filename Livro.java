public class Livro
{
    String codigoLivro, tituloLivro, categoria;
    int quantidade, emprestados;
    
    ArrayList<EmprestadoPara> historico;
    
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
    
    public void addUsuarioHist(GregorianCalendar dL, GregorianCalendar dD, int c)
    {
        // falta criar construtor EmprestadoPara
        EmprestadoPara objeto = new EmprestadoPara(dL, dD, c);
        // falta adicionar no historico
        
    }
}