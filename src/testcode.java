import java.util.Scanner;

public class testcode {
    public static void main(String[] args) {
        ngayChieu sc=new ngayChieu(11,5,2023);
        ngayChieu sc1=new ngayChieu(12,1,2233);
        hangPhim hp=new hangPhim("ldg","vietnam");
        hangPhim hp1=new hangPhim("lthn","vietnam");
        thongTin t=new thongTin("lap trinh java",2004,hp1,sc1,100);
        thongTin t1=new thongTin("lap trinh fonend",2005,hp,sc,200);
        System.out.println("kiem tra gia ve t vs t1:"+t.kiemTraGiaVe(t1));
        System.out.println("hien thi nha san xuat phim: "+hp.getHangSanXuat());
        System.out.println("gia sau khi giam 50% : "+t.giaTienKhiGiamGia(50)+"vnd");
        System.out.println("=====================================================");
    }
}
