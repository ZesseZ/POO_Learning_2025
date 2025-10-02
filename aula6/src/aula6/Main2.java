package aula6;

public class Main2 {

	public static void main(String[] args) {
		
		Endereco e2 = new Endereco();
		e2.setCep("9876345");
		e2.setLogradouro("Quadra 1008");
		e2.setNumero(3);
		
		String nome = "Ferdinando";
		
		Aluno a2 = new Aluno(nome, e2);
		
		System.out.println(a2.getNome());
		System.out.println(a2.getEndereco().getLogradouro());
		System.out.println(a2.getRA());
	}
}
