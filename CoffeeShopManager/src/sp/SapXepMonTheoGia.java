/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp;

import java.util.Comparator;

/**
 *
 * @author Minh Trí HP
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minh Trí HP
 */

//Ham sap xep theo gia

public class SapXepMonTheoGia implements Comparator<SanPham> {
    @Override
    public int compare(SanPham mon1, SanPham mon2) {
        if (mon1.getGia() < mon2.getGia()) {
            return 1;
        }
        return -1;
    }
}
 


