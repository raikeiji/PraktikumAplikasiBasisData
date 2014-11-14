/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kategori.barang;

import com.kategori.barang.kategoribarang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dalvins
 */
public class KategoriTableModel extends AbstractTableModel {

    private List<kategoribarang> kategoris = new ArrayList<kategoribarang>();

    public KategoriTableModel(List<kategoribarang> kategoris) {
        this.kategoris = kategoris;
    }

    public void deleteKategori(int row){
        kategoris.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateKategori(int row, kategoribarang kategori){
        kategoris.set(row,kategori);
        fireTableRowsUpdated(row, row);
    }

    public void addKategori(kategoribarang kategori) {
        kategoris.add(kategori);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    public int getRowCount() {
        return kategoris.size();
    }

    
    public int getColumnCount() {
        return 2;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        kategoribarang b = kategoris.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getKode_kategori();
            case 1:
                return b.getNama_kategori();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE KATEGORI";
            case 1:
                return "NAMA KATEGORI";
            default:
                return "";
        }
    }
}