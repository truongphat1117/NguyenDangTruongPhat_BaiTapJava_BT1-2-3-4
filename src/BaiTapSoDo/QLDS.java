/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapSoDo;

import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class QLDS implements IQLDS {
    
    ArrayList<CaNhan> dscanhan = new ArrayList<>();

    public QLDS() {
    }

    public QLDS(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }

    public ArrayList<CaNhan> getDscanhan() {
        return dscanhan;
    }

    public void setDscanhan(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }
    
    @Override
    public int them(CaNhan p) {
        dscanhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for(int i = 0; i < dscanhan.size(); i++){
            CaNhan p = dscanhan.get(i);
            dscanhan.remove(i);
        }            
        return 1;
    }

    @Override
    public void inDS() {
        for(int i = 0; i < dscanhan.size(); i++){        
            CaNhan p = dscanhan.get(i);
            p.HienThiTT();
            System.out.println("--------------------------------------------------------------------------------");
        }                        
    }
    
}
