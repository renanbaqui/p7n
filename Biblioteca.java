import java.io.*;
import java.util.*;

public class Biblioteca
{
    // campo para o cadastro de usuários contendo um objeto da classe java.util.Hashtable
    Hashtable<Integer, Usuario> ht1 = new Hashtable();
    // um campo para o cadastro de livros contendo um objeto da classe java.util.Hashtable.
    Hashtable<String, Livro> ht2 = new Hashtable();
    
    // construtor que inicialize todos os campos - OK!
    Biblioteca(Usuario u, Livro l)
    {
        this.ht1.put(u.getCodigoUsuario(), u);
        this.ht2.put(l.getCodigoLivro(), l);
    }
    
    //um construtor que carregue o cadastro de usuários e o cadastro de livros salvos em dois arquivos distintos
    /*Biblioteca()
    {
        // carregar arquivos
        this.ht1.put(u, l);
    }*/
    // cadastraUsuário: de retorno void, que recebe como parâmetro um objeto da classe Usuário e o armazena 
    // no objeto Hashtable correspondente. O código do usuário deve ser utilizado como chave - OK!
    public void cadastraUsuario(Usuario u)
    {
        this.ht1.put(u.getCodigoUsuario(), u);
    }
    
    // cadastraLivro: de retorno void, recebe como parâmetro um objeto da classe Livro e
    // o armazena no objeto Hashtable correspondente; O código do Livro deve ser usado como chave - OK
    public void cadastraLivro(Livro l)
    {
        this.ht2.put(l.getCodigoLivro(), l);
    }
    // salvaArquivo: de retorno void, recebe como parâmetros um objeto da classe Hashtable 
    // (que pode ser o cadastro de usuários ou o acervo de livros) e um objeto da classe 
    // String contendo o nome do arquivo onde o outro parâmetro será salvo
    public void salvaArquivo(Hashtable obj, String n)
    {
        
    }
    
    // lêArquivo: de retorno void, recebe como parâmetros um objeto da classe String contendo o 
    // nome do arquivo a ser lido (como o construtor, mas que pode ser chamado a qualquer hora, 
    // e lê somente o acervo de livros ou o cadastro de usuários);
    public void leArquivo(String n)
    {
       
    }
    // emprestaLivro: recebe como parâmetros a referência a um objeto Usuário e a referência a um 
    // objeto da classe Livro. (as referências já devem ter sido validadas – obtidas através dos métodos 
    // getLivro e getUsuário – veja observação abaixo). Chama o método empresta no objeto Livro e atualiza 
    // o histórico no objeto Usuário chamando addLivroHist. A data do empréstimo é obtida consultando o 
    // relógio/calendário do sistema no momento da operação;
  /*  public void emprestaLivro(Usuario u, Livro u??)
    {
       
    }*/
    
    
    // devolveLivro: o mesmo definido para o método anterior, só que chama o método devolve no 
    // objeto Livro. Aqui, no entanto, se você implementou a personalização direito, pode ser 
    // verificado se o usuário está devolvendo o livro com atraso e avisar de uma multa;
   /* public void devolveLivro(Usuario u, Livro u??)
    {
       
    }*/
    
    // String imprimeLivros(): Devolve uma string com a lista de livros cadastrados, ordenados pelo título; - OK!
    public String imprimeLivros()
    {
        return  "Livros: \n" + 
                this.ht2;
    }

    // String imprimeUsuários(): Devolve uma string com a lista de usuários cadastrados, ordenados pelo nome; - OK!
    public String imprimeUsuarios()
    {
        return  "Usuarios: \n" + 
                this.ht1;
    }
    // Livro getLivro (String cód): Recebe o código do livro e obtém o objeto Livro da Hashtable correspondente. 
    // Se o livro não estiver cadastrado, deve gerar a exceção LivroNaoCadastradoEx; - PARCIALMENTE OK!
    public Livro getLivro(String cod)
    {
        //if (ht2.containsKey(cod)) 
        //{
            Livro l = ht2.get(cod);
            return l;
        //}
        /*else
        {
            // gerar excecao;
        } */   
    }
    // Usuário getUsuário (int cód): Recebe o código do usuário e obtém o objeto Usuário da Hashtable correspondente. 
    // Se o usuário não existir na Hashtable, deve gerar a exceção UsuárioNaoCadastradoEx. - PARCIALMENTE OK!
    public Usuario getUsuario(int cod)
    {
        //if (ht1.containsKey(cod)) 
        //{
            Usuario u = ht1.get(cod);
            return u;
        //}
        /*else
        {
            // gerar excecao;
        }*/    
    }
}