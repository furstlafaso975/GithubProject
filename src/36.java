public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Example 1: Generate a long random number between 0 and 999999999 (2^7)
        int randomNumber = (int)(Math.random() * 999999999);
        
        // Example 2: Generate a string of random letters
        String letterRandoms = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomLetter = letterRandoms.charAt(Math.abs(randomNumber % 100)) + letterRandoms.substring(1, 5);
        
        System.out.println("Long Random Number: " + randomNumber);
        System.out.println("Random Letter: " + randomLetter);
    }
}
