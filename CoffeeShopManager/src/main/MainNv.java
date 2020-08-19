/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.util.Scanner;
import nv.QuanLyNhanVien;

/**
 *
 * @author BTS4LIFE
 */
public class MainNv {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) throws ParseException {
        String choose = null;
        boolean exit = false;
        QuanLyNhanVien nvManager = new QuanLyNhanVien();
        int id;
        String ten;
        String gt;
        String qq;
        String ns;
        //Hiện thị menu ra trước 
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1"://Xem danh sách nhân viên
                nvManager.show();
                break;
            case "2"://Thêm thông tin nhân viên
                nvManager.add();
                break;
            case "3"://Cập nhật thông tin nhân viên theo id
                System.out.print("Nhập id nhân viên để cập nhật: ");
                id = scanner.nextInt();
                nvManager.update(id);
                scanner.nextLine();
                break;
            case "4"://Xóa thông tin nhân viên
                System.out.print("Nhập id nhân viên để xóa: ");
                id = scanner.nextInt();
                nvManager.delete(id);
                scanner.nextLine();
                break;
            case "5"://Tìm kiếm thông tin nhân viên theo tên
                System.out.print("Nhập tên để hiển thị thông tin nhân viên: ");
                ten = scanner.nextLine();
                nvManager.findNvByTen(ten);
                
                break;
            case "6"://Tìm kiếm thông tin nhân viên theo giới tính
                System.out.print("Nhập giới tính để hiển thị thông nhân viên: ");
                gt = scanner.nextLine();
                nvManager.findNvByGt(gt);
                
                break;
            case "7"://Tìm kiếm thông tin nhân viên theo ngày sinh
                System.out.print("Nhập ngày để hiển thị thông nhân viên: ");
                ns = scanner.nextLine();
                nvManager.findNvByNgaySinh(ns);
                
                break;
            case "8"://Tìm kiếm thông tin nhân viên theo quê quán
                System.out.print("Nhập ngày để hiển thị thông nhân viên: ");
                qq = scanner.nextLine();
                nvManager.findNvByNgaySinh(qq);
                
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
            //Hiện lại menu để chọn tiếp if exit == false
            showMenu();
        }
    }
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("\n-----------MANAGER NHÂN VIÊN------------");
        System.out.println("1. Xem danh sách nhân viên.");
        System.out.println("2. Thêm thông tin nhân viên.");
        System.out.println("3. Cập nhật thông tin nhân viên theo id.");
        System.out.println("4. Xóa thông tin nhân viên theo id.");
        System.out.println("5. Tìm kiếm thông tin nhân viên theo tên.");
        System.out.println("6. Tìm kiếm thông tin nhân viên theo giới tính.");
        System.out.println("7. Tìm kiếm thông tin nhân viên theo ngày sinh.");
        System.out.println("8. Tìm kiếm thông tin nhân viên theo quê quán.");
        System.out.println("0. Thoát.");
        System.out.println("-----------------------------------------");
        System.out.print("Vui lòng chọn[0 - 8]: ");
    }
}
//chỉnh lại cái header (fixed)
//lỗi thêm nv, ko phải lỗi, ko hiển thị ra tt nv mới thêm, phải xóa nv trc thì mới hiển thị ttnv mới thêm (fixed)
//lỗi id ko auto tăng