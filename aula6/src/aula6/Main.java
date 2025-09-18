package aula6;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Carlos");
		a1.setRA("87654345");
		
		Endereco e1 = new Endereco();
		e1.setCep("9876345");
		e1.setLogradouro("Quadra 1008");
		e1.setNumero(3);
		
		a1.setEndereco(e1);
		
		System.out.println(a1.getNome() + 
				" - " + 
				a1.getRA() + 
				" - " + 
				a1.getEndereco().getLogradouro());
	}
}