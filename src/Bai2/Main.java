/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.NhanVien;

/**
 *
 * @author Laptop
 */
public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
        
        NhanVien NV1 = new NhanVien("Nguyễn Quỳnh Y","25", "Hồ Chí Minh", 6000000, 360);
        NhanVien NV2 = new NhanVien("Nguyễn Đăng Trường Phát","21", "Nha Trang", 2000000, 140);
        NhanVien NV3 = new NhanVien("Nguyễn Hải","56", "Diên Toàn", 10000000, 360);
        NhanVien NV4 = new NhanVien("Võ Thị Thâm","48", "Diên Phú", 15000000, 500);
        NhanVien NV5 = new NhanVien("Đậu Quang Lộc","21", "Phú Yên", 20000000, 300);
        
        QLNV.them(NV1);
        QLNV.them(NV2);
        QLNV.them(NV3);
        QLNV.them(NV4);
        QLNV.them(NV5);
        
        QLNV.inDS();
    }
}
