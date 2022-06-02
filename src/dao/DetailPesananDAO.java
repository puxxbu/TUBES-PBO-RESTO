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
import model.Pesanan;
import model.Menu;
import model.DetailPesanan;

public class DetailPesananDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insert(DetailPesanan d){
        con = dbCon.makeConnection();
        
        String sql = " INSERT INTO detail_pesanan(id_pesanan,id_menu,jumlah_pesanan,harga_total)"
                + "VALUES (" + d.getId_pesanan()+", "+ d.getMenu().getId()+", "+
                d.getJumlah_pesanan()+", "+d.getHarga_total() + ")";
        
        System.out.println("Adding Detail Pesanan...");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result +" detail pesanan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
//     tabel bawah(?)
    public List<DetailPesanan> show(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT d.*, m.* FROM detail_pesanan d "
                    +"JOIN detail_menu m on d.id_menu = m.id "
                    +"WHERE d.detail_pesanan = "+id+" ";
        
        System.out.println("Mengambil data pesanan...");
        
        List<DetailPesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                   Menu m = new Menu(
                            rs.getInt("m.id"),
                            rs.getString("m.nama_menu"),
                            rs.getString("m.deskripsi_menu"), 
                            rs.getString("m.kategori"),
                            rs.getInt("m.harga_menu")
                    );
                    DetailPesanan d = new DetailPesanan(
                            rs.getInt("d.id"),
                            m,
                            rs.getInt("d.jumlah_pesanan"),
                            rs.getInt("d.harga_total")
                    );
                    
                    list.add(d);
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
