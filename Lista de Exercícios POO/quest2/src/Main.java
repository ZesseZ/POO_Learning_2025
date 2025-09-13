import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        ArrayList<String> numbers2 = new ArrayList<String>();
        int j = 0;numbers.add(leitura.next());
        numbers.add(leitura.next());
        numbers.add(leitura.next());
        numbers.add(leitura.next());
        numbers.add(leitura.next());
        numbers.add(leitura.next());
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.contains(numbers.get(i))){
            }else {
                numbers2.add(i, numbers.get(i));
        }
        System.out.println(numbers2.size());
        }
    }
}
