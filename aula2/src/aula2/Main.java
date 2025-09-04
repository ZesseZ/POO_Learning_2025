package aula2;

public class Main {
	public static void main(String[]args) {
		Carro c1 = new Carro();
		c1.defineAutomovel();
		c1.Som();
		c1.ligar(true);
		Moto m1 = new Moto();
		m1.defineAutomovel();
		m1.Som();
		m1.ligar(false);
	}
}
