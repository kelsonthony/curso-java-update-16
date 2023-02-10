package com.kelsonthony.maratonajava.javacore.Minterfaces.test;

import com.kelsonthony.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import com.kelsonthony.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import com.kelsonthony.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remover();
        fileLoader.remover();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
