/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author phatc
 */
public class NhanVien {
    String TenNhanVien;
    String Tuoi;
    String Diachi;
    double TienLuong;
    int sogiolam;

    public NhanVien() {
    }

    public NhanVien(String TenNhanVien, String Tuoi, String Diachi, double TienLuong, int sogiolam) {
        this.TenNhanVien = TenNhanVien;
        this.Tuoi = Tuoi;
        this.Diachi = Diachi;
        this.TienLuong = TienLuong;
        this.sogiolam = sogiolam;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public int getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }

    public String getThongtin() {
        return "NhanVien{" + "TenNhanVien=" + TenNhanVien + ", Tuoi=" + Tuoi + ", Diachi=" + Diachi + ", TienLuong=" + TienLuong + ", sogiolam=" + sogiolam + '}';
    }
    
    public double TienThuong(){
        if(sogiolam>=200)return TienLuong*0.2;
        else if(sogiolam<200&&sogiolam>100)return TienLuong*0.1;
        return 0;
    }
    
}

