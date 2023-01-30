import java.util.ArrayList;
import java.util.List;
public class QuanLy {
    private static ArrayList<CanBo> DanhSachCB = new ArrayList<>();

    public QuanLy() {

    }
    public static ArrayList<CanBo> getDscb() {
        return DanhSachCB;
    }

        public static boolean themCanBo(CanBo cb) {
            DanhSachCB.add(cb);
            return true;
        }

        public static ArrayList<CanBo> xoaCanbo(String ten) {
            for (int i=0;i< DanhSachCB.size();i++) {
                if (ten.equalsIgnoreCase(DanhSachCB.get(i).getHoten())) {
                    DanhSachCB.remove(DanhSachCB.get(i));
                    break;
                }
            }
            return DanhSachCB;
        }
        //cv = chuc vu; dv = donvi ; snlv = so ngay lam viec
        public static ArrayList suaGiamDoc(int macanbo,String hoten,String cv ,String dv,int snlv,double luongcoban ){
            for (int i=0;i< DanhSachCB.size();i++) {
                if (macanbo == DanhSachCB.get(i).getMaCanBo()) {
                    DanhSachCB.set(i,new GiamDoc(macanbo,hoten,cv,dv,snlv,luongcoban));
                }
            }
            return DanhSachCB;
        }
        public static ArrayList suaTruongPhong(int macanbo,String hoten,String cv,String dv ,int snlv,double luongcoban,double phucap) {
            for (int i=0;i< DanhSachCB.size();i++) {
                if (macanbo == DanhSachCB.get(i).getMaCanBo()) {
                    DanhSachCB.set(i,new TruongPhong(macanbo,hoten,cv,dv,snlv,luongcoban,phucap));
                }
            }
            return DanhSachCB;
        }
    public static ArrayList suaNhanVien(int macanbo,String hoten,String cv,String dv ,int snlv,double luongcoban, double thuong) {
        for (int i=0;i< DanhSachCB.size();i++) {
            if (macanbo == DanhSachCB.get(i).getMaCanBo()) {
                DanhSachCB.set(i,new NhanVien (macanbo,hoten,cv,dv,snlv,luongcoban,thuong));
            }
        }
        return DanhSachCB;
    }
    public static void timKiem(String ten,int macanbo, String cv, String dv) {
        for (int i=0;i< DanhSachCB.size();i++) {
            if (ten.equalsIgnoreCase(DanhSachCB.get(i).getHoten()) ||
                    macanbo == DanhSachCB.get(i).getMaCanBo())
                    cv.equalsIgnoreCase(DanhSachCB.get(i).getChucvu()) ||
                            dv.equalsIgnoreCase(DanhSachCB.get(i).getDonvi()) ||
                System.out.println(DanhSachCB.get(i).getHoten());

        }
    }
        public void inDanhSach() {
            for (CanBo i : DanhSachCB) {
                i.inTTin();
            }
        }
}

