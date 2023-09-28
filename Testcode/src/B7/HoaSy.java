package B7;

import java.util.Scanner;

public class HoaSy {
    private String hoTen,diaChi;

    public HoaSy(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên tác giả: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
    }
    public void xuat(){
        System.out.println("Tên tác giả: "+hoTen);
        System.out.print("Địa chỉ: "+diaChi);
    }
}
