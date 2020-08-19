/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import sp.QuanLySanPham;

/**
 *
 * @author BTS4LIFE
 */
public class MainSp {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        QuanLySanPham spQl = new QuanLySanPham();
        String ten;
        float gia;
        //Hiện thị menu ra trước 
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1"://Xem danh sách sản phẩm 
                spQl.show();
                break;
            case "2"://Thêm thông tin sản phẩm
                spQl.add();
                break;
            case "3"://Cập nhật thông tin sản phẩm theo tên
                System.out.print("Nhập tên nhân viên để cập nhật: ");
                ten = scanner.nextLine();
                spQl.update(ten);
                break;
            case "4"://Xóa thông sản phẩm theo tên
                System.out.print("Nhập tên nhân viên để xóa: ");
                ten = scanner.nextLine();
                spQl.delete(ten);
                break;
            case "5"://Tìm kiếm thông tin sản phẩm theo tên
                System.out.print("Nhập tên để hiển thị thông tin sản phẩm: ");
                ten = scanner.nextLine();
                spQl.findSpByTen(ten);
                
                break;
            case "6"://Tìm kiếm thông tin sản phẩm theo giá
                System.out.print("Nhập giá để hiển thị thông sản phẩm: ");
                gia = scanner.nextFloat();
                spQl.findSpByGia(gia);
                scanner.nextLine();
                break;  
            case "7":
                spQl.sortMonByGia();
                break;
            case "0"://Chọn 0 để thoát
                System.out.println("Thoát thành công!");
                exit = true;
                break;
            default:
                System.out.println("Không hợp lệ! Vui lòng chọn[0 - 7]");
                break;
            }
            if (exit) { //Đúng thì thoát ra, ngưng hiển thị menu
                break;
            }
            //Hiện lại menu để chọn tiếp if exit == false
            showMenu();
        }
    }
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("\n-----------MANAGER SẢN PHẨM------------");
        System.out.println("1. Xem danh sản phẩm.");
        System.out.println("2. Thêm thông tin sản phẩm.");
        System.out.println("3. Cập nhật thông tin sản phẩm theo tên.");
        System.out.println("4. Xóa thông tin sản phẩm theo tên.");
        System.out.println("5. Tìm kiếm thông tin sản phẩm theo tên.");
        System.out.println("6. Tìm kiếm thông tin sản phẩm theo giá.");
        System.out.println("7. Sắp xếp thông tin sản phẩm theo giá giảm dần.");
        System.out.println("0. Thoát.");
        System.out.println("-----------------------------------------");
        System.out.print("Vui lòng chọn[0 - 7]: ");
    }
}
//lỗi tdb ko cho nhập
