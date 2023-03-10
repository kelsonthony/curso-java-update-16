package com.kelsonthony.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        //permitem alterações
        //BasicFileAttributesView DosFileAttributesView PosixFileAttributesView
        Path path = Paths.get("pasta2/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("-----------------------------------------------");

        BasicFileAttributeView basicFileAttributesView = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());

        basicFileAttributesView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = basicFileAttributesView.readAttributes().creationTime();
        lastModifiedTime = basicFileAttributesView.readAttributes().lastModifiedTime();
        lastAccessTime = basicFileAttributesView.readAttributes().lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);

    }
}
