package TSDH;

import java.util.Objects;
import java.util.Scanner;

public class KhoiB extends ThongTin{
    private double monToan,monHoa,monSinh;

    public KhoiB() {
        super();
        this.monToan = monToan;
        this.monHoa = monHoa;
        this.monSinh = monSinh;
    }

    public double getMonToan() {
        return monToan;
    }

    public void setMonToan(double monToan) {
        this.monToan = monToan;
    }

    public double getMonHoa() {
        return monHoa;
    }

    public void setMonHoa(double monHoa) {
        this.monHoa = monHoa;
    }

    public double getMonSinh() {
        return monSinh;
    }

    public void setMonSinh(double monSinh) {
        this.monSinh = monSinh;
    }
    public double tongdiem(){
        if(Objects.equals(getUt(), "kv1")){
            return monToan+monSinh+monHoa+2;
        }else if(Objects.equals(getUt(), "kv2")){
            return monToan+monSinh+monHoa+1.5;
        }else if(Objects.equals(getUt(), "kv3")){
            return monToan+monSinh+monHoa+1;
        }else {
            return monToan+monSinh+monHoa;
        }
    }
    public void nhap(){
        while (true){
            try {
                super.nhap();
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập điểm toán: ");
                monToan=sc.nextDouble();
                System.out.print("Nhập  điểm hóa: ");
                monHoa=sc.nextDouble();
                System.out.print("Nhập điểm sinh: ");
                monSinh=sc.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Nhập sai!");
            }
        }

    }
    public void xuat(){
        super.xuat();
        System.out.println("Diểm Toán: "+monToan);
        System.out.println("Diểm Hóa: "+monHoa);
        System.out.println("Diểm Sinh: "+monSinh);
        System.out.println("Diểm tổng : "+tongdiem());
    }
}
