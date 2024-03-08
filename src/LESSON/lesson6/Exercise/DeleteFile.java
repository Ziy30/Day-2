package LESSON.lesson6.Exercise;

import java.io.File;

public class DeleteFile {
      
    public static void deleteFile(String fileName) {
        // Create a File object with the given file name
        File file = new File(fileName);

        // Check if the file exists and delete it if it does
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File '" + fileName + "' deleted successfully.");
            } else {
                System.out.println("Failed to delete the file '" + fileName + "'.");
            }
        } else {
            System.out.println("File '" + fileName + "' does not exist.");
        }
    }

   
    
}
