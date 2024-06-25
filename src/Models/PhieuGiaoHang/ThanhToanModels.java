
package Models.PhieuGiaoHang;

import java.util.Date;


public class ThanhToanModels {
    int MaThanhToan;
    String PhuongThuc,TrangThai;
    Float soTien;
    Date NgayThanhToan;
    public ThanhToanModels() {
    }

    public ThanhToanModels(Float soTien) {
        this.soTien = soTien;
    }

    public Float getSoTien() {
        return soTien;
    }

    public void setSoTien(Float soTien) {
        this.soTien = soTien;
    }

   
    public int getMaThanhToan() {
        return MaThanhToan;
    }

    public void setMaThanhToan(int MaThanhToan) {
        this.MaThanhToan = MaThanhToan;
    }

 

    public String getPhuongThuc() {
        return PhuongThuc;
    }

    public void setPhuongThuc(String PhuongThuc) {
        this.PhuongThuc = PhuongThuc;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public ThanhToanModels(int MaThanhToan, String PhuongThuc, String TrangThai, Float soTien, Date NgayThanhToan) {
        this.MaThanhToan = MaThanhToan;
        this.PhuongThuc = PhuongThuc;
        this.TrangThai = TrangThai;
        this.soTien = soTien;
        this.NgayThanhToan = NgayThanhToan;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    @Override
    public String toString() {
        return "ThanhToanModels{" + "MaThanhToan=" + MaThanhToan + ", PhuongThuc=" + PhuongThuc + ", TrangThai=" + TrangThai + ", soTien=" + soTien + ", NgayThanhToan=" + NgayThanhToan + '}';
    }

  

  
  
    
}
