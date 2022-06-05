/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;
import dao.PembayaranDAO;
import java.util.List;
import model.Pembayaran;
import table.TablePembayaran;


public class PembayaranControl {
    private PembayaranDAO pDAO = new PembayaranDAO();
    
    public void insert(Pembayaran p){
        pDAO.insert(p);
    }
    
    public TablePembayaran showDataPesanan(){
        List<Pembayaran> dataPembayaran = pDAO.show();
        TablePembayaran tablePembayaran= new TablePembayaran(dataPembayaran);
        
        return tablePembayaran;
    }
}
