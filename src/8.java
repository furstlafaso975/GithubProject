import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int max = 100;
        Random random = new Random();
        System.out.println("A random number between 1 and " + max + " is: " + random.nextInt(max));
    }
}