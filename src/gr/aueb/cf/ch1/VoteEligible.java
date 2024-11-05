package gr.aueb.cf.ch1;

import java.util.Scanner;

/**\
 * ελέγχει αν μπορείς να ψηφίσεις
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        boolean isEligible = false;

        System.out.println("Πόσο χρονών είσαι ρε μλκ;");
        age = in.nextInt();

        isEligible = age >=18;

        System.out.println("Μπορείς να ψηφίσεις;" + isEligible);
    }
}
