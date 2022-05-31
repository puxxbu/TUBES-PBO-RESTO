/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Teprutz
 */
public class Menu {
    private int id;
    private String nama_menu;
    private String deskripsi_menu;
    private String kategori;
    private int harga_menu;

    public Menu(String nama_menu, String deskripsi_menu, String kategori, int harga_menu) {
        this.nama_menu = nama_menu;
        this.deskripsi_menu = deskripsi_menu;
        this.kategori = kategori;
        this.harga_menu = harga_menu;
    }

    public Menu(int id, String nama_menu, String deskripsi_menu, String kategori, int harga_menu) {
        this.id = id;
        this.nama_menu = nama_menu;
        this.deskripsi_menu = deskripsi_menu;
        this.kategori = kategori;
        this.harga_menu = harga_menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public String getDeskripsi_menu() {
        return deskripsi_menu;
    }

    public void setDeskripsi_menu(String deskripsi_menu) {
        this.deskripsi_menu = deskripsi_menu;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga_menu() {
        return harga_menu;
    }

    public void setHarga_menu(int harga_menu) {
        this.harga_menu = harga_menu;
    }
    
    
    
    
    
}
