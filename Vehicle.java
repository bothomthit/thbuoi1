/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class Vehicle {

    static void nhapThongTin(Vehicle vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    public String tenChuXe;
    
    public String loaiXe;
    
    public int dungTich;
    
    public double triGia;
    
    public double thuePhaiNop;

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia, double thuePhaiNop) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thuePhaiNop = thuePhaiNop;
    }

    Vehicle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    /**
     * Get the value of thuePhaiNop
     *
     * @return the value of thuePhaiNop
     */
    public double getThuePhaiNop() {
        if (100>dungTich) {
            return triGia/100;
        }
        if(dungTich>=200 & dungTich<=300) {
            return (triGia*3)/100;
        }
        else 
        return (triGia*5)/100;
    }

    /**
     * Set the value of thuePhaiNop
     *
     * @param thuePhaiNop new value of thuePhaiNop
     */
    public void setThuePhaiNop(double thuePhaiNop) {
        this.thuePhaiNop = thuePhaiNop;
    }


    /**
     * Get the value of triGia
     *
     * @return the value of triGia
     */
    public double getTriGia() {
        return triGia;
    }

    /**
     * Set the value of triGia
     *
     * @param triGia new value of triGia
     */
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }


    /**
     * Get the value of dungTich
     *
     * @return the value of dungTich
     */
    public int getDungTich() {
        return dungTich;
    }

    /**
     * Set the value of dungTich
     *
     * @param dungTich new value of dungTich
     */
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }


    /**
     * Get the value of loaiXe
     *
     * @return the value of loaiXe
     */
    public String getLoaiXe() {
        return loaiXe;
    }

    /**
     * Set the value of loaiXe
     *
     * @param loaiXe new value of loaiXe
     */
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }


    /**
     * Get the value of tenChuXe
     *
     * @return the value of tenChuXe
     */
    public String getTenChuXe() {
        return tenChuXe;
    }

    /**
     * Set the value of tenChuXe
     *
     * @param tenChuXe new value of tenChuXe
     */
    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    @Override
    public String toString() {
        return "_________________________________________________________________"
 +"/n"+"Ten_chu_Xe"    +"Loai_Xe" +     "dung_tich" +   "Tri_gia"  +"thue_phai_nop"  
 +"---------------------------------------------------------------------------------" 
 +tenChuXe+"    " +    loaiXe+"    " + dungTich+"   " + triGia+"  " + thuePhaiNop  ;      
    }
  
}
