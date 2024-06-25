/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.NhanVien;

import Models.NhanVien.Luong_NhanVienModel;
import Models.NhanVien.Luong_NhanVienModel;
import Utilities.DBcontext;
import Utilities.cnt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author LVQ
 */
public class Luong_NhanVienDAO implements InterFaceNhanVienDAO<Luong_NhanVienModel,String>{

    @Override
    public boolean Insert(Luong_NhanVienModel nv) {
        boolean a=false;
         try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("insert NHANVIEN_Luong(MaNhanVien,LuongCoban,LuongTangCa,ThueKhauTru) values (?,?,?,?)");
            pstm.setString(1,nv.getMaNV());
            pstm.setFloat(2,nv.getLuongCoBan());
            pstm.setFloat(3,nv.getLuongTangCa());
            pstm.setFloat(4,nv.getThueKhauTru());
             if (pstm.executeUpdate()>0) {
                 a=true;
             }
        } catch (Exception e) {
            e.printStackTrace();
            a=false;
        } return a;}

    @Override
    public boolean Update(Luong_NhanVienModel nv) {
        boolean a=false;
         try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("update NHANVIEN_Luong set LuongCoban=?,LuongTangCa=?,ThueKhauTru=? where MaNhanVien like ?");
            pstm.setString(4,nv.getMaNV());
            pstm.setFloat(1,nv.getLuongCoBan());
            pstm.setFloat(2,nv.getLuongTangCa());
            pstm.setFloat(3,nv.getThueKhauTru());
             if (pstm.executeUpdate()>0) {
                 a=true;
             }
        } catch (Exception e) {
            e.printStackTrace();
            a=false;
        } return a;}

    @Override
    public boolean Delete(Luong_NhanVienModel nv) {
     boolean a=false;
         try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("delete NHANVIEN_Luong where MaNhanVien like ?");
            pstm.setString(1,nv.getMaNV());
             if (pstm.executeUpdate()>0) {
                 a=true;
             }
        } catch (Exception e) {
            e.printStackTrace();
            a=false;
        } return a;
    }

    @Override
    public ArrayList<Luong_NhanVienModel> selectAll() {
    ArrayList<Luong_NhanVienModel>dslnv=new ArrayList<>();
    dslnv.removeAll(dslnv);
        try {
            Connection cnts =cnt.cnt();
            PreparedStatement pstm=cnts.prepareCall("select NhanVien.MaNhanVien,NhanVien.HoTen,LuongCoban,LuongTangCa,ThueKhauTru from NhanVien join NHANVIEN_Luong on NhanVien.MaNhanVien=NHANVIEN_Luong.MaNhanVien");
            ResultSet rs=pstm.executeQuery();
            while (rs.next()) { 
                Luong_NhanVienModel lnv=new Luong_NhanVienModel(rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getFloat(5));
                dslnv.add(lnv);
            }
            return dslnv;
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
