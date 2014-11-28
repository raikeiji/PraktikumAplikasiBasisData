/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kartustock;

import com.barang.barang;
import com.kategori.barang.kategoribarang;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rai
 */
public class KartuStockKontrol {

    Connection conn;

    public KartuStockKontrol(Connection koneksi) {
        this.conn = koneksi;
    }

    public static KartuStockKontrol getKoneksi() {
        KartuStockKontrol k = new KartuStockKontrol(com.koneksi.koneksi.getkoneksi2());
        return k;
    }

    public String cariNamaBarang(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select barang.namabarang from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("namabarang");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariSatuan(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select barang.satuan from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("satuan");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariKategori(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select barang.kategori from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("kategori");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public List<barang> lihatSeluruhKodeBarang() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select KODEBARANG, NAMABARANG from BARANG order by KODEBARANG");
            result = statement.executeQuery();
            System.out.println(statement);

            List<barang> kategoris = new ArrayList<barang>();

            System.out.println(result);
            while (result.next()) {
                barang b = new barang();
//                KartuStock k=new KartuStock();
                b.setKodeBarang(result.getString("KODEBARANG"));
                b.setNamaBarang(result.getString("NAMABARANG"));
//                k.setKodeBarang(b);
                kategoris.add(b);
            }

            conn.commit();
            return kategoris;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }

    public void TambahKartuStock(KartuStock kar) throws SQLException {

        String barang = kar.getKodeBarang().getKodeBarang();
        String tanggal = kar.getTanggal();
        String noBukti = kar.getNoBukti();
        String keterangan = kar.getKeterangan();
        int masuk = kar.getMasuk();
        int keluar = kar.getKeluar();
        int saldo = kar.getSaldo();

        conn.setAutoCommit(false);
        String sql = "insert into KARTUSTOCK (KODEBARANG, TANGGAL, NOBUKTI, KETERANGAN, "
                + "MASUK, KELUAR)"
                + " values ('" + barang + "','" + tanggal + "','" + noBukti + "','" + keterangan + "',"
                + masuk + "," + keluar + ")";
        Statement stat = conn.createStatement();
        stat.executeUpdate(sql);
        conn.close();
    }

    public void updateStok(KartuStock kart) throws SQLException {

        String ket = kart.getKeterangan();
        int mas = kart.getMasuk();
        int kel = kart.getKeluar();
        String Tanggal = kart.getTanggal();
        String nobuk = kart.getNoBukti();
        String sql = "update KARTUSTOCK set Keterangan=?,MASUK=?,KELUAR=? where TANGGAL=? and NOBUKTI=? ";
        java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);

        try {
            stat.setString(1, ket);
            stat.setInt(2, mas);
            stat.setInt(3, kel);
            stat.setString(4, Tanggal);
            stat.setString(5, nobuk);
            int selectedOption = JOptionPane.showConfirmDialog(null,
                    "Anda  ingin Mengubah data ini?",
                    "Update",
                    JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {

                stat.execute();
//                JOptionPane.showMessageDialog(null, "DATA TELAH DIUPDATE");
                conn.commit();
            }

            conn.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "DATA GAGAL DIUPDATE!!");
            conn.rollback();

        }

    }

    public static void cetakStock(JTable table) {
        try {
            String path="./laporan/kartu_stok.jrxml";
            if (!new File(path).exists()) {
                System.out.println("tidak ada");
            } else
            {
                System.out.println("ada");
            }
            Map<String,Object> param=new HashMap<String, Object>();
//        JasperPrint jp=JasperFillManager.fillReport(path, param , new JRTableModelDataSource(table.getModel()));
//        JasperViewer.viewReport(jp, false);
            JasperReport jasperReport=JasperCompileManager.compileReport(path);
            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, param,new JRTableModelDataSource(table.getModel()));
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(KartuStockKontrol.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void hapusStok(KartuStock kart) throws SQLException {

        String Tanggal = kart.getTanggal();
        String nobuk = kart.getNoBukti();
        String sql = "delete from KARTUSTOCK where TANGGAL=? and NOBUKTI=? ";
        java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);

        try {
            stat.setString(1, Tanggal);
            stat.setString(2, nobuk);
            int selectedOption = JOptionPane.showConfirmDialog(null,
                    "APA ANDA INGIN MENGHAPUS DATA INI?",
                    "HAPUS",
                    JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {

                stat.execute();
                conn.commit();
            }

            conn.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "DATA GAGAL DIHAPUS !!");
            conn.rollback();

        }

    }

//    public List<KartuStock> lihatSeluruhStok() throws SQLException {
//        PreparedStatement statement = null;
//        ResultSet result = null;
//
//        conn.setAutoCommit(false);
//        statement = conn.prepareStatement("select TANGGAL,NOBUKTI,KETERANGAN,MASUK,KELUAR "
//                + "from KARTUSTOCK order by TANGGAL");
//
//        result = statement.executeQuery();
//        List<KartuStock> kartu2 = new ArrayList<KartuStock>();
//        while (result.next()) {
//            KartuStock kart = new KartuStock();
//            kart.setTanggal(result.getString("TANGGAL"));
//            kart.setNoBukti(result.getString("NOBUKTI"));
//            kart.setKeterangan(result.getString("KETERANGAN"));
//            kart.setMasuk(result.getInt("MASUK"));
//            kart.setKeluar(result.getInt("KELUAR"));
//            kartu2.add(kart);
//        }
//        conn.commit();
//        return kartu2;
//    }
//    
//    public List<KartuStock> lihatSeluruhStok2(String kobar) throws SQLException {
//        PreparedStatement statement = null;
//        ResultSet result = null;
//
//        conn.setAutoCommit(false);
//        statement = conn.prepareStatement("select TANGGAL,NOBUKTI,KETERANGAN,MASUK,KELUAR from KARTUSTOCK \n" +
//"where KODEBARANG="+kobar+"order by TANGGAL;");
//
//        result = statement.executeQuery();
//        List<KartuStock> kartu2 = new ArrayList<KartuStock>();
//        while (result.next()) {
//            KartuStock kart = new KartuStock();
//            kart.setTanggal(result.getString("TANGGAL"));
//            kart.setNoBukti(result.getString("NOBUKTI"));
//            kart.setKeterangan(result.getString("KETERANGAN"));
//            kart.setMasuk(result.getInt("MASUK"));
//            kart.setKeluar(result.getInt("KELUAR"));
//            kartu2.add(kart);
//        }
//        conn.commit();
//        return kartu2;
//    }
    public List<KartuStock> LihatKartuStock(String kobar) throws SQLException {
        int saldoSebelum, saldoSesudah = 0;
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select k.tanggal, k.nobukti, k.keterangan, k.masuk ,k.keluar "
                    + " from kartustock k, barang b "
                    + " where k.kodebarang = b.kodebarang "
                    + "and k.KODEBARANG=" + kobar + " order by k.TANGGAL");
            result = statement.executeQuery();
            System.out.println("hasil " + statement);
            List<KartuStock> ks = new ArrayList<KartuStock>();
            System.out.println(result.getRow());
            while (result.next()) {
                KartuStock k = new KartuStock();
                k.setTanggal(result.getString("tanggal"));
                k.setNoBukti(result.getString("nobukti"));
                k.setKeterangan(result.getString("keterangan"));
                k.setMasuk(result.getInt("masuk"));
                k.setKeluar(result.getInt("keluar"));

                saldoSebelum = k.getMasuk() - k.getKeluar();
                saldoSesudah = saldoSesudah + saldoSebelum;
                k.setSaldo(saldoSesudah);
                saldoSebelum = 0;
                ks.add(k);
            }

            conn.commit();
            return ks;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }

//    public List<barang> lihatSeluruhStock() throws SQLException {
//        PreparedStatement statement = null;
//        ResultSet result = null;
//        try {
//            conn.setAutoCommit(false);
//            statement = conn.prepareStatement("select kodebarang, tanggal, nobukti, keterangan, masuk, keluar from kartustock order by tanggal");
//            result = statement.executeQuery();
//            List<barang> barangs = new ArrayList<barang>();
//            while (result.next()) {
//                barang brg = new barang();
//                kategoribarang kategori = new kategoribarang();
//                brg.setKodeBarang(result.getString("kodebarang"));
//                brg.setNamaBarang(result.getString("namabarang"));
//                brg.setKategori(kategori);
//                kategori.setKode_kategori(result.getString("kategori"));
//                brg.setRitelSesudah(result.getDouble("ritelsesudah"));
//
//                barangs.add(brg);
//            }
//
//            conn.commit();
//            return barangs;
//        } catch (SQLException exception) {
//            throw exception;
//        } finally {
//            try {
//                conn.setAutoCommit(true);
//                if (result != null) {
//                    result.close();
//                }
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException exception) {
//                throw exception;
//            }
//        }
//    }

}
