package quantrasua.com.controller;

import quantrasua.com.model.SanPham;
import quantrasua.com.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public Service service = new Service();

    public void themSanPham(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm: ");
        int idSanpham = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner1.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        SanPham sanPham = new SanPham(idSanpham,name,price);
        service.taoSanPham(sanPham);
    }

    public void xemSanPham(){
        ArrayList<SanPham> listSanPham;
        listSanPham = service.getListSanPham();
        for (int i = 0; i < listSanPham.size(); i++) {
            System.out.println(listSanPham.get(i).toString());
        }
    }
    public void xoaSanPham(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần xóa: ");
        int id = scanner.nextInt();
        service.xoaSanPham(id);
    }
    public void suaSanPham(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm: ");
        int idSanpham = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner1.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        SanPham sanPham = new SanPham(idSanpham,name,price);
        service.suaSanPham(sanPham);
    }

}
