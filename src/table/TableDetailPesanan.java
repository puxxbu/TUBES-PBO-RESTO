/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DetailPesanan;

/**
 Nama : Rakai Anandhi Mahardhika
 NPM : 200710914
 */
public class TableDetailPesanan extends AbstractTableModel{
    private List<DetailPesanan> list;

    public TableDetailPesanan(List<DetailPesanan> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 3;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        int subtotal = list.get(0).getHarga_total();
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getMenu().getNama_menu();
            case 1:
                return list.get(rowIndex).getJumlah_pesanan();
            case 2:
                return list.get(rowIndex).getHarga_total();
            case 3:
                return list.get(rowIndex).getId_pesanan();
            case 4:
                for(int i = 0; i<rowIndex; i++){
                    subtotal += list.get(rowIndex).getHarga_total();
                }
                return subtotal;
            default:
                return null;
                
                
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            
            case 0:
                return "Nama Menu";
            case 1:
                return "Jumlah Pesanan";
            case 2:
                return "Total Harga Pesanan";
            default:
                return null;
        }
    }
}
