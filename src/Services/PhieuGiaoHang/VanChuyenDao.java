
package Services.PhieuGiaoHang;

import Models.PhieuGiaoHang.DiaChiModel;
import Models.PhieuGiaoHang.VanChuyenModels;
import Utilities.DBcontext;
import Utilities.JdbcHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class VanChuyenDao {
     public ArrayList<VanChuyenModels> getAllVanCHuyen() {
        ArrayList<VanChuyenModels> list = new ArrayList<>();
        String sql = "Select * from PHIEUGIAOHANG_thongTinVanChuyen";
        try {
            Connection cn = DBcontext.getConnection();
            PreparedStatement ptsm = cn.prepareCall(sql);
            ResultSet rs = ptsm.executeQuery();
            while(rs.next()) {
                VanChuyenModels n = new VanChuyenModels();
                n.setMaVanChuyen(rs.getInt("MaVanChuyen"));
              
                n.setNguoiVanCHuyen(rs.getString("NguoiVanChuyen"));
                n.setSDTNguoiGiao(rs.getString("SDTNguoiGiao"));
               
                list.add(n);
            }
        } catch (Exception e) {
        }
        return list;
    }
     
      public Integer add(VanChuyenModels pgh) {
        Integer row = null;
        String sql = "INSERT INTO PHIEUGIAOHANG_thongTinVanChuyen(NguoiVanChuyen,SDTNguoiGiao) values (?,?)";
        try {
            Connection cn = DBcontext.getConnection();
            PreparedStatement ptsm = cn.prepareCall(sql);
//            ptsm.setObject(1, pgh.getMaDiaDiem());
            ptsm.setObject(1, pgh.getNguoiVanCHuyen());
            ptsm.setObject(2, pgh.getSDTNguoiGiao());  
          row = ptsm.executeUpdate();            
        } catch (Exception e) {
        }
        return row;
    }
      
      public Integer update(DiaChiModel pgh) {
          Integer row = null;
        String sql = "UPDATE PHIEUGIAOHANG_DiaDiemGiaoHang SET Duong=?,TenQH=?,TenTP=? WHERE MaDiaDiem = ?";
        Connection con = DBcontext.getConnection();

        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setObject(1, pgh.getDuong());
            pr.setObject(2, pgh.getTenQh());
            pr.setObject(3, pgh.getTenTP());
            pr.setObject(4, pgh.getMaDiaDiem());

            row = pr.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return row;
    }
      
       public Integer delete(int index, String pgh) {
          Integer row = null;
        String sql = "DELETE PHIEUGIAOHANG_thongTinVanChuyen WHERE MaVanChuyen = ?";
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
}
