import java.util.Random;

public class Main {
    public static void main(String[] args) {



        Random random = new Random();

        int randomNumber = random.nextInt(-1, 1);

        try {
            int j = 10 / randomNumber;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Random number: " + randomNumber);
        }

    }

}