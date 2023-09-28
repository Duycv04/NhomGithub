
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.IOException;

public class QLSV {
    static ArrayList<Sinhvien> Arr = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        while(true){
            System.out.print("\n------------MENU-------------\n");
            System.out.print("1.Thêm sinh viên\n");
            System.out.print("2.Xửa sinh viên theo id\n");
            System.out.print("3.Xóa sinh viên theo id\n");
            System.out.print("4.Sắp xếp sinh viên theo id\n");
            System.out.print("5.Sắp xếp sinh viên theo tên\n");
            System.out.print("6.Tìm kiếm theo id\n");
            System.out.print("7.Hiện thông tin sinh viên\n");
            System.out.print("8.Lưu File\n");
            System.out.print("9.Close\n");
            System.out.print("-----------------------------\n");
            System.out.print("\nNhap lua chon : ");
            int luachon;
            while(true){
                try{
                    luachon = Integer.parseInt(sc.nextLine());
                    if(luachon>9 || luachon <= 0){
                        System.out.print("Nhap so >0 & <8 !\n");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.print("Nhap lai !\n");
                }

            }

            switch (luachon){
                case 1:{
                    them();
                    break;
                }
                case 2:{
                    sua(Arr);
                    break;
                }
                case 3:{
                    xoa(Arr);
                    break;
                }
                case 4:{
                    sapxepxtheogpa(Arr);
                    break;
                }
                case 5:{
                    sapxepxtheoten(Arr);
                    break;
                }
                case 6: {
                timkiem(Arr);
                break;
                }
                case 7:{
                    in(Arr);
                    break;
                }
                case 8:{
                    luufile(Arr);
                    break;
                }
                case 9:{
                    System.exit(luachon);
                }
                default:{
                    System.out.print("Nhap sai!");
                }
            }
        }
    }
    //them sinh vien vao trong danh sach
    public static void them(){
        int n;
        while(true){
            try{
                System.out.print("\nNhap so luong sinh vien :");
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
            System.out.print("Nhập sinh viên số "+i+"\n");
            Sinhvien sv = new Sinhvien();
            sv.nhap();
            Arr.add(sv);
        }
    }
//    //in danh sach sinh vien co trong file
    public static void in(ArrayList<Sinhvien> Arr){
//        xoaTrungId(Arrsv);
        System.out.print("\nThông --------------tin\n");
        for (Sinhvien sv: Arr){
            sv.xuat();
        }
        System.out.print("\nKết -----------------thúc\n");
    }
//    //sua sinh vien bang gpa
    public static void  sua(ArrayList<Sinhvien> Arr){
        System.out.print("\nNhap id sinh vien can sua:");
        int id = Integer.parseInt(sc.nextLine());
        int check = 0;
        for(Sinhvien sv : Arr ){
            if(sv.getId() == id){
                check++;
                sv.nhap();
                break;
            }
        }
        if(check == 0){
            System.out.print("\nKhong tim thay sinh vien!\n");
        }
    }
//    //xoa sinh vien bang id
    public static void  xoa(ArrayList<Sinhvien> Arr){
        System.out.print("\nNhap id sinh vien can xoa:");
        int id = Integer.parseInt(sc.nextLine());
        int check = 0;
        for(Sinhvien sv : Arr ){
            if(sv.getId() == id){
                check++;
                Arr.remove(sv);
                break;
            }
        }
        if(check == 0){
            System.out.print("\nKhong tim thay sinh vien!\n");
        }
    }
//    // sap xep sinh vien theo gpa
    public static void sapxepxtheogpa(ArrayList<Sinhvien> Arr){
        Collections.sort(Arr, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                if(o1.getGpa() > o2.getGpa()){
                    return -1;
                }
                return 1;
            }

        });
    }
//    // sap xep sinh vien theo ten
    public static void sapxepxtheoten(ArrayList<Sinhvien> Arr){
        Collections.sort(Arr, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }
    public static void timkiem(ArrayList<Sinhvien> Arr){
        int id;
        while(true){
            try{
                System.out.print("\nNhap id cần tim :");
                 id = sc.nextInt();
                break;
            }catch (Exception e){
                System.out.print("Nhap lai !\n");
            }
        }
        for (Sinhvien sv : Arr){
            if(sv.getId()==id){
                sv.xuat();
            }
        }
    }
//    // lua Arraylist sinh vien vao file
    public static void luufile(ArrayList<Sinhvien> Arr){
        try(PrintWriter pw = new PrintWriter(new File("D:/ketqua.txt"))) {
            for(Sinhvien sv: Arr) {
                pw.println(sv.getId());
                pw.println(sv.getName());
                pw.println(sv.getTuoi());
                pw.println(sv.getQuequan());
                pw.println(sv.getGpa());
            }


        }catch(IOException ex){
            System.out.print("got an exception!");
        }
    }
//    //Xoa cac sinh vien trung Id trong Arraylist
//    public static void xoaTrungId(ArrayList<Sinhvien> Arrsv) {
//        HashSet<Integer> idSet = new HashSet<>();
//        ArrayList<Sinhvien> toRemove = new ArrayList<>();
//
//        for (Sinhvien sv : Arrsv) {
//            if (idSet.contains(sv.getId())) {
//                toRemove.add(sv);
//            } else {
//                idSet.add(sv.getId());
//            }
//        }
//
//        Arrsv.removeAll(toRemove);
//    }
//    //Doc file sinh vien
//    public static void docfile(ArrayList<Sinhvien> Arrsv){
//        try(Scanner sc = new Scanner(new File("D:/ketqua.txt"))) {
//            while (sc.hasNext()){
//                Sinhvien sv = new Sinhvien();
//                sv.setId(Integer.parseInt(sc.nextLine()));
//                sv.setName(sc.nextLine());
//                sv.setTuoi(Integer.parseInt(sc.nextLine()));
//                sv.setQuequan(sc.nextLine());
//                sv.setGpa(Float.parseFloat(sc.nextLine()));
//                Arrsv.add(sv);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public static void main(String[] args) {
        menu();
    }
}
