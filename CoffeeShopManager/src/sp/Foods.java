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
public class Foods extends SanPham {
    private boolean anChay = true;
    
    public Foods(String ten, float gia, boolean tt, String tdb, String dm,
            String lc, boolean anChay) {
        super(ten, gia, tt, tdb, dm, lc);
        this.anChay = anChay;
    }
    
    public String AnChay() {
        if(anChay == true) {
            return "Đồ ăn chay";
        } else {
            return "Đồ ăn không chay";
        }
    }

    /**
     * @return the anChay
     */
    public boolean isAnChay() {
        return anChay;
    }

    /**
     * @param anChay the anChay to set
     */
    public void setAnChay(boolean anChay) {
        this.anChay = anChay;
    }
    
}
