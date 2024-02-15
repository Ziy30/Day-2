package lesson6.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile extends ReadFileHandler {
    private String content;

    public AppendFile(String fileName, String content) {
        super(fileName);
        this.content = content;
    }

    public void Append(String fileName, String content) {

        try (
            FileWriter fileWriter = new FileWriter(super.getFilename(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            // Append the content to the file
            bufferedWriter.write(content);
            bufferedWriter.newLine(); // Add a new line after appending the content
            System.out.println("String appended to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error appending to the file: " + e.getMessage());
        }
    }

}
