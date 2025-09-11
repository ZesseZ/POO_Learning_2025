package aula5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		ArrayList<String> disciplinas = new ArrayList<String>();
		System.out.println("Informe três nomes: ");
		disciplinas.add(leitura.next());
		disciplinas.add(leitura.next());
		disciplinas.add(leitura.next());
		System.out.println(disciplinas);
		System.out.println(disciplinas.get(2));
		disciplinas.set(2, "Carlos el topo que gira");
		System.out.println(disciplinas);
		disciplinas.remove(2);
		System.out.println(disciplinas);
		
	for( int i = 0; i < disciplinas.size(); i++) {
		System.out.println(disciplinas.get(i));
		
		}
	if(disciplinas.contains("João")) {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		}
	}
}
