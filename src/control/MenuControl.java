/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import model.Menu;
import dao.MenuDAO;
import model.TempMenu;
import table.TableTempMenu;
import table.TableMenu;


public class MenuControl {
    private MenuDAO mDao = new MenuDAO();
    
//    public TableMahasiswa showMahasiswa(String query)
//    {
//        List<Mahasiswa> dataMahasiswa = mDao.showMahasiswa(query);
//        TableMahasiswa tableMahasiswa = new TableMahasiswa(dataMahasiswa);
//
//        return tableMahasiswa;
//    }
    
    public List<Menu> searchMenu(String query){
        List<Menu> dataMenu = mDao.searchMenu(query);
        return dataMenu;
    }
    
    public List<Menu> showListMenu(){
        List<Menu> dataMenu = mDao.showMenu();
        return dataMenu;
    }
    
    public TableMenu showDataMenu(String query){
        List<Menu> dataMenu = mDao.searchMenu(query);
        TableMenu tableMenu = new TableMenu(dataMenu);
        
        return tableMenu;
    }
    
    public TableTempMenu showTempMenu(List <TempMenu> dataMenu){
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
