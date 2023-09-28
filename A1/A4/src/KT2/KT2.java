package KT2;
import java.util.*;
import java.io.*;
public class KT2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<KhachHang> ds = new ArrayList<>();
    static int lc;
    public static void nhap(){
        int n;
        while(true){
            try{
                System.out.print("\nNhập số lượng khách hàng :");
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
                    System.out.print(" 1.Khách hàng Việt Nam \n 2.Khách hàng Nước Ngoài\nNhap loại khách hàng: ");
                    luachon = Integer.parseInt(sc.nextLine()) ;
                    if(luachon < 0 || luachon > 2){
                        System.out.print("Nhap so lon hon 0 va nho hon 2  !\n");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.print("Nhap lai !\n");
                }

            }
            if(luachon == 1){
                KhachHangVietNam cn = new KhachHangVietNam();
                cn.nhap();
                ds.add(cn);
            } else if (luachon == 2) {
                KhachHangNuocNgoai ks = new KhachHangNuocNgoai();
                ks.nhap();
                ds.add(ks);
            }
        }
    }
    public static void  xuat(){
        System.out.println("------Thông tin------");
        for(KhachHang a: ds){
            a.xuat();
            System.out.println("------------------------");
        }
    }
    public static void timkiem(){
        String ms;
        while(true){
            try{
                System.out.print("Nhập mã khách hàng cần tìm : ");
                ms=sc.nextLine();
                break;
            }catch(Exception e){
                System.out.print("Nhập lại");
            }
        }
        for(KhachHang a:ds){
            if(a.getMaKh().equalsIgnoreCase(ms)){
                a.xuat();
            }else{
                System.out.println("không tìm thấy mã khách hàng trên hệ thống! ");
            }
        }
    }
    public  static void sua(){
        String id;
        int check=0;
        while(true){
            try{
                System.out.print("Nhập mã khách hàng cần sửa : ");
                id=sc.nextLine();
                break;
            }catch(Exception e){
                System.out.print("Nhập lại");
            }
        }
        for(KhachHang a: ds){
            if(Objects.equals(a.getMaKh(), id)){
                check++;
                a.nhap();
                break;
            }
        }
        if (check==0){
            System.out.println("Không tìm mấy mã khách hàng cần sửa!");
        }

    }
    public static void xoatheoMa(){
        int check=0;
        String ma;
        while (true){
            try{
                System.out.print("Nhập mã khách hàng cần xóa: ");
                ma=sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Nhập lại!");
            }
        }
        for(KhachHang a:ds){
            if(Objects.equals(a.getMaKh(), ma)){
                check++;
                ds.remove(a);
                System.out.println("Xóa thành công");
                break;

            }
        }
            if(check==0){
                System.out.println("Xóa không thành công!");
            }
        }
    public static void sapxeptheoMa(){
        Collections.sort(ds, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1,KhachHang o2) {
                return o1.getMaKh().compareToIgnoreCase(o2.getMaKh());
            }
        });
    }
    public static void dem(){
        int vn=0;
        int nn=0;
        for(KhachHang a: ds){
            if(a instanceof KhachHangVietNam){
                vn++;
            }
            if(a instanceof KhachHangNuocNgoai){
                nn++;
            }
        }
        System.out.println("Số lượng khách hàng Việt Nam: "+vn);
        System.out.println("Số lượng khách hàng Nước ngoài: "+nn);
    }
    public static void tientb() {
        double tongtien = 0;
        double tongtien1=0;
        int vn = 0;
        int nn=0;
        for (KhachHang a : ds) {
            if (a instanceof KhachHangVietNam) {
            tongtien+= a.tinhthanhtien();
            vn++;
            }
            if(vn==0){
                System.out.println("Không có tiền Việt nam!");
            }else {
                System.out.println("Tiền trung bình Việt Nam: "+(tongtien/vn));
            }
        }
        for (KhachHang a : ds) {
            if (a instanceof KhachHangNuocNgoai) {
                tongtien1+= a.tinhthanhtien();
                nn++;
            }
            if(nn==0){
                System.out.println("Không có tiền Nước ngoài!");
            }else {
                System.out.println("Tiền trung bình Nước ngoài: "+(tongtien1/nn));
            }
        }
    }
    public static void hoadont9(){
        for(KhachHang a:ds){
            if(a.getThangraHd()==9&& a.getNamraHd()==2013){
                a.xuat();
            }else {
                System.out.println("Không có hóa đơn nào trong tháng 9!");
            }
        }
    }
    public static void luufile(){
        try(PrintWriter pw = new PrintWriter(new File("D:/ketqua.txt")))
        {
            for(KhachHang a: ds){
                pw.println("Mã khách hàng: "+a.getMaKh());
                pw.println("Họ và tên: "+a.getHoTen());
                pw.println("Ngày ra hóa đơn: "+a.getNgayraHd());
                pw.println("Tháng ra hóa đơn: "+a.getThangraHd());
                pw.println("Năm ra hóa đơn:"+a.getNamraHd());
                pw.println("Tổng tiền: "+a.tinhthanhtien());
            }
            System.out.println("Lưu thành công!");
        }catch(IOException ex){
            System.out.println("Lưu không thành công!");
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------------Menu---------------------");
            System.out.println("0.Thoát chương trình.");
            System.out.println("1.Thêm khách hàng.");
            System.out.println("2.In hóa đơn.");
            System.out.println("3.Tìm kiếm mã khách hàng.");
            System.out.println("4.Sửa thông tin khách hàng theo mã.");
            System.out.println("5.Xóa thông tin khách hàng theo mã.");
            System.out.println("6.Sắp xếp khách hàng theo mã.");
            System.out.println("7.Đếm số khách hàng trong và ngoài nước. ");
            System.out.println("8.Tiền trung bình trong và ngoài nước. ");
            System.out.println("9.Thông tin khách hàng có hóa đơn tháng 9.");
            System.out.println("10.Lưu kết quả vào File.");
            System.out.println("-----------------------------------------------");
            while (true) {
                try {
                    System.out.print("Nhập lựa chọn: ");
                    lc = Integer.parseInt(sc.nextLine());
                    if (lc < 0||lc>10) {
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
                    break;
                }case 1:{
                    nhap();
                    break;
                }case 2:{
                    xuat();
                    break;
                }case 3: {
                    timkiem();
                    break;
                }case 4: {
                    sua();
                    break;
                } case 5: {
                    xoatheoMa();
                    break;
                } case 6:{
                    sapxeptheoMa();
                    break;
                } case 7:{
                    dem();
                    break;
                } case 8:{
                   tientb();
                    break;
                } case 9:{
                    hoadont9();
                    break;
                } case 10:{
                    luufile();
                    break;
                }
            }
        }
    }
}
