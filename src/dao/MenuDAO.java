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
        
        String sql = " INSERT INTO detail_menu(nama_menu,deskripsi_menu,kategori,harga_menu) "
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
    
    public List<Menu> searchMenu(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM detail_menu WHERE ("
                + "id LIKE '%"+query+"%'"
                + "OR nama_menu LIKE '%"+query+"%'"
                + "OR deskripsi_menu LIKE '%"+query+"%'"
                + "OR kategori LIKE '%"+query+"%'"
                + "OR harga_menu LIKE '%"+query+"%')";
        
        System.out.println("Searching Menu...");
        
        List<Menu> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    Menu m = new Menu(
                            Integer.parseInt(rs.getString("id")),
                            rs.getString("nama_menu"),
                            rs.getString("deskripsi_menu"),
                            rs.getString("kategori"),
                            Integer.parseInt(rs.getString("harga_menu"))
                    );
                    list.add(m);
                }
            }
            
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Searching Menu...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
    
    public void updateMenu (Menu m){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE detail_menu SET nama_menu = '" + m.getNama_menu() + "',"
                + "deskripsi_menu = '" + m.getDeskripsi_menu() + "',"
                + "kategori = '" + m.getKategori()+ "',"
                + "harga_menu = '" + m.getHarga_menu()+ "' "
                + "WHERE id = "+m.getId()+"";
        System.out.println("Editing ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Menu " + m.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    
public void deleteMenu(int id){
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
