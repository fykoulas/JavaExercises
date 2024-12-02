package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * υπάρχει ένας αριθμός SECRET και ο χρήστης προσπαθεί να τον βρεί με μια μόνο προσπάθεια
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert an integer to guess the SECRET: ");
        num = scanner.nextInt();


        if (num == SECRET) {
            System.out.println("Secret found!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("Secret not found");
        }


    }
}
