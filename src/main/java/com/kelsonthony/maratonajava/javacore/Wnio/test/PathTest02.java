package com.kelsonthony.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pasta2 = Paths.get("arquivo");
        if (Files.notExists(pasta2)) {
            Path directory = Files.createDirectory(pasta2);
        }
        Path subPastas = Paths.get("pasta3\\subpasta\\subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastas);
        Path filePath = Paths.get(subPastas.toString(), "file2.txt");

        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
