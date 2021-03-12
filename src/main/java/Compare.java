import compression.Compression;
import compression.TypeCompressor;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.nio.file.Files;

import static java.lang.String.format;

public class Compare {
    static final int MAX_SIZE = 50 * 1024 * 1024;//bytes

    public static String checkCompress(
            String inputDir,
            String originalName,
            String outputDir,
            TypeCompressor type
    ) throws Exception {
        String extension = FilenameUtils.getExtension(originalName);
        String inputNoExtension = FilenameUtils.removeExtension(originalName);
        String compressedName = inputNoExtension + '.' + type.toString().toLowerCase();
        Compression comp = new Compression(MAX_SIZE);

        File original = new File(inputDir, originalName);
        File compressed = new File(outputDir, compressedName);

        int compressTime = comp.compress(original, compressed, type);
        
        File decompressed = new File(outputDir, format("%s(%s).%s"
                , inputNoExtension, type.toString().toLowerCase(), extension));
        
        int decompressTime = comp.decompress(compressed, decompressed, type);

        String result = format("____ %s(%s) ____\n", type.toString(), originalName);
        result += format("Original size: %f Kb\n", (double) Files.size(original.toPath()) / 1024);
        result += format("Compressed size: %f Kb\n", (double) Files.size(compressed.toPath()) / 1024);
        result += format("Decompressed size: %f Kb\n", (double) Files.size(decompressed.toPath()) / 1024);
        result += format("Time of compressing: %d ms\n", compressTime);
        result += format("Time of decompressing: %d ms\n", decompressTime);
        result += "\n";

        return result;

    }

    public static void main(String[] args) throws Exception {
        String inputDir = "/Users/denissaripov/IdeaProjects/File_compression_compare/src/main/java/input";
        String outputDir = "/Users/denissaripov/IdeaProjects/File_compression_compare/src/main/java/output";

        System.out.println(checkCompress(inputDir, "winter.jpg",
                outputDir, TypeCompressor.DEFLATE
        ));

        System.out.println(checkCompress(inputDir, "winter.jpg",
                outputDir, TypeCompressor.LZMA
        ));

        System.out.println(checkCompress(inputDir, "winter.jpg",
                outputDir, TypeCompressor.BZIP2
        ));

        System.out.println(checkCompress(inputDir, "winter.jpg",
                outputDir, TypeCompressor.GZ
        ));

        System.out.println(checkCompress(inputDir, "winter.jpg",
                outputDir, TypeCompressor.LZ4
        ));

        System.out.println(checkCompress(inputDir, "winter.jpg",
                outputDir, TypeCompressor.SNAPPY
        ));

        System.out.println(checkCompress(inputDir, "winter.jpg",
                outputDir, TypeCompressor.XZ
        ));
    }
}
