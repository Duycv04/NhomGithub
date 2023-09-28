package KT2;

import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;
    private int soLuong,donGia;

    public KhachHangNuocNgoai() {
        super();
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public void nhap(){
        while (true){
            try{
                super.nhap();
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập quốc tịch: ");
                quocTich=sc.nextLine();
                System.out.print("Nhập số lượng: ");
                soLuong=Integer.parseInt(sc.nextLine());
                System.out.print("Nhập đơn giá: ");
                donGia=Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Nhập lại!");
            }
        }
    }
    public void xuat(){
        super.xuat();
        System.out.println("Quốc tịch: "+quocTich);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Thành tiền: "+ tinhthanhtien());
    }
    @Override
    public double tinhthanhtien() {
        return soLuong*donGia;
    }
}
