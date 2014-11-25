/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kartustock;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rai
 */
public class KartuStockTableModel extends AbstractTableModel{
    public List<KartuStock> kart = new ArrayList<KartuStock>();

    public KartuStockTableModel(List<KartuStock> kartu) {
        this.kart = kartu;
    }

    @Override
    public int getRowCount() {
        return kart.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       KartuStock kc= kart.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return kc.getTanggal().substring(0,10);
            case 1:
                return kc.getNoBukti();
            case 2:
                return kc.getKeterangan();
            case 3:
                return kc.getMasuk();
            case 4:
                return kc.getKeluar();
            case 5:
                return kc.getSaldo();
            default:
                return "";
        }
    }

    @Override
        public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Tanggal";
            case 1:
                return "Nomor Bukti";
            case 2:
                return "Keterangan";
            case 3:
                return "Masuk";
            case 4:
                return "Keluar";
            case 5:
                return "Saldo";
            default:
                return "";
        }
    }
}
