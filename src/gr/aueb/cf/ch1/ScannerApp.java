package gr.aueb.cf.ch1;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.print("Enter your height in cm: ");
        double height = in.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");

        in.close();
    }
}
