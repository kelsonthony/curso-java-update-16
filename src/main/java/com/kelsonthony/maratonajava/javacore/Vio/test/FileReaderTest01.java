package com.kelsonthony.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kanthony\\Documents\\Developer\\projects\\idea-projects\\curso-java-update\\arquivo\\file.txt");

        try (FileReader fileReader = new FileReader(file)) {
            //System.out.println(fileReader.read());
            char[] in = new char[1000];
            int size = fileReader.read(in);
            System.out.println(size);
            for (char c: in) {
                System.out.print(c);
            }
//            fileReader.read(in);
//            for (char c: in) {
//                System.out.println(c);
//            }
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
