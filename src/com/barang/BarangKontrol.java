/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barang;

import com.kategori.barang.kategoribarang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lorencius
 */
public class BarangKontrol {

    private Connection conn;

    public BarangKontrol(Connection koneksi) {
        this.conn = koneksi;
    }

    public static BarangKontrol getKoneksi() {
//        BarangKontrol kon = new BarangKontrol(com.koneksi.koneksi.getkoneksi());
        BarangKontrol kon = new BarangKontrol(com.koneksi.koneksi.getkoneksi("hr", "hr", "jdbc:Oracle:thin:@localhost:1521:xe"));
        return kon;
    }

    public void tambahKategori(barang bar) throws SQLException {
        PreparedStatement stat = null;
        try {
            conn.setAutoCommit(false);
            String sql = "insert into barang"
                    + "(kodebarang,namabarang,satuan,quantitymax,quantitymin,"
                    + "ritelsesudah,ritelsebelum,belisesudah,belisebelum,kategori,gambar) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?)";
//            java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            stat = conn.prepareStatement(sql);
            stat.setString(1, bar.getKodeBarang());
            stat.setString(2, bar.getNamaBarang());
            stat.setString(3, bar.getSatuan());
            stat.setDouble(4, bar.getQuantityMax());
            stat.setDouble(5, bar.getQuantityMin());
            stat.setDouble(6, bar.getRitelSesudah());
            stat.setDouble(7, bar.getRitelSebelum());
            stat.setDouble(8, bar.getBeliSesudah());
            stat.setDouble(9, bar.getBeliSebelum());
            stat.setString(10, bar.getKategori().getKode_kategori());
            stat.setString(11, bar.getGambar());
//            stat.execute();
//            stat.executeUpdate();
//            conn.close();
            stat.executeQuery();
            conn.commit();
            conn.close();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        }
    }

     public void tambahKategori2(barang bar) throws SQLException {
        PreparedStatement stat = null;
        try {
            conn.setAutoCommit(false);
            String sql = "insert into barang"
                    + "(kodebarang,namabarang,satuan,quantitymax,quantitymin,"
                    + "ritelsesudah,ritelsebelum,belisesudah,belisebelum,kategori,gambar) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?)";
//            java.sql.PreparedStatement stat = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            stat = conn.prepareStatement(sql);
            stat.setString(1, bar.getKodeBarang());
            stat.setString(2, bar.getNamaBarang());
            stat.setString(3, bar.getSatuan());
            stat.setDouble(4, bar.getQuantityMax());
            stat.setDouble(5, bar.getQuantityMin());
            stat.setDouble(6, bar.getRitelSesudah());
            stat.setDouble(7, bar.getRitelSebelum());
            stat.setDouble(8, bar.getBeliSesudah());
            stat.setDouble(9, bar.getBeliSebelum());
            stat.setString(10, bar.getKategori().getKode_kategori());
            stat.setString(11, bar.getGambar());
//            stat.execute();
//            stat.executeUpdate();
//            conn.close();
            stat.executeQuery();
            conn.commit();
            conn.close();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        }
    }

    public String cariNamaBarang(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select namabarang from barang where kodebarang like ?";
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
            String sql = "select satuan from barang where kodebarang like ?";
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

    public String cariQuantityMax(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select quantitymax from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("quantitymax");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariQuantityMin(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select quantitymin from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("quantitymin");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariRitelSesudah(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select ritelsesudah from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("ritelsesudah");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariRitelSebelum(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select ritelsebelum from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("ritelsebelum");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariBeliSesudah(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select belisesudah from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("belisesudah");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariBeliSebelum(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select belisebelum from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("belisebelum");
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        }
        return namaBarang;
    }

    public String cariGambar(barang kategori) throws Exception {
        PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select gambar from barang where kodebarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
            result = prepare.executeQuery();
            if (result.next()) {
                namaBarang = result.getString("gambar");
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
            String sql = "select kategori from barang where namabarang like ?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getNamaBarang());
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

    
    public List<barang> lihatKategori() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select kategori from barang order by kodebarang");
            result = statement.executeQuery();
            List<barang> barangs = new ArrayList<barang>();
            while (result.next()) {
                barang brg = new barang();
                kategoribarang kategori = new kategoribarang();
//                brg.setKodeBarang(result.getString("kodebarang"));
//                brg.setNamaBarang(result.getString("namabarang"));
                brg.setKategori(kategori);
                kategori.setKode_kategori(result.getString("kategori"));
//                brg.setRitelSesudah(result.getDouble("ritelsesudah"));

                barangs.add(brg);
            }

            conn.commit();
            return barangs;
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

    public String cariNomorTerakhir(barang barang) throws SQLException {

        String kode = barang.getKategori().getKode_kategori();
        System.out.println(kode);
        Statement stmt = conn.createStatement();
        String sql = "select TO_CHAR((count(*)+1),'0009') AS JUMROW from barang where kategori='" + kode + "'";
        String jumlahRow = "";

        ResultSet rset = stmt.executeQuery(sql);
        while (rset.next()) {
            jumlahRow = rset.getString("JUMROW");
        }
        conn.commit();
        conn.close();
        System.out.println(jumlahRow);
        return jumlahRow;
    }

    public List<barang> CaridariLIST(String nama) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select DISTINCT b.kodebarang, b.namabarang, k.KODEKATEGORI, b.ritelsesudah  "
                    + "from barang b, kategori k "
                    + "where b.kategori = k.KODEKATEGORI "
                    + "AND ( b.namabarang LIKE '%" + nama + "%' OR b.kodebarang LIKE '%" + nama + "%' )");

            result = statement.executeQuery();
            List<barang> barangs = new ArrayList<barang>();
            while (result.next()) {
                barang brg = new barang();
                kategoribarang kategori = new kategoribarang();
                brg.setKodeBarang(result.getString("kodebarang"));
                brg.setNamaBarang(result.getString("namabarang"));
                brg.setKategori(kategori);
                kategori.setKode_kategori(result.getString("KODEKATEGORI"));
                brg.setRitelSesudah(result.getDouble("ritelsesudah"));
                barangs.add(brg);
            }
            conn.commit();
            return barangs;
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
    
    public List<barang> lihatSeluruhKateogri() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select kodebarang,"
                    + "namabarang, kategori, ritelsesudah "
                    + "from barang order by kodebarang");
            result = statement.executeQuery();
            List<barang> barangs = new ArrayList<barang>();
            while (result.next()) {
                barang brg = new barang();
                kategoribarang kategori = new kategoribarang();
                brg.setKodeBarang(result.getString("kodebarang"));
                brg.setNamaBarang(result.getString("namabarang"));
                brg.setKategori(kategori);
                kategori.setKode_kategori(result.getString("kategori"));
                brg.setRitelSesudah(result.getDouble("ritelsesudah"));

                barangs.add(brg);
            }

            conn.commit();
            return barangs;
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

    public List<barang> TampilTabelCetak(String awal, String akhir) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select b.kodebarang, b.namabarang, k.KODEKATEGORI, b.ritelsesudah  "
                    + "from barang b, kategori k "
                    + "where b.kategori = k.KODEKATEGORI "
                    + "AND  b.kodebarang BETWEEN '" + awal + "' AND '" + akhir + "'");
//            statement=conn.prepareStatement("select DISTINCT b.kodebarang, b.namabarang, k.KODEKATEGORI, b.ritelsesudah " +
//"                    from barang b, kategori k " +
//"                    where b.kategori = k.KODEKATEGORI and b.kodebarang between 0030001 and 0040002;)
            result = statement.executeQuery();
            List<barang> barangs = new ArrayList<barang>();
            while (result.next()) {
                barang brg = new barang();
                
                kategoribarang kategori = new kategoribarang();
                
                brg.setKodeBarang(result.getString("kodebarang"));
                brg.setNamaBarang(result.getString("namabarang"));
                brg.setKategori(kategori);
                
                kategori.setKode_kategori(result.getString("KODEKATEGORI"));
                
                brg.setRitelSesudah(result.getDouble("ritelsesudah"));
                
                barangs.add(brg);
            }
            conn.commit();
            return barangs;
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
    public void updateBarang(barang barang) throws SQLException {
        String nama = barang.getNamaBarang();
        String kode = barang.getKodeBarang();
        String satuan = barang.getSatuan();
        String kategori = barang.getKategori().getKode_kategori();
        String gambar = barang.getGambar();
        Double qtymax = barang.getQuantityMax();
        Double qtymin = barang.getQuantityMin();
        Double ritel_Setelah = barang.getRitelSesudah();
        Double ritel_sebelum = barang.getRitelSebelum();
        Double beli_sebelum = barang.getBeliSebelum();
        Double beli_setelah = barang.getBeliSesudah();

        String sql = "update barang set namabarang = '" + nama + "'"
                + ", satuan='" + satuan + "'"
                + ", quantitymax='" + qtymax + "'"
                + ", quantitymin='" + qtymin + "'"
                + ", ritelsesudah='" + ritel_Setelah + "'"
                + ", ritelsebelum='" + ritel_sebelum + "'"
                + ", belisesudah='" + beli_setelah + "'"
                + ", belisebelum='" + beli_sebelum + "'"
                + ", gambar='" + gambar + "'"
                + " where kodebarang='" + kode + "'";
        Statement statment = conn.createStatement();
        System.out.println(sql);
        statment.executeUpdate(sql);
//        statment.executeQuery(sql);
        conn.close();
    }

    public void deleteBarang(barang barang) throws SQLException {
        PreparedStatement psmt = null;
        try{
            conn.setAutoCommit(false);

            String kode = barang.getKodeBarang();
            String sql = "DELETE FROM BARANG "
                    + "WHERE KODEBARANG=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, kode);
            psmt.executeUpdate();
            conn.commit();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        }
    }
    
    public String cariSemua(barang kategori) throws SQLException{
       PreparedStatement prepare = null;
        ResultSet result = null;
        String namaBarang = "";
        try {
            conn.setAutoCommit(true);
//            String sql = "select namakategori from kategori where kodekategori like ?";
            String sql="select kodebarang,namabarang,satuan,quantitymax,quantitymin, "
                    + "ritelsesudah,ritelsebelum,belisesudah,belisebelum,kategori,gambar from barang "
                    + "where kodebarang";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, kategori.getKodeBarang());
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
    
}
