
import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse:");
        String input = getString("   It should be a non-empty string.");
        
        // ADD CODE TO COMPLETE THE MAIN
        // 1. Create a LinkedStack<Character>
        // 2. Push each character of the input string onto the stack
        // 3. Pop each character off the stack to build the reversed string
        // 4. Print the original and reversed strings
    }

    private static String getString(String prompt) {
        Scanner input;
        String result = "default"; // Default value
        try {
            input = new Scanner(System.in);
            System.out.println(prompt);
            result = input.nextLine();
            if (result.isEmpty()) {
                System.out.println("Empty input received. Will use 'default' as the default value.");
                result = "default";
            }
        } catch (Exception e) {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 'default' as the default value");
        }
        return result;
    }
}