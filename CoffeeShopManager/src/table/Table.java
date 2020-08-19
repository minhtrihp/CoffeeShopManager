/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.io.Serializable;

/**
 *
 * @author BTS4LIFE
 */

public class Table implements Serializable{
    private static int dem = 0;
    private int id = ++dem;
    private int capacity;
    private boolean isEmpty = true;
    
    private int soLuong = 0;
    
    public Table() {
        this.id = 0;
        this.capacity = 0;
        this.isEmpty = true;
    }
    
    public Table(int capacity, boolean isEmpty) {
        super();
        this.capacity = capacity;
        this.isEmpty = isEmpty;
    }
    
    public Table(int capacity, boolean isEmpty, int sl) {
        super();
        this.capacity = capacity;
        this.isEmpty = isEmpty;
        this.soLuong = sl;
    }
    
    public String layTinhTrang() {
        if(this.isEmpty == true) {
            return "Trống";
        } else {
            return "Không trống";
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the isEmpty
     */
    public boolean getIsEmpty() {
        return isEmpty;
    }

    /**
     * @param isEmpty the isEmpty to set
     */
    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
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
