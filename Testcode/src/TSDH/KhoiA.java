package TSDH;

import java.util.Objects;
import java.util.Scanner;

public class KhoiA extends ThongTin{
    private double monToan,monLy,monHoa;

    public KhoiA() {
        super();
        this.monToan = monToan;
        this.monLy = monLy;
        this.monHoa = monHoa;
    }

    public double getMonToan() {
        return monToan;
    }

    public void setMonToan(double monToan) {
        this.monToan = monToan;
    }

    public double getMonLy() {
        return monLy;
    }

    public void setMonLy(double monLy) {
        this.monLy = monLy;
    }

    public double getMonHoa() {
        return monHoa;
    }

    public void setMonHoa(double monHoa) {
        this.monHoa = monHoa;
    }

    public double tongdiem(){
        if(Objects.equals(getUt(), "kv1")){
            return monToan+monLy+monHoa+2;
        }else if(Objects.equals(getUt(), "kv2")){
            return monToan+monLy+monHoa+1.5;
        }else if(Objects.equals(getUt(), "kv3")){
            return monToan+monLy+monHoa+1;
        }else {
            return monToan+monLy+monHoa;
        }
    }
    public void nhap(){
        while (true){
            try {
                super.nhap();
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập điểm toán: ");
                monToan=sc.nextDouble();
                System.out.print("Nhập nhập điểm lý: ");
                monLy=sc.nextDouble();
                System.out.print("Nhập điểm hóa: ");
                monHoa=sc.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Nhập sai!");
            }
        }

    }
    public void xuat(){
        super.xuat();
        System.out.println("Diểm toán: "+monToan);
        System.out.println("Diểm lý: "+monLy);
        System.out.println("Diểm hóa: "+monHoa);
        System.out.println("Diểm tổng điểm: "+tongdiem());
    }
}
