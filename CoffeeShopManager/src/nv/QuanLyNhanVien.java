/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BTS4LIFE
 */
public class QuanLyNhanVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<NhanVien> nvList; 
    private NhanVienDao nvDao;
    
    public void autoId(){
        int size = getNvList().size();
        for(int i = 0; i < size; i++) {
            getNvList().get(i).setMaNhanVien(++i);
        }
    }
    
    public QuanLyNhanVien() {
        nvDao = new NhanVienDao();
        nvList = nvDao.read();
    }
    
    public void add() throws ParseException {
        String ho = inputHo();
        String ten = inputTen();
        String gt = inputGt();
        String qq = inputQq();
        Date ns = new Date();
        Date nvl = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        ns = f.parse(inputNs()); 
        nvl = f.parse(inputNvl());
        String bp = inputBp();
        
        NhanVien nv = new NhanVien(ho, ten, gt, qq, ns, nvl, bp);
        getNvList().add(nv);
        nvDao.write(getNvList());
        System.out.println("Thêm thành công!!!");
    }
    
    public void update(int id) throws ParseException {
        boolean isExisted = false;
        int size = getNvList().size();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < size; i++) {
            if (getNvList().get(i).getMaNhanVien()== id) {
                isExisted = true;
                getNvList().get(i).setHoNhanVien(inputHo());
                getNvList().get(i).setTenNhanVien(inputTen());
                getNvList().get(i).setGioiTinh(inputGt());
                getNvList().get(i).setQueQuan(inputQq());
                getNvList().get(i).setNgaySinh( f.parse(inputNs()) );
                getNvList().get(i).setNgayVaoLam( f.parse(inputNvl()) );
                getNvList().get(i).setBp(inputBp());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d không tồn tại.\n", id);
        } else {
            nvDao.write(getNvList());
            System.out.println("Cập nhật thành công!!!");
        }
    }
    
    public void delete(int id) {
        NhanVien nv = null;
        int size = getNvList().size();
        for (int i = 0; i < size; i++) { 
            if (getNvList().get(i).getMaNhanVien()== id) {
                nv = getNvList().get(i);
                break;
            }
        }
        if (nv != null) {
            getNvList().remove(nv);
            nvDao.write(getNvList());
            System.out.println("Xóa thành công!!!");
        } else {
            System.out.printf("id = %d không tồn tại.\n", id);
        }
    }
    
    public void findNvByTen(String ten) {
        boolean isExisted = false;
        int size = getNvList().size();
        
        for(int i = 0; i < size; i++){
            if(getNvList().get(i).getTenNhanVien().equals(ten)) {
                isExisted = true;
                System.out.println("Mã nhân viên\t| Họ nhân viên\t| Tên nhân viên\t| "
                + "Giới tính\t| Ngày sinh\t| Ngày vào làm\t| Mã bộ phận\t| Tên bộ phận\t|");
                System.out.println();
                System.out.printf("%d\t|", getNvList().get(i).getMaNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getHoNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getTenNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getGioiTinh());
                System.out.printf("%s\t|", getNvList().get(i).getQueQuan());
                System.out.printf("%s\t|", getNvList().get(i).getNgaySinh());
                System.out.printf("%s\t|", getNvList().get(i).getNgayVaoLam());
                System.out.printf("%s\t\n", getNvList().get(i).getBp());
            } 
        }
        if (!isExisted) {
            System.out.printf("Danh sách %s không có.\n", ten);
        }
    }
    
    public void findNvByGt(String gioiTinh) {
        boolean isExisted = false;
        int size = getNvList().size();

        for(int i = 0; i < size; i++){
            if(getNvList().get(i).getGioiTinh().equals(gioiTinh)) {
                isExisted = true;
                System.out.println("Mã nhân viên\t| Họ nhân viên\t| Tên nhân viên\t| "
                + "Giới tính\t| Ngày sinh\t| Ngày vào làm\t| Mã bộ phận\t| Tên bộ phận\t|");
                System.out.println();
                System.out.printf("%d\t|", getNvList().get(i).getMaNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getHoNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getTenNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getGioiTinh());
                System.out.printf("%s\t|", getNvList().get(i).getQueQuan());
                System.out.printf("%s\t|", getNvList().get(i).getNgaySinh());
                System.out.printf("%s\t|", getNvList().get(i).getNgayVaoLam());
                System.out.printf("%s\t\n", getNvList().get(i).getBp());
            } 
        }
        if (!isExisted) {
            System.out.printf("Danh sách %s không có.\n", gioiTinh);
        }
    }
    
    public void findNvByQq(String qq) {
        boolean isExisted = false;
        int size = getNvList().size();

        for(int i = 0; i < size; i++){
            if(getNvList().get(i).getQueQuan().equals(qq)) {
                isExisted = true;
                System.out.println("Mã nhân viên\t| Họ nhân viên\t| Tên nhân viên\t| "
                + "Giới tính\t| Ngày sinh\t| Ngày vào làm\t| Mã bộ phận\t| Tên bộ phận\t|");
                System.out.println();
                System.out.printf("%d\t|", getNvList().get(i).getMaNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getHoNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getTenNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getGioiTinh());
                System.out.printf("%s\t|", getNvList().get(i).getQueQuan());
                System.out.printf("%s\t|", getNvList().get(i).getNgaySinh());
                System.out.printf("%s\t|", getNvList().get(i).getNgayVaoLam());
                System.out.printf("%s\t\n", getNvList().get(i).getBp());
            } 
        }
        if (!isExisted) {
            System.out.printf("Danh sách %s không có.\n", qq);
        }
    }
    
    public void findNvByNgaySinh(String ns) {
        boolean isExisted = false;
        int size = getNvList().size();

        for(int i = 0; i < size; i++){
            if(getNvList().get(i).getQueQuan().equals(ns)) {
                isExisted = true;
                System.out.println("Mã nhân viên\t| Họ nhân viên\t| Tên nhân viên\t| "
                + "Giới tính\t| Ngày sinh\t| Ngày vào làm\t| Mã bộ phận\t| Tên bộ phận\t|");
                System.out.println();
                System.out.printf("%d\t|", getNvList().get(i).getMaNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getHoNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getTenNhanVien());
                System.out.printf("%s\t|", getNvList().get(i).getGioiTinh());
                System.out.printf("%s\t|", getNvList().get(i).getQueQuan());
                System.out.printf("%s\t|", getNvList().get(i).getNgaySinh());
                System.out.printf("%s\t|", getNvList().get(i).getNgayVaoLam());
                System.out.printf("%s\t\n", getNvList().get(i).getBp());
            } 
        }
        if (!isExisted) {
            System.out.printf("Danh sách %s không có.\n", ns);
        }
    }
    
    public void show() {
        System.out.println("Mã nhân viên\t| Họ nhân viên\t| Tên nhân viên\t| "
                + "Giới tính\t| Ngày sinh\t| Ngày vào làm\t| Mã bộ phận\t| Tên bộ phận\t|");
        System.out.println();
        for(NhanVien nv: getNvList()) {
            System.out.printf("%d\t|", nv.getMaNhanVien());
            System.out.printf("%s\t|", nv.getHoNhanVien());
            System.out.printf("%s\t|", nv.getTenNhanVien());
            System.out.printf("%s\t|", nv.getGioiTinh());
            System.out.printf("%s\t|", nv.getQueQuan());
            System.out.printf("%s\t|", nv.getNgaySinh());
            System.out.printf("%s\t|", nv.getNgayVaoLam());
            System.out.printf("%s\t|\n", nv.getBp());
        }
    }
    
    private String inputHo() {
        System.out.print("Nhập họ nhân viên: ");
        return scanner.nextLine();
    }
    
    private String inputTen() {
        System.out.print("Nhập tên nhân viên: ");
        return scanner.nextLine();
    }
    
    private String inputGt() {
        System.out.print("Nhập giới tính nhân viên: ");
        return scanner.nextLine();
    }
    
    private String inputQq() {
        System.out.print("Nhập quê quán nhân viên: ");
        return scanner.nextLine();
    }
    
    private String inputNs() {
        System.out.print("Nhập ngày sinh nhân viên: ");
        return scanner.nextLine();
    }
    
    private String inputNvl() {
        System.out.print("Nhập ngày vào làm nhân viên: ");
        return scanner.nextLine();
    }
    
    private String inputBp() {
        System.out.print("Nhập bộ phận trực thuộc của nhân viên: ");
        return scanner.nextLine();
    }

    /**
     * @return the nvList
     */
    public List<NhanVien> getNvList() {
        return nvList;
    }

    /**
     * @param nvList the nvList to set
     */
    public void setNvList(List<NhanVien> nvList) {
        this.nvList = nvList;
    }
}
