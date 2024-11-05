import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the integer
        int reversed = 0;
        int temp = Math.abs(number); // Use absolute value to handle negative numbers

        while (temp != 0) {
            int digit = temp % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Add it to the reversed number
            temp /= 10; // Remove the last digit
        }

        // Adjust the sign if the original number was negative
        if (number < 0) {
            reversed = -reversed;
        }

        // Display the result
        System.out.println("The reversed integer is: " + reversed);

        scanner.close();
    }
}
