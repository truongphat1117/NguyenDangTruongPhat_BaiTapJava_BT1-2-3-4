/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author phatc
 */
public abstract class SinhVienPoLy {
    String Hoten;
    String Nganh;

    public SinhVienPoLy(String Hoten, String Nganh) {
        this.Hoten = Hoten;
        this.Nganh = Nganh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    
    public abstract double GetDiem();
    public String GetHocLuc(){
        if(GetDiem() <5) return "Yếu";
        if(GetDiem() >= 5 && GetDiem() < 6.5 ) return "Trung Bình";
        if(GetDiem() >= 6.5 && GetDiem() < 7.5 ) return "Khá";
        if(GetDiem() >= 7.5 && GetDiem() < 9 ) return "Giỏi";
        else return "Xuất sắc";
    }
    public void xuat(){
        System.out.println("Họ tên :"+Hoten);
        System.out.println("Tên ngành học :"+Nganh);
        System.out.println("Điểm :"+GetDiem());
        System.out.println("Học lực :"+GetHocLuc());
    }
}

   

