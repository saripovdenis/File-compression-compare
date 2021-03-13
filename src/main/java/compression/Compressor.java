package compression;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class Compressor {
    private final int MAX_SIZE;//bytes

    public Compressor(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
    }

    public int compress(File input, File output, TypeCompressor type) {
        long startTime = System.nanoTime();
        try {
            InputStream in = Files.newInputStream(input.toPath());

            OutputStream fout = Files.newOutputStream(output.toPath());
            BufferedOutputStream out = new BufferedOutputStream(fout);

            OutputStream compOut = switch(type){
                case DEFLATE -> new DeflateCompressorOutputStream(out);
                case LZMA -> new LZMACompressorOutputStream(out);
                case BZIP2 -> new BZip2CompressorOutputStream(out);
                case GZ -> new GzipCompressorOutputStream(out);
                case LZ4 -> new FramedLZ4CompressorOutputStream(out);
                case XZ -> new XZCompressorOutputStream(out);
                case SNAPPY -> new FramedSnappyCompressorOutputStream(out);
                default -> throw new RuntimeException();
            };

            final byte[] buffer = new byte[1024];
            int n = 0;
            while (-1 != (n = in.read(buffer))) {
                compOut.write(buffer, 0, n);
            }
            compOut.close();
            in.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
        long endTime = System.nanoTime();

        return (int) ((endTime - startTime) / 1_000_000);
    }

    public int decompress(File input, File output, TypeCompressor type) {
        long startTime = System.nanoTime();
        try{
            InputStream fin = Files.newInputStream(input.toPath());
            BufferedInputStream in = new BufferedInputStream(fin);
            OutputStream out = Files.newOutputStream(output.toPath());

            InputStream compIn = switch(type){
                case DEFLATE -> new DeflateCompressorInputStream(in);
                case LZMA -> new LZMACompressorInputStream(in);
                case BZIP2 -> new BZip2CompressorInputStream(in);
                case GZ -> new GzipCompressorInputStream(in);
                case LZ4 -> new FramedLZ4CompressorInputStream(in);
                case XZ -> new XZCompressorInputStream(in);
                case SNAPPY -> new FramedSnappyCompressorInputStream(in);
                default -> throw new RuntimeException();
            };

            final byte[] buffer = new byte[1024];
            int n = 0;
            while (-1 != (n = compIn.read(buffer))) {
                out.write(buffer, 0, n);
            }
            out.close();
            compIn.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        long endTime = System.nanoTime();

        return (int) ((endTime - startTime) / 1_000_000);
    }
}
