package lesson6.Excercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.err.println("Enter String to save in Text File :");
        String in = scan.nextLine();

        String WriteFile = "C:\\Users\\USER\\App\\bin\\lesson6\\Excercise\\WriteFile.txt";


        try {
            FileWriter fileWriter = new FileWriter(WriteFile);
            fileWriter.write(in);
            fileWriter.close();

            System.err.println("String has been written");
          
        } catch (IOException e) {
            e.printStackTrace();
        }
        


    }
}
