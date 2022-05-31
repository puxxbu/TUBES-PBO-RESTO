/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Teprutz
 */
public class DetailPesanan {
    private int id_pesanan;
    private int id_makanan;
    private int jumlah_pesanan;
    private int harga_total;

    public DetailPesanan(int id_pesanan, int id_makanan, int jumlah_pesanan, int harga_total) {
        this.id_pesanan = id_pesanan;
        this.id_makanan = id_makanan;
        this.jumlah_pesanan = jumlah_pesanan;
        this.harga_total = harga_total;
    }

    public int getId_pesanan() {
        return id_pesanan;
    }

    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    public int getId_makanan() {
        return id_makanan;
    }

    public void setId_makanan(int id_makanan) {
        this.id_makanan = id_makanan;
    }

    public int getJumlah_pesanan() {
        return jumlah_pesanan;
    }

    public void setJumlah_pesanan(int jumlah_pesanan) {
        this.jumlah_pesanan = jumlah_pesanan;
    }

    public int getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(int harga_total) {
        this.harga_total = harga_total;
    }
    
    
}
