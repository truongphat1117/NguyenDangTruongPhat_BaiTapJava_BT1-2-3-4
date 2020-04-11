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

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NhanVien Nv1 = new NhanVien ("Nguyễn Đăng Trường Phát","20" , "NhaTrang", 900000, 250);
       NhanVien Nv2 = new NhanVien ("Nguyen Hải","25","Cam Ranh", 9000, 210);
            System.out.println("Nhan Vien  nv1:" + Nv1.getThongtin());
            System.out.println("Nhan Vien nv2:" + Nv2.getThongtin());
    }
    
}