import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt((10 - 5) + 1) + 5;
        System.out.println("Random number: " + num);
    }
}
