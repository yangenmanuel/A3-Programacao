/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Produto;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yang
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    Produto product;
    
    public MainScreen() {
        initComponents();
        
        Color bgColor = new Color(250, 240, 240);
        getContentPane().setBackground(bgColor);
        
        jTableProducts.getTableHeader().setOpaque(false);
        jTableProducts.getTableHeader().setBackground(new Color(253, 164, 165));
        
        jTableProducts.getTableHeader().setFont(new Font("Inter", Font.BOLD, 14));
        
        this.product = new Produto();
        this.loadTable();
    }
    
    public void loadTable() {
        DefaultTableModel model = (DefaultTableModel) jTableProducts.getModel();
        model.setNumRows(0);
        
        ArrayList<Produto> list = new ArrayList();
        
        list = product.getList();
        
        for (Produto p : list) {
            model.addRow(new Object[] {
                p.getProduct_id(),
                p.getName(),
                p.getDescription(),
                p.getStock(),
                p.getPrice(),
                p.getDate_registered(),
            });
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducts = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setForeground(new java.awt.Color(153, 51, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter SemiBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Stock Manager");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 0));

        jTableProducts.setAutoCreateRowSorter(true);
        jTableProducts.setBackground(new java.awt.Color(250, 240, 240));
        jTableProducts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTableProducts.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jTableProducts.setForeground(new java.awt.Color(0, 0, 0));
        jTableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Produto", "Descrição", "Estoque", "Preço", "Data cadastrado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProducts.setAutoscrolls(false);
        jTableProducts.setGridColor(new java.awt.Color(0, 0, 0));
        jTableProducts.setMinimumSize(new java.awt.Dimension(20, 0));
        jTableProducts.setOpaque(false);
        jTableProducts.setPreferredSize(new java.awt.Dimension(400, 250));
        jTableProducts.setRowHeight(30);
        jTableProducts.setShowGrid(true);
        jTableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProducts);
        jTableProducts.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTableProducts.getColumnModel().getColumnCount() > 0) {
            jTableProducts.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTableProducts.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTableProducts.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTableProducts.getColumnModel().getColumn(4).setPreferredWidth(17);
            jTableProducts.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jButton1.setBackground(new java.awt.Color(250, 240, 240));
        jButton1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jButton1.setText("Adicionar produto");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 164, 164), 2, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductsMouseClicked

        if (this.jTableProducts.getSelectedRow() != -1) {
            String id = this.jTableProducts.getValueAt(this.jTableProducts.getSelectedRow(), 0).toString();
            String name = this.jTableProducts.getValueAt(this.jTableProducts.getSelectedRow(), 1).toString();
            String description = this.jTableProducts.getValueAt(this.jTableProducts.getSelectedRow(), 2).toString();
            String stock   = this.jTableProducts.getValueAt(this.jTableProducts.getSelectedRow(), 3).toString();
            String price = this.jTableProducts.getValueAt(this.jTableProducts.getSelectedRow(), 4).toString();

            
            System.out.println(id+ name + description + stock + price);
            
            EditOrDeleteProduct editordelete = new EditOrDeleteProduct(id, name, description, stock, price);
            setVisible(false);
        }
    }//GEN-LAST:event_jTableProductsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddProduct add = new AddProduct();
        add.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducts;
    // End of variables declaration//GEN-END:variables
}
