package com.mebel.manajemenstokmebel1;

import javax.swing.SwingUtilities;

public class main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Login login = new Login();

            login.setTitle("Manajemen Stok Mebel - Login");
            login.setLocationRelativeTo(null);
            login.setVisible(true);

        });

    }
}
