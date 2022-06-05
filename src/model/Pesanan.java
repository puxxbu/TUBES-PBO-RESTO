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
    private int id_pegawai;
    private int id_pembeli;
    private Pembeli pembeli;
    private Pegawai pegawai;
    private double sub_total;
    private String tanggal_pesanan;
    private String status_pembayaran;

    public Pesanan(int id, Pembeli pembeli, Pegawai pegawai, double sub_total, String tanggal_pesanan, String status_pembayaran) {
        this.id = id;
        this.pembeli = pembeli;
        this.pegawai = pegawai;
        this.sub_total = sub_total;
        this.tanggal_pesanan = tanggal_pesanan;
        this.status_pembayaran = status_pembayaran;
    }

    public Pesanan(int id_pegawai, int id_pembeli, double sub_total, String tanggal_pesanan, String status_pembayaran) {
        this.id_pegawai = id_pegawai;
        this.id_pembeli = id_pembeli;
        this.sub_total = sub_total;
        this.tanggal_pesanan = tanggal_pesanan;
        this.status_pembayaran = status_pembayaran;
    }

    public int getId_pegawai() {
        return id_pegawai;
    }

    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public int getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(int id_pembeli) {
        this.id_pembeli = id_pembeli;
    }
    
    public String getStatus_pembayaran() {
        return status_pembayaran;
    }

    public void setStatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
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
