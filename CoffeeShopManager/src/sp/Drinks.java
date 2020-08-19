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
public class Drinks extends SanPham {
    private boolean haveIce;

    public Drinks(String ten, float gia, boolean tt, String tdb, String dm,
                    String lc, boolean haveIce) {
        super(ten, gia, tt, tdb, dm, lc);
        this.haveIce = haveIce;
    }
    
    public String haveIce() {
        if(haveIce == true) {
            return "Có đá";
        } else {
            return "Không đá";
        }
    }

    /**
     * @return the haveIce
     */
    public boolean isHaveIce() {
        return haveIce;
    }

    /**
     * @param haveIce the haveIce to set
     */
    public void setHaveIce(boolean haveIce) {
        this.haveIce = haveIce;
    }
}
