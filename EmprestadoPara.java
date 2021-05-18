import java.util.*;

public class EmprestadoPara
{
    GregorianCalendar dataEmprestimo, dataDevolucao;
    int codigoUsuario;
    
    EmprestadoPara(int anoE, int mesE, int diaE, int anoD, int mesD, int diaD, int c)
    {
        this.dataEmprestimo = new GregorianCalendar(anoE, mesE, diaE);
        this.dataDevolucao = new GregorianCalendar(anoD, mesD, diaD);
        this.codigoUsuario = c;
    }
    
        public String toString()
    {
        return  "Data de Emprestimo: " +    this.dataEmprestimo.get(Calendar.DATE) + "/" +
                                            this.dataEmprestimo.get(Calendar.MONTH) + "/" +
                                            this.dataEmprestimo.get(Calendar.YEAR)+ "\n" +
                "Data de Devolucao: "  +    this.dataDevolucao.get(Calendar.DATE) + "/" +
                                            this.dataDevolucao.get(Calendar.MONTH) + "/" +
                                            this.dataDevolucao.get(Calendar.YEAR)+ "\n" +
                "Codigo do Livro: " + this.codigoUsuario + "\n";
    }
}