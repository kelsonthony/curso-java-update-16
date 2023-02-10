package com.kelsonthony.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;


public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("C:\\Users\\kanthony\\Documents\\Developer\\projects\\idea-projects\\curso-java-update\\arquivo\\directory");
        boolean mkdir = directory.mkdir();
        System.out.println("Pasta criada? " + mkdir);

        File fileArquivoDiretorio = new File(directory, "arquivo.txt");
        boolean newFile = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado? " + newFile);

        File fileRenamed = new File(directory,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado? "+ isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = directory.renameTo(diretorioRenamed);
        System.out.println("Diretorio renomeado? "+ isDiretorioRenomeado);
    }
}
