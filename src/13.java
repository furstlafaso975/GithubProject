import java.util.Random;
class RandomCode {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);
		System.out.println("Your random number is: " + x);
	}
}