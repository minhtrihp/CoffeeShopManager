/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BTS4LIFE
 */
public class QuanLySanPham {
    public static Scanner scanner = new Scanner(System.in);
    private List<SanPham> spList; 
    private SanPhamDao spDao;
    
//    public void autoId(){
//        int size = spList.size();
//        for(int i = 0; i < size; i++) {
//            spList.get(i).setMaNhanVien(++i);
//        }
//    }
    
    public QuanLySanPham() {
        spDao = new SanPhamDao();
        spList = spDao.read();
    }
    
    public void add() {
        String ten = inputTen();
        float gia = inputGia();
        boolean tinhTrang = true;
        String thoiDiemBan = inputTdb();
        String danhMuc = inputDm();
        String luaChon = inputLc();

        SanPham sp = new SanPham(ten, gia, tinhTrang, thoiDiemBan, 
                                danhMuc, luaChon);
        getSpList().add(sp);
        spDao.write(getSpList());
        System.out.println("Thêm thành công!!!");
    }
    
    public void update(String ten) {
        boolean isExisted = false;
        int size = spList.size();
        for (int i = 0; i < size; i++) {
            if (spList.get(i).getTen().equals(ten)) {
                isExisted = true;
                spList.get(i).setTen(inputTen());
                spList.get(i).setGia(inputGia());
                spList.get(i).layTinhTrang();
                spList.get(i).setThoiDiemBan(inputTdb());
                spList.get(i).setDanhMuc(inputDm());
                spList.get(i).setLuaChon(inputLc());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("Tên = %s không tồn tại.\n", ten);
        } else {
            spDao.write(spList);
            System.out.println("Cập nhật thành công!!!");
        }
    }
    
    public void delete(String ten) {
        SanPham sp = null;
        int size = spList.size();
        for (int i = 0; i < size; i++) { 
            if (spList.get(i).getTen().equals(ten)) {
                sp = spList.get(i);
                break;
            }
        }
        if (sp != null) {
            spList.remove(sp);
            spDao.write(spList);
            System.out.println("Xóa thành công!!!");
        } else {
            System.out.printf("Tên = %s không tồn tại.\n", ten);
        }
    }
    
    public void findSpByTen(String ten) {
        boolean isExisted = false;
        int size = spList.size();

        for(int i = 0; i < size; i++){
            if(spList.get(i).getTen().equals(ten)) {
                isExisted = true;
                System.out.println("Tên món\t| Giá món\t| "
                + "Tình trạng món| Thời điểm bán\t| \tDanh mục món\t| "
                + "Có(ăn chay - uống đá)không? - Đặc điểm\t|");
                System.out.println();
                System.out.printf("%s\t|", spList.get(i).getTen());
                System.out.printf("%.2f\t|", spList.get(i).getGia());
                System.out.printf("%s\t|", spList.get(i).layTinhTrang());
                System.out.printf("%s\t|", spList.get(i).getThoiDiemBan());
                System.out.printf("%s\t|", spList.get(i).getDanhMuc());
                System.out.printf("%s\t|", spList.get(i).getLuaChon());
            } 
        }
        if (!isExisted) {
            System.out.printf("Danh sách %s không có.\n", ten);
        }
    }
    
    public void findSpByGia(float gia) {
        boolean isExisted = false;
        int size = spList.size();

        for(int i = 0; i < size; i++){
            if(spList.get(i).getGia()== gia ) {
                isExisted = true;
                System.out.println("Tên món\t| Giá món\t| "
                + "Tình trạng món| Thời điểm bán\t| \tDanh mục món\t| "
                + "Có(ăn chay - uống đá)không? - Đặc điểm\t|");
                System.out.println();
                System.out.printf("%s\t|", spList.get(i).getTen());
                System.out.printf("%.2f\t|", spList.get(i).getGia());
                System.out.printf("%s\t|", spList.get(i).layTinhTrang());
                System.out.printf("%s\t|", spList.get(i).getThoiDiemBan());
                System.out.printf("%s\t|", spList.get(i).getDanhMuc());
                System.out.printf("%s\t|\n", spList.get(i).getLuaChon());
            } 
        }
        if (!isExisted) {
            System.out.printf("Danh sách không có %f.\n", gia);
        }
    }
    
    public void show() {
    System.out.println("Tên món\t| Giá món\t| "
                + "Tình trạng món| Thời điểm bán\t| \tDanh mục món\t| "
                + "Có(ăn chay - uống đá)không? - Đặc điểm\t|");
    System.out.println();
        for(SanPham sp: getSpList()) {
            System.out.printf("%s\t|", sp.getTen());
            System.out.printf("%.2f\t|", sp.getGia());
            System.out.printf("%s\t|", sp.layTinhTrang());
            System.out.printf("%s\t|", sp.getThoiDiemBan());
            System.out.printf("%s\t|", sp.getDanhMuc());
            System.out.printf("%s\t|\n", sp.getLuaChon());
        }
    }
    
    private String inputTen() {
        System.out.print("Nhập tên sản phẩm: ");
        return scanner.nextLine();
    }
    
    private float inputGia() {
        System.out.print("Nhập giá của sản phẩm: ");
        return scanner.nextFloat();
    }
    
    private String inputTdb() {
        scanner.nextLine();
        System.out.print("Nhập thời điểm bán của sản phẩm: ");
        return scanner.nextLine();
    }
    
    private String inputDm() {
        System.out.print("Nhập danh mục của sản phẩm: ");
        return scanner.nextLine();
    }
    
    private String inputLc(){
        System.out.print("Nhập danh mục món (1 - Thức ăn, 2 - Thức uống, "
                + "3 - Tráng miệng): ");
        int choose = scanner.nextInt();
        String coDaKhong;
        String coAnChayKhong;
        String dacDiem;
        switch (choose) {
            case 1:
                System.out.println("\n\n========DANH MỤC THỨC ĂN========\n\n"
                        + "Có ăn chay không? ");
                coAnChayKhong = scanner.nextLine();
                System.out.format("%s",coAnChayKhong);
                break;
            case 2:
                System.out.println("\n\n========DANH MỤC THỨC UỐNG========\n\n"
                        + "Có đá không? ");
                coDaKhong = scanner.nextLine();
                System.out.format("%s",coDaKhong);
                break;
            case 3:
                System.out.println("\n\n========DANH MỤC TRÁNG MIỆNG========\n\n"
                        + "Đặc điểm món: ");
                dacDiem = scanner.nextLine();
                System.out.format("%s",dacDiem);
                break;
            default:
                System.out.println("Nhập danh mục món không đúng!");
                break;
        }
        return scanner.nextLine();
    }
    
    /**
     * sort nhanVien by name
     */
    public void sortMonByGia() {
        Collections.sort(getSpList(), new SapXepMonTheoGia());
    }
    
    /**
     * @return the spList
     */
    public List<SanPham> getSpList() {
        return spList;
    }

    /**
     * @param spList the spList to set
     */
    public void setSpList(List<SanPham> spList) {
        this.spList = spList;
    }
}
