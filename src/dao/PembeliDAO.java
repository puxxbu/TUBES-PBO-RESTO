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
import model.Pembeli;

/**
 *
 * @author Teprutz
 */
public class PembeliDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPembeli(Pembeli p){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO pembeli(nama_pembeli,no_hp) VALUES ('"
                + p.getNama_pembeli()+ "','" + p.getNo_hp()  + "')";
        
        System.out.println("Adding Pembeli...");
        
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Pembeli");
            statement.close();
        } catch (Exception e){
            System.out.println("Error adding Pembeli...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public Pembeli getLastPembeli(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pembeli";
        System.out.println("Mengambil data Pegawai...");
        
        List<Pembeli> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()) {
                    
                    Pembeli p = new Pembeli(Integer.parseInt(rs.getString("id")),
                            rs.getString("nama_pembeli"),
                            rs.getString("no_hp"));
                    
                    list.add(p);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list.get(list.size()-1);
    }
    
}
