package LESSON.lesson6.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch extends ReadFileHandler {
    private String search;

    public WordSearch(String fileName, String search) {
        super(fileName);
        this.search = search;
    }

    public boolean wordSearch(String fileName, String search) {

        try (BufferedReader reader = new BufferedReader(new FileReader(super.getFilename()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the word
                if (line.contains(search)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return false;
    }

}
