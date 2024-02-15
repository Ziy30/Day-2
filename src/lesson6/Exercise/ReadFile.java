package lesson6.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

// ReadFile class extends ReadFileHandler
public class ReadFile extends ReadFileHandler {

    // Private member variable to store the filename
    private String filename;

    // Constructor to initialize the filename using superclass constructor
    public ReadFile(String fileName) {
        super(fileName);
    }

    // Method to print the contents of the file
    public void printFile() {
        // Create an instance of ReadFile using the filename obtained from the superclass
        ReadFile readFile = new ReadFile(super.getFilename());
        try (BufferedReader reader = readFile.readfileBuffer()) {
            String line;
            // Read each line from the file and print it
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle IOException by printing an error message
            System.err.println("Error in reading the file" + e.getMessage());
        }
    }

    // Method to create a BufferedReader for reading the file
    public BufferedReader readfileBuffer(){
        BufferedReader reader = null;
        // Obtain the file path using the filename
        Path filePath = Paths.get(super.getFilename());
        try {
            // Create a BufferedReader using FileReader with the file path
            reader = new BufferedReader(new FileReader(filePath.toString()));
        } catch (IOException e) {
            // Handle IOException by printing an error message
            System.err.println("Error in reading the file" + e.getMessage());
        }
        return reader;
    }
}