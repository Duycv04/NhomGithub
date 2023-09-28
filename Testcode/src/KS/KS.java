package KS;

import B7.Sach;
import B7.SachVeBIa;

import java.util.ArrayList;
import java.util.Scanner;

public class KS {
    static ArrayList<NguoiDat>ng = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void nhap(){
        int n;
        while (true) {
            try {
                System.out.print("Nhập số người cần đặt: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập lại!");
            }
        }
        for (int i = 0; i < n; i++) {
            int luachon;
            while (true) {
                try {
                    System.out.print(" 1.Phòng thường \n 2.Phòng trung bình\n3.Phòng víp\nNhập lựa chọn: ");
                    luachon = Integer.parseInt(sc.nextLine());
                    if (luachon < 0 || luachon > 3) {
                        System.out.print("Nhap so lon hon 0 va nho hon 2  !\n");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.print("Nhap lai !\n");
                }

            }
            if (luachon == 1) {
                Phong p= new Phong();
                p.nhap();
                ng.add(p);
            } else if (luachon == 2) {
                PhongTb ptb= new PhongTb();
                ptb.nhap();
                ng.add(ptb);
            }else if(luachon==3){
                PhongVip pv= new PhongVip();
                pv.nhap();
                ng.add(pv);
            }
        }
    }
    public static void xuat(){
        System.out.println("------Thông tin------");
        for(NguoiDat n: ng){
            n.xuat();
            System.out.println("------------------------");
        }
    }
    public static void main(String[] args) {
nhap();
xuat();
    }
}
