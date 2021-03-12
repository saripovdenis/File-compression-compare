package compression;

import java.io.File;

public interface Compressor {
    void compress(File input, File output);

    void decompress(File input, File output);
}

