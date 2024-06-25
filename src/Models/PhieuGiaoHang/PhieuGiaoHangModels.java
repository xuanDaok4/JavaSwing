
package Models.PhieuGiaoHang;

import java.util.Date;


public class PhieuGiaoHangModels {
    private String maPhieu;
    int MaTrangThai;
    private Date ngayGiao;   
     private String NguoiNhan,Sdt,Gmail,TrangThaiThanhToan,GhiChu;

    public PhieuGiaoHangModels() {
    }

    public int getMaTrangThai() {
        return MaTrangThai;
    }

    public void setMaTrangThai(int MaTrangThai) {
        this.MaTrangThai = MaTrangThai;
    }

    public PhieuGiaoHangModels(int MaTrangThai) {
        this.MaTrangThai = MaTrangThai;
    }

    public PhieuGiaoHangModels(String maPhieu, Date ngayGiao, String NguoiNhan, String Sdt, String Gmail, String TrangThaiThanhToan, String GhiChu) {
        this.maPhieu = maPhieu;
        this.ngayGiao = ngayGiao;
        this.NguoiNhan = NguoiNhan;
        this.Sdt = Sdt;
        this.Gmail = Gmail;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
        this.GhiChu = GhiChu;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public String getNguoiNhan() {
        return NguoiNhan;
    }

    public void setNguoiNhan(String NguoiNhan) {
        this.NguoiNhan = NguoiNhan;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getTrangThaiThanhToan() {
        return TrangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(String TrangThaiThanhToan) {
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return "PhieuGiaoHangModels{" + "maPhieu=" + maPhieu + ", MaTrangThai=" + MaTrangThai + ", ngayGiao=" + ngayGiao + ", NguoiNhan=" + NguoiNhan + ", Sdt=" + Sdt + ", Gmail=" + Gmail + ", TrangThaiThanhToan=" + TrangThaiThanhToan + ", GhiChu=" + GhiChu + '}';
    }

  
     
}
