/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BTS4LIFE
 */
public class NhanVienDao {
    private static final String NHANVIEN_FILE_NAME = "nhanVien.txt";
    
    public void write(List<NhanVien> nvList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(NHANVIEN_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(nvList);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    
    public List<NhanVien> read() {
        List<NhanVien> nvList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null; 
        
        try {
            fis = new FileInputStream(new File(NHANVIEN_FILE_NAME));
            ois = new ObjectInputStream(fis);
            nvList = (List<NhanVien>) ois.readObject();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return nvList;
    }
    
    private void closeStream(InputStream is) {
        if(is != null) {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
    }
    
    private void closeStream(OutputStream os) {
        if(os != null) {
            try {
                os.close();
            } catch (IOException e) {
            }
        }
    }
}
