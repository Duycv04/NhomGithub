package TSDH;

import java.util.Objects;
import java.util.Scanner;

public class KhoiC extends ThongTin{
    private double van,su,dia;

    public KhoiC() {
        super();
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }
    public double tongdiem(){
        if(Objects.equals(getUt(), "kv1")){
            return van+su+dia+2;
        }else if(Objects.equals(getUt(), "kv2")){
            return van+su+dia+1.5;
        }else if(Objects.equals(getUt(), "kv3")){
            return van+su+dia+1;
        }else {
            return van+su+dia;
        }
    }
    public void nhap(){
        while (true){
            try {
                super.nhap();
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập điểm văn: ");
                van=sc.nextDouble();
                System.out.print("Nhập nhập điểm sử: ");
                su=sc.nextDouble();
                System.out.print("Nhập điểm địa: ");
                dia=sc.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Nhập sai!");
            }
        }

    }
    public void xuat(){
        super.xuat();
        System.out.println("Diểm toán: "+van);
        System.out.println("Diểm lý: "+su);
        System.out.println("Diểm hóa: "+dia);
        System.out.println("Diểm tổng điểm: "+tongdiem());
    }
}
