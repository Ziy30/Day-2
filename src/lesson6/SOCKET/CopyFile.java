package lesson6.SOCKET;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.err.println("Enter the source file name :");
        String fileSource = scan.nextLine();

        System.err.println("Enter file destination :");
        String fileDest = scan.nextLine();

        try {
            FileReader fileReader = new FileReader(fileSource);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(fileDest);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String readLine;

            while ((readLine = bufferedReader.readLine()) != null) {
                bufferedWriter.write(readLine);
                bufferedWriter.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
