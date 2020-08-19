/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import table.TableManager;

/**
 *
 * @author BTS4LIFE
 */
public class MainTable {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        TableManager tableManager = new TableManager();
        int tableId;
        int capacity;
        //Hiện thị menu ra trước 
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1"://Xem danh sách bàn trống
                tableManager.checkEmpty();
                break;
            case "2"://Thêm thông tin bàn
                tableManager.add();
                break;
            case "3"://Cập nhật thông tin bàn
                System.out.print("Nhập 3 số id cuối của mã bàn để cập nhật "
                        + "lại thông tin bàn: ");
                tableId = scanner.nextInt();
                tableManager.update(tableId);
                scanner.nextLine();
                break;
            case "4"://Xóa thông tin bàn
                System.out.print("Nhập 3 số id cuối của mã bàn để xóa "
                        + "thông tin bàn: ");
                tableId = scanner.nextInt();
                tableManager.delete(tableId);
                scanner.nextLine();
                break;
            case "5"://Tìm kiếm bàn theo sức chứa
                System.out.print("Nhập sức chứa để hiển thị thông tin bàn: ");
                capacity = scanner.nextInt();
                tableManager.findTableByCapacity(capacity);
                scanner.nextLine();
                break;
            case "6"://Hiển thị danh sách bàn 
                tableManager.show();
                break;
            case "0"://Chọn 0 để thoát
                System.out.println("Thoát thành công!");
                exit = true;
                break;
            default:
                System.out.println("Không hợp lệ! Vui lòng chọn[0 - 6]");
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
        System.out.println("-----------MANAGER TABLE------------");
        System.out.println("1. Xem danh sách bàn trống");
        System.out.println("2. Thêm thông tin bàn.");
        System.out.println("3. Cập nhật thông tin bàn theo id bàn.");
        System.out.println("4. Xóa thông tin bàn theo id.");
        System.out.println("5. Tìm kiếm thông tin bàn theo sức chứa(Capacity).");
        System.out.println("6. Hiển thị danh sách bàn.");
        System.out.println("0. Thoát.");
        System.out.println("------------------------------------");
        System.out.print("Vui lòng chọn[0 - 6]: ");
    }
}
