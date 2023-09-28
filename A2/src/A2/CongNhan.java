package A2;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private int Bac;
    public CongNhan() {
        super();
        this.Bac = Bac;
    }


    public int getBac() {
        return Bac;
    }

    public void setBac(int bac) {
        Bac = bac;
    }
public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập bậc công nhân");
                Bac = Integer.parseInt(sc.nextLine());
               if(Bac<0 && Bac>10){
                   System.out.println("Nhập bậc lớn hơn 0 và nhỏ hơn 10!");
                   continue;
               }
            } catch (Exception e) {
                System.out.println("Nhập lại!");
            }
        }
}
public void xuat(){
        super.xuat();
        System.out.println("Bâc"+Bac);
}
}
