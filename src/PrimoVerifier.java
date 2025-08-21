

public class PrimoVerifier {
    public boolean verificadorPrimo(int numero){
        if(numero <= 0){
            System.out.println("\nO número não é primo!");
        }
        for (int i = 2; i < numero; i++) {
            if(numero % i == 0){
                System.out.println("\nO número não é primo!");
                return false;
            }
        }
        System.out.println("\nO número é primo");
        return true;
        }
    }
