package KS;

import java.util.Scanner;

public class NguoiDat {
    private String hoTen,diaChi,gioiTinh;
    private int tuoi,cccd;

    public NguoiDat() {
        super();
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.cccd=cccd;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getCccd() {
        return cccd;
    }

    public void setCccd(int cccd) {
        this.cccd = cccd;
    }
    public double tinhtien(){
        return 0;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        gioiTinh=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
        System.out.print("Nhập căn cước công dân: ");
        cccd=Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Họ và tên:"+hoTen);
        System.out.println("Tuổi:"+tuoi);
        System.out.println("Giới tính:"+gioiTinh);
        System.out.println("Địa chỉ:"+diaChi);
        System.out.println("CCCD:"+cccd);
    }
}
