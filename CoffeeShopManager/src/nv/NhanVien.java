/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nv;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author BTS4LIFE
 */
public class NhanVien implements Serializable{
    private static int dem = 0;
    private int maNhanVien = ++dem;
    private String hoNhanVien;
    private String tenNhanVien;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private String bp;
    
    public NhanVien() {
        
    }
    
    public NhanVien(String ho, String ten, String gt, String qq, 
            Date ns, Date nvl, String bp) {
        super();
        this.hoNhanVien = ho;
        this.tenNhanVien = ten;
        this.gioiTinh = gt;
        this.queQuan = qq;
        this.ngayVaoLam = nvl;
        this.ngaySinh = ns;
        this.bp = bp;
    }

    /**
     * @return the maNhanVien
     */
    public int getMaNhanVien() {
        return maNhanVien;
    }

    /**
     * @param maNhanVien the maNhanVien to set
     */
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    /**
     * @return the hoNhanVien
     */
    public String getHoNhanVien() {
        return hoNhanVien;
    }

    /**
     * @param hoNhanVien the hoNhanVien to set
     */
    public void setHoNhanVien(String hoNhanVien) {
        this.hoNhanVien = hoNhanVien;
    }

    /**
     * @return the tenNhanVien
     */
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    /**
     * @param tenNhanVien the tenNhanVien to set
     */
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVaoLam
     */
    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the bp
     */
    public String getBp() {
        return bp;
    }

    /**
     * @param bp the bp to set
     */
    public void setBp(String bp) {
        this.bp = bp;
    }
}
