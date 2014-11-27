/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MainFrame;

import com.barang.daftarmenuArsip;
import com.kartustock.FormKartuStock;
import com.kategori.barang.KategoriBarangForm;

/**
 *
 * @author rai
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemKategori = new javax.swing.JMenuItem();
        jMenuItemBarang = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuTransaksi = new javax.swing.JMenu();
        jMenuItemKartuStock = new javax.swing.JMenuItem();
        jMenuKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuFile.setText("File");

        jMenuItemKategori.setText("Kategori");
        jMenuItemKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKategoriActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemKategori);

        jMenuItemBarang.setText("Barang");
        jMenuItemBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBarangActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemBarang);
        jMenuFile.add(jSeparator1);

        jMenuBar1.add(jMenuFile);

        jMenuTransaksi.setText("Transaksi");

        jMenuItemKartuStock.setText("Kartu Stock");
        jMenuItemKartuStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKartuStockActionPerformed(evt);
            }
        });
        jMenuTransaksi.add(jMenuItemKartuStock);

        jMenuBar1.add(jMenuTransaksi);

        jMenuKeluar.setText("Keluar");
        jMenuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKeluarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuKeluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKategoriActionPerformed
        com.kategori.barang.KategoriBarangForm k=new KategoriBarangForm();
        k.setVisible(true);
    }//GEN-LAST:event_jMenuItemKategoriActionPerformed

    private void jMenuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuKeluarActionPerformed

    private void jMenuItemBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBarangActionPerformed
        com.barang.daftarmenuArsip b=new daftarmenuArsip();
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItemBarangActionPerformed

    private void jMenuItemKartuStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKartuStockActionPerformed
        com.kartustock.FormKartuStock k=new FormKartuStock();
        k.setVisible(true);
    }//GEN-LAST:event_jMenuItemKartuStockActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemBarang;
    private javax.swing.JMenuItem jMenuItemKartuStock;
    private javax.swing.JMenuItem jMenuItemKategori;
    private javax.swing.JMenu jMenuKeluar;
    private javax.swing.JMenu jMenuTransaksi;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
