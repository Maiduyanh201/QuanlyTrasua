package quantrasua.com;

import quantrasua.com.controller.Controller;
import quantrasua.com.model.SanPham;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.xem sản phẩm: ");
            System.out.println("2.thêm sản phẩm: ");
            System.out.println("3.xóa sản phẩm theo id: ");
            System.out.println("4.sửa sản phẩm : ");
            int in = scanner.nextInt();
            switch (in){
                case 1:controller.xemSanPham();
                break;
                case 2:controller.themSanPham();
                break;
                case 3:controller.xoaSanPham();
                break;
                case 4:controller.suaSanPham();
                break;
                default:
                    System.out.println("ERROR");
            }
        }while (true);
    }
}
