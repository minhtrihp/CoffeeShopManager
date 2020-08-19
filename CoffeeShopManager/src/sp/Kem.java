/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp;

/**
 *
 * @author BTS4LIFE
 */
public class Kem extends SanPham{
    private String huongVi;
    public Kem(String ten, float gia, boolean tt, String tdb, String dm, 
            String lc, String hv) {
        super(ten, gia, tt, tdb, dm, lc);
        this.huongVi = hv;
    }

    /**
     * @return the huongVi
     */
    public String getHuongVi() {
        return huongVi;
    }

    /**
     * @param huongVi the huongVi to set
     */
    public void setHuongVi(String huongVi) {
        this.huongVi = huongVi;
    }
    
}
