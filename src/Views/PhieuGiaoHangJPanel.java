
package Views;

import Models.PhieuGiaoHang.DiaChiModel;
import Models.PhieuGiaoHang.PhieuGiaoHangModels;
import Models.PhieuGiaoHang.ThanhToanModels;
import Models.PhieuGiaoHang.TrangThaiModels;
import Models.PhieuGiaoHang.VanChuyenModels;
import Services.PhieuGiaoHang.DiaChiDao;
import Services.PhieuGiaoHang.PhieuGiaoHangDao;
import Services.PhieuGiaoHang.ThanhToanDao;
import Services.PhieuGiaoHang.TrangThaiDao;
import Services.PhieuGiaoHang.VanChuyenDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PhieuGiaoHangJPanel extends javax.swing.JPanel {
  PhieuGiaoHangDao list = new PhieuGiaoHangDao();
    DiaChiDao diadiem = new DiaChiDao();
    ThanhToanDao thanhToan = new ThanhToanDao();
    VanChuyenDao vanchuyen = new VanChuyenDao();
    TrangThaiDao trangThai = new TrangThaiDao();
    DefaultTableModel model = new DefaultTableModel();
    DefaultComboBoxModel cbo = new DefaultComboBoxModel();
    public PhieuGiaoHangJPanel() {
        initComponents();
        fillTablePhieuGiaoHang();
        fillTableĐiaiem();
        fillTableThanhToan();
        fillTableVanChuyen();
        fillTableTrangThai();
        fillComboboxTrangThai();
    }
 private void fillComboboxTrangThai() {
    DefaultComboBoxModel  model = (DefaultComboBoxModel)cbo_TrangThaiThanhToan.getModel();
     model.removeAllElements();
     ArrayList<TrangThaiModels> lst = trangThai.getAllTramgThai();
     for(TrangThaiModels tt : lst) {
         model.addElement(tt.getTrangThai());
         this.fillTableTrangThai();
     }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        DiaChiJDialog = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_MaDiaDiem = new javax.swing.JTextField();
        txt_Duong = new javax.swing.JTextField();
        txt_tenQH = new javax.swing.JTextField();
        txt_tenTP = new javax.swing.JTextField();
        btn_luuDiaCHi = new javax.swing.JButton();
        btn_luu1 = new javax.swing.JButton();
        btn_UpdateDiaChi = new javax.swing.JButton();
        btn_deleteDiaChi = new javax.swing.JButton();
        JdialogThanhToan = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_MathanhToan = new javax.swing.JTextField();
        txt_NgayThanhToan = new javax.swing.JTextField();
        txt_soTien = new javax.swing.JTextField();
        txt_PhuongThuc = new javax.swing.JTextField();
        btn_luuThanhToan = new javax.swing.JButton();
        btn_luu2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        rdo_chuaThanhToan1 = new javax.swing.JRadioButton();
        rdo_DaThanhToan1 = new javax.swing.JRadioButton();
        ThongTinVanChuyen = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_MaVanChuyen = new javax.swing.JTextField();
        txt_NguoiVanChuyen = new javax.swing.JTextField();
        txt_sdtNguoiGiao = new javax.swing.JTextField();
        btn_luuThanhToan1 = new javax.swing.JButton();
        btn_luu3 = new javax.swing.JButton();
        TrangThai = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txt_TrangThai = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_maTrangTHai1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_maPhieu = new javax.swing.JTextField();
        txt_ngayGiao = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_PhieuGiaoHang = new javax.swing.JTable();
        btn_themPhieuGiaoHang = new javax.swing.JButton();
        btn_updatePhieuGiaoHang = new javax.swing.JButton();
        btn_xoaPhieuGiaoHang = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txt_timKiem = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_diaChi = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_updateDiaChi = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_thanhToan = new javax.swing.JTable();
        btn_them1 = new javax.swing.JButton();
        btn_updateThanhToan = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_vanchuyen = new javax.swing.JTable();
        btn_them2 = new javax.swing.JButton();
        btn_them3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_TrangThai = new javax.swing.JTable();
        btn_them4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_nguoiNhan = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_ghiChu = new javax.swing.JTextField();
        rdo_thanhtoan = new javax.swing.JRadioButton();
        rdo_chuathanhtoan = new javax.swing.JRadioButton();
        txt_email = new javax.swing.JTextField();
        cbo_TrangThaiThanhToan = new javax.swing.JComboBox<>();

        DiaChiJDialog.setTitle("Diachi");
        DiaChiJDialog.setMinimumSize(new java.awt.Dimension(400, 400));
        DiaChiJDialog.setModal(true);

        jLabel8.setText("Mã Địa Điểm:");

        jLabel9.setText("Đường:");

        jLabel10.setText("Tên Quận Huyện:");

        jLabel11.setText("Tên Thành Phố:");

        btn_luuDiaCHi.setText("Lưu");
        btn_luuDiaCHi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuDiaCHiActionPerformed(evt);
            }
        });

        btn_luu1.setText("Cancel");
        btn_luu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luu1ActionPerformed(evt);
            }
        });

        btn_UpdateDiaChi.setText("Update");
        btn_UpdateDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateDiaChiActionPerformed(evt);
            }
        });

        btn_deleteDiaChi.setText("Delete");
        btn_deleteDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteDiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_MaDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Duong, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenQH, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenTP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_luuDiaCHi)
                .addGap(18, 18, 18)
                .addComponent(btn_UpdateDiaChi)
                .addGap(18, 18, 18)
                .addComponent(btn_deleteDiaChi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btn_luu1)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_MaDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Duong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_tenQH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_tenTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luuDiaCHi)
                    .addComponent(btn_luu1)
                    .addComponent(btn_UpdateDiaChi)
                    .addComponent(btn_deleteDiaChi))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DiaChiJDialogLayout = new javax.swing.GroupLayout(DiaChiJDialog.getContentPane());
        DiaChiJDialog.getContentPane().setLayout(DiaChiJDialogLayout);
        DiaChiJDialogLayout.setHorizontalGroup(
            DiaChiJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DiaChiJDialogLayout.setVerticalGroup(
            DiaChiJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JdialogThanhToan.setTitle("JdialogThanhToan");
        JdialogThanhToan.setMinimumSize(new java.awt.Dimension(400, 400));
        JdialogThanhToan.setModal(true);

        jLabel12.setText("Mã Thanh Toan");

        jLabel13.setText("Ngày Thanh Toán");

        jLabel14.setText("Số Tiền");

        jLabel15.setText("Phương Thức");

        btn_luuThanhToan.setText("Lưu");
        btn_luuThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuThanhToanActionPerformed(evt);
            }
        });

        btn_luu2.setText("Cancel");
        btn_luu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luu2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Trạng Thái");

        rdo_chuaThanhToan1.setText("Chưa Thanh Toán");

        rdo_DaThanhToan1.setText("Đã Thanh Toán");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_MathanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_PhuongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btn_luuThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(rdo_DaThanhToan1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdo_chuaThanhToan1))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btn_luu2)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_MathanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_NgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txt_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_PhuongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(rdo_chuaThanhToan1)
                    .addComponent(rdo_DaThanhToan1))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luuThanhToan)
                    .addComponent(btn_luu2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JdialogThanhToanLayout = new javax.swing.GroupLayout(JdialogThanhToan.getContentPane());
        JdialogThanhToan.getContentPane().setLayout(JdialogThanhToanLayout);
        JdialogThanhToanLayout.setHorizontalGroup(
            JdialogThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JdialogThanhToanLayout.setVerticalGroup(
            JdialogThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ThongTinVanChuyen.setMinimumSize(new java.awt.Dimension(400, 400));
        ThongTinVanChuyen.setModal(true);

        jLabel17.setText("Mã Vận Chuyển");

        jLabel18.setText("Người Vận Chuyển");

        jLabel20.setText("SDT Người Giao:");

        btn_luuThanhToan1.setText("Lưu");
        btn_luuThanhToan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuThanhToan1ActionPerformed(evt);
            }
        });

        btn_luu3.setText("Cancel");
        btn_luu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btn_luuThanhToan1)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_luu3)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txt_MaVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NguoiVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdtNguoiGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_MaVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NguoiVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_sdtNguoiGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luuThanhToan1)
                    .addComponent(btn_luu3))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThongTinVanChuyenLayout = new javax.swing.GroupLayout(ThongTinVanChuyen.getContentPane());
        ThongTinVanChuyen.getContentPane().setLayout(ThongTinVanChuyenLayout);
        ThongTinVanChuyenLayout.setHorizontalGroup(
            ThongTinVanChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThongTinVanChuyenLayout.setVerticalGroup(
            ThongTinVanChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TrangThai.setMinimumSize(new java.awt.Dimension(400, 400));
        TrangThai.setModal(true);

        jLabel19.setText("Mã Trạng Thái: ");

        jLabel21.setText("Trạng Thái:");

        jButton8.setText("Thêm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Clear");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21)
                        .addComponent(jLabel19)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_maTrangTHai1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton9)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_maTrangTHai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel21)))
                .addGap(55, 55, 55)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TrangThaiLayout = new javax.swing.GroupLayout(TrangThai.getContentPane());
        TrangThai.getContentPane().setLayout(TrangThaiLayout);
        TrangThaiLayout.setHorizontalGroup(
            TrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TrangThaiLayout.setVerticalGroup(
            TrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setText("Mã Phiếu");

        jLabel2.setText("Ngày Giao");

        jLabel3.setText("Người Nhận");

        jLabel4.setText("SDT");

        jLabel5.setText("Email");

        jLabel6.setText("Trạng Thái");

        jLabel22.setText("Trạng Thái Thanh Toán");

        jLabel7.setText("Ghi Chú");

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tbl_PhieuGiaoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu", "Ngày Giao", "SDT Người Giao", "Phương Thức Thanh Toán", "Email", "Trạng Thái Thanh Toán", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_PhieuGiaoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PhieuGiaoHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_PhieuGiaoHang);

        btn_themPhieuGiaoHang.setText("Thêm");
        btn_themPhieuGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themPhieuGiaoHangActionPerformed(evt);
            }
        });

        btn_updatePhieuGiaoHang.setText("Update");
        btn_updatePhieuGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updatePhieuGiaoHangActionPerformed(evt);
            }
        });

        btn_xoaPhieuGiaoHang.setText("Delete");
        btn_xoaPhieuGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaPhieuGiaoHangActionPerformed(evt);
            }
        });

        jButton7.setText("Clear");

        btn_timKiem.setText("Tìm Kiếm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_themPhieuGiaoHang)
                        .addGap(18, 18, 18)
                        .addComponent(btn_updatePhieuGiaoHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_xoaPhieuGiaoHang)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_timKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themPhieuGiaoHang)
                    .addComponent(btn_updatePhieuGiaoHang)
                    .addComponent(btn_xoaPhieuGiaoHang)
                    .addComponent(jButton7))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Phiếu Giao Hàng", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        tbl_diaChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Địa Điểm", "Đường", "Tên QH", "Tên Thành Phố"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_diaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_diaChiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_diaChi);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_updateDiaChi.setText("Update");
        btn_updateDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateDiaChiActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_them)
                .addGap(41, 41, 41)
                .addComponent(btn_updateDiaChi)
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addGap(546, 796, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_updateDiaChi)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Địa chỉ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        tbl_thanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Thanh Toán", "Ngày Thanh Toán", "Số Tiền", "Phương Thức Thanh Toán", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_thanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_thanhToanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_thanhToan);

        btn_them1.setText("Thêm");
        btn_them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them1ActionPerformed(evt);
            }
        });

        btn_updateThanhToan.setText("Update");
        btn_updateThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateThanhToanActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them1)
                .addGap(30, 30, 30)
                .addComponent(btn_updateThanhToan)
                .addGap(27, 27, 27)
                .addComponent(jButton5)
                .addGap(35, 35, 35)
                .addComponent(jButton6)
                .addContainerGap(812, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them1)
                    .addComponent(btn_updateThanhToan)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Thanh Toán", jPanel3);

        tbl_vanchuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Vận Chuyển", "Người Vận Chuyển", "SDT Người Giao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbl_vanchuyen);

        btn_them2.setText("Thêm");
        btn_them2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them2ActionPerformed(evt);
            }
        });

        btn_them3.setText("Xoá");
        btn_them3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them2)
                .addGap(29, 29, 29)
                .addComponent(btn_them3)
                .addContainerGap(1019, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them2)
                    .addComponent(btn_them3))
                .addGap(19, 19, 19))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Thông tin vận chuyển", jPanel4);

        tbl_TrangThai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Trạng Thái", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbl_TrangThai);

        btn_them4.setText("Thêm");
        btn_them4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them4ActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1186, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(413, 413, 413)
                    .addComponent(btn_them4)
                    .addContainerGap(713, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(btn_them4)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Trạng Thái", jPanel5);

        rdo_thanhtoan.setSelected(true);
        rdo_thanhtoan.setText("Đã Thanh Toán");

        rdo_chuathanhtoan.setText("Chưa Thanh Toán");

        cbo_TrangThaiThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_maPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_TrangThaiThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_ngayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdo_thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdo_chuathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_maPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_TrangThaiThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ngayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdo_thanhtoan)
                    .addComponent(rdo_chuathanhtoan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_PhieuGiaoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PhieuGiaoHangMouseClicked
        this.showDetai();// TODO add your handling code here:
    }//GEN-LAST:event_tbl_PhieuGiaoHangMouseClicked

    private void btn_themPhieuGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themPhieuGiaoHangActionPerformed
        try {

            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            PhieuGiaoHangModels nv = getForm();
            if (list.add(nv) != null) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                this.fillTablePhieuGiaoHang();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themPhieuGiaoHangActionPerformed

    private void btn_updatePhieuGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updatePhieuGiaoHangActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            int index = tbl_PhieuGiaoHang.getSelectedRow();

            PhieuGiaoHangModels kh = getForm();
            if (list.update(kh) != null && index >= 0) {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công!");
                fillTablePhieuGiaoHang();
                if (tbl_PhieuGiaoHang.getRowCount() >= 0) {
                    tbl_PhieuGiaoHang.setRowSelectionInterval(1, 1);
                    showDetai();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thất bại");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi nút update");
        } // TODO add your handling code here:
    }//GEN-LAST:event_btn_updatePhieuGiaoHangActionPerformed

    private void btn_xoaPhieuGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaPhieuGiaoHangActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
                int index = tbl_PhieuGiaoHang.getRowCount();
                String maPhieu = txt_maPhieu.getText();
                if (index >= 0 && list.delete(index, maPhieu)!= null) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillTablePhieuGiaoHang();
                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        showDetai();
                        //                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btn_xoaPhieuGiaoHangActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        try {
            model = (DefaultTableModel) tbl_PhieuGiaoHang.getModel();
            model.setRowCount(0);
            String maNh = txt_timKiem.getText();
            for (PhieuGiaoHangModels p : list.getMa(maNh)) {
                model.addRow(new Object[]{p.getMaPhieu(),p.getNgayGiao(),p.getNguoiNhan(),p.getSdt(),p.getGmail(),p.getGhiChu()});
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void tbl_diaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_diaChiMouseClicked
        int index = tbl_diaChi.getSelectedRow();
        txt_Duong.setText(tbl_diaChi.getValueAt(index, 1).toString());
        txt_MaDiaDiem.setText(tbl_diaChi.getValueAt(index, 0).toString());
        txt_tenQH.setText(tbl_diaChi.getValueAt(index, 2).toString());
        txt_tenTP.setText(tbl_diaChi.getValueAt(index, 3).toString());// TODO add your handling code here:
    }//GEN-LAST:event_tbl_diaChiMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        DiaChiJDialog.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_updateDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateDiaChiActionPerformed
        DiaChiJDialog.setVisible(true);
    }//GEN-LAST:event_btn_updateDiaChiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
                int index = tbl_diaChi.getRowCount();
                String maPhieu = txt_MaDiaDiem.getText();
                if (index >= 0 && diadiem.delete(index, maPhieu) != null) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillTableĐiaiem();
                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        showDetai();
                        //                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
void show(int Vitri) {
        ThanhToanModels vx = thanhToan.getAllThanhToan().get(Vitri);
        if(vx.getTrangThai().equals("Da Thanh Toan")) 
         rdo_DaThanhToan1.setSelected(true);  
     else
         rdo_chuaThanhToan1.setSelected(true);        
    }
    private void tbl_thanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_thanhToanMouseClicked
        int index = tbl_thanhToan.getSelectedRow();
        txt_NgayThanhToan.setText(tbl_thanhToan.getValueAt(index, 1).toString());
        txt_soTien.setText(tbl_thanhToan.getValueAt(index, 2).toString());
        txt_PhuongThuc.setText(tbl_thanhToan.getValueAt(index, 3).toString());
        txt_MathanhToan.setText(tbl_thanhToan.getValueAt(index, 0).toString());
        //        ThanhToanModels tt = new ThanhToanModels();
        this.show(index);

    }//GEN-LAST:event_tbl_thanhToanMouseClicked

    private void btn_them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them1ActionPerformed
        JdialogThanhToan.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_them1ActionPerformed

    private void btn_updateThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateThanhToanActionPerformed
        JdialogThanhToan.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_updateThanhToanActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
                int index = tbl_thanhToan.getRowCount();
                String maPhieu = txt_MathanhToan.getText();
                if (index >= 0 && thanhToan.delete(index, maPhieu) != null) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillTableThanhToan();
                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        showDetai();
                        //                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_them2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them2ActionPerformed
        ThongTinVanChuyen.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_them2ActionPerformed

    private void btn_them3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them3ActionPerformed
        /////        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
                int index = tbl_vanchuyen.getRowCount();
                String maPhieu = txt_MaVanChuyen.getText();
                if (index >= 0 && vanchuyen.delete(index, maPhieu) != null) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillTableVanChuyen();
                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        showDetai();
                        //                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_them3ActionPerformed

    private void btn_them4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_them4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TrangThai.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
                int index = tbl_TrangThai.getRowCount();
                String maPhieu = txt_maTrangTHai1.getText();
                if (index >= 0 && trangThai.delete(index, maPhieu) != null) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillTableTrangThai();
                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        showDetai();
                        //                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_luuDiaCHiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuDiaCHiActionPerformed
        DiaChiModel dd = new DiaChiModel();
        dd.setTenTP(txt_tenTP.getText());
        dd.setTenQh(txt_tenQH.getText());
        dd.setDuong(txt_Duong.getText());
        diadiem.add(dd);
        this.fillTableĐiaiem();
        JOptionPane.showMessageDialog(this, "Thêm Thành Công");
    }//GEN-LAST:event_btn_luuDiaCHiActionPerformed

    private void btn_luu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luu1ActionPerformed
        DiaChiJDialog.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btn_luu1ActionPerformed

    private void btn_UpdateDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateDiaChiActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }

            int index = tbl_diaChi.getSelectedRow();
            DiaChiModel dd = new DiaChiModel();
            dd.setTenTP(txt_tenTP.getText());
            dd.setTenQh(txt_tenQH.getText());
            dd.setDuong(txt_Duong.getText());
            if (diadiem.update(dd) != null && index >= 0) {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công!");
                fillTableĐiaiem();
                if (tbl_diaChi.getRowCount() >= 0) {
                    tbl_diaChi.setRowSelectionInterval(1, 1);
                    //                        showDetai();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thất bại");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btn_UpdateDiaChiActionPerformed

    private void btn_deleteDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteDiaChiActionPerformed
        //          DiaChiJDialog.setVisible(true);
    }//GEN-LAST:event_btn_deleteDiaChiActionPerformed

    private void btn_luuThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThanhToanActionPerformed
        try {
            ThanhToanModels dd = new ThanhToanModels();
            String ngayGiaoText = txt_NgayThanhToan.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date ngayGiao = dateFormat.parse(ngayGiaoText);
            dd.setNgayThanhToan(ngayGiao);
            dd.setSoTien(Float.parseFloat(txt_soTien.getText()));
            dd.setPhuongThuc(txt_PhuongThuc.getText());
            if (rdo_DaThanhToan1.isSelected()) {
                dd.setTrangThai(rdo_DaThanhToan1.getText());
            }else{
                dd.setTrangThai(rdo_chuaThanhToan1.getText());
            }
            thanhToan.add(dd);
            this.fillTableThanhToan();
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");// TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(PhieuGiaoHangJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_luuThanhToanActionPerformed

    private void btn_luu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luu2ActionPerformed
        JdialogThanhToan.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btn_luu2ActionPerformed

    private void btn_luuThanhToan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThanhToan1ActionPerformed
        ///////        // TODO add your handling code here:
        VanChuyenModels dd = new VanChuyenModels();
        dd.setNguoiVanCHuyen(txt_NguoiVanChuyen.getText());
        dd.setSDTNguoiGiao(txt_sdtNguoiGiao.getText());
        vanchuyen.add(dd);
        this.fillTableVanChuyen();
        JOptionPane.showMessageDialog(this, "Thêm Thành Công");
    }//GEN-LAST:event_btn_luuThanhToan1ActionPerformed

    private void btn_luu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_luu3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TrangThaiModels dd = new TrangThaiModels();
        dd.setTrangThai(txt_TrangThai.getText());
        trangThai.add(dd);
        this.fillTableTrangThai();
        JOptionPane.showMessageDialog(this, "Thêm Thành Công");
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DiaChiJDialog;
    private javax.swing.JDialog JdialogThanhToan;
    private javax.swing.JDialog ThongTinVanChuyen;
    private javax.swing.JDialog TrangThai;
    private javax.swing.JButton btn_UpdateDiaChi;
    private javax.swing.JButton btn_deleteDiaChi;
    private javax.swing.JButton btn_luu1;
    private javax.swing.JButton btn_luu2;
    private javax.swing.JButton btn_luu3;
    private javax.swing.JButton btn_luuDiaCHi;
    private javax.swing.JButton btn_luuThanhToan;
    private javax.swing.JButton btn_luuThanhToan1;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_them1;
    private javax.swing.JButton btn_them2;
    private javax.swing.JButton btn_them3;
    private javax.swing.JButton btn_them4;
    private javax.swing.JButton btn_themPhieuGiaoHang;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_updateDiaChi;
    private javax.swing.JButton btn_updatePhieuGiaoHang;
    private javax.swing.JButton btn_updateThanhToan;
    private javax.swing.JButton btn_xoaPhieuGiaoHang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_TrangThaiThanhToan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdo_DaThanhToan1;
    private javax.swing.JRadioButton rdo_chuaThanhToan1;
    private javax.swing.JRadioButton rdo_chuathanhtoan;
    private javax.swing.JRadioButton rdo_thanhtoan;
    private javax.swing.JTable tbl_PhieuGiaoHang;
    private javax.swing.JTable tbl_TrangThai;
    private javax.swing.JTable tbl_diaChi;
    private javax.swing.JTable tbl_thanhToan;
    private javax.swing.JTable tbl_vanchuyen;
    private javax.swing.JTextField txt_Duong;
    private javax.swing.JTextField txt_MaDiaDiem;
    private javax.swing.JTextField txt_MaVanChuyen;
    private javax.swing.JTextField txt_MathanhToan;
    private javax.swing.JTextField txt_NgayThanhToan;
    private javax.swing.JTextField txt_NguoiVanChuyen;
    private javax.swing.JTextField txt_PhuongThuc;
    private javax.swing.JTextField txt_TrangThai;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_ghiChu;
    private javax.swing.JTextField txt_maPhieu;
    private javax.swing.JTextField txt_maTrangTHai1;
    private javax.swing.JTextField txt_ngayGiao;
    private javax.swing.JTextField txt_nguoiNhan;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_sdtNguoiGiao;
    private javax.swing.JTextField txt_soTien;
    private javax.swing.JTextField txt_tenQH;
    private javax.swing.JTextField txt_tenTP;
    private javax.swing.JTextField txt_timKiem;
    // End of variables declaration//GEN-END:variables
  private void fillTablePhieuGiaoHang() {
        model = (DefaultTableModel) tbl_PhieuGiaoHang.getModel();
        model.setRowCount(0);
        try {
//           ThanhToanModels tt = (ThanhToanModels)cbo_TrangThaiThanhToan.getSelectedItem();
//          ArrayList<PhieuGiaoHangModels> pgh = list.selectByThanhToan(tt.getMaThanhToan());
          ArrayList<PhieuGiaoHangModels> pgh = list.getAll();
        for (PhieuGiaoHangModels n : pgh) {
            model.addRow(new Object[]{
                n.getMaPhieu(), n.getNgayGiao(), n.getNguoiNhan(), n.getSdt(), n.getGmail(), n.getTrangThaiThanhToan(), n.getGhiChu()
            });
        } 
        } catch (Exception e) {
        }
        
    }
    
  
    private PhieuGiaoHangModels getForm() throws ParseException {
        PhieuGiaoHangModels pgh = new PhieuGiaoHangModels();
        pgh.setMaPhieu(txt_maPhieu.getText());
        String ngayGiaoText = txt_ngayGiao.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayGiao = dateFormat.parse(ngayGiaoText);
        pgh.setNgayGiao(ngayGiao);
        pgh.setNguoiNhan(txt_nguoiNhan.getText());
        pgh.setSdt(txt_sdt.getText());
        pgh.setGhiChu(txt_ghiChu.getText());
        pgh.setGmail(txt_email.getText());
        if (rdo_thanhtoan.isSelected()) {
                pgh.setTrangThaiThanhToan(rdo_thanhtoan.getText());
            }else{
                pgh.setTrangThaiThanhToan(rdo_chuathanhtoan.getText());
            }
       return pgh; 
    }
    
     private void showDetai() {
        int index = tbl_PhieuGiaoHang.getSelectedRow();
        txt_maPhieu.setText(tbl_PhieuGiaoHang.getValueAt(index, 0).toString());
        txt_ngayGiao.setText(tbl_PhieuGiaoHang.getValueAt(index, 1).toString());
        txt_nguoiNhan.setText(tbl_PhieuGiaoHang.getValueAt(index, 2).toString());
        txt_sdt.setText(tbl_PhieuGiaoHang.getValueAt(index, 3).toString());
        txt_email.setText(tbl_PhieuGiaoHang.getValueAt(index,4).toString());
        txt_ghiChu.setText(tbl_PhieuGiaoHang.getValueAt(index, 6).toString());
                this.show1(index);
        
     }
     
      void show1(int Vitri) {
       PhieuGiaoHangModels vx = list.getAll().get(Vitri);
          if(vx.getTrangThaiThanhToan().equals("DaThanhToan")) 
         rdo_thanhtoan.setSelected(true);  
     else
         rdo_chuathanhtoan.setSelected(true);  
    }
      
      
    private void fillTableĐiaiem() {
        model = (DefaultTableModel) tbl_diaChi.getModel();
        model.setRowCount(0);
        ArrayList<DiaChiModel> pgh = diadiem.getAllDiaDiem();
        for (DiaChiModel gh : pgh) {
            model.addRow(new Object[]{
                gh.getMaDiaDiem(), gh.getDuong(), gh.getTenQh(), gh.getTenTP()
            });
        }
    }

    private void fillTableThanhToan() {
        model = (DefaultTableModel) tbl_thanhToan.getModel();
        model.setRowCount(0);
        ArrayList<ThanhToanModels> pgh = thanhToan.getAllThanhToan();
        for (ThanhToanModels gh : pgh) {
            model.addRow(new Object[]{
                gh.getMaThanhToan(), gh.getNgayThanhToan(), gh.getSoTien(), gh.getPhuongThuc(), gh.getTrangThai()
            });
        }
    }

    private void fillTableVanChuyen() {
        model = (DefaultTableModel) tbl_vanchuyen.getModel();
        model.setRowCount(0);
        ArrayList<VanChuyenModels> pgh = vanchuyen.getAllVanCHuyen();
        for (VanChuyenModels gh : pgh) {
            model.addRow(new Object[]{
                gh.getMaVanChuyen(), gh.getNguoiVanCHuyen(), gh.getSDTNguoiGiao()
            });
        }
    }

    private void fillTableTrangThai() {
        model = (DefaultTableModel) tbl_TrangThai.getModel();
        model.setRowCount(0);
        ArrayList<TrangThaiModels> pgh = trangThai.getAllTramgThai();
        for (TrangThaiModels gh : pgh) {
            model.addRow(new Object[]{
                gh.getMaTrangThai(), gh.getTrangThai()
            });
        }
    }
}
