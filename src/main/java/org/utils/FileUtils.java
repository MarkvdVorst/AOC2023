package org.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(Path filepath) throws IOException {
        return Files.readAllLines(filepath);
    }
}
