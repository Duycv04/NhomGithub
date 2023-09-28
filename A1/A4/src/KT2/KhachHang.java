package KT2;

import java.util.Scanner;

public class KhachHang {
    private String maKh,hoTen;
    private int ngayraHd,thangraHd,namraHd;

    public KhachHang() {
        super();
        this.maKh = maKh;
        this.hoTen = hoTen;
        this.ngayraHd = ngayraHd;
        this.thangraHd = thangraHd;
        this.namraHd = namraHd;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgayraHd() {
        return ngayraHd;
    }

    public void setNgayraHd(int ngayraHd) {
        this.ngayraHd = ngayraHd;
    }

    public int getThangraHd() {
        return thangraHd;
    }

    public void setThangraHd(int thangraHd) {
        this.thangraHd = thangraHd;
    }

    public int getNamraHd() {
        return namraHd;
    }

    public void setNamraHd(int namraHd) {
        this.namraHd = namraHd;
    }
    public double tinhthanhtien(){
        return 0;
    }

    public void nhap(){
        while (true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập mã khách hang: ");
                maKh=sc.nextLine();
                System.out.print("Nhập Họ tên: ");
                hoTen=sc.nextLine();
                System.out.print("Nhập ngày ra hóa đơn: ");
                ngayraHd=Integer.parseInt(sc.nextLine());
                System.out.print("Nhập tháng ra hoa đơn: ");
                thangraHd=Integer.parseInt(sc.nextLine());
                System.out.print("Nhập năm ra hóa đơn: ");
                namraHd=Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Nhập lại!");
            }
        }
    }
    public void xuat(){
        System.out.println("Mã khách hàng:"+maKh);
        System.out.println("Họ và tên:"+hoTen);
        System.out.println("Ngày ra hóa đơn:"+ngayraHd);
        System.out.println("Tháng ra hóa đơn:"+thangraHd);
        System.out.println("Năm ra hóa đơn:"+namraHd);
    }
}
