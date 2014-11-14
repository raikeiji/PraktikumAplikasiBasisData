/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barang;

//import com_kategori.KategoriBarang;
import com.kategori.barang.kategoribarang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class TabelModelBarang extends AbstractTableModel {

    private List<barang> barangs = new ArrayList<barang>();

    public TabelModelBarang(List<barang> barangs) {
        this.barangs = barangs;
    }

    public void deleteBarang(int row) {
        barangs.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateBarang(int row, barang barang) {
        barangs.set(row, barang);
        fireTableRowsUpdated(row, row);
    }

    public void addBarang(barang barang) {
        barangs.add(barang);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    public int getRowCount() {
        return barangs.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        barang b = barangs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getKodeBarang();
            case 1:
                return b.getNamaBarang();
            case 2:
                kategoribarang kabar = new kategoribarang();
                kabar = b.getKategori();
                return kabar.getKode_kategori();
            case 3:
                return b.getRitelSesudah();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODEBARANG";
            case 1:
                return "NAMABARANG";
            case 2:
                return "KATEGORI";
            case 3:
                return "RITELSESUDAH";
            default:
                return "";
        }
    }
}
