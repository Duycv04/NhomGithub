package B7;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class B7 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> kobia = new ArrayList<>();
    static ArrayList<SachVeBIa> cobia = new ArrayList<>();
    static int lc;

    public static void nhapSach() {
        int n;
        while (true) {
            try {
                System.out.print("Nhập số sách: ");
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
                    System.out.print(" 1.Sách có bìa \n 2.Sách không bìa\nNhập loại sách: ");
                    luachon = Integer.parseInt(sc.nextLine());
                    if (luachon < 0 || luachon > 2) {
                        System.out.print("Nhap so lon hon 0 va nho hon 2  !\n");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.print("Nhap lai !\n");
                }

            }
            if (luachon == 1) {
                SachVeBIa svb = new SachVeBIa();
                svb.nhap();
                cobia.add(svb);
            } else if (luachon == 2) {
                Sach sa = new Sach();
                sa.nhap();
                kobia.add(sa);
            }
        }
    }

    public static void in() {
        int luachon;
        while (true) {
            try {
                System.out.print(" 1.Thông tin sách có bìa \n 2.Thông tin sách không bìa\nNhập lựa chon: ");
                luachon = Integer.parseInt(sc.nextLine());
                if (luachon < 0 || luachon > 2) {
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
                for (SachVeBIa svb : cobia) {
                    System.out.println("Thông tin sách có bìa!");
                    svb.xuat();
                }

                break;
            }
            case 2: {
                for (Sach sa : kobia) {
                    System.out.println("Thông tin sách không có bìa!");
                    sa.xuat();
                }
                break;
            }
        }
    }

    public static void timkiem() {
        int n;
        String ms;
        while (true) {
            try {
                System.out.print("1.Sách có bìa\n2.Sách không bìa\nNhập lựa chọn: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Nhập lại");
            }
        }
        switch (n) {
            case 1: {
                System.out.print("Nhập mã cần tìm:");
                ms = sc.nextLine();
                for (SachVeBIa svb : cobia) {
                    System.out.println("Thông tin!");
                    if (svb.getTenSach().equalsIgnoreCase(ms)) {
                        svb.xuat();
                    } else {
                        System.out.println("không tìm thấy sách! ");
                    }
                }
                break;
            }
            case 2: {
                System.out.print("Nhập mã cần tìm:");
                ms = sc.nextLine();
                for (Sach sa : kobia) {
                    System.out.println("Thông tin!");
                    if (sa.getTenSach().equalsIgnoreCase(ms)) {
                        sa.xuat();
                    } else {
                        System.out.println("không tìm thấy sách! ");
                    }
                }
                break;
            }
        }
    }

    public static void sua() {
        int n;
        String ms;
        int check = 0;
        while (true) {
            try {
                System.out.println("1.Sách có bìa\n2.Sách không bìa\nNhập lựa chon: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập lai!");
            }
        }
        switch (n) {
            case 1: {
                for (SachVeBIa svb : cobia) {
                    System.out.println("Nhâp tên sách cần sửa: ");
                    ms = sc.nextLine();
                    if (Objects.equals(svb.getTenSach(), ms)) {
                        check++;
                        svb.nhap();
                    }
                }
                if (check == 0) {
                    System.out.println("Không tìm thấy sách!");
                }
                break;
            }
            case 2: {
                for (Sach sa : kobia) {
                    System.out.println("Nhập tên sách cần sửa: ");
                    ms = sc.nextLine();
                    if (Objects.equals(sa.getTenSach(), ms)) {
                        check++;
                        sa.nhap();
                    }
                }
                if (check == 0) {
                    System.out.println("Không tìm thấy sách!");
                }
                break;
            }
        }
    }

    public static void xoa() {
        int n;
        String ms;
        int check = 0;
        while (true) {
            try {
                System.out.println("1.Sách có bìa\n2.Sách không bìa\nNhập lựa chon: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập lai!");
            }
        }
        switch (n) {
            case 1: {
                for (SachVeBIa svb : cobia) {
                    System.out.println("Nhâp tên sách cần xóa: ");
                    ms = sc.nextLine();
                    if (Objects.equals(svb.getTenSach(), ms)) {
                        check++;
                        cobia.remove(svb);
                        System.out.println("Xóa thành công");
                    }
                }
                if (check == 0) {
                    System.out.println("Xóa không thành công!");
                }
                break;
            }
            case 2: {
                for (Sach sa : kobia) {
                    System.out.println("Nhập tên sách cần xóa: ");
                    ms = sc.nextLine();
                    if (Objects.equals(sa.getTenSach(), ms)) {
                        check++;
                        kobia.remove(sa);
                        System.out.println("Xóa thành công");
                    }
                }
                if (check == 0) {
                    System.out.println("Xóa không thành công!");
                }
                break;
            }
        }
    }

    public static void sapxep() {
        Collections.sort(cobia, new Comparator<SachVeBIa>() {
            @Override
            public int compare(SachVeBIa o1, SachVeBIa o2) {
                return o1.getTenSach().compareToIgnoreCase(o2.getTenSach());
            }
        });
        Collections.sort(kobia, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTenSach().compareToIgnoreCase(o2.getTenSach());
            }
        });
    }

    public static void dem() {
        int vn = 0;
        int nn = 0;
        for (SachVeBIa svb : cobia) {
            if (svb instanceof SachVeBIa) {
                vn++;
            }
        }
        for (Sach sa : kobia) {
            if (sa instanceof Sach) {
                nn++;
            }
        }
        System.out.println("Số lượng sách có bìa: " + vn);
        System.out.println("Số lượng sách không bìa: " + nn);
    }

    public static void luufile(){
        int lcc;
        while (true){
            try{
                System.out.println("1.Lưu sách có bìa!\n2.Lưu sách không bìa!\nNhập lựa chọn: ");
                lcc=Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Nhập lại!");
            }
        }
        switch (lcc){
            case 1:{
                try(PrintWriter pr = new PrintWriter(new File("D:/kt.txt"));){
                    for(SachVeBIa svb:cobia){
                        pr.println("Tên sách: "+svb.getTenSach());
                        pr.println("Tác giả: "+svb.getTacGia());
                        pr.println("Mã hình ảnh: "+svb.getMaHinhanh());
                        pr.println("Tiền vé: "+svb.getTienVe());
                        pr.println("Giá bán: "+svb.getGiaBan());
                        pr.println("Tổng tiền: "+svb.tinhtien());
                    }
                    System.out.println("Lưu thành công!");
                }catch (IOException ie){
                    System.out.println("Lưu không thành công");
                }
                break;
            } case 2:{
                try(PrintWriter pa = new PrintWriter(new File("D:/kt1.txt"));){
                    for(Sach sa:kobia){
                        pa.println("Tên sách: "+sa.getTenSach());
                        pa.println("Tác giả: "+sa.getTacGia());
                        pa.println("Mã hình ảnh: "+sa.getGiaBan());
                    }
                    System.out.println("Lưu thành công!");
                }catch (IOException ie){
                    System.out.println("Lưu không thành công");
                }
                break;
            }

        }
}

    public static void main(String[] args) {while (true) {
        System.out.println("---------------------Menu---------------------");
        System.out.println("0.Thoát chương trình.");
        System.out.println("1.Thêm sách.");
        System.out.println("2.In sách.");
        System.out.println("3.Tìm kiếm sách theo tên.");
        System.out.println("4.Sửa thông tin sách theo tên.");
        System.out.println("5.Xóa thông tin sách theo tên.");
        System.out.println("6.Sắp xếp sách theo tên.");
        System.out.println("7.Đếm số có bìa và không bìa. ");
//            System.out.println("8.Tiền trung bình trong và ngoài nước. ");
//            System.out.println("9.Thông tin khách hàng có hóa đơn tháng 9.");
        System.out.println("8.Lưu kết quả vào File.");
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
            case 1: {
                nhapSach();
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
            case 4: {
                sua();
                break;
            }
            case 5: {
                xoa();
                break;
            }
            case 6: {
                sapxep();
                break;
            }
            case 7: {
                dem();
                break;
            } case 8:{
                luufile();
                break;
            }
        }
    }
    }

}
