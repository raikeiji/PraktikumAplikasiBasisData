/*
 * harga setelah=harga setelah + harga setelah * 10 /100
 * atau harga setelah (1+10/100)
 * atau harga setelah = harga sebelum * 1.1/10
 * harga sebelum = harga setelah * 10/11
 */
package com.barang;

import com.kategori.barang.kategoribarang;

/**
 *
 * @author admin
 */
public class barang {
    public String namaBarang, kodeBarang, satuan, gambar;
    public kategoribarang kategori;
    public double ritelSebelum, ritelSesudah, beliSebelum, beliSesudah, quantityMax, quantityMin;

    public kategoribarang getKategori() {
        return kategori;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public void setKategori(kategoribarang kategori) {
        this.kategori = kategori;
    }

    public double getBeliSebelum() {
        return beliSebelum;
    }

    public void setBeliSebelum(double beliSebelum) {
        this.beliSebelum = beliSebelum;
    }

    public double getBeliSesudah() {
        return beliSesudah;
    }

    public void setBeliSesudah(double beliSesudah) {
        this.beliSesudah = beliSesudah;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getQuantityMax() {
        return quantityMax;
    }

    public void setQuantityMax(double quantityMax) {
        this.quantityMax = quantityMax;
    }

    public double getQuantityMin() {
        return quantityMin;
    }

    public void setQuantityMin(double quantityMin) {
        this.quantityMin = quantityMin;
    }

    public double getRitelSebelum() {
        return ritelSebelum;
    }

    public void setRitelSebelum(double ritelSebelum) {
        this.ritelSebelum = ritelSebelum;
    }

    public double getRitelSesudah() {
        return ritelSesudah;
    }

    public void setRitelSesudah(double ritelSesudah) {
        this.ritelSesudah = ritelSesudah;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
}
