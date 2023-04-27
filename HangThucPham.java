/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class HangThucPham {
      private int maHang;
    private String tenHang;
    private double donGia;
    private Date nSX, hSD;
    
    private String ghiChu;

    /**
     * Get the value of ghiChu
     *
     * @return the value of ghiChu
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * Set the value of ghiChu
     *
     * @param ghiChu new value of ghiChu
     */
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

 
   
    public HangThucPham (int maHang, String tenHang, double donGia, Date nSX, Date hSD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.hSD = hSD;
        this.ghiChu = ghiChu;
    }
 
    
    public HangThucPham(){
    }
 
  
    public int getMaHang() {
        return maHang;
    }
 
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
 
    public String getTenHang() {
        return tenHang;
    }
 
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
 
    public double getDonGia() {
        return donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public Date getnSX() {
        return nSX;
    }
 
    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }
 
    public Date gethSD() {
        return hSD;
    }
 
    public void sethSD(Date hSD) {
        this.hSD = hSD;
    }
 

    @Override
    
    public String toString() {
       
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(donGia);
       
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(nSX);
        String str2 = simpleDateFormat.format(hSD);
        return "------------------------------------------------------------"+
    "\nMa_hang" + "Tên_hàng" + "Đơn_giá" + "Ngay_san_xuat" + "Ngay_het_han" +"Ghi_chu"+
   "\n_____________________________________________________________________________"
   +"\n"+" "+ maHang +" "+ tenHang+"  "  +"  "+ str +"  " + str1 +"  "  + str2 +"  " + ghiChu ;       
                   
    }
 
   
    public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nSX = calendar.getTime();
    }
 
    
    public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hSD = calendar.getTime();
    }
 
    
    public boolean kiemTraTenHang(boolean k) {
        if ("".equals(this.tenHang) || this.tenHang.isEmpty()) {
            System.out.println("Tên hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
 
    
    public boolean kiemTraNgay(boolean t) {
        if (this.getnSX().compareTo(this.gethSD()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
 
    
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.gethSD().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
}

