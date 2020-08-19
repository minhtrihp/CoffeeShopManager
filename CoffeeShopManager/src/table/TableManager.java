/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BTS4LIFE
 */
public class TableManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Table> tableList; 
    private TableDao tableDao;
    
    public TableManager() {
        tableDao = new TableDao();
        tableList = tableDao.read();
    }
    
    public void autoId(){
        int size = tableList.size();
        for(int i = 0; i < size; i++) {
            tableList.get(i).setId(++i);
        }
    }
    /**
     * Kiểm tra bàn trống
     */
    public void checkEmpty() {
        boolean empty = false;
        int size = tableList.size();
        System.out.println("Table id\t| Table capacity\t| Table status\t|");
        for(int i = 0; i < size; i++){
            if(tableList.get(i).getIsEmpty() == true) {
                empty = true;
                String m;
                m = String.format("B%03d\t\t|", tableList.get(i).getId());
                System.out.print(m);
                System.out.printf("%d\t\t|", tableList.get(i).getCapacity());
                System.out.printf("%s\t\t\n", tableList.get(i).layTinhTrang());
            }   
        }
        if(!empty) {
                System.out.println("Không có bàn trống");
        } 
    }
    
    /**
     * Thêm vào danh sách bàn
     */
    public void add() {
        //Hiện thị ID bàn cuối cùng để thêm vào danh sách.
//        int id = (tableList.size() > 0) ? (tableList.size() + 1) : 1; 
//        String m;
//        m = String.format("Table id: B%03d", id);
//        System.out.println(m);//Hiển thị đang thêm id thứ bao nhiêu
        
        int capacity = inputCapacity();//Nhập thông tin sức chứa
        
        boolean isEmpty = true;//Tạo bàn mới chưa bị đặt nên đặt mặc định true
        
        Table table = new Table(capacity, isEmpty); 
        tableList.add(table);
        tableDao.write(tableList);
        System.out.println("Thêm thành công!!!");
    }
    
    public void update(int id) {
        boolean isExisted = false;
        String change;
        int size = tableList.size();
        for (int i = 0; i < size; i++) {
            if (tableList.get(i).getId() == id) {
                isExisted = true;
                tableList.get(i).setCapacity(inputCapacity());
                System.out.printf("Bàn %s\n", tableList.get(i).layTinhTrang());
                System.out.print("Bạn có muốn thay đổi tình trạng bàn(y/n): ");
                change = scanner.nextLine();
                if("y".equals(change) && tableList.get(i).getIsEmpty() == true)
                {
                    tableList.get(i).setIsEmpty(false);
                } else if ("y".equals(change) && 
                            tableList.get(i).getIsEmpty() == false) {
                    tableList.get(i).setIsEmpty(true);
                } else if("n".equals(change) && 
                            tableList.get(i).getIsEmpty() == true ) {
                    tableList.get(i).setIsEmpty(true);
                } else if ("n".equals(change) && 
                            tableList.get(i).getIsEmpty() == false ) {
                    tableList.get(i).setIsEmpty(false);
                }
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d không tồn tại.\n", id);
        } else {
            tableDao.write(tableList);
            System.out.println("Cập nhật thành công!!!");
        }
    }
    
    public void delete(int id) {
        Table t = null;
        int size = tableList.size();
        for (int i = 0; i < size; i++) { 
            if (tableList.get(i).getId() == id) {
                t = tableList.get(i);
                break;
            }
        }
        if (t != null) {
            tableList.remove(t);
            tableDao.write(tableList);
            System.out.println("Xóa thành công!!!");
        } else {
            System.out.printf("id = %d không tồn tại.\n", id);
        }
    }
    
    public void findTableByCapacity(int capacity) {
        boolean isExisted = false;
        int size = tableList.size();
        System.out.println("Table id\t| Table capacity\t| Table status\t|");
        for(int i = 0; i < size; i++){
            if(tableList.get(i).getCapacity() == capacity) {
                isExisted = true;
                String m;
                m = String.format("B%03d\t\t|", tableList.get(i).getId());
                System.out.print(m);
                System.out.printf("%d\t\t|", tableList.get(i).getCapacity());
                System.out.printf("%s\t\t\n", tableList.get(i).layTinhTrang());
            } 
        }
        if (!isExisted) {
            System.out.printf("Sức chứa %d không có.\n", capacity);
        }
    }
    
    /**
     * Hiển thị danh sách bàn
     */
    public void show() {
        String m;
        System.out.println("Table id\t| Table capacity\t| Table status\t|");
        for(Table t: tableList) {
            m = String.format("B%03d\t\t|", t.getId());
            System.out.print(m);
            System.out.printf("%d\t\t|", t.getCapacity());
            System.out.printf("%s\t\t\n", t.layTinhTrang());
        }
    }
    /**
     * Nhập thông tin sức chứa
     * @return 
     */
    public int inputCapacity() {
        System.out.print("Input table capacity: ");
        while (true) {
            try {
                int capacity = Integer.parseInt((scanner.nextLine()));
                return capacity;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }



    /**
     * @return the tableList
     */
    public List<Table> getTableList() {
        return tableList;
    }

    /**
     * @param tableList the tableList to set
     */
    public void setTableList(List<Table> tableList) {
        this.tableList = tableList;
    }
}
