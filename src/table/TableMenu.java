/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Menu;

/**
 *
 * @author Teprutz tes
 */
public class TableMenu extends AbstractTableModel{
    private List<Menu> list;
    
    public TableMenu(List<Menu> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0: return list.get(rowIndex).getId();
            case 1: return list.get(rowIndex).getNama_menu();
            case 2: return list.get(rowIndex).getDeskripsi_menu();
            case 3: return list.get(rowIndex).getKategori();
            case 4: return list.get(rowIndex).getHarga_menu();
            default: return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0: return "ID";
            case 1: return "Nama Menu";
            case 2: return "Deskripsi Menu";
            case 3: return "Kategori";
            case 4: return "Harga Menu";
            default: return null;
        }
    }
}
