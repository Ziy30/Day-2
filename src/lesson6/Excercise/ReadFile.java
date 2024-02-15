package lesson6.Excercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void ReadingFile(String readFile) {

        try {

            FileReader fileReader = new FileReader(readFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
          
            String readLine;
            int countWord = 0;

            while ((readLine = bufferedReader.readLine()) != null) {
                System.err.println(readLine);
                String[] words = readLine.split("\s+");
                countWord += words.length;
            }
            bufferedReader.close();

            System.out.println("Total word: " + countWord);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        String File = "C:\\Users\\USER\\App\\bin\\lesson6\\Excercise\\TextFile.txt";
        ReadingFile(File);
        

    }
}
