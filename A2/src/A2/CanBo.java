package A2;

import java.util.Scanner;

public class CanBo {
    private String hoTen, gioiTinh, diaChi;
    private int tuoi;
    public CanBo() {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập tên cán bộ: ");
                hoTen=sc.nextLine();
                System.out.print("Nhập giới tinh: ");
                gioiTinh=sc.nextLine();
                System.out.print("Nhập địa chỉ: ");
                diaChi=sc.nextLine();
                System.out.print("Nhập tuổi: ");
                tuoi=Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.print("Nhập lại");
            }

        }
    }
    public void xuat(){
        System.out.print("Tên cán bộ: "+hoTen);
        System.out.print("Giới tính: "+gioiTinh);
        System.out.print("Địa chỉ: "+diaChi);
        System.out.print("Tuổi: "+tuoi);
    }
}
