/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datban;

import java.io.Serializable;
import sp.SanPham;

/**
 *
 * @author BTS4LIFE
 */
public class DatBan implements Serializable{
    private table.Table tb; 
    private SanPham sp;
    private int soLuong;
    
    public DatBan(table.Table tb, SanPham sp, int soLuong) {
        super();
        this.tb = tb;
        this.sp = sp;
        this.soLuong = soLuong;
    }

    /**
     * @return the tb
     */
    public table.Table getTb() {
        return tb;
    }

    /**
     * @param tb the tb to set
     */
    public void setTb(table.Table tb) {
        this.tb = tb;
    }

    /**
     * @return the sp
     */
    public SanPham getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
