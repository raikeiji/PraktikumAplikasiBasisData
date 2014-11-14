/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kategori.barang;

import com.koneksi.koneksi;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author admiin
 */
class IDException extends Exception {

    IDException() {
    }

    IDException(String message) {
        super(message);
    }
}

class NamaException extends Exception {

    public NamaException() {
    }

    public NamaException(String message) {
        super(message);
    }
}

public final class kategoribarangform extends javax.swing.JFrame {

    /**
     * Creates new form kategoribarangform
     */
    GridBagConstraints cons = new GridBagConstraints();
    private String noID, nam;
    private int kesalahan;
    koneksi k = new koneksi();

    public kategoribarangform() {
        initComponents();
        lihatkategori();
//        addComponent(this);
        tampilanAwalTeksKodeKategori();
        tampilanAwalTeksNamaKategori();
        button_batal.setEnabled(false);
        button_hapus.setEnabled(false);
        button_simpan.setEnabled(false);
    }

    public String getID() {
        return noID;
    }

    public String getNama() {
        return nam;
    }

    public void setID(String id) throws IDException {
        String pola = "[0-9]*";
        if (id.matches(pola)) {
            this.noID = id;
        } //        else if (id.equalsIgnoreCase("") || id.equalsIgnoreCase("Masukkan Nomor Identitas")) {
        //            throw new IDException("harus di isi");
        //        } 
        else {
            throw new IDException("hanya masukkan angka");
        }
    }

    public void setNama(String nama) throws NamaException {
        String pola = "[a-zA-Z ]*";
        if (nama.matches(pola)) {
            this.nam = nama;
        } else if (nama.equalsIgnoreCase("") || nama.equalsIgnoreCase("Masukkan Nama Kategori")) {
            throw new NamaException("harus di isi");
        } else {
            throw new NamaException("tidak boleh ada angka");
        }
    }

    public void kesalahanID() {
        try {
            setID(teks_kode_kategori.getText());
        } catch (IDException ix) {
            teks_kode_kategori.setForeground(Color.LIGHT_GRAY);
            teks_kode_kategori.setText("Masukkan Kode Kategori");
            eid.setText(ix.getMessage());
            return;
        }
        teks_kode_kategori.setText(getID());
        eid.setText(" ");
        kesalahan--;
    }

    public void kesalahanNama() {
        try {
            setNama(teks_nama_kategori.getText());
        } catch (NamaException nx) {
            teks_nama_kategori.setForeground(Color.LIGHT_GRAY);
            teks_nama_kategori.setText("Masukkan Nama Kategori");
            enama.setText(nx.getMessage());
            return;
        }
        teks_nama_kategori.setText(getNama());
        enama.setText(" ");
        kesalahan--;
    }

//    public void addComponent(Container pane) {
//        GridBagConstraints cons = new GridBagConstraints();
//        eid =new JLabel(" ");
//        eid.setForeground(Color.RED);
//        cons.gridy = 1;
//        cons.insets = new Insets(0, 10, 0, 10);
//        pane.add(eid, cons);
//
//        enama = new JLabel(" ");
//        enama.setForeground(Color.RED);
//        cons.gridy = 3;
//        pane.add(enama, cons);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        teks_kode_kategori = new javax.swing.JTextField();
        teks_nama_kategori = new javax.swing.JTextField();
        eid = new javax.swing.JLabel();
        enama = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        button_simpan = new javax.swing.JButton();
        button_hapus = new javax.swing.JButton();
        button_batal = new javax.swing.JButton();
        button_keluar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablevar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KATEGORI");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("KATEGORI BARANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setText("KODE KATEGORI");

        jLabel3.setText("NAMA KATEGORI");

        teks_kode_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teks_kode_kategoriMouseClicked(evt);
            }
        });
        teks_kode_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teks_kode_kategoriActionPerformed(evt);
            }
        });
        teks_kode_kategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teks_kode_kategoriKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teks_kode_kategoriKeyTyped(evt);
            }
        });

        teks_nama_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teks_nama_kategoriMouseClicked(evt);
            }
        });

        eid.setForeground(new java.awt.Color(255, 0, 51));

        enama.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teks_kode_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(enama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teks_nama_kategori, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(teks_kode_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teks_nama_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enama, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jDesktopPane1.add(jPanel2);
        jPanel2.setBounds(0, 30, 530, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        button_simpan.setText("SIMPAN");
        button_simpan.setToolTipText("Tombol untuk menyimpan");
        button_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simpanActionPerformed(evt);
            }
        });

        button_hapus.setText("HAPUS");
        button_hapus.setToolTipText("Tombol untuk menghapus record");
        button_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hapusActionPerformed(evt);
            }
        });

        button_batal.setText("BATAL");
        button_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_batalActionPerformed(evt);
            }
        });

        button_keluar.setText("KELUAR");
        button_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_simpan)
                .addGap(18, 18, 18)
                .addComponent(button_hapus)
                .addGap(18, 18, 18)
                .addComponent(button_batal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(button_keluar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_simpan)
                    .addComponent(button_hapus)
                    .addComponent(button_batal)
                    .addComponent(button_keluar))
                .addContainerGap())
        );

        jDesktopPane1.add(jPanel3);
        jPanel3.setBounds(0, 170, 530, 50);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DAFTAR KATEGORI"));
        jPanel4.setForeground(new java.awt.Color(102, 102, 102));

        tablevar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "KODE", "NAMA"
            }
        ));
        tablevar.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tablevarMouseWheelMoved(evt);
            }
        });
        tablevar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablevarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablevar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jPanel4);
        jPanel4.setBounds(0, 220, 530, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(544, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teks_kode_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teks_kode_kategoriActionPerformed
        // TODO add your handling code here:
        String kode = teks_kode_kategori.getText();
        kategoribarang kb = new kategoribarang();
        kb.setKode_kategori(kode);
        if (kode.equals("") || kode == null) {
            JOptionPane.showMessageDialog(rootPane, "Kode harus diisi");
        } else {
            try {
//                kategoribarangkontrol kbk = new kategoribarangkontrol(k.getkoneksi());
                kategoribarangkontrol kbk = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi("hr","hr","jdbc:Oracle:thin:@localhost:1521:xe"));
                String namakategori = kbk.getKoneksiKategori().carikategoribarang(kb);
                teks_nama_kategori.setEnabled(true);
                teks_nama_kategori.setText(namakategori);
                teks_nama_kategori.setForeground(Color.BLACK);
                repaint();
                revalidate();
                if (teks_nama_kategori.getText().isEmpty()) {
                    button_simpan.setText("SIMPAN");
                } else {
                    button_simpan.setText("UPDATE");
                }
            } catch (Exception e) {
                teks_nama_kategori.setText("");
                teks_nama_kategori.requestFocus();
            }
        }
    }//GEN-LAST:event_teks_kode_kategoriActionPerformed

    private void button_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simpanActionPerformed

        String kodekategori = teks_kode_kategori.getText();
        String namakategori = teks_nama_kategori.getText();
        kategoribarang kd = new kategoribarang();
//          STATEMENT BIASA         
//        kategoribarangkontrol kbk=new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi());
//        try {
//            kbk.tambahKategori(kd);
//        } catch (SQLException ex) {
//            Logger.getLogger(kategoribarangform.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        PREPARED STATEMENT      
//        kategoribarangkontrol kbk = new kategoribarangkontrol(k.getkoneksi());
        kategoribarangkontrol kbk = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi("hr","hr","jdbc:Oracle:thin:@localhost:1521:xe"));
        try {
            kesalahan = 2;
            if (kesalahan != 0) {
                kesalahanID();
                kesalahanNama();
                if (kesalahan == 0) {
                    kd.setKode_kategori(kodekategori);
                    kd.setNama_kategori(namakategori);
                    kbk.tambahKategoriprepare2(kd);
//                    dispose();
                    JOptionPane.showMessageDialog(rootPane, "Kode Kategori" + kodekategori + ", Nama Kategori " + namakategori + " telah di masukkan ke database");
                }
            }
        } catch (Exception ex) {
        }
//        teks_kode_kategori.setText("");
//        teks_nama_kategori.setText("");
        tampilanAwalTeksKodeKategori();
        tampilanAwalTeksNamaKategori();
        lihatkategori();
    }//GEN-LAST:event_button_simpanActionPerformed

    private void button_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_hapusActionPerformed
        String kodekategori = teks_kode_kategori.getText();
        String namakategori = teks_nama_kategori.getText();
        kategoribarang kd = new kategoribarang();
        kd.setKode_kategori(kodekategori);
        kd.setNama_kategori(namakategori);
//        kategoribarangkontrol kbk = new kategoribarangkontrol(k.getkoneksi());
        kategoribarangkontrol kbk = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi("hr","hr","jdbc:Oracle:thin:@localhost:1521:xe"));
        try {
            kbk.deleteKategoriprepare(kd);
        } catch (Exception ex) {
            Logger.getLogger(kategoribarangform.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Kode kategori" + kodekategori + ", nama kategori" + namakategori + " telah di hapus ke database");
        teks_kode_kategori.setText("");
        teks_nama_kategori.setText("");
        lihatkategori();
    }//GEN-LAST:event_button_hapusActionPerformed

    private void button_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_button_keluarActionPerformed

    private void button_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_batalActionPerformed
        teks_kode_kategori.setText("");
        teks_nama_kategori.setText("");
        button_batal.setEnabled(false);
        button_hapus.setEnabled(false);
        button_simpan.setEnabled(false);
        eid.setText("");
        enama.setText("");
        button_simpan.setText("SIMPAN");
        tampilanAwalTeksKodeKategori();
        tampilanAwalTeksNamaKategori();
    }//GEN-LAST:event_button_batalActionPerformed

    private void tablevarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablevarMouseClicked
        // TODO add your handling code here:
        int baris = tablevar.getSelectedRow();

        String kode = tablevar.getValueAt(baris, 0).toString();
        String nama = tablevar.getValueAt(baris, 1).toString();

        teks_kode_kategori.setText(kode);
        teks_nama_kategori.setText(nama);

        button_batal.setEnabled(true);
        button_simpan.setEnabled(true);
        button_hapus.setEnabled(true);
        button_simpan.setText("UPDATE");

    }//GEN-LAST:event_tablevarMouseClicked

    private void tablevarMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tablevarMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablevarMouseWheelMoved

    private void teks_kode_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teks_kode_kategoriMouseClicked
        button_simpan.setEnabled(true);
        button_hapus.setEnabled(true);
        button_batal.setEnabled(true);
        button_keluar.setEnabled(true);

        String kodekategori = teks_kode_kategori.getText();
        String namakategori = teks_nama_kategori.getText();

        kategoribarang kd = new kategoribarang();

        kd.setKode_kategori(kodekategori);
        kd.setNama_kategori(namakategori);

//        kategoribarangkontrol kbk = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi());
        kategoribarangkontrol kbk = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi("hr","hr","jdbc:Oracle:thin:@localhost:1521:xe"));
//        try {
        if (teks_kode_kategori.getText().equals("Masukkan Kode Kategori")) {
            teks_kode_kategori.setText("");
            teks_kode_kategori.setForeground(Color.BLACK);
            repaint();
            revalidate();
            enama.setText("");
        }
//            if (kbk.carikategoribarang(kd).contains(namakategori)) {
//            } else {
//                button_simpan.setText("SIMPAN");
//            }
//            kbk.tambahKategoriprepare2(kd);
//        } catch (Exception ex) {
//            Logger.getLogger(kategoribarangform.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_teks_kode_kategoriMouseClicked

    private void teks_nama_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teks_nama_kategoriMouseClicked
        // TODO add your handling code here:

        if (teks_nama_kategori.getText().equals("") || teks_nama_kategori.getText().equals("Masukkan Nama Kategori")) {
            button_simpan.setText("SIMPAN");
            enama.setEnabled(true);
            enama.setText("masukkan kode kategori terlebih dahulu");
            button_batal.setEnabled(false);
            button_hapus.setEnabled(false);
            button_keluar.setEnabled(true);
            button_simpan.setEnabled(false);
        }
//        else {
//            button_simpan.setText("UPDATE");
//        }
    }//GEN-LAST:event_teks_nama_kategoriMouseClicked

    private void teks_kode_kategoriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teks_kode_kategoriKeyTyped
//        if (!teks_kode_kategori.getText().contains(".") || teks_kode_kategori.getText().contains(".")) {
//            if (teks_kode_kategori.getText().length() > 3) {
//                if (!teks_kode_kategori.getText().contains(".")) {
//                teks_kode_kategori.setText(teks_kode_kategori.getText().charAt(0) + "." + teks_kode_kategori.getText().substring(2, 4));
//                }if (".".equals("" + teks_kode_kategori.getText().charAt(1)) && teks_kode_kategori.getText().length() > 4) {
//                    teks_kode_kategori.setText(teks_kode_kategori.getText().charAt(0) + teks_kode_kategori.getText().charAt(2) + "." + teks_kode_kategori.getText().substring(4, 6));
//                }
//            }
//        }
//        if (teks_kode_kategori.getText().length() > 3 && !teks_kode_kategori.getText().contains(".")) {
//            teks_kode_kategori.setText(teks_kode_kategori.getText().charAt(0) + "." + teks_kode_kategori.getText().substring(2, 4));
//
//        }
//        if (teks_kode_kategori.getText().length() > 7) {
//            teks_kode_kategori.setText(teks_kode_kategori.getText().charAt(0) + "." + teks_kode_kategori.getText().substring(2, 4)
//                    + "." + teks_kode_kategori.getText().substring(5, 8));
//        }

        
    }//GEN-LAST:event_teks_kode_kategoriKeyTyped

    private void teks_kode_kategoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teks_kode_kategoriKeyPressed
        // TODO add your handling code here:
//        if (!teks_kode_kategori.getText().contains(".") || teks_kode_kategori.getText().contains(".")) {
//            if (teks_kode_kategori.getText().length() > 3) {
//                if (!teks_kode_kategori.getText().contains(".")) {
//                teks_kode_kategori.setText(teks_kode_kategori.getText().charAt(0) + "." + teks_kode_kategori.getText().substring(2, 4));
//                }if (".".equals("" + teks_kode_kategori.getText().charAt(1)) && teks_kode_kategori.getText().length() > 4) {
//                    teks_kode_kategori.setText(teks_kode_kategori.getText().charAt(0) + teks_kode_kategori.getText().charAt(2) + "." + teks_kode_kategori.getText().substring(4, 6));
//                }
//            }
//        }
    }//GEN-LAST:event_teks_kode_kategoriKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kategoribarangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kategoribarangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kategoribarangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kategoribarangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new kategoribarangform().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_batal;
    private javax.swing.JButton button_hapus;
    private javax.swing.JButton button_keluar;
    private javax.swing.JButton button_simpan;
    private javax.swing.JLabel eid;
    private javax.swing.JLabel enama;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablevar;
    private javax.swing.JTextField teks_kode_kategori;
    private javax.swing.JTextField teks_nama_kategori;
    // End of variables declaration//GEN-END:variables

    private void lihatkategori() {
        try {
            List<kategoribarang> listkat = kategoribarangkontrol.getKoneksiKategori().lihatSeluruhKateogri();
            KategoriTableModel katmodel = new KategoriTableModel(listkat);
            tablevar.setModel(katmodel);
        } catch (Exception e) {
        }
    }

    public void tampilanAwalTeksKodeKategori() {
        teks_kode_kategori.setText("Masukkan Kode Kategori");
        teks_kode_kategori.setPreferredSize(teks_kode_kategori.getPreferredSize());
//        teks_kode_kategori.setMaximumSize(teks_kode_kategori.getPreferredSize());
        teks_kode_kategori.setForeground(Color.LIGHT_GRAY);
    }

    public void tampilanAwalTeksNamaKategori() {
        teks_nama_kategori.setText("Masukkan Nama Kategori");
        teks_nama_kategori.setPreferredSize(teks_nama_kategori.getPreferredSize());
//        teks_nama_kategori.setMaximumSize(teks_nama_kategori.getPreferredSize());
        teks_nama_kategori.setForeground(Color.LIGHT_GRAY);
        if (teks_kode_kategori.getText().equals("Masukkan Kode Kategori")) {
//            teks_nama_kategori.enable(false);
        }
    }
}