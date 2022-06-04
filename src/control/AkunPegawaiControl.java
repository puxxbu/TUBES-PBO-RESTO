

package control;

import dao.AkunPegawaiDAO;
import java.util.List;
import model.AkunPegawai;
import table.TableAkunPegawai;


public class AkunPegawaiControl {
    private AkunPegawaiDAO ApDao = new AkunPegawaiDAO();
    
    public void insertDataAkunPegawai(AkunPegawai Ap) {
        ApDao.insertAkunPegawai(Ap);
    }
    
    public List<AkunPegawai> showListAkunPegawai (String query){
        List<AkunPegawai> dataAkunPegawai = ApDao.showAkunPegawai(query);
        return dataAkunPegawai;
    }
    
    public TableAkunPegawai showDataAkunPegawai (String query){
        List<AkunPegawai> dataAkunPegawai = ApDao.showAkunPegawai(query);
        TableAkunPegawai tableAkunPegawai = new TableAkunPegawai(dataAkunPegawai);
        
        return tableAkunPegawai;
    }
    
    public void updateDataAkunPegawai(AkunPegawai Ap) {
        ApDao.updateAkunPegawai(Ap);
    }
    
    public void deleteDataAkunPegawai(int id){
       ApDao.deleteAkunPegawai(id);
    }
}
