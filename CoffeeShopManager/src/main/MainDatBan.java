/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import datban.QuanLyBanDat;
import datban.QuanLyDatMon;
import java.util.Scanner;

/**
 *
 * @author BTS4LIFE
 */
public class MainDatBan {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        QuanLyBanDat qlbd = new QuanLyBanDat();
        QuanLyDatMon qldm = new QuanLyDatMon();
        String ten;
        int capacity;
        float gia;
        //Hiện thị menu ra trước 
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1"://Xem danh sách bàn trống
                qlbd.checkEmpty();
                break;
            case "2"://Thêm thông tin bàn
                qlbd.add();
                break;

//            case "3"://Cập nhật thông tin bàn
//                System.out.print("Nhập 3 số id cuối của mã bàn để cập nhật "
//                        + "lại thông tin bàn: ");
//                tableId = scanner.nextInt();
//                tableManager.update(tableId);
//                scanner.nextLine();
//                break;
//            case "4"://Xóa thông tin bàn
//                System.out.print("Nhập 3 số id cuối của mã bàn để xóa "
//                        + "thông tin bàn: ");
//                tableId = scanner.nextInt();
//                tableManager.delete(tableId);
//                scanner.nextLine();
//                break;
                
            case "3"://Tìm kiếm bàn theo sức chứa
                System.out.print("Nhập sức chứa để hiển thị thông tin bàn: ");
                capacity = scanner.nextInt();
                qlbd.findTableByCapacity(capacity);
                scanner.nextLine();
                break;
            case "4"://Hiển thị danh sách bàn 
                qlbd.show();
                break;
                
            case "5"://Xem danh sách sản phẩm 
                qldm.show();
                break;
            case "6"://Thêm thông tin sản phẩm
                qldm.add();
                break;
            
            case "7"://Tìm kiếm thông tin sản phẩm theo tên
                System.out.print("Nhập tên để hiển thị thông tin sản phẩm: ");
                ten = scanner.nextLine();
                qldm.findSpByTen(ten);
                break;
            case "8":
                System.out.print("Nhập giá để hiển thị thông tin sản phẩm: ");
                gia = scanner.nextFloat();
                qldm.findSpByGia(gia);
                break;
            case "0"://Chọn 0 để thoát
                System.out.println("Thoát thành công!");
                exit = true;
                break;
            default:
                System.out.println("Không hợp lệ! Vui lòng chọn[0 - 8]");
                break;
            }
            if (exit) { //Đúng thì thoát ra, ngưng hiển thị menu
                break;
            }
            //Hiện lại menu để chọn tiếp
            showMenu();
        }
    }
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------BOOK TABLE AND DISHES---------------");
        System.out.println("1. Xem danh sách bàn trống");
        System.out.println("2. Thêm thông tin bàn.");
        System.out.println("3. Tìm kiếm thông tin bàn theo sức chứa(Capacity).");
        System.out.println("4. Hiển thị danh sách bàn.");
        System.out.println("5. Xem danh sách sản phẩm.");
        System.out.println("6. Thêm thông tin sản phẩm.");
        System.out.println("7. Tìm kiếm thông tin sản phẩm theo tên.");
        System.out.println("8. Tìm kiếm thông tin sản phẩm theo giá.");
        System.out.println("0. Thoát.");
        System.out.println("-----------------------------------------------");
        System.out.print("Vui lòng chọn[0 - 8]: ");
    }
}
