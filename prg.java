import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Print Hello, World!
        System.out.println("Hello, User!");
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to Java.");
        
        // Close the scanner
        scanner.close();
    }
}

