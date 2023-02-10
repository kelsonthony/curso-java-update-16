package com.kelsonthony.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kanthony\\Documents\\Developer\\projects\\idea-projects\\curso-java-update\\arquivo\\file.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }
}
