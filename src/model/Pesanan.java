/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Teprutz
 */
public class Pesanan {
    private int id;
    private int id_pembeli;
    private double sub_total;
    private String tanggal_pesanan;

    public Pesanan(int id, int id_pembeli, double sub_total, String tanggal_pesanan) {
        this.id = id;
        this.id_pembeli = id_pembeli;
        this.sub_total = sub_total;
        this.tanggal_pesanan = tanggal_pesanan;
    }

    public Pesanan(int id_pembeli, double sub_total, String tanggal_pesanan) {
        this.id_pembeli = id_pembeli;
        this.sub_total = sub_total;
        this.tanggal_pesanan = tanggal_pesanan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(int id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }

    public String getTanggal_pesanan() {
        return tanggal_pesanan;
    }

    public void setTanggal_pesanan(String tanggal_pesanan) {
        this.tanggal_pesanan = tanggal_pesanan;
    }
    
    
    
}
