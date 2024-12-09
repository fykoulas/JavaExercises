package gr.aueb.cf.ch9;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA1Hasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to hash: ");
        String input = scanner.nextLine();

        // Generate SHA-1 hash
        try {
            String sha1Hash = generateSHA1Hash(input);
            System.out.println("SHA-1 Hash is: " + sha1Hash);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-1 algorithm not found!");
        }

        scanner.close();
    }

    public static String generateSHA1Hash(String input) throws NoSuchAlgorithmException {
        // Create a MessageDigest instance for SHA-1
        MessageDigest md = MessageDigest.getInstance("SHA-1");

        // Update the digest with the input bytes
        md.update(input.getBytes());

        // Perform the hash computation
        byte[] digest = md.digest();

        // Convert the byte array to a hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            hexString.append(String.format("%02x", b));
        }

        return hexString.toString();
    }
}
