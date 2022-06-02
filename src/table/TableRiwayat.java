/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pesanan;

/**
 Nama : Rakai Anandhi Mahardhika
 NPM : 200710914
 */
public class TableRiwayat extends AbstractTableModel {
    private List<Pesanan> list;

    public TableRiwayat(List<Pesanan> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getPembeli().getNama_pembeli();
            case 2:
                return list.get(rowIndex).getPegawai().getNama_pegawai();
            case 3:
                return list.get(rowIndex).getSub_total();
            case 4:
                return list.get(rowIndex).getTanggal_pesanan();
            case 5:
                return list.get(rowIndex).getPembeli().getId();
            case 6:
                return list.get(rowIndex).getPegawai().getId();
            default:
                return null;
                
                
        }
    }
}
