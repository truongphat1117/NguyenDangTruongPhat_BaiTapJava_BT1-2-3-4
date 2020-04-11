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
public abstract class XeNoiThanh extends ChuyenXe {
    private int sotuyen;
    private int sokm;

    public XeNoiThanh(int sotuyen, int sokm, int Maso, String HotenTX, String Soxe, double doanhthu) {
        super(Maso, HotenTX, Soxe, doanhthu);
        this.sotuyen = sotuyen;
        this.sokm = sokm;
    }

    public int getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(int sotuyen) {
        this.sotuyen = sotuyen;
    }

    public int getSokm() {
        return sokm;
    }

    public void setSokm(int sokm) {
        this.sokm = sokm;
    }
    
    @Override
    public void hienthiTTCX() {
        System.out.println("\nThông tin chuyến xe nội thành :\n");
        super.hienthiTTCX();
        System.out.println(", Số tuyến :"+ sotuyen +", Số Km đi được"+ sokm );
    }
    
    
}
