package com.mycompany.calculadora;


    public class main {
    public static void main(String[] args) {
        // Cria uma instância da calculadora_Visual
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora_Visual().setVisible(true);
            }
        });
    }
}


