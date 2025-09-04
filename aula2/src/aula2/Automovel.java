package aula2;
import java.util.Scanner;
import java.util.Random;

public class Automovel {
	public int autonomia;
	public double preco;
	public String marca;
	public String modelo;
	public int ano;
	public int num;
	
	Scanner leitura = new Scanner(System.in);
	Random aleat = new Random();
	public void fichaTecnica(){
		System.out.println("\n\nMarca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Preço: " + preco);
		System.out.println("Autonomia: " + autonomia);
							
	}
	
	public void defineAutomovel() {
		System.out.println("\nInforme a marca do veículo: ");
		marca = leitura.next();
		System.out.println("\nInforme o modelo do veículo: ");
		modelo = leitura.next();
		System.out.println("\nInforme o ano do veículo: ");
		ano = leitura.nextInt();
		System.out.println("\nInforme o preço do veículo: ");
		preco = leitura.nextDouble();
		System.out.println("\nInforme a autonomia do veículo: ");
		autonomia = leitura.nextInt();
		
		
		fichaTecnica();
	}
	
	public void ligar() {
		System.out.println("\n\nO automóvel está ligado");
	}
	
	public void ligar(boolean usouAfogador) {
		//num = aleat.nextInt(10);
		//if(num > 6) {
			//usouAfogador = false;
		//}else {
			//usouAfogador = true;
		//}
		if(usouAfogador) {
			System.out.println("\n\nO veículo ligou!");
		}else {
			System.out.println("\n\nO veículo não ligou...");
		}
	}
	
	public void Som() {
		System.out.println("som");
	}
}
