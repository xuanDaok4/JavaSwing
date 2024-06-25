/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.NhanVien;

import Models.NhanVien.CaLam_NhanVienModel;
import Utilities.DBcontext;
import Utilities.cnt;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author LVQ
 */
public class CaLam_NhanVienDAO implements InterFaceNhanVienDAO<CaLam_NhanVienModel, String> {

    @Override
    public boolean Insert(CaLam_NhanVienModel nv) {
        boolean a = false;
        try {
            Connection cnts = DBcontext.getConnection();
            PreparedStatement pstm = cnts.prepareCall("insert NHANVIEN_CaLam(MaNhanVien,TenCa) values(?,?)");
            pstm.setString(1, nv.getMaNV());
            pstm.setInt(2, nv.getCaLam());
            if (pstm.executeUpdate() > 0) {
                a = true;
                System.out.println("Thêm đc");
            }else{
                System.out.println("Sao đ đc");
            }
        } catch (Exception e) {
            e.printStackTrace();
            a = false;
        }
        return a;
    }

    @Override
    public boolean Update(CaLam_NhanVienModel e) {
        boolean a = false;
        if (Delete(e)) {
            System.out.println("Xóa được");
            if (e.LayCaLamCuThe().size()==0) {
                System.out.println("đéo có nhá");
            }
            for (Integer i:e.LayCaLamCuThe()) {
                System.out.println(i);
                if (Insert(new CaLam_NhanVienModel(e.getMaNV(), e.getHoTen(),i))) {
                    a = true;
                    System.out.println("Đang thêm"+i);
            }else{System.out.println("Thất bại");}
        }}else{System.out.println("Hay luôn đ xóa được");}
        return a;
    }

    @Override
    public boolean Delete(CaLam_NhanVienModel nv) {
        boolean a = false;
        try {
            Connection cnts = DBcontext.getConnection();
            PreparedStatement pstm = cnts.prepareCall("delete NHANVIEN_CaLam where MaNhanVien = ?");
            pstm.setString(1, nv.getMaNV());
            if (pstm.executeUpdate() > 0) {
                a = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            a = false;
        }
        return a;
    }

    @Override
    public ArrayList<CaLam_NhanVienModel> selectAll() {
        ArrayList<CaLam_NhanVienModel> ds = new ArrayList<>();
        try {
            Connection cnts = cnt.cnt();
            PreparedStatement pstm = cnts.prepareCall("SELECT nv.MaNhanVien, nv.HoTen,STRING_AGG(cl.TenCa, N' và ') AS CacCaLam,COUNT(*) as SoCa \n"
                    + "FROM NhanVien nv\n"
                    + "JOIN NHANVIEN_CaLam cl ON nv.MaNhanVien = cl.MaNhanVien\n"
                    + "GROUP BY nv.MaNhanVien, nv.HoTen;");
            ResultSet rs = pstm.executeQuery();
            ArrayList<Integer> caca = new ArrayList<>();

            while (rs.next()) {
                ds.add(new CaLam_NhanVienModel(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public boolean selectByID(String k) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
