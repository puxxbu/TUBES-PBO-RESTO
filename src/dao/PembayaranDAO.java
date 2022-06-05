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
import model.Pegawai;
import model.Pembayaran;
import model.Pembeli;


public class PembayaranDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insert(Pembayaran p){
        con = dbCon.makeConnection();
        
        String sql = " INSERT INTO pesanan(id_pembeli,id_pegawai,sub_total,tanggal_pesanan, status_pembayaran) "
                + "VALUES (" + p.getId_pembeli()+", "+ p.getId_pegawai()+", "+
                p.getSub_total()+", '"+p.getTanggal_pesanan() + "', '"+p.getStatus_pembayaran()+ "')";
        
        System.out.println("Adding Pesanan...");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result +" pesanan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    public List<Pembayaran> show(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT m.*,p.*, g.* FROM pembeli as m JOIN pesanan p ON m.id = p.id_pembeli "
                       +"JOIN pegawai g ON p.id_pegawai = g.id ";
        
        System.out.println("Mengambil data pesanan...");
        
        List<Pembayaran> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                   
                   Pegawai g = new Pegawai(
                            rs.getInt("g.id"),
                            rs.getString("g.nama_pegawai"),
                            rs.getString("g.shift_mulai"), 
                            rs.getString("g.shift_berakhir"),
                            rs.getDouble("g.gaji"),
                            rs.getString("g.email_pegawai")
                    );
                    Pembeli m = new Pembeli(
                            rs.getInt("m.id"),
                            rs.getString("m.nama_pembeli"),
                            rs.getString("m.no_hp")
                    );
                    
                    Pembayaran p = new Pembayaran(
                            rs.getInt("p.id"),
                            m,g,
                            rs.getDouble("p.sub_total"),
                            rs.getString("p.tanggal_pesanan"),
                            rs.getString("p.status_pembayaran")
                    );
                    
                    list.add(p);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        return list;
    }
}
