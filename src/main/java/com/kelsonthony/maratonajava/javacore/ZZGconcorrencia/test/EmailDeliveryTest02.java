package com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.test;



import com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.dominio.Members;
import com.kelsonthony.maratonajava.javacore.ZZGconcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest02 {
    public static void main(String[] args) {

        Members members = new Members();
        Thread kakaroto = new Thread(new EmailDeliveryService(members), "Kakaroto");
        Thread vegeta = new Thread(new EmailDeliveryService(members), "Vegeta");

        kakaroto.start();
        vegeta.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com sem email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
