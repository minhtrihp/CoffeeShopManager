/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp;

import java.io.Serializable;

/**
 *
 * @author BTS4LIFE
 */
public class SanPham implements Serializable{
    
    private String ten;
    private float gia;
    private boolean tinhTrang = true;
    private String thoiDiemBan;
    private String danhMuc;
    private String luaChon;
    
    private int soLuong;
    
    public SanPham(String ten, float gia, boolean tt, String tdb, String dm,
            String lc) {
        super();
        this.ten = ten;
        this.gia = gia;
        this.tinhTrang = tt;
        this.thoiDiemBan = tdb;
        this.danhMuc = dm;
        this.luaChon = lc;
    }
    
    public SanPham(String ten, float gia, boolean tt, String tdb, String dm,
            String lc, int sl) {
        super();
        this.ten = ten;
        this.gia = gia;
        this.tinhTrang = tt;
        this.thoiDiemBan = tdb;
        this.danhMuc = dm;
        this.luaChon = lc;
        
        this.soLuong = sl;
    }
    
    public String layTinhTrang() {
        if(this.tinhTrang == true) {
            return "Còn";
        } else {
            return "Hết";
        }
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gia
     */
    public float getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(float gia) {
        this.gia = gia;
    }

    /**
     * @return the tinhTrang
     */
    public boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the thoiDiemBan
     */
    public String getThoiDiemBan() {
        return thoiDiemBan;
    }

    /**
     * @param thoiDiemBan the thoiDiemBan to set
     */
    public void setThoiDiemBan(String thoiDiemBan) {
        this.thoiDiemBan = thoiDiemBan;
    }

    /**
     * @return the danhMuc
     */
    public String getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    /**
     * @return the luaChon
     */
    public String getLuaChon() {
        return luaChon;
    }

    /**
     * @param luaChon the luaChon to set
     */
    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
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
