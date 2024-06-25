
package Services.PhieuGiaoHang;

import Models.PhieuGiaoHang.PhieuGiaoHangModels;
import Models.PhieuGiaoHang.ThanhToanModels;
import Utilities.DBcontext;
import Utilities.JdbcHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class PhieuGiaoHangDao {
     public ArrayList<PhieuGiaoHangModels> getAll() {
       ArrayList<PhieuGiaoHangModels> pgh = new ArrayList<>();
      String sql = "select * from PhieuGiaoHang ";
//              + "join PHIEUGIAOHANG_DiaDiemGiaoHang on "
//              + "PhieuGiaoHang.MaDiaDiem=PHIEUGIAOHANG_DiaDiemGiaoHang.MaDiaDiem"
//              + " join PHIEUGIAOHANG_thongTinVanChuyen on PhieuGiaoHang.MaVanChuyen=PHIEUGIAOHANG_thongTinVanChuyen.MaVanChuyen"
//              + " join PHIEUGIAOHANG_TrangThai on PhieuGiaoHang.MaTrangThai=PHIEUGIAOHANG_TrangThai.MaTrangThai";
        try {           
            Connection cn = DBcontext.getConnection();
            PreparedStatement ptsm = cn.prepareCall(sql);
            ResultSet rs = ptsm.executeQuery();
            while (rs.next()) {
                PhieuGiaoHangModels ph = new PhieuGiaoHangModels();
                
                ph.setMaPhieu(rs.getString("MaPhieu"));
                ph.setNgayGiao(rs.getDate("NgayGiao"));
                ph.setMaTrangThai(rs.getInt("MaTrangThai"));
                // ph.setDiaChi(rs.getString(3));
                ph.setNguoiNhan(rs.getString("NguoiNhan"));
                ph.setSdt(rs.getString("Sdt"));
                ph.setGmail(rs.getString("Email"));
                ph.setTrangThaiThanhToan(rs.getString("TrangThaiThanhToan"));
                ph.setGhiChu(rs.getString("GhiChu"));
                pgh.add(ph);
            }
        } catch (Exception e) {
              throw new RuntimeException(e);
        }
        return pgh;
    }
     
     public Integer add(PhieuGiaoHangModels nv) {
        Integer row = null;
        String sql = "INSERT INTO PhieuGiaoHang(MaPhieu,NgayGiao,NguoiNhan,Sdt,Email,TrangThaiThanhToan,GhiChu) VALUES (?,?,?,?,?,?,?)";
        Connection con = DBcontext.getConnection();
        
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setObject(1, nv.getMaPhieu());
            pr.setObject(2, nv.getNgayGiao());
            pr.setObject(3, nv.getNguoiNhan());
            pr.setObject(4, nv.getSdt());
            pr.setObject(5, nv.getGmail());
            pr.setObject(6, nv.getTrangThaiThanhToan());
            pr.setObject(7, nv.getGhiChu());
            
            row = pr.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return row;
    }
  public Integer update(PhieuGiaoHangModels pgh) {
       Integer row = null;
        String sql = "UPDATE PhieuGiaoHang SET NgayGiao = ?, NguoiNhan = ?, Sdt = ?,Email=?,TrangThaiThanhToan=?, GhiChu = ? WHERE MaPhieu = ?";
        Connection con = DBcontext.getConnection();

        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setObject(1, pgh.getNgayGiao());
            pr.setObject(2, pgh.getNguoiNhan());
            pr.setObject(3, pgh.getSdt());
            pr.setObject(4, pgh.getGmail());
            pr.setObject(5, pgh.getTrangThaiThanhToan());
            pr.setObject(6, pgh.getGhiChu());
            pr.setObject(7, pgh.getMaPhieu());            
            row = pr.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return row;
    }
    public Integer delete(int index, String pgh) {
        Integer row = null;
        String sql = "DELETE PhieuGiaoHang WHERE MaPhieu = ?";
        Connection con = DBcontext.getConnection();
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, pgh);
            row = pr.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return row;
    }
    
    public ArrayList<PhieuGiaoHangModels> getMa(String MA) {
        ArrayList<PhieuGiaoHangModels> lst = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PhieuGiaoHang WHERE MaPhieu like '%" + MA + "%'";
            Connection cn = DBcontext.getConnection();
            PreparedStatement ptsm = cn.prepareStatement(sql);
            ResultSet rs = ptsm.executeQuery();
            while (rs.next()) {
                PhieuGiaoHangModels kh = new PhieuGiaoHangModels();

                kh.setMaPhieu(rs.getString("MaPhieu"));
                kh.setNgayGiao(rs.getDate("NgayGiao"));
                kh.setNguoiNhan(rs.getString("NguoiNhan"));
                kh.setSdt(rs.getString("Sdt"));
                kh.setGhiChu(rs.getString("GhiChu"));
                kh.setGmail(rs.getString("Gmail"));
                kh.setTrangThaiThanhToan(rs.getString("TrangThaiThanhToan"));
                lst.add(kh);
            }
        } catch (Exception e) {
        }
        return lst;
    }
    
    
    
     public ArrayList<PhieuGiaoHangModels> selectByThanhToan(String macd) {
        String sql = "select*from PhieuGiaoHang where MaTrangThai = ?";
        return this.getAll();
    }

   
    
}
