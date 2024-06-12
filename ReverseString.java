import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String reversed = "";

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                reversed = ch + reversed;
            }

            System.out.println("Reversed string: " + reversed);
        }
    }
    
}
