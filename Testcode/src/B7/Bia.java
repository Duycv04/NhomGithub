package B7;

import java.util.Scanner;

public class Bia extends Sach{
    private String maHinhanh;
    private double tienVe;
    public Bia() {
        super();
        this.maHinhanh = maHinhanh;
        this.tienVe = tienVe;
    }

    public String getMaHinhanh() {
        return maHinhanh;
    }

    public void setMaHinhanh(String maHinhanh) {
        this.maHinhanh = maHinhanh;
    }

    public double getTienVe() {
        return tienVe;
    }

    public void setTienVe(double tienVe) {
        this.tienVe = tienVe;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hình ảnh: ");
        maHinhanh=sc.nextLine();
        System.out.print("Nhập tiền vé: ");
        tienVe=sc.nextDouble();

    }
    public void xuat(){
        super.xuat();
        System.out.println("Mã hình ảnh: "+maHinhanh);
        System.out.println("tiền vé: "+tienVe);

    }
}
