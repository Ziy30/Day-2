package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG10;

public class Main10 {
    public static void main(String[] args) {
        // Test ZipAlgorithm
        CompressionAlgorithm zipAlgorithm = new ZipAlgorithm();
        zipAlgorithm.compress("input.txt", "output.zip");

        // Test GZipAlgorithm
        CompressionAlgorithm gzipAlgorithm = new GZipAlgorithm();
        gzipAlgorithm.compress("input.txt", "output.gz");

        // Test LZMAAlgorithm (not implemented yet)
        CompressionAlgorithm lzmaAlgorithm = new LZMAAlgorithm();
        lzmaAlgorithm.compress("input.txt", "output.lzma");
    }
}
