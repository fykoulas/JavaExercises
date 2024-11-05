package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Controls if an integer is artios.
 */
public class IsEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isEven = false;

        System.out.println("Insert number: ");
        num = scanner.nextInt();

        //is Even
        isEven = (num % 2) == 0;

        System.out.printf("%d is even: %b!", num, isEven);
    }
}
