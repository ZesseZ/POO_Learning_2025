package exemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class Main implements CommandLineRunner{
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Scanner leitura = new Scanner(System.in);
		Pessoa p = new Pessoa();
		p.setNome(leitura.next());
		p.setIdade(14);
		
		pessoaRepository.save(p);
	}

}
