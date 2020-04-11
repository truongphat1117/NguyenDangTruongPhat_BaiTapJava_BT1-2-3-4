/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author phatc
 */
public abstract class ChuyenXe {
    int Maso;
    String HotenTX;
    String Soxe;
    double doanhthu;

    public ChuyenXe(int Maso, String HotenTX, String Soxe, double doanhthu) {
        this.Maso = Maso;
        this.HotenTX = HotenTX;
        this.Soxe = Soxe;
        this.doanhthu = doanhthu;
    }

    public int getMaso() {
        return Maso;
    }

    public void setMaso(int Maso) {
        this.Maso = Maso;
    }

    public String getHotenTX() {
        return HotenTX;
    }

    public void setHotenTX(String HotenTX) {
        this.HotenTX = HotenTX;
    }

    public String getSoxe() {
        return Soxe;
    }

    public void setSoxe(String Soxe) {
        this.Soxe = Soxe;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
    public void hienthiTTCX()
    {
        System.out.println("Mã số chuyến xe :"+Maso+", Họ tên tài xế :"+HotenTX+", Số xe :"+Soxe+", Doanh thu :"+doanhthu);
    }
     
}
