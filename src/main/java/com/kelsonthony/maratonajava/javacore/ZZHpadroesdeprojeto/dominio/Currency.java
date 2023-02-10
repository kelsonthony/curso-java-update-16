package com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "RS";
    }
}

class UsDollar implements Currency {
    @Override
    public String getSymbol() {
        return "S";
    }
}
