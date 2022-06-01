/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Teprutz tes
 */

import dao.PegawaiDAO;
import java.util.List;
import model.Pegawai;
public class PegawaiControl {
    private PegawaiDAO pDao = new PegawaiDAO();

    public List<Pegawai> showListPembeli() {
        List<Pegawai> dataPegawai = pDao.showPegawai();
        return dataPegawai;
    }
    
    public void insertDataPembeli(Pegawai p){
        pDao.insertPegawai(p);
    }

    
    public void deleteDataPegawai (int id){
        pDao.deletePegawai(id);
    }
    
    public void updateDataPegawai(Pegawai p){
        pDao.updatePegawai(p);
    }
}
