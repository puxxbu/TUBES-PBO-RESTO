/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.PembeliDAO;
import java.util.List;
import model.Pembeli;

/**
 *
 * @author Teprutz
 */
public class PembeliControl {
    private PembeliDAO pDao = new PembeliDAO();
    
    public void insertPembeli(Pembeli p){
        pDao.insertPembeli(p);
    }
    
    public Pembeli getLastPembeli(){
        return pDao.getLastPembeli();
    }
    
}
