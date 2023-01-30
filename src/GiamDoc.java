import java.util.Scanner;
public class GiamDoc extends CanBo {
    private static double luongCoban = 1000000;

    public GiamDoc(int maCanBo, String hoten,String Chucvu, String Donvi,int Songaylamviec, double luongCoban){
        super(maCanBo, hoten, Chucvu, Donvi, Songaylamviec);
        this.luongCoban = luongCoban;
    }
public GiamDoc(){
        super();
}
public double tinhLuong(){
        return (long) super.getSongaylamviec() * luongCoban;
    }
    public void inTTin(){
        System.out.println("Mã cán bộ:" + getMaCanBo());
        System.out.println("Họ và Tên:" + getHoten());
        System.out.println("Chức Vụ:" + getChucvu());
        System.out.println("Đơn Vị:" + getDonvi());
        System.out.println("Lương của cán bộ:" + tinhLuong());
    }
}