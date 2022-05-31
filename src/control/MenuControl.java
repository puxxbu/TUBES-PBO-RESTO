/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import model.Menu;
import dao.MenuDAO;
import table.TableTempMenu;
// import table.TableMenu menunggu nessa


public class MenuControl {
    private MenuDAO mDao = new MenuDAO();
    
//    public TableMahasiswa showMahasiswa(String query)
//    {
//        List<Mahasiswa> dataMahasiswa = mDao.showMahasiswa(query);
//        TableMahasiswa tableMahasiswa = new TableMahasiswa(dataMahasiswa);
//
//        return tableMahasiswa;
//    }
    
    public TableTempMenu showTempMenu(List <Menu> dataMenu){
        TableTempMenu tableTempMenu = new TableTempMenu(dataMenu);
        return tableTempMenu;
    }
   
    
    public void insertDataMenu(Menu m){
        mDao.insertMenu(m);
    }
    
    public void updateDataMenu(Menu m,String id){
        mDao.updateMenu(m, id);
    }
    
    public void deleteDataMenu(String id){
        mDao.deleteMenu(id);
    }
}
