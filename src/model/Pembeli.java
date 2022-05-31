/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Teprutz
 */
public class Pembeli {
    private int id;
    private String nama_pembeli;
    private String no_hp;

    public Pembeli(int id, String nama_pembeli, String no_hp) {
        this.id = id;
        this.nama_pembeli = nama_pembeli;
        this.no_hp = no_hp;
    }

    public Pembeli(String nama_pembeli, String no_hp) {
        this.nama_pembeli = nama_pembeli;
        this.no_hp = no_hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
    
    
    
}
