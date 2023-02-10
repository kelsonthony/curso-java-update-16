package com.kelsonthony.maratonajava.javacore.Oexception.exception.test;

import com.kelsonthony.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import com.kelsonthony.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public  static void  lerArquivo() {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public  static void  lerArquivo2() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {

        }
    }
    public static void lerArquivo3() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
