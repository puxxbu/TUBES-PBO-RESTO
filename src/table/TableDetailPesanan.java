/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import model.DetailPesanan;

/**
 Nama : Rakai Anandhi Mahardhika
 NPM : 200710914
 */
public class TableDetailPesanan {
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
                return list.get(rowIndex).getHarga_total()*list.get(rowIndex).getJumlah_pesanan();  
            default:
                return null;
                
                
        }
    }
}
