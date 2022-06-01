/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import model.TempMenu;
/**
 *
 * @author Teprutz
 */
public class TableTempMenu extends AbstractTableModel{
    private List<TempMenu> list;

    public TableTempMenu (List<TempMenu> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    @Override
    public int getColumnCount() {
        return 3;
    }
    
    
    @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            
            case 0:
                return list.get(rowIndex).getNama_menu();
            case 1:
                return list.get(rowIndex).getHarga_menu();
            case 2:
                return list.get(rowIndex).getJumlah_pesanan();
            
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
                return "Harga Menu";
            case 2:
                return "Jumlah Pesanan";
            default:
                return null;
        }
    }


}
