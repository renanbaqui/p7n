

public class Main
{
	public static void main(String[] args) {
		
		Usuario usu1 = new Usuario("Carlos", 1990, 8, 1, "Rua", 1546);
		usu1.addLivroHist(2012, 2, 3, 2012, 4, 4, 176);
		usu1.addLivroHist(2013, 1, 3, 2013, 2, 20, 150);
		
		Usuario usu2 = new Usuario("Felipe", 1991, 1, 21, "Avenida", 2696);
		usu2.addLivroHist(2011, 2, 3, 2011, 3, 18, 190);
		
		/*Emprestimo emp1 = new Emprestimo(2013, 1, 2, 2013, 2, 4, 177);
		System.out.println(emp1.toString());
		obj.add(obj2);
		
		System.out.println(obj.toString()); */
		
		Livro livro1 = new Livro("ABC", "Os Ventos", "Romance", 2, 1);
		livro1.addUsuarioHist(2010, 1, 10, 2011, 2, 7, 19);
		livro1.addUsuarioHist(2018, 1, 10, 2019, 2, 7, 94);
		
		Livro livro2 = new Livro("FGH", "As Nuvens", "Horror", 3, 3);
		
		//System.out.println(usu1.toString()); 
		//System.out.println(livro1.toString()); 
		
		
		Biblioteca bibli1 = new Biblioteca(usu1, livro1);
		
		bibli1.cadastraUsuario(usu2);
		bibli1.cadastraLivro(livro2);
		
		Livro livro3 = bibli1.getLivro("FGH");
		
		System.out.println(livro3.toString()); 
		
		//System.out.println(bibli1.imprimeLivros());
		//System.out.println(bibli1.imprimeUsuarios());
		
	}
}
