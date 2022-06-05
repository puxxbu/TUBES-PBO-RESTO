/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pembayaran;

public class TablePembayaran extends AbstractTableModel {
    private List<Pembayaran> list;

    public TablePembayaran(List<Pembayaran> list) {
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
                return list.get(rowIndex).getStatus_pembayaran();
            case 6:
                return list.get(rowIndex).getId_pembeli();
            case 7:
                return list.get(rowIndex).getId_pegawai();
            default:
                return null;
                
                
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id Pesanan";
            case 1:
                return "Nama Pembeli";
            case 2:
                return "Nama Pegawai";
            case 3:
                return "Sub Total";
            case 4:
                return "Tanggal Pesanan";
            case 5:
                return "Status Pembayaran";
            default:
                return null;
        }
    }
}
