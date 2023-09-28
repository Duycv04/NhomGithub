package A2;

import java.util.Scanner;

public class KySu extends CanBo {
    private String NganhDaoTao;

    public KySu() {
        super();
        this.NganhDaoTao = NganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập ngành đào tạo");
        NganhDaoTao=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.print("Ngành đào tạo"+NganhDaoTao);
    }

}
