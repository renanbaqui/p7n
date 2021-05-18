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
}