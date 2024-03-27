package com.mycompany.calculadora;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class calculadora_Visual extends javax.swing.JFrame {

    public calculadora_Visual() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        CALCULAR = new javax.swing.JButton();
        SUBTRAIR = new javax.swing.JButton();
        SOMA = new javax.swing.JButton();
        MULTIPLICA = new javax.swing.JButton();
        DIVIDIR = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton0);
        jButton0.setBounds(20, 360, 100, 40);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 200, 60, 40);

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 200, 60, 40);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(180, 200, 60, 40);

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 250, 60, 40);

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(100, 250, 60, 40);

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(180, 250, 60, 40);

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 300, 60, 40);

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(100, 300, 60, 40);

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(180, 300, 60, 40);

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE);
        DELETE.setBounds(150, 360, 100, 40);

        CALCULAR.setText("CALCULAR");
        CALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULARActionPerformed(evt);
            }
        });
        jPanel1.add(CALCULAR);
        CALCULAR.setBounds(70, 420, 160, 90);

        SUBTRAIR.setText("-");
        SUBTRAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBTRAIRActionPerformed(evt);
            }
        });
        jPanel1.add(SUBTRAIR);
        SUBTRAIR.setBounds(270, 200, 60, 40);

        SOMA.setText("+");
        SOMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOMAActionPerformed(evt);
            }
        });
        jPanel1.add(SOMA);
        SOMA.setBounds(270, 250, 60, 40);

        MULTIPLICA.setText("*");
        MULTIPLICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIPLICAActionPerformed(evt);
            }
        });
        jPanel1.add(MULTIPLICA);
        MULTIPLICA.setBounds(270, 300, 60, 40);

        DIVIDIR.setText("/");
        DIVIDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVIDIRActionPerformed(evt);
            }
        });
        jPanel1.add(DIVIDIR);
        DIVIDIR.setBounds(270, 350, 60, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(50, 50, 260, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "1"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "2"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "3"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "4"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "5"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "6"; // Adiciona o número  à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "7"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); // onde o texto está inserindo os números e operações
        entrada += "8"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada
    }//GEN-LAST:event_jButton8ActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
   jTextField1.setText(""); // Limpar o texto do JTextField
    }//GEN-LAST:event_DELETEActionPerformed

    private void DIVIDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVIDIRActionPerformed
          String entrada = jTextField1.getText();
          entrada += '/';
          jTextField1.setText(entrada);    
    }//GEN-LAST:event_DIVIDIRActionPerformed

    private void CALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULARActionPerformed
                                       
 // Obter o texto inserido pelo usuário
    String entrada = jTextField1.getText();

    // Verificar se a entrada não está vazia
    if (!entrada.isEmpty()) {
        // Separar a entrada em número, operação e segundo número
        int num1 = Character.getNumericValue(entrada.charAt(0));
        char caracter = entrada.charAt(1);
        int num2 = Character.getNumericValue(entrada.charAt(2));

        // Realizar a operação matemática
        int resultado = calcular(num1, caracter, num2);

        // Exibir o resultado na mesma caixa de texto
        jTextField1.setText(Integer.toString(resultado));
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, insira uma entrada válida.");
    }
}

private int calcular(int num1, char caracter, int num2) {
    int resultado = 0;
    switch (caracter) {
        case '+':
            resultado = num1 + num2;
            break;
        case '-':
            resultado = num1 - num2;
            break;
        case '*':
            resultado = num1 * num2;
            break;
        case '/':
                resultado = num1 / num2;
            break;
    }
    return resultado;



    }//GEN-LAST:event_CALCULARActionPerformed

    private void SUBTRAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBTRAIRActionPerformed
     String entrada = jTextField1.getText();
          entrada += '-';
          jTextField1.setText(entrada);
    }//GEN-LAST:event_SUBTRAIRActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
      // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "0"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada
    }//GEN-LAST:event_jButton0ActionPerformed

    private void SOMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOMAActionPerformed
          String entrada = jTextField1.getText();
          entrada += '+';
          jTextField1.setText(entrada);
    }//GEN-LAST:event_SOMAActionPerformed

    private void MULTIPLICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIPLICAActionPerformed
         String entrada = jTextField1.getText();
          entrada += '*';
          jTextField1.setText(entrada);
    }//GEN-LAST:event_MULTIPLICAActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       // Quando o botão for pressionado, associar o número 1
        String entrada = jTextField1.getText(); //  texto onde está inserindo os números e operações
        entrada += "9"; // Adiciona o número à entrada existente
        jTextField1.setText(entrada); // Atualiza o campo de texto com a nova entrada 
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora_Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULAR;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton DIVIDIR;
    private javax.swing.JButton MULTIPLICA;
    private javax.swing.JButton SOMA;
    private javax.swing.JButton SUBTRAIR;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
