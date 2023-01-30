public class NhanVien extends CanBo{
    private static double luongCoban = 200000;
    private double thuongtheophong;
    public NhanVien(int maCanBo, String hoten,String Chucvu, String Donvi,int Songaylamviec, double luongCoban,double thuongtheophong){
        super(maCanBo, hoten, Chucvu, Donvi, Songaylamviec);
        this.luongCoban = luongCoban;
        this.thuongtheophong = thuongtheophong;
    }
    public NhanVien(){
        super();
    }
    public double tinhLuong(){
        return (long) super.getSongaylamviec() * luongCoban + thuongtheophong;
    }
    public void inTTin(){
        System.out.println("Mã cán bộ:" + getMaCanBo());
        System.out.println("Họ và Tên:" + getHoten());
        System.out.println("Chức Vụ:" + getChucvu());
        System.out.println("Đơn Vị:" + getDonvi());
        System.out.println("Lương của cán bộ:" + tinhLuong());
    }
}
