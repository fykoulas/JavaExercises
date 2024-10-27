package gr.aueb.cf.ch1;

public class BasicMath {
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 30;
        int sum = 0;
        int sub = 0;

        sum = num1 + num2;
        sub = num2 - num1;
        System.out.println("Το άθροισμα των " + num1 + " και " + num2 + " είναι " + sum);
        System.out.printf("Αν αφαιρέσουμε το %d από το %d, το αποτέλεσμα είναι %d", num1, num2, sub);
    }
}
