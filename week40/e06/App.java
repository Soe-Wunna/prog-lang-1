import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Palindrome test, please enter some text:");
            String userInput = scanner.nextLine();
            
            if (isPalindrome(userInput)) {
                System.out.println(userInput + " is a palindrome");
            } else {
                System.out.println(userInput + " is not a palindrome");
            }
            
            System.out.println();
        }
    }
    
    public static boolean isPalindrome(String text) {
        
        String normalizedText = text.toLowerCase();
        
        normalizedText = normalizedText.replaceAll("[^a-z0-9]", "");
        
        String reversedText = new StringBuilder(normalizedText).reverse().toString();
        
        return normalizedText.equals(reversedText);
    }
}