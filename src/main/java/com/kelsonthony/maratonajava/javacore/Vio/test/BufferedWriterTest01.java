package com.kelsonthony.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kanthony\\Documents\\Developer\\projects\\idea-projects\\curso-java-update\\arquivo\\file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fileWriter)) {
            bw.write("Olá mundo, este e melhor curso do Brasil!!! Continuando a escrever");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
