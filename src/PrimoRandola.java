import java.util.Random;
import java.util.Scanner;

public class PrimoRandola extends PrimoVerifier {
    Scanner leitura = new Scanner(System.in);
    Random aleat = new Random();

    void numerosAleatorios() {
        int a;
        int b ;
        int c;
        int roleta;
        System.out.println("Informe quantos números você deseja analisar aleatoriamente: ");
        a = leitura.nextInt();
        c = a;
        System.out.println("Informe o termo máximo para verificar. Ex: 10 irá gerar um termo entre 0 e 10");
        b = leitura.nextInt();
        for (int i = 0; i < 1 + a; i++) {
            roleta = aleat.nextInt(b);
            System.out.println("\n" + roleta);
                verificadorPrimo(roleta);
            }
        }
    }
