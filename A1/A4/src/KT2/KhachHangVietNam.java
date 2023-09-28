package KT2;

import java.util.Scanner;

public class KhachHangVietNam extends KhachHang{
    private String doiTuong;
    private int soLuong,donGia,dinhMuc;

    public KhachHangVietNam() {
        super();
        this.doiTuong = doiTuong;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
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

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    public void nhap(){
        while (true){
            try{
                super.nhap();
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập đối tượng khách hàng: ");
                doiTuong=sc.nextLine();
                System.out.print("Nhập số lượng: ");
                soLuong=Integer.parseInt(sc.nextLine());
                System.out.print("Nhập đơn giá: ");
                donGia=Integer.parseInt(sc.nextLine());
                System.out.print("Nhập định mức: ");
                dinhMuc=Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Nhập lại!");
            }
        }
    }
    public void xuat(){
        super.xuat();
        System.out.println("Đối tượng khách hàng:"+doiTuong);
        System.out.println("Số lượng:"+soLuong);
        System.out.println("Đơn Giá:"+donGia);
        System.out.println("Định mức:"+dinhMuc);
        System.out.println("Thành tiền: "+ tinhthanhtien());
    }
    @Override
    public double tinhthanhtien(){
        if(soLuong<=dinhMuc){
            return soLuong*donGia;
        } else {
            return soLuong*donGia*dinhMuc+(soLuong-dinhMuc)*donGia*2.5;
        }

    }
}
