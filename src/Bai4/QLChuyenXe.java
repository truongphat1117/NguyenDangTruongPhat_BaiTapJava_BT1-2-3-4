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
import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class QLChuyenXe {
    ArrayList<ChuyenXe> DSCX = new ArrayList<>();

    public QLChuyenXe() {
    }
    
    public void themChuyenXe(ChuyenXe Cx){
        DSCX.add(Cx);
    }
    public void inDSCX(){
        for(int i=0;i<DSCX.size();i++)
            DSCX.get(i).hienthiTTCX();
    }
    public double tinhDoanhThuNoiThanh()
    {
        double S = 0;
        for(int i=0;i < DSCX.size(); i++)
            if(DSCX.get(i) instanceof XeNoiThanh){
            S += DSCX.get(i).getDoanhthu();
            }
        return S;
    }
    public double tinhDoanhThuNgoaiThanh()
    {
        double S = 0;
        for(int i=0 ; i< DSCX.size(); i++)
            if(DSCX.get(i) instanceof XeNgoaiThanh){
            S += DSCX.get(i).getDoanhthu();
            }
        return S;
    }
    public double tongDoanhThu()
    {
        double S = 0;
        for(int i=0 ; i< DSCX.size(); i++){
            S += DSCX.get(i).getDoanhthu();
        }
        return S;
    }
}
