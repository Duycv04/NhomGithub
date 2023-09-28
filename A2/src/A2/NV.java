package A2;

import java.util.Scanner;

public class NV extends CanBo {
    private String congViec;


    public NV() {
        super();
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập công việc");
        congViec=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.print("Công việc"+congViec);
    }

}
