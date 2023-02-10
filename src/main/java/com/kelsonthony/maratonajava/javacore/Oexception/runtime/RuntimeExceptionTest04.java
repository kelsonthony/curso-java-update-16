package com.kelsonthony.maratonajava.javacore.Oexception.runtime;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw  new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceExeption();
        //} catch (SQLException | FileNotFoundException | IOException e) { // não compila pois estão ma mesma linha de herança
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExeption() throws SQLException, FileNotFoundException, IOException {

    }

}
