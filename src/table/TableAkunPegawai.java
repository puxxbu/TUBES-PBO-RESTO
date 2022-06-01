

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.AkunPegawai;


public class TableAkunPegawai extends AbstractTableModel{
    private List<AkunPegawai> list;

    public TableAkunPegawai(List<AkunPegawai> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 7;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getPegawai().getNama_pegawai();
            case 1:
                return list.get(rowIndex).getPegawai().getShift_mulai();
            case 2:
                return list.get(rowIndex).getPegawai().getShift_berakhir();
            case 3:
                return list.get(rowIndex).getPegawai().getGaji();
            case 4:
                return list.get(rowIndex).getPegawai().getEmail_pegawai();
            case 5:
                return list.get(rowIndex).getUsername();
            case 6:
                return list.get(rowIndex).getPassword();
            case 7:
                return list.get(rowIndex).getId();
            case 8:
                return list.get(rowIndex).getPegawai().getId();  
            default:
                return null;
                
                
        }
        
    }
        
    

    public String getColumnName(int column){
        switch(column) {
            case 0:
                return "Nama Pegawai";
            case 1:
                return "Shift Mulai";
            case 2:
                return "Shift Berakhir";
            case 3:
                return "Gaji";
            case 4:
                return "Email Pegawai";
            case 5:
                return "Username";
            case 6:
                return "Password";
            default:
                return null;
                    
        }
    }
}
