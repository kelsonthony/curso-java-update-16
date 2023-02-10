package com.kelsonthony.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private _. default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados dos bancos de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }


    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataDize na classe");
    }
}
