import java.util.Random;

public class GeneradorAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            int randomNumber = random.nextInt(101); // Números entre 0 y 100
            System.out.println(randomNumber);
            
        }
        System.out.println("Fin");
    }
}
