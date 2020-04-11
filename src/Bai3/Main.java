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
public class Main {
    public static void main(String[] args) {
        SinhVienPoLy SV1 = new SinhVienIT(7, 6, 8, "Nguyễn Đăng Trường Phát", "CNTT") {} ;
        System.out.println("\nSinh vien IT cua sinh vien Poly");
        SV1.xuat();
        
        SinhVienPoLy SV2 = new SinhVienBiz(8, 8, "Hà Yến Nhi", "tài chính ngân hàng") {};
        System.out.println("\nSinh vien Biz cua sinh vien Poly");
        SV2.xuat();
    }
}
