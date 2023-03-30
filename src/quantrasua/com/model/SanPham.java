package quantrasua.com.model;

import jdk.jshell.spi.SPIResolutionException;

public class SanPham {
    private int idSanPham;
    private String name;
    private double price;

    public SanPham() {
    }

    public SanPham(int idSanPham, String name, double price) {
        this.idSanPham = idSanPham;
        this.name = name;
        this.price = price;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "idSanPham=" + idSanPham +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
