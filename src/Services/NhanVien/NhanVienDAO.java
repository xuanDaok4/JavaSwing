/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.NhanVien;

import Models.NhanVien.CaLam_NhanVienModel;
import Models.NhanVien.Luong_NhanVienModel;
import Models.NhanVien.NhanVienModel;
import Utilities.DBcontext;
import Utilities.cnt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author LVQ
 */
public class NhanVienDAO implements InterFaceNhanVienDAO<NhanVienModel,String>{
NhanVien_ChucVuDAO nvcv=new NhanVien_ChucVuDAO();
Luong_NhanVienDAO lnv=new Luong_NhanVienDAO();
CaLam_NhanVienDAO clnv=new CaLam_NhanVienDAO();
    @Override
    public boolean Insert(NhanVienModel nv) {
        boolean a=false;
        try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("insert NhanVien(MaNhanVien,HoTen,GioiTinh,DiaChi,SDT,NgaySinh,MatKhau,TrangThai) values(?,?,?,?,?,?,'123',1)");
            pstm.setString(1,nv.getMaNV());
            pstm.setString(2,nv.getHoTen());
            pstm.setInt(3,nv.getGioiTinh().equalsIgnoreCase("Nam")?1:0);
            pstm.setString(4, nv.getDiaChi());       
            pstm.setString(5,nv.getSDT());
            pstm.setString(6,new String(new SimpleDateFormat("MM-dd-yyyy").format(nv.getNgaySinh())));
            if (pstm.executeUpdate()>0) {
                a= true;
                if (nvcv.Insert(nv)) {
                    a=true;
                    if (lnv.Insert(new Luong_NhanVienModel(nv.getMaNV(),nv.getHoTen(), 0, 0, 0)));
                    {
                    a=true;
                        if (clnv.Insert(new CaLam_NhanVienModel(nv.getMaNV(),nv.getHoTen(), 0))); {
                            
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            a= false;
        }
       
        return a;}

    @Override
    public boolean Update(NhanVienModel nv) {
        boolean a=false;
        if (nv.getTrangThai().equalsIgnoreCase("Đã nghỉ")) {
            clnv.Delete(new CaLam_NhanVienModel(nv.getMaNV(),"",""));
            lnv.Delete(new Luong_NhanVienModel(nv.getMaNV(),"", 0, 0, 0));
            try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("update NhanVien set HoTen=?,GioiTinh=?,DiaChi=?,SDT=?,TrangThai=? where MaNhanVien like ?");
            pstm.setString(6,nv.getMaNV());
            pstm.setInt(5, nv.getTrangThai().equalsIgnoreCase("Đang Làm")?1:0);
            pstm.setString(1,nv.getHoTen());
            pstm.setInt(2,nv.getGioiTinh().equalsIgnoreCase("Nam")?1:0);
            pstm.setString(3, nv.getDiaChi());
            pstm.setString(4,nv.getSDT());
            if (pstm.executeUpdate()>0) {
                a= true;
                nvcv.Update(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            a= false;
        }
        }else if(nv.getTrangThai().equalsIgnoreCase("Đang làm")){
            clnv.Insert(new CaLam_NhanVienModel(nv.getMaNV(),"",""));
            lnv.Insert(new Luong_NhanVienModel(nv.getMaNV(),"", 0, 0, 0));
        try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("update NhanVien set HoTen=?,GioiTinh=?,DiaChi=?,SDT=?,TrangThai=? where MaNhanVien like ?");
            pstm.setString(6,nv.getMaNV());
            pstm.setInt(5, nv.getTrangThai().equalsIgnoreCase("Đang Làm")?1:0);
            pstm.setString(1,nv.getHoTen());
            pstm.setInt(2,nv.getGioiTinh().equalsIgnoreCase("Nam")?1:0);
            pstm.setString(3, nv.getDiaChi());
            pstm.setString(4,nv.getSDT());
            if (pstm.executeUpdate()>0) {
                a= true;
                nvcv.Update(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            a= false;
        }
        }else{
        try {
            Connection cnts=DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("update NhanVien set HoTen=?,GioiTinh=?,DiaChi=?,SDT=?,TrangThai=? where MaNhanVien like ?");
            pstm.setString(6,nv.getMaNV());
            pstm.setInt(5, nv.getTrangThai().equalsIgnoreCase("Đang Làm")?1:0);
            pstm.setString(1,nv.getHoTen());
            pstm.setInt(2,nv.getGioiTinh().equalsIgnoreCase("Nam")?1:0);
            pstm.setString(3, nv.getDiaChi());
            pstm.setString(4,nv.getSDT());
            if (pstm.executeUpdate()>0) {
                a= true;
                nvcv.Update(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            a= false;
        }
        }
        return a;}

    @Override
    public boolean Delete(NhanVienModel e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NhanVienModel> selectAll() {
        ArrayList<NhanVienModel> ds=new ArrayList<>();
        ds.removeAll(ds);
        try {
            Connection cnts =DBcontext.getConnection();
            PreparedStatement pstm=cnts.prepareCall("select NhanVien.MaNhanVien,HoTen,GioiTinh,DiaChi,TenCV,SDT,NgaySinh,TrangThai from NhanVien left join NHANVIEN_ChucVu on NhanVien.MaNhanVien=NHANVIEN_ChucVu.MaNhanVien");
            ResultSet rs=pstm.executeQuery();
            while (rs.next()) {                
                 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                 Date NgaySinh=sdf.parse(rs.getString(7));
                 ds.add(new NhanVienModel(rs.getString(1),rs.getString(2),rs.getInt(3)==1?"Nam":"Nữ",rs.getString(4),rs.getString(5),rs.getString(6),NgaySinh,rs.getInt(8)==1?"Đang làm":"Đã nghỉ"));
            }
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean selectByID(String mnv) {
        boolean a=false;
           for (NhanVienModel nhanVien : selectAll()) {
               if (mnv.equalsIgnoreCase(nhanVien.getMaNV())||mnv==nhanVien.getMaNV()) {
                   a=true;
                   break;
               }
        }
   return a;
    }
    public NhanVienModel findNV(String mnv){
        NhanVienModel nv = null; 
    for (NhanVienModel nhanVien : selectAll()) {
               if (mnv.equalsIgnoreCase(nhanVien.getMaNV())||mnv==nhanVien.getMaNV()) {
                   nv=nhanVien;
                   break;
               }
    }
    return nv;
}}
