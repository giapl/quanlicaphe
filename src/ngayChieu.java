public class ngayChieu {
    private int ngay;
    private int thang;
    private int nam;
    // contructorn
    public ngayChieu(int ngay,int thang,int nam){
        this.ngay=ngay;
        this.thang=thang;
        this.nam=nam;
    }
    // tao ham get va set
    public int getNgay() {
        return this.ngay=ngay;
    }
    public void setNgay(int d){
        if(ngay>=1&&ngay<=31){
            this.ngay=d;
        }else {
            this.ngay=1;
        }
    }
    public int getThang(){
      return this.thang=thang;
    }
    public void setThang(int m){
        if(thang>=1&&thang<=12){
            this.thang=m;
        }else {
            this.thang=1;
        }
    }
    public int getNam(){
        return this.nam=nam;
    }

    public void setNam(int y) {
        if(nam>=1){
            this.nam=y;
        }else {
            this.nam=1;
        }
    }
}