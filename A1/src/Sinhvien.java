
import java.util.Scanner;

public class Sinhvien {

    static int dem = 1;
    private int id;
    int tuoi;
    String name,quequan;;
    float gpa;
    public Sinhvien(){
        id = dem++;
    }
    public Sinhvien(int id, String name , int tuoi, String quequan, float gpa ){
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.quequan = quequan;
        this.gpa = gpa;
        id = dem++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getTuoi() {
        return tuoi;
    }


    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void nhap(){

        while(true){
            try{


                    Scanner sc = new Scanner(System.in);
                    System.out.print("Nhập id: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten :");
                    name = sc.nextLine();
                    System.out.print("Nhap tuoi :");
                    tuoi = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap que quan :");
                    quequan = sc.nextLine();
                    System.out.print("Nhap diem :");
                    gpa = Float.parseFloat(sc.nextLine());
                    break;

            }catch (Exception e){
                System.out.print("Nhap lai !\n");
            }

        }
    }
    public void xuat(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Sinhvien{" +
                "id=" + id +
                ", name=" + name +
                ", tuoi='" + tuoi + '\'' +
                ", quequan='" + quequan + '\'' +
                ", gpa=" + gpa +
                '}';
    }

}
