package TSDH;


import B7.Sach;
import B7.SachVeBIa;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhScach {
    static ArrayList<ThongTin>tt=new ArrayList<>();
    static ArrayList<KhoiA>ka=new ArrayList<>();
    static ArrayList<KhoiB>kb=new ArrayList<>();
    static ArrayList<KhoiC>kc=new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int lc;
    private static void nhap(){
        int n;
        while (true) {
            try {
                System.out.print("Nhập số sinh viên dự thi: ");
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
                    System.out.print(" 1.Thí sinh khối A \n 2.Thí sinh khối B \n 3.Thí sinh khối C\n Nhập lựa chọn: ");
                    luachon = Integer.parseInt(sc.nextLine());
                    if (luachon < 0 || luachon > 3) {
                        System.out.print("Nhap so lon hon 0 va nho hon 3  !\n");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.print("Nhap lai !\n");
                }

            }
            if (luachon == 1) {
                System.out.println("Thí sinh khối A");
                KhoiA ka1= new KhoiA();
                ka1.nhap();
                ka.add(ka1);
            } else if (luachon == 2) {
                System.out.println("Thí sinh khối B");
               KhoiB kb1 = new KhoiB();
               kb1.nhap();
               kb.add(kb1);
            }else if(luachon==3){
                System.out.println("Thí sinh khối C");
                KhoiC kc1 = new KhoiC();
                kc1.nhap();
                kc.add(kc1);
            }
        }
    }
public static void in() {
    int luachon;
    while (true) {
        try {
            System.out.print(" 1.Thông tin thí sinh khối A \n 2.Thông tin thí sinh khối B \n 3.Thông tin thí sinh khối C \nNhập lựa chon: ");
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
    switch (luachon) {
        case 1: {
            for (KhoiA ka1 : ka) {
                System.out.println("Thí sinh khối A");
                ka1.xuat();
            }

            break;
        }
        case 2: {
            for (KhoiB kb1 : kb) {
                System.out.println("Thí sinh khối B");
                kb1.xuat();
            }
            break;
        }
        case 3: {
            for (KhoiC kc1 : kc) {
                System.out.println("Thí sinh khối C ");
                kc1.xuat();
            }
            break;
        }
    }
}public static void timkiem() {
        int n;
        int ms;
        while (true) {
            try {
                System.out.print("1.Thí sinh khối A\n2.Thí sinh khối B\nThí sinh khối C\nNhập lựa chọn: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Nhập lại");
            }
        }
        switch (n) {
            case 1: {
                System.out.print("Nhập mã cần tìm:");
                ms =Integer.parseInt(sc.nextLine());
                for (KhoiA ka1 : ka) {
                    System.out.println("Thông tin!");
                    if (ka1.getSbd()==ms) {
                        ka1.xuat();
                    } else {
                        System.out.println("không tìm thấy sách! ");
                    }
                }
                break;
            }
            case 2: {
                System.out.print("Nhập mã cần tìm:");
                ms =Integer.parseInt(sc.nextLine());
                for (KhoiB kb1 : kb ){
                    System.out.println("Thông tin!");
                    if (kb1.getSbd()==ms) {
                        kb1.xuat();
                    } else {
                        System.out.println("không tìm thấy sách! ");
                    }
                }
                break;
            }case 3: {
                System.out.print("Nhập mã cần tìm:");
                ms =Integer.parseInt(sc.nextLine());
                for (KhoiC kc1 : kc ){
                    System.out.println("Thông tin!");
                    if (kc1.getSbd()==ms) {
                        kc1.xuat();
                    } else {
                        System.out.println("không tìm thấy sách! ");
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("--------------------Menu---------------------");
            System.out.println("0.Thoát chương trình.");
            System.out.println("1.Thêm sách.");
            System.out.println("2.In sách.");
            System.out.println("3.Tìm kiếm sách theo sbd.");
//            System.out.println("4.Sửa thông tin sách theo tên.");
//            System.out.println("5.Xóa thông tin sách theo tên.");
//            System.out.println("6.Sắp xếp sách theo tên.");
//            System.out.println("7.Đếm số có bìa và không bìa. ");
//            System.out.println("8.Lưu kết quả vào File.");
            System.out.println("-----------------------------------------------");
            while (true) {
                try {
                    System.out.print("Nhập lựa chọn: ");
                    lc = Integer.parseInt(sc.nextLine());
                    if (lc < 0 || lc > 8) {
                        System.out.println("Nhập lại!");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Nhập lại!");
                }
            }
            switch (lc) {
                case 0:{
                    System.exit(0);
                }
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    in();
                    break;
                }
                case 3: {
                    timkiem();
                    break;
                }
//                case 4: {
//                    sua();
//                    break;
//                }
//                case 5: {
//                    xoa();
//                    break;
//                }
//                case 6: {
//                    sapxep();
//                    break;
//                }
//                case 7: {
//                    dem();
//                    break;
//                } case 8:{
//                    luufile();
//                    break;
//                }
            }
        }
    }
    }

