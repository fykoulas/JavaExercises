package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Sum of all artioi up to number x
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = 0;
        int num = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Give me the upper limit: ");
        limit = in.nextInt();

        while (i <=limit) {
            sum = sum + i;
            i = i + 2;
        }

        System.out.println("The sum of even numbers up to " + limit + " is " + sum + " including " + limit);


    }
}
