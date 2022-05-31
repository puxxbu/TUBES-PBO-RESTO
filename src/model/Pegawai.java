/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Teprutz
 */
public class Pegawai {
    private int id;
    private String nama_pegawai;
    private String shift_mulai;
    private String shift_berakhir;
    private double gaji;
    private String email_pegawai;

    public Pegawai(int id, String nama_pegawai, String shift_mulai, String shift_berakhir, double gaji, String email_pegawai) {
        this.id = id;
        this.nama_pegawai = nama_pegawai;
        this.shift_mulai = shift_mulai;
        this.shift_berakhir = shift_berakhir;
        this.gaji = gaji;
        this.email_pegawai = email_pegawai;
    }

    public Pegawai(String nama_pegawai, String shift_mulai, String shift_berakhir, double gaji, String email_pegawai) {
        this.nama_pegawai = nama_pegawai;
        this.shift_mulai = shift_mulai;
        this.shift_berakhir = shift_berakhir;
        this.gaji = gaji;
        this.email_pegawai = email_pegawai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getShift_mulai() {
        return shift_mulai;
    }

    public void setShift_mulai(String shift_mulai) {
        this.shift_mulai = shift_mulai;
    }

    public String getShift_berakhir() {
        return shift_berakhir;
    }

    public void setShift_berakhir(String shift_berakhir) {
        this.shift_berakhir = shift_berakhir;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getEmail_pegawai() {
        return email_pegawai;
    }

    public void setEmail_pegawai(String email_pegawai) {
        this.email_pegawai = email_pegawai;
    }
    
    

    
    
    
    
}
