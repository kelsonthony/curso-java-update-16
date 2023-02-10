package com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);

        Person person = Person.PersonBuilder.builder()
                .firstName("Kelson")
                .lastName("Menezes")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }


}
