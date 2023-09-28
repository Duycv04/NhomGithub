package B7;

public class SachVeBIa extends Bia{
    public SachVeBIa() {
        super();
    }

    public double tinhtien(){
        return getGiaBan()+getTienVe();
    }
    public void nhap(){
        super.nhap();
    }
    public void xuat(){
        super.xuat();
        System.out.println("Tổng tiền: "+tinhtien());
    }

}
