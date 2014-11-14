/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kartustock;

import com.barang.barang;

/**
 *
 * @author rai
 */
public class KartuStock {
    private barang kodeBarang;
    private String tanggal, noBukti, keterangan;
    private Double masuk, keluar, saldo;

    public KartuStock() {
    }

    public barang getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(barang kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNoBukti() {
        return noBukti;
    }

    public void setNoBukti(String noBukti) {
        this.noBukti = noBukti;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Double getMasuk() {
        return masuk;
    }

    public void setMasuk(Double masuk) {
        this.masuk = masuk;
    }

    public Double getKeluar() {
        return keluar;
    }

    public void setKeluar(Double keluar) {
        this.keluar = keluar;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
}
