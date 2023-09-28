package KS;

import java.util.Scanner;

public class PhongVip extends NguoiDat {

        private String maPhong;
        private int ngayThue,ngayCha,tang;
        private double giaPhong;

        public PhongVip() {
            super();
            this.tang = tang;
            this.maPhong = maPhong;
            this.ngayThue = ngayThue;
            this.ngayCha = ngayCha;
            this.giaPhong = giaPhong;
        }

        public int getTang() {
            return tang;
        }

        public void setTang(int tang) {
            this.tang = tang;
        }

        public String getMaPhong() {
            return maPhong;
        }

        public void setMaPhong(String maPhong) {
            this.maPhong = maPhong;
        }

        public int getNgayThue() {
            return ngayThue;
        }

        public void setNgayThue(int ngayThue) {
            this.ngayThue = ngayThue;
        }

        public int getNgayCha() {
            return ngayCha;
        }

        public void setNgayCha(int ngayCha) {
            this.ngayCha = ngayCha;
        }

        public double getGiaPhong() {
            return giaPhong;
        }

        public void setGiaPhong(double giaPhong) {
            this.giaPhong = giaPhong;
        }
        public double tinhtien(){
            if(ngayCha>=ngayThue){
                return (ngayCha-ngayThue)*giaPhong;
            }else {
                System.out.println("Nhập sai!");
            }
            return 0;
        }

        public void nhap(){
            super.nhap();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tầng: ");
            tang=Integer.parseInt(sc.nextLine());
            System.out.print("Nhập mã phòng: ");
            maPhong=sc.nextLine();
            System.out.print("Nhập ngày thuê: ");
            ngayThue=Integer.parseInt(sc.nextLine());
            System.out.print("Nhập ngày chả: ");
            ngayCha=Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giá phòng: ");
            giaPhong=sc.nextDouble();
        }
        public void xuat(){
            System.out.println("Tầng: "+tang);
            System.out.println("Mã phòng: "+maPhong);
            System.out.println("Ngày thuê: "+ngayThue);
            System.out.println("Ngày chả: "+ngayCha);
            System.out.println("Giá phòng: "+giaPhong);
            System.out.println("Tổng tiên"+tinhtien());
        }

}
