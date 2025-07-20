import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        byte[] original = Files.readAllBytes(Paths.get("C:\\Users\\HP\\Downloads\\check.txt"));

        compression_decompression compressor = new compression_decompression();

        byte[] compressed = compressor.compress(original);
        Files.write(Paths.get("C:\\Users\\HP\\Downloads\\check.txt"), compressed);
        byte[] decompressed = compressor.decompress(compressed);

        System.out.println("Original bytes: " + original.length);
        System.out.println("Compressed bytes: " + compressed.length);
        System.out.println("Decompressed matches original: " + Arrays.equals(original, decompressed));
    }
}
