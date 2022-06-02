/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.DetailPesananDAO;
import java.util.List;
import model.DetailPesanan;
import model.Pesanan;
import table.TableDetailPesanan;

/**
 Nama : Rakai Anandhi Mahardhika
 NPM : 200710914
 */
public class DetailPesananControl {
    private DetailPesananDAO dDAO = new DetailPesananDAO();
    
    public void insertDetailPesanan(DetailPesanan dp){
        dDAO.insert(dp);
    }
    
    public TableDetailPesanan showDataDetailPesanan(Pesanan p){
        List<DetailPesanan> dataDetailPesanan = dDAO.show(p);
        TableDetailPesanan tableDetailPesanan = new TableDetailPesanan(dataDetailPesanan);
        
        return tableDetailPesanan;
    }
}
