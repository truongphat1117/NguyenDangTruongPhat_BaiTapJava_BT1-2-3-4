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
public class Main {
    public static void main(String[] args) {
        QLChuyenXe QLCX = new QLChuyenXe();
        XeNoiThanh XNT1 = new XeNoiThanh (10, 300, 113, "Nguyễn Đăng Trường Phát", "79D1-43771", 1900000) {};
        XeNoiThanh XNT2 = new XeNoiThanh (5, 600, 119, "Nguyễn Hải", "79D1-31772", 2900000) {};
        XeNoiThanh XNT3 = new XeNoiThanh (8, 700, 120, "Võ Thị Thâm", "79D1-7809", 3900000) {};
        XeNgoaiThanh XNGT1 = new XeNgoaiThanh("Đà Lạt", 116, 1, "Lê Hà Anh Huy", "79D1-30119", 3500000) {};
        XeNgoaiThanh XNGT2 = new XeNgoaiThanh("Hồ Chí Minh", 125, 2, "Nguyễn Ngọc Gia Hân", "79D1-99999", 7500000) {};
        XeNgoaiThanh XNGT3 = new XeNgoaiThanh("SaPa", 126, 4, "Nguyễn Thị Như Ý", "79D1-7777", 5500000) {};
       
        QLCX.themChuyenXe(XNT1);
        QLCX.themChuyenXe(XNT2);
        QLCX.themChuyenXe(XNT3);
        QLCX.themChuyenXe(XNGT1);
        QLCX.themChuyenXe(XNGT2);
        QLCX.themChuyenXe(XNGT3);
        
        QLCX.inDSCX();
        
        System.out.println("Tổng doanh thu chuyến xe ngoại thành :"+QLCX.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu chuyến xe nội thành :"+QLCX.tinhDoanhThuNoiThanh());
        System.out.println("tổng doanh thu cả 2 loại xe :"+QLCX.tongDoanhThu());
        
    }
}
