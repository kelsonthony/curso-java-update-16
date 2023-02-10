package com.kelsonthony.maratonajava.javacore.Kenum.test;

import com.kelsonthony.maratonajava.javacore.Kenum.dominio.Cliente;
import com.kelsonthony.maratonajava.javacore.Kenum.dominio.TipoCliente;
import com.kelsonthony.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente c2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println("tipoCliente1: " + tipoCliente1.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física222");
        System.out.println("tipoCliente2: " + tipoCliente2);

    }
}

