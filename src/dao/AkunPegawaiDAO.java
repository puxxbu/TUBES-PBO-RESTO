

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pegawai;
import model.AkunPegawai;


public class AkunPegawaiDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertAkunPegawai(AkunPegawai p){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO list_pegawai(id_pegawai, username, password) VALUES ('"
                + p.getPegawai().getId() + "','" + p.getUsername() + "','" + p.getPassword() + "')";
        
        System.out.println("Adding list_pegawai...");
        
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+"List Pegawai");
            statement.close();
        } catch (Exception e){
            System.out.println("Error adding List_pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<AkunPegawai> showAkunPegawai(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT lp.*, p.* FROM list_pegawai as lp JOIN pegawai as p ON lp.id_pegawai = p.id WHERE (p.nama_pegawai LIKE "
                + "'%" + query + "%'"
                + "OR p.shift_mulai LIKE '%" + query + "%'"
                + "OR p.shift_berakhir LIKE '%" + query + "%'"
                + "OR p.gaji LIKE '%" + query + "%'"
                + "OR p.email_pegawai LIKE '%" + query + "%'"
                + "OR lp.username LIKE '%" + query + "%'"
                + "OR lp.password LIKE '%" + query + "%') "
                + "ORDER BY lp.id";
        
        System.out.println("Mengambil data Transaksi...");
        
        List<AkunPegawai> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()) {
                    
                    
                    Pegawai p = new Pegawai(
                            Integer.parseInt(rs.getString("p.id")),
                            rs.getString("p.nama_pegawai"),
                            rs.getString("p.shift_mulai"),
                            rs.getString("p.shift_berakhir"),
                            Double.parseDouble(rs.getString("p.gaji")),
                            rs.getString("p.email_pegawai"));
                   
                    
                    AkunPegawai Ap = new AkunPegawai(
                            Integer.parseInt(rs.getString("lp.id")),
                            p,
                            rs.getString("lp.username"),
                            rs.getString("lp.password"));
                                             
                    list.add(Ap);
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
    
    public void updateAkunPegawai(AkunPegawai Ap) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE list_pegawai SET id_pegawai = '" + Ap.getPegawai().getId()
                + "', username = '" + Ap.getUsername() 
                + "', password = '" + Ap.getPassword()             
                + "' WHERE id = '" + Ap.getId() + "'";
            
              
        System.out.println("Editing list_pegawai...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+" list_pegawai "+Ap.getId());
            statement.close();
        } catch (Exception e){
            System.out.println("Error editing list_pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deleteAkunPegawai(int id){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM list_pegawai WHERE id = " + id + "";
        System.out.println("Deleteing list_pegawai...");
        
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" list_pegawai "+id);
            statement.close();
        } catch (Exception e){
            System.out.println("Error deleting list_pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
