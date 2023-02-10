package com.kelsonthony.maratonajava.javacore.Oexception.exception.test;

import com.kelsonthony.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import com.kelsonthony.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import com.kelsonthony.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
