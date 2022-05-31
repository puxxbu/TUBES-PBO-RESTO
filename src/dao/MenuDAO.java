/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Menu;

/**
 *
 * @author Teprutz
 */
public class MenuDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertMenu(Menu m){
        con = dbCon.makeConnection();
        
        String sql = " INSERT INTO detail_menu(nama_menu,deskripsi_menu,kategori,harga_menu)"
                + "VALUES ('" + m.getNama_menu()+"', '"+ m.getDeskripsi_menu()+"', '"+
                m.getKategori()+"', '"+
                m.getHarga_menu() + "')";
        
        System.out.println("Adding Menu...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result );
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Menu> showMenu(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM detail_menu";
        System.out.println("Mengambil data ...");
        
        List<Menu> list = new ArrayList<>();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {                    
                        Menu m = new Menu(
                              rs.getString("nama_menu"), 
                              rs.getString("nama_menu"), 
                              rs.getString("kategori"), 
                              rs.getInt("harga_menu"));
                      
                    
                    list.add(m);
                    
                    
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding ...");
            System.out.println(e);
        }
        return list;
    }
    
//    public Menu searchMenu (String id){
//        con = dbCon.makeConnection();
//        
//        String sql = "SELECT * FROM computer WHERE id = '"
//                + id + "'";
//        System.out.println("Searching ...");
//        Computer c = null;
//        
//        try {
//            Statement statement = con.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            
//            if (rs != null) {
//                while (rs.next()) {                    
//                    c = new Computer(rs.getString("id"),
//                            rs.getString("nama"),
//                            rs.getString("processor"),
//                            rs.getString("jenis"),
//                            rs.getInt("kapasitasRAM"),
//                            rs.getInt("dayaListrik"),
//                            rs.getInt("kapasitasBaterai"));
//                }
//            }
//            rs.close();
//            statement.close();
//        } catch (Exception e) {
//            System.out.println("Error reading database...");
//            System.out.println(e);
//        }
//        dbCon.closeConnection();
//        return c;
//        
//    }
    
    public void updateMenu (Menu m, String id){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE detail_menu SET id = '" +m.getId() +"',"
                + "nama_menu = '" + m.getNama_menu() + "',"
                + "deskripsi_menu = '" + m.getDeskripsi_menu() + "',"
                + "kategori = '" + m.getKategori()+ "',"
                + "harga_menu = '" + m.getHarga_menu()+ "' "
                + "WHERE id = '" + id + "'";
        System.out.println("Editing ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Menu " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    
public void deleteMenu(String id){
    con = dbCon.makeConnection();
    
    String sql = "DELETE FROM detail_menu WHERE id = '"
            + id + "'";
    System.out.println("Deleting Computer...");
    
    try {
        Statement statement = con.createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println("Delete " + result + " Menu with id =  " + id);
        statement.close();
    } catch (Exception e) {
        System.out.println("Error reading database...");
        System.out.println(e);
    }
    dbCon.closeConnection();
}    
    
}
