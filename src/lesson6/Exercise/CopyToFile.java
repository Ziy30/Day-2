package lesson6.Exercise;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyToFile extends ReadFileHandler{

    private String outputFileName;

    public CopyToFile(String fileName, String outputFileName) {
        super(fileName);
        this.outputFileName = outputFileName;
    }

    public void copyFile(String fileName, String outputFileName){

        try {
        FileReader fileReader = new FileReader(super.getFilename());
        FileWriter fileWriter = new FileWriter(outputFileName);

        int character;
        while ((character= fileReader.read()) != -1) {
            fileWriter.write(character);
        }

        System.out.println("File copied succesfuly!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    


}
