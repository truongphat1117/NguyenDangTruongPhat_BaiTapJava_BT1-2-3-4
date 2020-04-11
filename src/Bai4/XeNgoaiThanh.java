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
public abstract class XeNgoaiThanh extends ChuyenXe {
    private String Noiden;
    private int Songaydi;

    public XeNgoaiThanh(String Noiden, int Songaydi, int Maso, String HotenTX, String Soxe, double doanhthu) {
        super(Maso, HotenTX, Soxe, doanhthu);
        this.Noiden = Noiden;
        this.Songaydi = Songaydi;
    }

    public String getNoiden() {
        return Noiden;
    }

    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }

    public int getSongaydi() {
        return Songaydi;
    }

    public void setSongaydi(int Songaydi) {
        this.Songaydi = Songaydi;
    }
    @Override
     public void hienthiTTCX() {
        System.out.println("\nThông tin chuyến xe ngoại thành :\n");
        super.hienthiTTCX();
        System.out.println(", Nơi đến :"+ Noiden +", Số ngày đi được"+ Songaydi );
    } 
    
}
