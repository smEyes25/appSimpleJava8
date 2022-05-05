
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongNguyen
 */
public class Lop {
    private String ma, ten;
    private Map<Integer, SinhVien> dsSV;

    public Lop() {
        this.ma = this.ten = "";
        this.dsSV = new HashMap<>();
    }

    public Lop(String ma, String ten, Map<Integer, SinhVien> dsSV) {
        this.ma = ma;
        this.ten = ten;
        this.dsSV = dsSV;
    }

    public Lop(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.dsSV = new HashMap<>();
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Map<Integer, SinhVien> getDsSV() {
        return dsSV;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDsSV(Map<Integer, SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
    
    public void themSV(SinhVien sv) {
        dsSV.put(sv.getMa(), sv);
    }
    
    public void xoaSV(SinhVien sv) {
        dsSV.remove(sv.getMa());
    }
    
    public void capNhatSV(int ma, SinhVien sv) {
        dsSV.replace(ma, sv);
    }
}
