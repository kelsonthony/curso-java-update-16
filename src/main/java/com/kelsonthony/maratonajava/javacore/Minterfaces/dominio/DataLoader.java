package com.kelsonthony.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    default void checkPermission() {
        System.out.println("Fazendo uma checagem de permissões");
    }
    // métodos estáticos nunca podem ser sobrescritos, eles pertencem à interface.
    static void retriveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataDize na interface");
    }
}
