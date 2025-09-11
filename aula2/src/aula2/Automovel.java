package aula2;
import java.util.Scanner;
import java.util.Random;

public class Automovel {
	private int autonomia;
	private double preco;
	private String marca;
	private String modelo;
	private int ano;
	private int num;
	
	Scanner leitura = new Scanner(System.in);
	Random aleat = new Random();
	
	private String lerStringEmMaiusculas(String prompt) {
        System.out.println(prompt);
        return leitura.next().toUpperCase();
    }
	
	public void fichaTecnica(){
		System.out.println("\n\nMarca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Preço: " + preco);
		System.out.println("Autonomia: " + autonomia);
							
	}
	
	public void defineAutomovel() {
		marca = lerStringEmMaiusculas("\nInforme a marca do veículo: ");
		modelo = lerStringEmMaiusculas("\nInforme o modelo do veículo: ");
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

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
