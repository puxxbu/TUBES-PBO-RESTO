/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Teprutz tes
 */

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pegawai;

public class PegawaiDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPegawai(Pegawai p){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO pegawai(nama_pegawai, shift_mulai, shift_berakhir, gaji, email_pegawai) VALUES ('"
                + p.getNama_pegawai() + "','" + p.getShift_mulai() + "','" + p.getShift_berakhir() +  "'," + p.getGaji() + ",'" +p.getEmail_pegawai() + "')";
        
        System.out.println("Adding Pegawai...");
        
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Pegawai");
            statement.close();
        } catch (Exception e){
            System.out.println("Error adding Pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updatePegawai(Pegawai p) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE pegawai SET nama_pegawai = '" + p.getNama_pegawai() + "',"
                + "shift_mulai = '" + p.getShift_mulai() + "', " +  "shift_berakhir = '" +p.getShift_berakhir() + "', " + " gaji = "+p.getGaji() + " , " + "email_pegawai = '" +p.getEmail_pegawai() + "' WHERE id = '"+p.getId()+"'";
        System.out.println("Editing Pegawai...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Pegawai "+p.getId());
            statement.close();
        } catch (Exception e){
            System.out.println("Error editing Pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Pegawai> showPegawai(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pegawai";
        System.out.println("Mengambil data Pegawai...");
        
        List<Pegawai> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()) {
                    Pegawai p = new Pegawai(
                            Integer.parseInt(rs.getString("id")),
                            rs.getString("nama_pegawai"),
                            rs.getString("shift_mulai"),
                            rs.getString("shift_berakhir"),
                            Double.parseDouble(rs.getString("gaji")),
                            rs.getString("email_pegawai"));
                    
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
        
        return list;
    }
    
    public void deletePegawai(int id){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM pegawai WHERE id = " + id + "";
        System.out.println("Deleteing Pegawai...");
        
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Pegawai "+id);
            statement.close();
        } catch (Exception e){
            System.out.println("Error deleting pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
