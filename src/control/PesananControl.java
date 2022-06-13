/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.PesananDAO;
import java.util.List;
import model.Pesanan;
import table.TableRiwayat;

/**
 Nama : Rakai Anandhi Mahardhika
 NPM : 200710914
 */
public class PesananControl {
    private PesananDAO pDAO = new PesananDAO();
    
    public void insertDetailPesanan(Pesanan p){
        pDAO.insert(p);
    }
    
    public Pesanan getLastPesanan(){
        return pDAO.getLastPesanan();
    }
    
    public void updatePesanan(String id){
        pDAO.updatePesanan(id);
    }
    

    public TableRiwayat showData(){
        List<Pesanan> dataPesanan = pDAO.show();
        TableRiwayat tablePesanan = new TableRiwayat(dataPesanan);
        
        return tablePesanan;
    }
    
    public TableRiwayat showDataPesananTerbayar(){
        List<Pesanan> dataPesanan = pDAO.showTerbayar();
        TableRiwayat tablePesanan = new TableRiwayat(dataPesanan);
        
        return tablePesanan;
    }
}
