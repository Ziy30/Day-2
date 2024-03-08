package LESSON.lesson6.Exercise;

import java.io.BufferedReader;
import java.util.Scanner;

import LESSON.lesson6.SOCKET.CopyFile;

public class Main {

    static String filename = "C:\\Users\\USER\\App\\bin\\lesson6\\Exercise\\TextFile.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Readfile & print the file
        ReadFile readFile = new ReadFile(filename);
        readFile.printFile();
        // Count words
        CountWords countWords = new CountWords(filename);
        int count = countWords.countWords();
        System.out.println("Length of words: " + count);
        // Write File
        WriteFile writeFile = new WriteFile(filename);
        writeFile.write("Write some text \n Write some more text");
        readFile.printFile();

        //Copy File
        String outputFileName = "output.txt";
        CopyToFile copy = new CopyToFile(filename, outputFileName);
        copy.copyFile(filename, outputFileName);

        //Append into File
        System.out.println("Enter the string to append to the file:");
        String stringToAppend = scanner.nextLine();
        
        AppendFile appendFile = new AppendFile(filename, stringToAppend);
        appendFile.Append(filename, stringToAppend);
        
        //Word Search
        System.out.print("Enter a word to search in the file: ");
        String wordToSearch = scanner.nextLine();

        WordSearch wordSearch = new WordSearch(filename, wordToSearch);
        boolean word = wordSearch.wordSearch(filename, wordToSearch);

        if (word) {
            System.out.println("The word '" + wordToSearch + "' exists in the file.");
        } else {
            System.out.println("The word '" + wordToSearch + "' does not exist in the file.");
        }

        //Deleting File 
        System.out.print("Enter File to delete : ");
        String dFile = scanner.nextLine();
        DeleteFile delete = new DeleteFile();
        delete.deleteFile(dFile);

        //File Size
        System.out.print("Enter File to calculate length : ");
        String sFile = scanner.nextLine();
        System.out.println("Size of the file '" + sFile + "': " + sFile.length() + " bytes");
        
        //Encrypt & Decrypt File
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.txt";
        int shift = 3; // Example shift value for encryption

        // Encrypt the content of the input file and write it to the encrypted file
        FileEncryptor.encryptFile(inputFile, encryptedFile, shift);
        // Decrypt the content of the encrypted file and print it to the console
        FileEncryptor.decryptFile(encryptedFile, shift);








    }
}