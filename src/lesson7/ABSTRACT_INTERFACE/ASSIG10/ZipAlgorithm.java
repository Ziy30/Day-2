package lesson7.ABSTRACT_INTERFACE.ASSIG10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipAlgorithm extends CompressionAlgorithm {
    @Override
    void compress(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outputFile))) {
            zos.putNextEntry(new ZipEntry(inputFile));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
