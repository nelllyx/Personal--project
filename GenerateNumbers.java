import java.security.SecureRandom;

public class GenerateNumbers {

    public static void main(String... args) {
        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(11) + 10;

        int newNumber = 21 * 100 + (randomNumber % 100);

        System.out.println("Random 11-digit number: " + newNumber);
    }
}
