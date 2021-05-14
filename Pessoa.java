public class Pessoa
{
    String nome;
    GregorianCalendar dataNascimento; //data de nascimento
    
    Pessoa(String n, GregorianCalendar d)
    {
        this.nome = n;
        this.dataNascimento = d;
    }
    
    public String toString()
    {
        return  "Nome: " + this.nome + "\n" +
                "Data de Nascimento: " + this.dataNascimento;
    }
    
}