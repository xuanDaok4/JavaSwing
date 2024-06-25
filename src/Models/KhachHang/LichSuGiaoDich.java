/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.KhachHang;

/**
 *
 * @author VU ANH TAI
 */
public class LichSuGiaoDich {
    private String tenKH;
    private String tenSp;
    private String sdt;
    private float soLuong;
    private float tongTien;
    private boolean trangThai;

    public LichSuGiaoDich() {
    }

    public LichSuGiaoDich(String tenKH, String tenSp, String sdt, float soLuong, float tongTien, boolean trangThai) {
        this.tenKH = tenKH;
        this.tenSp = tenSp;
        this.sdt = sdt;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    
}
