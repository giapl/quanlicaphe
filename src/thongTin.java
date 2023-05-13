public class thongTin {
    private String tenPhim;
    private int namSanXuat;
    private hangPhim hangSanXuat;
    private double giaVe;
    private ngayChieu NgayChieu;
    // contructorn
   public thongTin(String tenPhim,int namSanXuat,hangPhim hangSanXuat,ngayChieu NgayChieu,double giaVe){
       this.tenPhim=tenPhim;
       this.namSanXuat=namSanXuat;
       this.hangSanXuat=hangSanXuat;
       this.NgayChieu=NgayChieu;
       this.giaVe=giaVe;
   }
   // cac phuong thuc ham set vs get
    public String gettenphim(){
       return this.tenPhim=tenPhim;
    }
    public void setTenPhim(){
       this.tenPhim=tenPhim;
    }
    public int getNamSanXuat(){
       return this.namSanXuat=namSanXuat;
    }
    public void setHangSanXuat(){
       this.hangSanXuat=hangSanXuat;
    }
    public double getGiaVe(){
       return this.giaVe=giaVe;
    }
    public void setGiaVe(double index){
       this.giaVe=index;
    }
   // cac phuong thuc lam viec
    public boolean kiemTraGiaVe(thongTin boPhimKhac){
       return giaVe<=boPhimKhac.giaVe;
    }
    public String inHangSanXuat(){
       return this.hangSanXuat.getHangSanXuat();
    }
    public double giaTienKhiGiamGia(double x){
       return giaVe-(x/100)*giaVe;
    }
}
