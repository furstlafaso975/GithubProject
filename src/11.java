import java.util.Random;
public class GithubProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10);
        System.out.println("The random number is: " + number);
    }
}