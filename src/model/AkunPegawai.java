/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Teprutz
 */
public class AkunPegawai {
    private int id;
    private int id_pegawai;
    private String username;
    private String password;

    public AkunPegawai(int id, int id_pegawai, String username, String password) {
        this.id = id;
        this.id_pegawai = id_pegawai;
        this.username = username;
        this.password = password;
    }

    public AkunPegawai(int id_pegawai, String username, String password) {
        this.id_pegawai = id_pegawai;
        this.username = username;
        this.password = password;
    }
    
    
}
