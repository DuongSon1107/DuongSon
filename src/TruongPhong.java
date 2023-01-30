public class TruongPhong extends CanBo {
private static double luongCoban = 500000;
private double phucapquanlyphong;
    public TruongPhong(int maCanBo, String hoten,String Chucvu, String Donvi,int Songaylamviec, double luongCoban,double phucapquanlyphong){
        super(maCanBo, hoten, Chucvu, Donvi, Songaylamviec);
        this.luongCoban = luongCoban;
        this.phucapquanlyphong = phucapquanlyphong;
    }
    public TruongPhong(){
        super();
    }
    public double tinhLuong(){
        return (long) super.getSongaylamviec() * luongCoban + phucapquanlyphong;
    }
    public void inTTin(){
        System.out.println("Mã cán bộ:" + getMaCanBo());
        System.out.println("Họ và Tên:" + getHoten());
        System.out.println("Chức Vụ:" + getChucvu());
        System.out.println("Đơn Vị:" + getDonvi());
        System.out.println("Lương của cán bộ:" + tinhLuong());
    }
}
