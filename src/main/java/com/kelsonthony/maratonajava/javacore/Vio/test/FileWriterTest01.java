package com.kelsonthony.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kanthony\\Documents\\Developer\\projects\\idea-projects\\curso-java-update\\arquivo\\file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Olá mundo, este e melhor curso do Brasil!!!\n Continuando a escrever\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
