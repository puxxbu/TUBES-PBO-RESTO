/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import model.Menu;
/**
 *
 * @author Teprutz
 */
public class TableTempMenu extends AbstractTableModel{
    private List<Menu> list;

    public TableTempMenu (List<Menu> list) {
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
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama_menu();
            case 2:
                return list.get(rowIndex).getHarga_menu();
            
            default:
                return null;
        }
    }
   
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama Menu";
            case 2:
                return "Harga Menu";
            default:
                return null;
        }
    }


}
