/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ProdutoDAO;
import Model.Produto;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yang
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    ProdutoDAO dao;
    Produto product;
    
    public AddProduct() {
        initComponents();
        
        Color bgColor = new Color(250, 240, 240);
        getContentPane().setBackground(bgColor);
        
        this.dao = new ProdutoDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c_stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_price = new javax.swing.JTextField();
        b_add = new javax.swing.JButton();
        b_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_desc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 240, 240));

        c_stock.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        c_stock.setForeground(new java.awt.Color(0, 0, 0));
        c_stock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 16, 36)));
        c_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_stockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel4.setText("Preço");

        c_price.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        c_price.setForeground(new java.awt.Color(0, 0, 0));
        c_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 16, 36)));
        c_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_priceActionPerformed(evt);
            }
        });

        b_add.setBackground(new java.awt.Color(253, 164, 165));
        b_add.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        b_add.setForeground(new java.awt.Color(0, 0, 0));
        b_add.setText("Cadastrar");
        b_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 164, 164), 2, true));
        b_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addActionPerformed(evt);
            }
        });

        b_cancel.setBackground(new java.awt.Color(250, 240, 240));
        b_cancel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        b_cancel.setForeground(new java.awt.Color(0, 0, 0));
        b_cancel.setText("Cancelar");
        b_cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 164, 165), 2, true));
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        c_name.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        c_name.setForeground(new java.awt.Color(0, 0, 0));
        c_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 16, 52), 2, true));
        c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");

        c_desc.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        c_desc.setForeground(new java.awt.Color(0, 0, 0));
        c_desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 16, 36)));
        c_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel3.setText("Estoque");

        jLabel5.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Adicione um Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(c_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(c_name))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(b_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(c_price, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_stock, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(b_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(c_name, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(c_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(c_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(c_price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_add, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_stockActionPerformed

    private void c_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_priceActionPerformed

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed

        try {
            // recebendo e validando dados da interface gr�fica.
            String name = "";
            String description = "";
            double price = 0;
            int stock = 0;
            Timestamp date_registered = new Timestamp(System.currentTimeMillis());

            if (this.c_name.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                name = this.c_name.getText();
            }

            if (this.c_desc.getText().length() <= 0) {
                throw new Mensagens("A descrição deve ser maior");
            } else {
                description = this.c_desc.getText();
            }

            if (Integer.parseInt(this.c_stock.getText()) < 2) {
                throw new Mensagens("O estoque deve ser maior que 2");
            } else {
                stock = Integer.parseInt(this.c_stock.getText());
            }

            if ((this.c_price.getText().length()) <= 0) {
                throw new Mensagens("O preço deve ser maior do que 0");
            } else {
                price = Double.parseDouble(this.c_price.getText());
            }
            
            product = new Produto(5, name, description, stock, price, date_registered);

            // envia os dados para o Controlador cadastrar
            if (this.dao.InserirProduto(product)) {
                JOptionPane.showMessageDialog(rootPane, "Aluno Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_name.setText("");
                this.c_desc.setText("");
                this.c_stock.setText("");
                this.c_price.setText("");

            }
            MainScreen home = new MainScreen();
            home.setVisible(true);
            this.setVisible(false);
            
            System.out.println(this.product.getList().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        }

    }//GEN-LAST:event_b_addActionPerformed

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelActionPerformed

    private void c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nameActionPerformed

    private void c_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_descActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_add;
    private javax.swing.JButton b_cancel;
    private javax.swing.JTextField c_desc;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField c_price;
    private javax.swing.JTextField c_stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
