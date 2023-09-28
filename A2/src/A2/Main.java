package A2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<CanBo> dscb = new ArrayList();
    //    public static void menuchucvu(){
//        while(true){
//            System.out.print("\n------------Chuc vu-------------\n");
//            System.out.print("| 1.Con nhan                     |\n");
//            System.out.print("| 2.Ky su                        |\n");
//            System.out.print("| 3.Nhan vien                    |\n");
//            System.out.print("--------------------------------\n");
//            System.out.print("\nNhap lua chon :\n");
//            int luachon;
//            while(true){
//                try{
//                    luachon = Integer.parseInt(sc.nextLine());
//                    if(luachon>3 || luachon <= 0){
//                        System.out.print("Nhap so >0 & <=3 !\n");
//                        continue;
//                    }
//                    break;
//                }catch (Exception e){
//                    System.out.print("Nhap lai !\n");
//                    System.out.print("\nNhap lua chon :\n");
//                }
//
//            }
//
//            switch (luachon){
//                case 1:{
//                    them();
//                    break;
//                }
//                case 2:{
//                    timkiem();
//                    break;
//                }
//                case 3:{
//                    in();
//                    break;
//                }
//                default:{
//                    System.out.print("Nhap sai!");
//                }
//            }
//        }
//    }
    public static void them(){
        int n;
        while(true){
            try{
                System.out.print("\nNhap so luong can bo :");
                n = Integer.parseInt(sc.nextLine());
                if(n<0){
                    System.out.print("Nhap so lon hon 0 !\n");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.print("Nhap lai !\n");
            }

        }

        for(int i = 0; i < n ; i++){
            int luachon;
            while(true){
                try{
                    System.out.print(" 1.Cong nhan \n 2.Ky su\n 3.Nhan vien\nNhap chuc vu: ");
                    luachon = Integer.parseInt(sc.nextLine()) ;
                    if(luachon < 0 || luachon > 3){
                        System.out.print("Nhap so lon hon 0 va nho hon 3  !\n");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.print("Nhap lai !\n");
                }

            }
            if(luachon == 1){
                CanBo cn = new CanBo();
                cn.nhap();
                dscb.add(cn);
            } else if (luachon == 2) {
                KySu ks = new KySu();
                ks.nhap();
                dscb.add(ks);
            } else if (luachon == 3) {
                NV nhanvien = new NV();
                nhanvien.nhap();
                dscb.add(nhanvien);
            }
        }
    }
    public static void in(){
        System.out.print("\n--------------------DSCB-----------------\n");
        for (CanBo cb: dscb){
            cb.xuat();
            System.out.print("\n------------------------------------------\n");
        }
    }
    public static void timkiem(){
        String name;
        while(true){
            try{
                System.out.print("\nNhap ten can tim :");
                name = sc.nextLine();
                break;
            }catch (Exception e){
                System.out.print("Nhap lai !\n");
            }
        }
        for (CanBo cb : dscb){
            if(cb.getHoTen().equalsIgnoreCase(name)){
                cb.xuat();
            }
        }
    }
    public static void main(String[] args) {
        while(true){
            System.out.print("\n============MENU=============\n");
            System.out.print("|1.Them                     |\n");
            System.out.print("|2.Tim kiem                 |\n");
            System.out.print("|3.Hien thi danh sach can bo|\n");
            System.out.print("|4.Thoat                    |\n");
            System.out.print("=============================\n");
            System.out.print("\nNhap lua chon :\n");
            int luachon;
            while(true){
                try{
                    luachon = Integer.parseInt(sc.nextLine());
                    if(luachon>4 || luachon <= 0){
                        System.out.print("Nhap so >0 & <4 !\n");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.print("Nhap lai !\n");
                    System.out.print("\nNhap lua chon :\n");
                }

            }

            switch (luachon){
                case 1:{
                    them();
                    break;
                }
                case 2:{
                    timkiem();
                    break;
                }
                case 3:{
                    in();
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.print("Nhap sai!");
                }
            }
        }
    }
}
