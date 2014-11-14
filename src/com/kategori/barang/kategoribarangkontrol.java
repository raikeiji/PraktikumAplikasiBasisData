/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kategori.barang;

import com.koneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class kategoribarangkontrol extends koneksi {

    private Connection conn;
    koneksi k = new koneksi();

    public kategoribarangkontrol() {
    }

    
    public kategoribarangkontrol(Connection koneksi) {
        this.conn = koneksi;
    }

//    public static kategoribarangkontrol getKoneksiKategori() throws SQLException {
//        kategoribarangkontrol kon = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi());
//        return kon;
//    }
    public static kategoribarangkontrol getKoneksiKategori() throws SQLException {
//        kategoribarangkontrol kon = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi());
        kategoribarangkontrol kon = new kategoribarangkontrol(com.koneksi.koneksi.getkoneksi("hr", "hr", "jdbc:Oracle:thin:@localhost:1521:xe"));
        return kon;
    }

    public void tambahKategori(kategoribarang kategori) throws SQLException {
        String kode = kategori.getKode_kategori();
        String nama = kategori.getNama_kategori();
        String sql = "insert into kategori(kodekategori,namakategori) "
                + "values('" + kode + "','" + nama + "')";
        java.sql.Statement stat = conn.createStatement();
        stat.executeUpdate(sql);
        conn.close();
    }

    public void tambahKategoriprepare(kategoribarang kategori) throws SQLException {
        String kode = kategori.getKode_kategori();
        String nama = kategori.getNama_kategori();
        String sql = "insert into kategori(kodekategori,namakategori) "
                + "values(?,?)";
        java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);
        stat.setString(1, kode);
        stat.setString(2, nama);
        stat.execute();
        conn.close();
    }

//    public void tambahKategoriprepare2(kategoribarang kategori) throws SQLException {
//        String kode = kategori.getKode_kategori();
//        String nama = kategori.getNama_kategori();
//        String sql = "insert into kategori(kodekategori,namakategori) "
//                + "values(?,?)";
//        java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);
//        try {
//            stat.setString(1, kode);
//            stat.setString(2, nama);
//            stat.execute();
//            conn.close();
//        } catch (Exception e) {
//            conn.rollback();
//        }
//    }
    public void tambahKategoriprepare2(kategoribarang kategori) throws SQLException, Exception {
        String kode = kategori.getKode_kategori();
        String nama = kategori.getNama_kategori();
        if (carikategoribarang(kategori).isEmpty()) {
            String sql = "insert into kategori(kodekategori,namakategori) "
                    + "values(?,?)";
            java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            try {
                stat.setString(1, kode);
                stat.setString(2, nama);
                stat.execute();
                conn.close();
            } catch (Exception e) {
                conn.rollback();
            }
        } else {
            String sql = "update kategori set namakategori=? where kodekategori=? ";
            java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setString(2, kode);
//            stat.execute();
            stat.executeUpdate();
            conn.commit();
        }
    }
    
    public void deleteKategoriprepare(kategoribarang kategori) throws SQLException {
        String kode = kategori.getKode_kategori();
        String nama = kategori.getNama_kategori();
        String sql = "delete from kategori where kodekategori='"+kode+"'";
                
        java.sql.Statement stat = conn.createStatement();
        stat.executeQuery(sql);
        conn.commit();
        conn.close();
    }

    public String carikategoribarang(kategoribarang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select namakategori from kategori where kodekategori like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKode_kategori());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("namakategori");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public List<kategoribarang> lihatSeluruhKateogri() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select kodekategori,"
                    + "namakategori "
                    + "from kategori order by kodekategori");
            result = statement.executeQuery();
            List<kategoribarang> kategoris = new ArrayList<kategoribarang>();
            while (result.next()) {
                kategoribarang kategori = new kategoribarang();
                kategori.setKode_kategori(result.getString("kodekategori"));
                kategori.setNama_kategori(result.getString("namakategori"));
                kategoris.add(kategori);
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
}
