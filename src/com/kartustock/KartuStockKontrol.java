/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kartustock;

import com.barang.barang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
