/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapSoDo;

/**
 *
 * @author phatc
 */
public class Main {
    
    public static void main(String[] args) {
        LopHoc LH = new LopHoc();
        HocSinh HS1 = new HocSinh("59CNTT1", "Nhảy", "Nguyễn Đăng Trường Phát", 21, "Nha Trang", "0349343081");
        HocSinh HS2 = new HocSinh("59CNTT1", "Ca Hát", "Hà Yến Nhi", 22, "Đà Nẵng", "0377984529");
        
        GiaoVien GV1 = new GiaoVien("Nhập môn công nghệ thông tin", "Lập trình", "Nguyễn Văn Thuần", 40, "Nghệ An", "01676685783");
        GiaoVien GV2 = new GiaoVien("XLM và ứng dụng", "Thiết kế web", "Nguyễn Thị Thu Thúy", 32, "Nha Trang", "098346784");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        
        LH.themGVGD(GV1);
        LH.themGVGD(GV2);
        
        System.out.println("DANH SÁCH HỌC SINH: \n");
        LH.inDSHS();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("DANH SÁCH GIÁO VIÊN GIẢNG DẠY: \n");
        LH.inDSGVGD();
    }
    
}