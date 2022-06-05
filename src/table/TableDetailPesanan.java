/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DetailPesanan;


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
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getMenu().getNama_menu();
            case 1:
                return list.get(rowIndex).getJumlah_pesanan();
            case 2:
                return list.get(rowIndex).getHarga_total();
            case 3:
                return list.get(rowIndex).getId_pesanan();
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
