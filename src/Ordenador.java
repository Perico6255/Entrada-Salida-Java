import java.util.ArrayList;
import java.util.Scanner;


public class Ordenador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        String linea= scanner.nextLine();
        int i = 0;
        while (!linea.equals("Fin")) {
            i++;

            number = Integer.parseInt(linea);
            System.out.println("["+i+"]Recibido desde la entrada estándar : " + number);
            numbers.add(number);
            linea = scanner.nextLine();
        }
        numbers.sort(null);
        System.out.println("-------ARRAY ORDENADO--------");
        System.out.println("{");
        for (int j = 0; j < numbers.size(); j++) {
            System.out.println(numbers.get(j));
        }
        System.out.println("}");

    

        scanner.close();
        
    }
}
