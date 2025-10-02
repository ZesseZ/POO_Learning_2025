package aula7;

public class Main {
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setAutor("Stewart");
		l1.setTitulo("Calculo II");
		l1.setAno(2020);
		
		Livro l2 = new Livro();
		l2.setAutor("Halliday");
		l2.setTitulo("Física III");
		l2.setAno(2020);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("Vera Lúcia");
		b1.getLivros().add(l1);
		b1.getLivros().add(l2);
		
		for(Livro livro : b1.getLivros()) {
			System.out.println(livro.getTitulo());
		}
	}
}
