package lesson6.Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptor {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Decryption method
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // Decryption is the inverse operation of encryption
    }

    // Method to encrypt the content of a file and write it to another file
    public static void encryptFile(String inputFile, String outputFile, int shift) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String encryptedLine = encrypt(line, shift);
                writer.write(encryptedLine);
                writer.newLine();
            }
            System.out.println("File encrypted successfully.");
        } catch (IOException e) {
            System.err.println("Error encrypting the file: " + e.getMessage());
        }
    }

    // Method to decrypt the content of an encrypted file and print it to the console
    public static void decryptFile(String inputFile, int shift) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String decryptedLine = decrypt(line, shift);
                System.out.println(decryptedLine);
            }
        } catch (IOException e) {
            System.err.println("Error decrypting the file: " + e.getMessage());
        }
    }

}
