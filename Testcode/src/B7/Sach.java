package B7;

import java.util.Scanner;

public class Sach {
    private String tenSach,tacGia;
    private double giaBan;

    public Sach() {
        super();
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaBan = giaBan;
    }
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        tenSach=sc.nextLine();
        System.out.print("Nhập tác giả: ");
        tacGia=sc.nextLine();
        System.out.print("Nhập giá bán: ");
        giaBan=sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Tên sách: "+tenSach);
        System.out.println("Tác giả: "+tacGia);
        System.out.println("Giá bán: "+giaBan);
    }
}
