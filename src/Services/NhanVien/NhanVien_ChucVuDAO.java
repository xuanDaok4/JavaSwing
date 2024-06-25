/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.NhanVien;

import Models.NhanVien.NhanVienModel;
import Utilities.DBcontext;
import Utilities.cnt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.xml.transform.Result;

/**
 *
 * @author LVQ
 */
public class NhanVien_ChucVuDAO implements InterFaceNhanVienDAO<NhanVienModel,String>{

    @Override
    public boolean Insert(NhanVienModel nv) {
        boolean a=false;
         try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("insert NHANVIEN_ChucVu(MaNhanVien,TenCV) values(?,?)");
            pstm.setString(1,nv.getMaNV());
            pstm.setString(2,nv.getChucVu());
             if (pstm.executeUpdate()>0) {
                 a=true;
             }
        } catch (Exception e) {
            e.printStackTrace();
            a=false;
        } return a;}

    @Override
    public boolean Update(NhanVienModel nv) {
    boolean a=false;
         try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("update NHANVIEN_ChucVu set TenCV=? where MaNhanVien like ?");
            pstm.setString(2,nv.getMaNV());
            pstm.setString(1,nv.getChucVu());
             if (pstm.executeUpdate()>0) {
                 a=true;
             }
        } catch (Exception e) {
            e.printStackTrace();
            a=false;
        } return a;   
    }

    @Override
    public boolean Delete(NhanVienModel e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NhanVienModel> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean selectByID(String k) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public ArrayList<String> SelectChucVu(){
    ArrayList<String> dscv=new ArrayList<>();
    String sql="select distinct TenCV from NHANVIEN_ChucVu";
        try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall(sql);
            ResultSet rs=pstm.executeQuery();
            while (rs.next()) {                
               dscv.add(rs.getString(1));
            }
            return dscv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
