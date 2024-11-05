package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Ypologisei to athroisma ton psifion enos akeraiou
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        System.out.println("Enter a positive integer: ");
        num = in.nextInt();

        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10;       // Remove the last digit
        }

        System.out.println("The sum of digits of " + num + " is: " + sum) ;
    }

}
