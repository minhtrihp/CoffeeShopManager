/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nv;

/**
 *
 * @author BTS4LIFE
 */
public class BoPhan {
    private static int dem = 0;
    private int idBp = ++dem;
    private String tenBp;
    
    public BoPhan() {
        
    }
    
    public BoPhan(String ten) {
        this.tenBp = ten;
    }

    /**
     * @return the idBp
     */
    public int getIdBp() {
        return idBp;
    }

    /**
     * @param idBp the idBp to set
     */
    public void setIdBp(int idBp) {
        this.idBp = idBp;
    }

    /**
     * @return the tenBp
     */
    public String getTenBp() {
        return tenBp;
    }

    /**
     * @param tenBp the tenBp to set
     */
    public void setTenBp(String tenBp) {
        this.tenBp = tenBp;
    }
    
}
