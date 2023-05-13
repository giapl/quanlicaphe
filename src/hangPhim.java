public class hangPhim {
    private String hangSanXuat;
    private String quocGia;
    // contructorn
    public hangPhim(String hangSanXuat,String quoocGia){
        this.hangSanXuat=hangSanXuat;
        this.quocGia=quocGia;
    }
// cac phuong thuc get va set
    public String getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public String getQuocGia() {
        return quocGia;
    }
    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
