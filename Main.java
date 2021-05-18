

public class Main
{
	public static void main(String[] args) {
		
		Usuario obj = new Usuario("Carlos", 1990, 8, 1, "Rua", 9738963);
		
		obj.addLivroHist(2012, 2, 3, 2014, 1, 4, 176);
		
		Emprestimo obj2 = new Emprestimo(2013, 1, 2, 2013, 2, 4, 177);
		System.out.println(obj2.toString());
		obj.add(obj2);
		
		System.out.println(obj.toString()); // consertar historico toString
		
		/*Livro obj1 = new Livro("ABC", "Os Ventos", "Romance", 2, 1);
		
		obj1.addUsuarioHist(2010, 1, 10, 2011, 2, 7, 221);
		//obj1.addUsuarioHist(2018, 1, 10, 2019, 2, 7, 222);
		
		System.out.println(obj1.toString());*/ // historico desse toString nao funciona
		
		
		
	}
}
