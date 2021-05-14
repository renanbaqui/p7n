public class Usuario extends Pessoa
{
    String endereco;
    int codigoUsuario;
    
    ArrayList<Emprestimo> historico;
    
    Usuario(String e, int c)
    {
        this.endereco = e;
        this.codigoUsuario = c;
    }
    
    // recebe a data de locação e o código do Livro emprestado
    // cria um objeto Empréstimo com estas informações e adiciona o mesmo no Histórico.
    public void addLivroHist(GregorianCalendar d, int c)
    {
        Emprestimo objeto = new Emprestimo(d, c);
        // falta adicionar no historico
    }
}