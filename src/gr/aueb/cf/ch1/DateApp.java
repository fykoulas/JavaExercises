package gr.aueb.cf.ch1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Δώστε την ημέρα: ");
        int day = in.nextInt();

        System.out.println("Δώστε το μήνα: ");
        int month = in. nextInt();

        System.out.println("Δώστε το έτος: ");
        int year = in. nextInt();

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);

    }
}
