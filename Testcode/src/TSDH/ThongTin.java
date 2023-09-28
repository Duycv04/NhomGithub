package TSDH;

import java.util.Objects;
import java.util.Scanner;

public class ThongTin {
    private int sbd;
    private String ten,diaChi,ut;

    public ThongTin() {
        super();
        this.sbd = sbd;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ut = ut;
    }

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUt() {
        return ut;
    }

    public void setUt(String ut) {
        this.ut = ut;
    }
    public double tongdiem(){
        return 0;
    }
    double kiemtra(){
        if(Objects.equals(getUt(), "kv1")){
            return tongdiem()+2;
        }else if(Objects.equals(getUt(), "kv2")){
            return tongdiem()+1.5;
        }else if(Objects.equals(getUt(), "kv3")){
            return tongdiem()+1;
        }
        return 0;
    }

    public void nhap(){
        while (true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập số báo danh: ");
                sbd=Integer.parseInt(sc.nextLine());
                System.out.print("Nhập họ và tên thí sinh: ");
                ten=sc.nextLine();
                System.out.print("Nhập địa chỉ: ");
                diaChi=sc.nextLine();
                System.out.print("Nhập diện ưu tiên: ");
                ut=sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Nhập lại!");
            }
        }
    }
    public void xuat(){
        System.out.println("Số báo danh: "+sbd);
        System.out.println("Họ và tên: "+ten);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Diện ưu tiên: "+ut);
    }
}
