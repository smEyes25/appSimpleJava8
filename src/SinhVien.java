/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongNguyen
 */
public class SinhVien {
    private int ma;
    private String ten;
    private boolean phai;
    private double diem;
    private String maLop;

    public SinhVien() {
        this.ma = 0;
        this.ten = "";
        this.phai = true;
        this.diem = 0;
        this.maLop = "";
    }

    public SinhVien(int ma, String ten, boolean phai, double diem, String maLop) {
        this.ma = ma;
        this.ten = ten;
        this.phai = phai;
        this.diem = diem;
        this.maLop = maLop;
    }

    public SinhVien(String ten, boolean phai, double diem, String maLop) {
        this.ten = ten;
        this.phai = phai;
        this.diem = diem;
        this.maLop = maLop;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public boolean isPhai() {
        return phai;
    }

    public double getDiem() {
        return diem;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    
    
}
