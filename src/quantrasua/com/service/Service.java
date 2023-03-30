package quantrasua.com.service;

import quantrasua.com.model.SanPham;

import java.util.ArrayList;

public class Service {
    ArrayList<SanPham> listSanPham;

    public ArrayList<SanPham> getListSanPham() {
        if (listSanPham == null){
            listSanPham = new ArrayList<>();
            SanPham sanPham = new SanPham(1,"Aha",500000);
            SanPham sanPham1 = new SanPham(2,"apple",750000);
            SanPham sanPham2 = new SanPham(3,"abcxuz",3462000);
            SanPham sanPham3 = new SanPham(4,"zxcvbbn",4620000);
            SanPham sanPham4 = new SanPham(5,"qwerty",2467000);
            listSanPham.add(sanPham1);
            listSanPham.add(sanPham);
            listSanPham.add(sanPham2);
            listSanPham.add(sanPham3);
            listSanPham.add(sanPham4);
        }
        return listSanPham;
    }

    public void taoSanPham(SanPham sanPham){
        listSanPham.add(sanPham);
    }

    public void suaSanPham(SanPham sanPham){
        boolean cond = true;
        for (int i = 0; i < listSanPham.size();i ++){
            if (sanPham.getIdSanPham() == listSanPham.get(i).getIdSanPham()){
                sanPham.setIdSanPham(listSanPham.get(i).getIdSanPham());
                sanPham.setName(listSanPham.get(i).getName());
                sanPham.setPrice(listSanPham.get(i).getPrice());
                cond = false;
                break;
            }
        }
        if (cond){
            System.out.println("không tồn tại id này");
        }
    }
    public void xoaSanPham(int idSanPham){
        for (int i = 0; i < listSanPham.size(); i++) {
            if (idSanPham == listSanPham.get(i).getIdSanPham()){
                listSanPham.remove(i);
            }
        }
    }

}
