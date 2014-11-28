/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kartustock;

import com.barang.BarangKontrol;
import com.barang.TabelModelBarang;
import com.barang.barang;
import com.barang.daftarmenuArsip;
import com.kategori.barang.kategoribarang;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rai
 */
public class FormKartuStock extends javax.swing.JFrame {

    /**
     * Creates new form FormKartuStock
     */
    public FormKartuStock() {
        initComponents();
        GregorianCalendar gc = new GregorianCalendar();
//        jDateChooserTanggalTransaksi.setDate(gc.getTime());
        tampilanAwal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelJudul = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelKodeBarang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldKodeBarang = new javax.swing.JTextField();
        jTextFieldNamaBarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldKategori = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSatuan = new javax.swing.JTextField();
        jButtonLihatKodeBarang = new javax.swing.JButton();
        jPanelStockBarang = new javax.swing.JPanel();
        jDateChooserCalender = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNoBukti = new javax.swing.JTextField();
        jTextFieldKeterangan = new javax.swing.JTextField();
        jTextFieldMasuk = new javax.swing.JTextField();
        jTextFieldKeluar = new javax.swing.JTextField();
        jPanelTabelStock = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKartuStock = new javax.swing.JTable();
        jPanelTombolStock = new javax.swing.JPanel();
        jButtonKeluar = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Kartu Stock");

        //
        //jDesktopPane.add(jPanelJudul);
        jPanelJudul.setBackground(new java.awt.Color(59, 142, 172));

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 2, 15)); // NOI18N
        jLabel2.setText("Form ini digunakan untuk mengetahui saldo akhir barang");

        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("/home/rai/NetBeansProjects/PrakAppBD/src/com/kartustock/kpackage.png")); // NOI18N
        jLabel7.setText("KARTU STOCK BARANG");

        javax.swing.GroupLayout jPanelJudulLayout = new javax.swing.GroupLayout(jPanelJudul);
        jPanelJudul.setLayout(jPanelJudulLayout);
        jPanelJudulLayout.setHorizontalGroup(
            jPanelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJudulLayout.setVerticalGroup(
            jPanelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //jDesktopPane.add(jPanelKodeBarang);
        jPanelKodeBarang.setBackground(new java.awt.Color(59, 142, 172));

        jLabel3.setText("Kode Barang");

        jLabel4.setText("Nama Barang");

        jTextFieldKodeBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldKodeBarangMouseClicked(evt);
            }
        });
        jTextFieldKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKodeBarangActionPerformed(evt);
            }
        });

        jTextFieldNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaBarangActionPerformed(evt);
            }
        });

        jLabel5.setText("Kategori");

        jTextFieldKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKategoriActionPerformed(evt);
            }
        });

        jLabel6.setText("Satuan");

        jButtonLihatKodeBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kartustock/logviewer.png"))); // NOI18N
        jButtonLihatKodeBarang.setToolTipText("Tombil search");
        jButtonLihatKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLihatKodeBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKodeBarangLayout = new javax.swing.GroupLayout(jPanelKodeBarang);
        jPanelKodeBarang.setLayout(jPanelKodeBarangLayout);
        jPanelKodeBarangLayout.setHorizontalGroup(
            jPanelKodeBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKodeBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKodeBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKodeBarangLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLihatKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelKodeBarangLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelKodeBarangLayout.setVerticalGroup(
            jPanelKodeBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKodeBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKodeBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLihatKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelKodeBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelKodeBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //jDesktopPane.add(jPanelStockBarang);
        jPanelStockBarang.setBackground(new java.awt.Color(59, 142, 172));

        jLabel1.setText("Tanggal");

        jLabel8.setText("No. Bukti");

        jLabel9.setText("Keterangan");

        jLabel10.setText("Masuk");

        jLabel11.setText("Keluar");

        jTextFieldKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKeteranganActionPerformed(evt);
            }
        });

        jTextFieldMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldMasukMouseClicked(evt);
            }
        });

        jTextFieldKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldKeluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelStockBarangLayout = new javax.swing.GroupLayout(jPanelStockBarang);
        jPanelStockBarang.setLayout(jPanelStockBarangLayout);
        jPanelStockBarangLayout.setHorizontalGroup(
            jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStockBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStockBarangLayout.createSequentialGroup()
                        .addComponent(jDateChooserCalender, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNoBukti, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelStockBarangLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldKeterangan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );
        jPanelStockBarangLayout.setVerticalGroup(
            jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStockBarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserCalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelStockBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNoBukti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelTabelStock.setBackground(new java.awt.Color(59, 142, 172));
        jPanelTabelStock.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kolom Kode Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Mono", 2, 10))); // NOI18N
        //
        //jDesktopPane.add(jPanelTabelStock);

        jScrollPane1.setBackground(new java.awt.Color(240, 242, 242));

        jTableKartuStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "No. Bukti", "Keterangan", "Masuk", "Keluar", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableKartuStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKartuStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKartuStock);

        javax.swing.GroupLayout jPanelTabelStockLayout = new javax.swing.GroupLayout(jPanelTabelStock);
        jPanelTabelStock.setLayout(jPanelTabelStockLayout);
        jPanelTabelStockLayout.setHorizontalGroup(
            jPanelTabelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelTabelStockLayout.setVerticalGroup(
            jPanelTabelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        //jDesktopPane.add(jPanelTombolStock);
        jPanelTombolStock.setBackground(new java.awt.Color(59, 142, 172));

        jButtonKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kartustock/exit.png"))); // NOI18N
        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        jButtonBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kartustock/batal.png"))); // NOI18N
        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jButtonSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kartustock/simpan.png"))); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kartustock/print2.png"))); // NOI18N
        jButtonCetak.setText("Cetak");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });

        jButtonHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kartustock/trash.png"))); // NOI18N
        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTombolStockLayout = new javax.swing.GroupLayout(jPanelTombolStock);
        jPanelTombolStock.setLayout(jPanelTombolStockLayout);
        jPanelTombolStockLayout.setHorizontalGroup(
            jPanelTombolStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTombolStockLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelTombolStockLayout.setVerticalGroup(
            jPanelTombolStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTombolStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTombolStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCetak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelTombolStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSimpan)
                        .addComponent(jButtonBatal)
                        .addComponent(jButtonKeluar)
                        .addComponent(jButtonHapus)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelKodeBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStockBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTabelStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTombolStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStockBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabelStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTombolStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaBarangActionPerformed

    private void jTextFieldKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKategoriActionPerformed

    private void jTextFieldKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKeteranganActionPerformed

    private void jTextFieldKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodeBarangActionPerformed
        String kode = jTextFieldKodeBarang.getText();
        barang kb = new barang();
        kb.setKodeBarang(kode);
        try {
            String namaBarang = KartuStockKontrol.getKoneksi().cariNamaBarang(kb);
            String kategori = KartuStockKontrol.getKoneksi().cariKategori(kb);
            String satuan = KartuStockKontrol.getKoneksi().cariSatuan(kb);

            jTextFieldNamaBarang.setText(namaBarang);
            jTextFieldKategori.setText(kategori);
            jTextFieldSatuan.setText(satuan);
            if (jTextFieldNamaBarang.getText().equals("")) {
//                jInternalFrameKodeBarang.setVisible(true);
                JOptionPane.showMessageDialog(rootPane, "Kode barang tidak terdapat dalam database, silahkan menekan icon search");

            }
            ListStock();
            jDateChooserCalender.setEnabled(true);
            jTextFieldNoBukti.setEnabled(true);
            jTextFieldKeterangan.setEnabled(true);
            jTextFieldMasuk.setEnabled(true);
            jTextFieldKeluar.setEnabled(true);
            jButtonBatal.setEnabled(true);
            jButtonCetak.setEnabled(true);
            jButtonHapus.setEnabled(true);
            jButtonSimpan.setEnabled(true);

        } catch (Exception ex) {
            Logger.getLogger(FormKartuStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldKodeBarangActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        tampilanAwal();
//        hapusListStock();
//        jTableKartuStock.removeAll();
        try{
        DefaultTableModel dtm = (DefaultTableModel) jTableKartuStock.getModel();
//        while (dtm.getRowCount() > 0) {
//            for (int i = dtm.getRowCount()-1; i >=0; i--) {
//                dtm.removeRow(i);
//            }
//        }
        jTableKartuStock.setEnabled(true);
        jTableKartuStock.setCellSelectionEnabled(false);
        dtm.setNumRows(0);
        dtm.setRowCount(0);
        }catch(Exception a){
            System.out.println("masih belum terhapus data tabelnya");
        }
        jButtonSimpan.setText("Simpan");
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void jTextFieldKodeBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldKodeBarangMouseClicked
        if (jTextFieldKodeBarang.getText().equals("Masukkan kode barang anda")) {
            jTextFieldKodeBarang.setText("");
            jTextFieldKodeBarang.setForeground(Color.BLACK);
            validate();
            repaint();
        }
    }//GEN-LAST:event_jTextFieldKodeBarangMouseClicked

    private void jButtonLihatKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLihatKodeBarangActionPerformed
//        jInternalFrameKodeBarang.setVisible(true);
//        jLayeredPaneKodeBarang.setVisible(true);
        FrameKodeBarang f = new FrameKodeBarang();
        f.setVisible(true);

    }//GEN-LAST:event_jButtonLihatKodeBarangActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        KartuStock ks = new KartuStock();
        barang b = new barang();

        String kodeBarang = jTextFieldKodeBarang.getText();
        b.setKodeBarang(kodeBarang);
        ks.setKodeBarang(b);

        Date tgl = jDateChooserCalender.getDate();
        SimpleDateFormat calender = new SimpleDateFormat("dd-MMM-yy");
        String tanggal = calender.format(tgl);
        ks.setTanggal(tanggal);

        String noBukti = jTextFieldNoBukti.getText();
        ks.setNoBukti(noBukti);

        String keterangan = jTextFieldKeterangan.getText();
        ks.setKeterangan(keterangan);

        String masuk = jTextFieldMasuk.getText();
        int masukInt = Integer.parseInt(masuk);
        ks.setMasuk(masukInt);

        String keluar = jTextFieldKeluar.getText();
        int keluarInt = Integer.parseInt(keluar);
        ks.setKeluar(keluarInt);

        if (jButtonSimpan.getText().equals("Simpan")) {
            try {
                KartuStockKontrol.getKoneksi().TambahKartuStock(ks);
                JOptionPane.showMessageDialog(rootPane, "DATA ANDA TELAH TERSIMPAN DI DATABASE");
            } catch (SQLException ex) {
                Logger.getLogger(FormKartuStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                KartuStockKontrol.getKoneksi().updateStok(ks);
                JOptionPane.showMessageDialog(rootPane, "DATA ANDA TELAH DIUPDATE DI DATABASE");
            } catch (SQLException ex) {
                Logger.getLogger(FormKartuStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ListStock();

    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTableKartuStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKartuStockMouseClicked
        int baris = jTableKartuStock.getSelectedRow();
        String noBukti, tanggal, keterangan, masuk, keluar;
        tanggal = jTableKartuStock.getValueAt(baris, 0).toString();
        noBukti = jTableKartuStock.getValueAt(baris, 1).toString();
        keterangan = jTableKartuStock.getValueAt(baris, 2).toString();
        masuk = jTableKartuStock.getValueAt(baris, 3).toString();
        keluar = jTableKartuStock.getValueAt(baris, 4).toString();

        String tgl1 = tanggal.substring(0, 10);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date tgl2 = sdf.parse(tgl1);

            SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMM yy");

            String tgl3 = sdf2.format(tgl2);

            Date tgl4 = sdf2.parse(tgl3);
            jDateChooserCalender.setDate(tgl4);
        } catch (ParseException ex) {
        }

        jTextFieldNoBukti.setText(noBukti);
        jTextFieldKeterangan.setText(keterangan);
        jTextFieldMasuk.setText(masuk);
        jTextFieldKeluar.setText(keluar);
        jButtonSimpan.setText("Update");
//        if (jButtonBatal.isSelected()) {
//            ListStockKosong();
//        }
    }//GEN-LAST:event_jTableKartuStockMouseClicked

    private void jTextFieldMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMasukMouseClicked
        jTextFieldKeluar.setEnabled(false);
        jTextFieldKeluar.setText("0");
    }//GEN-LAST:event_jTextFieldMasukMouseClicked

    private void jTextFieldKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldKeluarMouseClicked
        jTextFieldMasuk.setEnabled(false);
        jTextFieldMasuk.setText("0");
    }//GEN-LAST:event_jTextFieldKeluarMouseClicked

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        java.util.Date tgl = jDateChooserCalender.getDate();
        SimpleDateFormat sdr = new SimpleDateFormat("dd-MMM-yy");

        String tanggal = sdr.format(tgl);
        String noBukti = jTextFieldNoBukti.getText();

        KartuStock k = new KartuStock();
        k.setTanggal(tanggal);
        k.setNoBukti(noBukti);
        try {
            KartuStockKontrol.getKoneksi().hapusStok(k);
            JOptionPane.showMessageDialog(rootPane, "DATA ANDA TELAH TERHAPUS DI DATABASE");
        } catch (SQLException ex) {
            Logger.getLogger(FormKartuStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        ListStock();
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        KartuStockKontrol.cetakStock(jTableKartuStock);
    }//GEN-LAST:event_jButtonCetakActionPerformed

    public void tampilanAwal() {
        jTextFieldKodeBarang.setText("Masukkan kode barang anda");
        jTextFieldKodeBarang.setPreferredSize(jTextFieldKodeBarang.getPreferredSize());
        jTextFieldKodeBarang.setForeground(Color.GRAY);
        jTextFieldKategori.setEnabled(false);
        jTextFieldKategori.setText("");
        jTextFieldNamaBarang.setEnabled(false);
        jTextFieldNamaBarang.setText("");
        jTextFieldSatuan.setEnabled(false);
        jTextFieldSatuan.setText("");
        jDateChooserCalender.setEnabled(false);
        jTextFieldKeterangan.setEnabled(false);
        jTextFieldMasuk.setEnabled(false);
        jTextFieldKeluar.setEnabled(false);
        jTextFieldNoBukti.setEnabled(false);
        jButtonBatal.setEnabled(false);
        jButtonCetak.setEnabled(false);
        jButtonHapus.setEnabled(false);
        jButtonSimpan.setEnabled(false);
        jTextFieldNoBukti.setText("");
        jTextFieldKeterangan.setText("");
        jTextFieldMasuk.setText("");
        jTextFieldKeluar.setText("");
        jDateChooserCalender.setDate(null);
//        ListStockSalah();
    }

    private void ListStock() {
        String kodeBarang = jTextFieldKodeBarang.getText();
        try {
            List<KartuStock> daftarStock = KartuStockKontrol.getKoneksi().LihatKartuStock(kodeBarang);
            KartuStockTableModel model = new KartuStockTableModel(daftarStock);
            model.fireTableDataChanged();
            jTableKartuStock.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(FormKartuStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ListStockSalah() {
        String namaBarang = jTextFieldNamaBarang.getText();
        try {
            List<KartuStock> daftarStock = KartuStockKontrol.getKoneksi().LihatKartuStock(namaBarang);
            KartuStockTableModel model = new KartuStockTableModel(daftarStock);
            model.fireTableDataChanged();
            jTableKartuStock.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(FormKartuStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(FormKartuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKartuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKartuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKartuStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKartuStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonLihatKodeBarang;
    private javax.swing.JButton jButtonSimpan;
    private com.toedter.calendar.JDateChooser jDateChooserCalender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelJudul;
    private javax.swing.JPanel jPanelKodeBarang;
    private javax.swing.JPanel jPanelStockBarang;
    private javax.swing.JPanel jPanelTabelStock;
    private javax.swing.JPanel jPanelTombolStock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKartuStock;
    private javax.swing.JTextField jTextFieldKategori;
    private javax.swing.JTextField jTextFieldKeluar;
    private javax.swing.JTextField jTextFieldKeterangan;
    private javax.swing.JTextField jTextFieldKodeBarang;
    private javax.swing.JTextField jTextFieldMasuk;
    private javax.swing.JTextField jTextFieldNamaBarang;
    private javax.swing.JTextField jTextFieldNoBukti;
    private javax.swing.JTextField jTextFieldSatuan;
    // End of variables declaration//GEN-END:variables
}
