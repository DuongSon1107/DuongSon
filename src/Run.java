import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        QuanLy ql = new QuanLy();
        do {
            System.out.println("1-thêm cán bộ");
            System.out.println("2-in thông tin danh sách");
            System.out.println("3-xóa cán bộ");
            System.out.println("4-sửa thông tin cán bộ");
            System.out.println("Tìm kiếm cán bộ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:

                    System.out.println("1-Giam Doc ");
                    System.out.println("2-Truong Phong");
                    System.out.println("3- Nhan Vien");
                    int chonloai = sc.nextInt();
                    if (chonloai == 1) {
                        System.out.println("Nhap ma can bo:");
                        int macanbo = sc.nextInt();
                        System.out.println("-------------------");
                        String blank1 = sc.nextLine();
                        System.out.println("Nhap ho ten giam doc:");
                        String tengiamdoc = sc.nextLine();
                        System.out.println("Nhap chuc vu:");
                        String chucvu = sc.nextLine();
                        System.out.println("Nhap don vi cong tac:");
                        String donvicongtac = sc.nextLine();
                        System.out.println("Nhap so ngay lam viec:");
                        int songaylamviec = sc.nextInt();
                        System.out.println("Nhap luong co ban");
                        double luongcb = sc.nextDouble();
                        CanBo giamDoc = new GiamDoc(macanbo,tengiamdoc,chucvu,donvicongtac,songaylamviec,luongcb);
                        ql.themCanBo(giamDoc);

                    } else if (chonloai == 2) {
                        System.out.println("Nhap ma can bo :");
                        int macanbo = sc.nextInt();
                        System.out.println("-------------------");
                        String blank2 = sc.nextLine();
                        System.out.println("Nhap ho ten truong phong:");
                        String tentruongphong = sc.nextLine();
                        System.out.println("Nhap chuc vu:");
                        String chucvu = sc.nextLine();
                        System.out.println("Nhap don vi cong tac:");
                        String donvi = sc.nextLine();
                        System.out.println("Nhap so ngay lam viec::");
                        int songaylamviec = sc.nextInt();
                        System.out.println("Nhap luong co ban:");
                        double luongcoban = sc.nextDouble();
                        System.out.println("Nhap phu cap quan ly phong");
                        double phucapquanly = sc.nextDouble();
                        CanBo truongphong = new TruongPhong(macanbo,tentruongphong,chucvu,donvi,songaylamviec,luongcoban,phucapquanly);
                        ql.themCanBo(truongphong);

                    } else if (chonloai == 3){
                        System.out.println("Nhap ma can bo :");
                        int macanbo = sc.nextInt();
                        System.out.println("-------------------");
                        String blank3 = sc.nextLine();
                        System.out.println("Nhap ho ten truong phong:");
                        String tentruongphong = sc.nextLine();
                        System.out.println("Nhap chuc vu:");
                        String chucvu = sc.nextLine();
                        System.out.println("Nhap don vi cong tac:");
                        String donvi = sc.nextLine();
                        System.out.println("Nhap so ngay lam viec::");
                        int songaylamviec = sc.nextInt();
                        System.out.println("Nhap luong co ban:");
                        double luongcoban = sc.nextDouble();
                        System.out.println("Nhap thuong theo phong");
                        double thuongtheophong = sc.nextDouble();
                        CanBo nhanvien = new TruongPhong(macanbo,tentruongphong,chucvu,donvi,songaylamviec,luongcoban,thuongtheophong);
                        ql.themCanBo(nhanvien);
                    }
                    break;
                case 2:
                    ql.inDanhSach();
                    break;
                case 3:
                    System.out.println("-------------------");
                    String blank4 = sc.nextLine();
                    System.out.println("Nhap vao ten can bo muon xoa:");
                    String ten_de_xoa = sc.nextLine();
                    ql.xoaCanbo(ten_de_xoa);
                    break;
                case 4:
                    System.out.println("-------------------");
                    String blank5 = sc.nextLine();
                    System.out.println("1-Giam doc");
                    System.out.println("2-Truong Phong");
                    System.out.println("3-Nhan vien");
                    int chonloai2 = sc.nextInt();
                    if (chonloai2 == 1) {
                        System.out.println("Nhap ma giam doc muon sua:");
                        int maGiamDoc = sc.nextInt();
                        System.out.println("-------------------");
                        String blank6 = sc.nextLine();
                        System.out.println("sua ten:");
                        String sua_ten = sc.nextLine();
                        System.out.println("sua chuc vu:");
                        String sua_chucvu = sc.nextLine();
                        System.out.println("sua don vi cong tac:");
                        String sua_donvi = sc.nextLine();
                        System.out.println("sua so ngay lam viec:");
                        int sua_songaylamviec = sc.nextInt();
                        System.out.println("Sua luong co ban");
                        double sua_luongcoban = sc.nextDouble();
                        ql.suaGiamDoc(maGiamDoc,sua_ten,sua_chucvu,sua_donvi,sua_songaylamviec,sua_luongcoban);
                    } else if (chonloai2 == 2) {
                        System.out.println("Nhap ma Truong Phong muon sua:");
                        int maTruongPhong = sc.nextInt();
                        System.out.println("-------------------");
                        String blank7 = sc.nextLine();
                        System.out.println("sua ten:");
                        String sua_ten = sc.nextLine();
                        System.out.println("sua chuc vu:");
                        String sua_chucvu = sc.nextLine();
                        System.out.println("sua don vi cong tac:");
                        String sua_donvi = sc.nextLine();
                        System.out.println("sua so ngay lam viec:");
                        int sua_Songaylamviec = sc.nextInt();
                        System.out.println("Sua luong co ban");
                        int sua_luongcoban = sc.nextInt();
                        System.out.println("Sua phu cap quan ly phong");
                        double sua_phucap = sc.nextDouble();
                        ql.suaTruongPhong(maTruongPhong,sua_ten,sua_chucvu,sua_donvi,sua_Songaylamviec,sua_luongcoban,sua_phucap);
                    }
                case 5:
                    System.out.println("-------------------");
                    String wtf6 = sc.nextLine();
                    System.out.println("Tìm kiếm: ");
                    System.out.println("Nhập tên cán bộ:");
                    String ten = sc.nextLine();
                    System.out.println("Nhập mã cán bộ");
                    String macanbo = sc.nextLine();
                    System.out.println("Nhap chuc vu");
                    String chucvu = sc.nextLine();
                    System.out.println("Nhập đơn vị công tác");
                    String dvct = sc.nextLine();
                    ql.timKiem(ten,macanbo,chucvu,dvct);
                    break;
                case 7:
                    System.out.println("-------------------");
                    String wtf7 = sc.nextLine();
                    for (int i=0;i< ql.getDscb().size();i++) {
                        if (ql.getDscb().get(i).tinhLuong() > 10000000) {
                            System.out.println("Cán bộ có lương trên 10 triệu là:");
                            System.out.println(ql.getDscb().get(i).inTTin()+"\n");
                        }
                    }
                    break;
            }
        } while (isRunning);
    }
}