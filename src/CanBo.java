public class CanBo {
        private int maCanBo;
        private String Hoten;
        private int Songaylamviec;
        private String Chucvu;
        private String Donvi;

    public CanBo (int maCanBo,String hoten,String Chucvu,String Donvi,int Songaylamviec){
        this.maCanBo = maCanBo;
        this.Hoten = hoten;
        this.Chucvu = Chucvu;
        this.Donvi = Donvi;
        this.Songaylamviec = Songaylamviec;
        //luongcoban=luongcoban
    }
        public CanBo() {
        }
        public int getMaCanBo() {
            return maCanBo;
        }

        public void setMaCanBo(int maCanBo) {
            this.maCanBo = maCanBo;
        }

        public String getHoten() {
            return Hoten;
        }
        public void setHoten(String hoten) {
            Hoten = hoten;
        }

        public String getChucvu(){
        return Chucvu;
        }
        public void setChucvu(String Chucvu){
        Chucvu = Chucvu;
        }
        public String getDonvi(){
        return Donvi;
        }
        public void setDonvi(String donvi){
        donvi = donvi;
        }
        public int getSongaylamviec(){
        return Songaylamviec;
        }
        public void setSongaylamviec(int songaylamviec){
        this.Songaylamviec=songaylamviec;
        }
        public double tinhLuong() {
            return 0.0;
        }
        public void inTTin() {
        }
    }

