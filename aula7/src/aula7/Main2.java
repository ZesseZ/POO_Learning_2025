package aula7;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
			
		Livro l1 = new Livro();
		l1.setAutor("Stewart");
		l1.setTitulo("Calculo II");
		l1.setAno(2020);
			
		Livro l2 = new Livro();
		l2.setAutor("Halliday");
		l2.setTitulo("Física III");
		l2.setAno(2020);
		
		ArrayList<Livro> ls = new ArrayList<Livro>();
		ls.add(l1);
		ls.add(l2);
			
		Biblioteca b1 = new Biblioteca(ls);
		b1.setNome("Vera Lúcia");
			
		for(Livro livro : b1.getLivros()) {
				System.out.println(livro.getTitulo());
		}
	}
}
