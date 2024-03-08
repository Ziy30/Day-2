package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipAlgorithm extends CompressionAlgorithm {
    @Override
    void compress(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
             GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(outputFile))) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                gzos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
