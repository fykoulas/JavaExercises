package gr.aueb.cf.ch1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Πρόγραμμα Μετατροπής Fahrenheit σε Celsius");
        System.out.print("Βάλτε τους βαθμούς Fahrenheit: ");
        int fahrenheit = in.nextInt();
        double result = (fahrenheit - 32) / 1.8;

        System.out.printf("Οι βαθμοί Celsius είναι: %.1f°C", result);
    }
}
