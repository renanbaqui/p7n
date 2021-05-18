import java.util.*;

public class Pessoa
{
    String nome;
    GregorianCalendar dataNascimento; 
    
    Pessoa(String n, int ano, int mes, int dia)
    {
        this.nome = n;
        this.dataNascimento = new GregorianCalendar(ano, mes, dia);
    }
    
    public String getNome(){ return this.nome; }
    
    public GregorianCalendar getDataNascimento(){ return this.dataNascimento; }
    
    public String toString()
    {
        return  "Nome: " + this.nome + "\n" +
                "Data de Nascimento: " +    this.dataNascimento.get(Calendar.DATE) + "/" +
                                            this.dataNascimento.get(Calendar.MONTH) + "/" +
                                            this.dataNascimento.get(Calendar.YEAR);
    }
}