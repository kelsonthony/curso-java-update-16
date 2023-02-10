package com.kelsonthony.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kanthony\\Documents\\Developer\\projects\\idea-projects\\curso-java-update\\arquivo\\file.txt");

        try {
            //boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path: " + file.getPath());
            System.out.println("path absolute: " + file.getAbsolutePath());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is file: " + file.isFile());
            System.out.println("is hidden: " + file.isHidden());
            System.out.println("last modified: " + new Date(file.lastModified()));
            System.out.println("last modified: "
                    + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());
            boolean exists = file.exists();
            if (exists) {
                boolean delete = file.delete();
                System.out.println("Deleted: " +delete);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
