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
public abstract class SinhVienBiz extends SinhVienPoLy{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String Hoten, String Nganh) {
        super(Hoten, Nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    public double GetDiem(){
        return (2*diemMarketing + diemSales)/3;
    }
}
