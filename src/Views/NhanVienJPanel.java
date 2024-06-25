/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Models.NhanVien.CaLam_NhanVienModel;
import Models.NhanVien.Luong_NhanVienModel;
import Models.NhanVien.NhanVienModel;
import Services.NhanVien.CaLam_NhanVienDAO;
import Services.NhanVien.Luong_NhanVienDAO;
import Services.NhanVien.NhanVienDAO;
import Services.NhanVien.NhanVien_ChucVuDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LVQ
 */
public class NhanVienJPanel extends javax.swing.JPanel {
    /**
     * Creates new form JpanelNhanVien
     */
    public NhanVienJPanel() {
        initComponents();
        fillTableNhanVien();
        fillTableLuongNhanVien();
        fillTableCaLamNhanVien();
        init();
//        setLayout(new FlowLayout());
    }
    NhanVienDAO nvs = new NhanVienDAO();
    Luong_NhanVienDAO lnvs = new Luong_NhanVienDAO();
    CaLam_NhanVienDAO clnvs = new CaLam_NhanVienDAO();
    NhanVien_ChucVuDAO nvcvs=new NhanVien_ChucVuDAO();
    public void fillAllTable() {
        fillTableCaLamNhanVien();
        fillTableLuongNhanVien();
        fillTableNhanVien();
    }

    public void fillTableNhanVien() {
        DefaultTableModel tbl = (DefaultTableModel) tblNhanVien.getModel();
        tbl.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (NhanVienModel nhanVien : nvs.selectAll()) {
            Object[] row = {nhanVien.getMaNV(), nhanVien.getHoTen(), nhanVien.getGioiTinh(), new String(sdf.format(nhanVien.getNgaySinh())), nhanVien.getDiaChi(), nhanVien.getChucVu(), nhanVien.getSDT(),nhanVien.getTrangThai(),nhanVien.getTrangThai()};
            tbl.addRow(row);
        }
    }

    public void fillTableLuongNhanVien() {
        DefaultTableModel tbl = (DefaultTableModel) tblLuong.getModel();
        tbl.setRowCount(0);
        for (Luong_NhanVienModel nhanVien : lnvs.selectAll()) {
            Object[] row = {nhanVien.getMaNV(), nhanVien.getHoTen(), nhanVien.getLuongCoBan(), nhanVien.getLuongTangCa(), nhanVien.getThueKhauTru()};
            tbl.addRow(row);
        }
    }

    public void fillTableCaLamNhanVien() {
        DefaultTableModel tbl = (DefaultTableModel) tblCaLam.getModel();
        tbl.setRowCount(0);
        for (CaLam_NhanVienModel nhanVien : clnvs.selectAll()) {
            Object[] row = {nhanVien.getMaNV(), nhanVien.getHoTen(), nhanVien.getCacCaLam(), nhanVien.LayCaLamCuThe().get(0) == 0 ? "0" : nhanVien.LayCaLamCuThe().size()};
            tbl.addRow(row);
        }
    }

    public NhanVienModel getModel() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date ngsinh = sdf.parse(txtNgaySinh.getText());

            NhanVienModel nv = new NhanVienModel(txtMaNV.getText(), txtHoTen.getText(), rdoNam.isSelected() ? "Nam" : "Nữ", txtDiaChi.getText(), (String) cboChucVu.getSelectedItem(), txtSDT.getText(), ngsinh, (String) cboTrangThai.getSelectedItem());
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setModel(NhanVienModel nv) {
        txtMaNV.setText(nv.getMaNV());
        txtHoTen.setText(nv.getHoTen());
        txtSDT.setText(nv.getSDT());
        txtDiaChi.setText(nv.getDiaChi());
        if (nv.getGioiTinh().equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        };
        cboChucVu.setSelectedItem(nv.getChucVu());
        String ns = new SimpleDateFormat("dd/MM/yyyy").format(nv.getNgaySinh());
        txtNgaySinh.setText(ns);
        cboTrangThai.setSelectedItem(nv.getTrangThai());
    }
    public static boolean kiemTraSo(String chuoi) {
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public boolean validateTableNV() {
        boolean a = true;
        int row = tblNhanVien.getSelectedRow();
        String HoTen = (String) tblNhanVien.getValueAt(row, 1);
        String GioiTinh = (String) tblNhanVien.getValueAt(row, 2);
        String NgaySinh = (String) tblNhanVien.getValueAt(row, 3);
        String ChucVu = (String) tblNhanVien.getValueAt(row, 5);
        String SDT = (String) tblNhanVien.getValueAt(row, 6);
        if (kiemTraSo(HoTen)) {
            JOptionPane.showMessageDialog(this, "Tên mày có số à");
            a = false;
        } else if (!kiemTraSo(SDT)) {
            JOptionPane.showMessageDialog(this, "Mày nhập cái sdt tử tế hộ tao cái");
            a = false;
        } else if (SDT.length() < 10 || SDT.length() > 11) {
            JOptionPane.showMessageDialog(this, "Địt mẹ mày nhập cái số điện thoại 10 số hộ tao cái");
            a = false;
        } else {
            try {
                Date ns = new SimpleDateFormat("dd/MM/yyyy").parse(NgaySinh);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ngày sinh nhập đúng định dạng dd/MM/yyyy");
                a = false;
            }
        }
        return a;
    }
//    else if (!ChucVu.equalsIgnoreCase("Bán hàng")||!ChucVu.equalsIgnoreCase("Thu Ngân")||!ChucVu.equalsIgnoreCase("Giao hàng")||!ChucVu.equalsIgnoreCase("Vệ Sinh")||!ChucVu.equalsIgnoreCase("Giao Hàng")) {
//            JOptionPane.showMessageDialog(this,"Vui lòng nhập đúng chức vụ nhé");
//            a=false;
//        }else if(GioiTinh.equalsIgnoreCase("nam")||GioiTinh.equalsIgnoreCase("nữ")){
//            JOptionPane.showMessageDialog(this,"Địt mẹ mày là giới tính"+" "+GioiTinh+" "+"à?Nhập lại đi");
//            a=false;
//        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        searchTextNV = new javax.swing.JTextField();
        btnSuaNhanVientbl = new javax.swing.JButton();
        btnCaLamNV2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLuong = new javax.swing.JTable();
        searchTextLuong = new javax.swing.JTextField();
        btnSuaLuongNV = new javax.swing.JButton();
        btnCaLamNV4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCaLam = new javax.swing.JTable();
        searchTextCaLam = new javax.swing.JTextField();
        btnCaLamNV1 = new javax.swing.JButton();
        btnCaLamNV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        cboChucVu = new javax.swing.JComboBox<>();
        txtSDT = new javax.swing.JTextField();
        cboTrangThai = new javax.swing.JComboBox<>();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnCaLamNV3 = new javax.swing.JButton();
        btnThemNV = new javax.swing.JButton();
        btnSuaNhanVien = new javax.swing.JButton();

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        tblNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Giới Tính", "Ngày Sinh", "Địa Chỉ", "Chức Vụ", "SDT", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setToolTipText("");
        tblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblNhanVien.setGridColor(new java.awt.Color(0, 0, 0));
        tblNhanVien.setName(""); // NOI18N
        tblNhanVien.setShowGrid(true);
        tblNhanVien.getTableHeader().setResizingAllowed(false);
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblNhanVien);

        searchTextNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextNVKeyReleased(evt);
            }
        });

        btnSuaNhanVientbl.setText("Sửa");

        btnCaLamNV2.setText("Refresh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(searchTextNV)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCaLamNV2)
                .addGap(18, 18, 18)
                .addComponent(btnSuaNhanVientbl)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(searchTextNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaNhanVientbl)
                    .addComponent(btnCaLamNV2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sách", jPanel1);

        tblLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Lương Cơ Bản", "Lương Tăng Ca", "Thuế"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLuong.setToolTipText("");
        tblLuong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblLuong.setGridColor(new java.awt.Color(0, 0, 0));
        tblLuong.setName(""); // NOI18N
        tblLuong.setShowGrid(true);
        tblLuong.getTableHeader().setResizingAllowed(false);
        tblLuong.getTableHeader().setReorderingAllowed(false);
        tblLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLuongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLuong);
        if (tblLuong.getColumnModel().getColumnCount() > 0) {
            tblLuong.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        searchTextLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextLuongKeyReleased(evt);
            }
        });

        btnSuaLuongNV.setText("Sửa");
        btnSuaLuongNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaLuongNVActionPerformed(evt);
            }
        });

        btnCaLamNV4.setText("Refresh");
        btnCaLamNV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaLamNV4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(searchTextLuong)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCaLamNV4)
                .addGap(32, 32, 32)
                .addComponent(btnSuaLuongNV))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(searchTextLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaLuongNV)
                    .addComponent(btnCaLamNV4))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Lương Nhân Viên", jPanel3);

        tblCaLam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblCaLam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Các Ca Làm", "Số Ca Làm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCaLam.setToolTipText("");
        tblCaLam.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCaLam.setGridColor(new java.awt.Color(0, 0, 0));
        tblCaLam.setName(""); // NOI18N
        tblCaLam.setShowGrid(true);
        tblCaLam.getTableHeader().setResizingAllowed(false);
        tblCaLam.getTableHeader().setReorderingAllowed(false);
        tblCaLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCaLamMouseClicked(evt);
            }
        });
        tblCaLam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCaLamKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblCaLam);
        if (tblCaLam.getColumnModel().getColumnCount() > 0) {
            tblCaLam.getColumnModel().getColumn(0).setResizable(false);
            tblCaLam.getColumnModel().getColumn(1).setResizable(false);
            tblCaLam.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCaLam.getColumnModel().getColumn(3).setResizable(false);
        }

        searchTextCaLam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextCaLamKeyReleased(evt);
            }
        });

        btnCaLamNV1.setText("Refresh");
        btnCaLamNV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaLamNV1ActionPerformed(evt);
            }
        });

        btnCaLamNV.setText("Sửa");
        btnCaLamNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaLamNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(searchTextCaLam)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCaLamNV1)
                .addGap(23, 23, 23)
                .addComponent(btnCaLamNV)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(searchTextCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaLamNV1)
                    .addComponent(btnCaLamNV))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Ca Làm Nhân Viên", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Mã");

        jLabel2.setText("Họ Và Tên");

        jLabel3.setText("Ngày Sinh");

        jLabel4.setText("Địa Chỉ");

        jLabel5.setText("Chức vụ");

        jLabel6.setText("SDT");

        jLabel7.setText("Trạng thái");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        btnCaLamNV3.setText("Refresh");
        btnCaLamNV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaLamNV3ActionPerformed(evt);
            }
        });

        btnThemNV.setText("Thêm");
        btnThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNVActionPerformed(evt);
            }
        });

        btnSuaNhanVien.setText("Sửa");
        btnSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cboTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboChucVu, 0, 492, Short.MAX_VALUE)
                                .addComponent(txtSDT))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rdoNam)
                                    .addGap(49, 49, 49)
                                    .addComponent(rdoNu))
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSuaNhanVien)
                    .addComponent(btnThemNV)
                    .addComponent(btnCaLamNV3))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(btnCaLamNV3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemNV)
                .addGap(18, 18, 18)
                .addComponent(btnSuaNhanVien)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lí", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLuongMouseClicked
        int row = tblLuong.getSelectedRow();
//        tblCaLam.setRowSelectionInterval(row, row);
//        tblNhanVien.setRowSelectionInterval(row, row);
//        int sodongcl=tblCaLam.getRowCount();
//        int sodongnv=tblNhanVien.getRowCount();
          String mnv=(String) tblLuong.getValueAt(row,0);
          setModel(nvs.findNV(mnv));
    }//GEN-LAST:event_tblLuongMouseClicked

    private void tblCaLamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCaLamMouseClicked
        int row = tblCaLam.getSelectedRow();
        tblNhanVien.setRowSelectionInterval(row, row);
        tblLuong.setRowSelectionInterval(row, row);
//        String CacCaLam = (String) tblCaLam.getValueAt(row, 2);
//        System.out.println(CacCaLam);
          String mnv=(String) tblLuong.getValueAt(row,0);
          setModel(nvs.findNV(mnv));
    }//GEN-LAST:event_tblCaLamMouseClicked

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int row = tblNhanVien.getSelectedRow();
        txtHoTen.setText((String) tblNhanVien.getValueAt(row, 1));
        txtSDT.setText((String) tblNhanVien.getValueAt(row, 6));
        txtNgaySinh.setText((String) tblNhanVien.getValueAt(row, 3));
        txtDiaChi.setText((String) tblNhanVien.getValueAt(row, 4));
        if (tblNhanVien.getValueAt(row, 2).equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        };
        cboChucVu.setSelectedItem((String) tblNhanVien.getValueAt(row, 5));
        txtMaNV.setText((String) tblNhanVien.getValueAt(row, 0));
        cboTrangThai.setSelectedItem(tblNhanVien.getValueAt(row,7));
//        if (row<tblCaLam.getRowCount()) {
//            tblCaLam.setRowSelectionInterval(row, row);
//            return;
//        } if(row<tblLuong.getRowCount()){
//        tblLuong.setRowSelectionInterval(row, row);
//        return;
//        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNVActionPerformed
        if (validateform()) {
            if (nvs.selectByID(txtMaNV.getText())) {
                JOptionPane.showMessageDialog(this, "Mã Nhân Viên đã trùng rồi");
            } else {
                if (nvs.Insert(getModel())) {
                    fillAllTable();
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }

            }

        }

    }//GEN-LAST:event_btnThemNVActionPerformed

    private void btnSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNhanVienActionPerformed
        if (nvs.selectByID(txtMaNV.getText())) {
            if (nvs.Update(getModel())) {
                fillTableNhanVien();
                JOptionPane.showMessageDialog(this, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Mã Nhân Viên chưa tồn tại");
        }
    }//GEN-LAST:event_btnSuaNhanVienActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void btnSuaLuongNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaLuongNVActionPerformed
        int row = tblLuong.getSelectedRow();
        if (row >= 0) {
            String MaNV = (String) tblLuong.getValueAt(row, 0);
            String HoTen = (String) tblLuong.getValueAt(row, 1);
            float LuongCoBan = Float.parseFloat(tblLuong.getValueAt(row, 2).toString());
            float LuongTangCa = Float.parseFloat(tblLuong.getValueAt(row, 3).toString());
            float ThueKhauTru = Float.parseFloat(tblLuong.getValueAt(row, 4).toString());
            if (nvs.selectByID(MaNV)) {
                if (lnvs.Update(new Luong_NhanVienModel(MaNV, HoTen, LuongCoBan, LuongTangCa, ThueKhauTru))) {
                    fillAllTable();
                    JOptionPane.showMessageDialog(this, "OK");
                } else {
                    JOptionPane.showMessageDialog(this, "DeoOK");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mã Nhân Viên Chưa Có Nhá");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng");
        }
    }//GEN-LAST:event_btnSuaLuongNVActionPerformed

    private void btnCaLamNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaLamNVActionPerformed
        int row = tblCaLam.getSelectedRow();
        if (row >= 0) {
            String MaNV = ((String) tblCaLam.getValueAt(row, 0));
            String HoTen = (String) tblCaLam.getValueAt(row, 1);
            String CacCaLam = tblCaLam.getValueAt(row, 2).toString();
            if (CacCaLam.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nhập đi ba!k nhập đòi sửa cái gì");
            } else {
                if (clnvs.Update(new CaLam_NhanVienModel(MaNV, HoTen, CacCaLam))) {
                    fillAllTable();
                    JOptionPane.showMessageDialog(this, "Sửa OK rồi");
                } else {
                    JOptionPane.showMessageDialog(this, "Lỗi đ gì ấy");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng");
        }
    }//GEN-LAST:event_btnCaLamNVActionPerformed

    private void btnSuaNhanVientblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNhanVientblActionPerformed
      int row = tblNhanVien.getSelectedRow();  
        if (row >= 0) {
        if (validateTableNV()) {       
                String MaNV = ((String) tblNhanVien.getValueAt(row, 0));
                if (nvs.selectByID(MaNV)) {
                    try {
                        String ns = tblNhanVien.getValueAt(row, 3).toString();
                        Date nsn = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
                        String HoTen = ((String) tblNhanVien.getValueAt(row, 1));
                        String GioiTinh = ((String) tblNhanVien.getValueAt(row, 2));
                        String DiaChi = ((String) tblNhanVien.getValueAt(row, 4));
                        String ChucVu = ((String) tblNhanVien.getValueAt(row, 5));
                        String SDT = ((String) tblNhanVien.getValueAt(row, 6));
                        String TrangThai=((String) tblNhanVien.getValueAt(row, 7));
                        nvs.Update(new NhanVienModel(MaNV, HoTen, GioiTinh, DiaChi, ChucVu, SDT, nsn,TrangThai));
                        fillAllTable();
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Lỗi");
                    }                   
                } else {
                    JOptionPane.showMessageDialog(this, "Mã Nhân Viên chưa tồn tại");
                }
            } 
        }else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng");
            }
    }//GEN-LAST:event_btnSuaNhanVientblActionPerformed

    private void searchTextNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextNVKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
        DefaultTableModel dtnv=(DefaultTableModel) tblCaLam.getModel();
        DefaultTableModel dtl=(DefaultTableModel) tblLuong.getModel();
        TableRowSorter<DefaultTableModel> ab = new TableRowSorter<>(dtm);
        TableRowSorter<DefaultTableModel> abs = new TableRowSorter<>(dtnv);
        TableRowSorter<DefaultTableModel> abc = new TableRowSorter<>(dtl);
        tblNhanVien.setRowSorter(ab);
        tblCaLam.setRowSorter(abs);
        tblLuong.setRowSorter(abc);
        ab.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
        abs.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
        abc.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
    }//GEN-LAST:event_searchTextNVKeyReleased

    private void searchtextCaLamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextCaLamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextCaLamActionPerformed

    private void searchTextLuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextLuongKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
        DefaultTableModel dtnv=(DefaultTableModel) tblCaLam.getModel();
        DefaultTableModel dtl=(DefaultTableModel) tblLuong.getModel();
        TableRowSorter<DefaultTableModel> ab = new TableRowSorter<>(dtm);
        TableRowSorter<DefaultTableModel> abs = new TableRowSorter<>(dtnv);
        TableRowSorter<DefaultTableModel> abc = new TableRowSorter<>(dtl);
        tblNhanVien.setRowSorter(ab);
        tblCaLam.setRowSorter(abs);
        tblLuong.setRowSorter(abc);
        ab.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
        abs.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
        abc.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
    }//GEN-LAST:event_searchTextLuongKeyReleased

    private void tblCaLamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCaLamKeyReleased

    }//GEN-LAST:event_tblCaLamKeyReleased

    private void searchtextCaLamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextCaLamKeyReleased
       
    }//GEN-LAST:event_searchtextCaLamKeyReleased

    private void btnCaLamNV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaLamNV1ActionPerformed
        fillAllTable();
        txtMaNV.setText("");
        txtHoTen.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        cboChucVu.setSelectedItem("");
        txtNgaySinh.setText("");
    }//GEN-LAST:event_btnCaLamNV1ActionPerformed

    private void btnCaLamNV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaLamNV2ActionPerformed
        fillAllTable();
        txtMaNV.setText("");
        txtHoTen.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        cboChucVu.setSelectedItem("");
        txtNgaySinh.setText("");
    }//GEN-LAST:event_btnCaLamNV2ActionPerformed

    private void btnCaLamNV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaLamNV3ActionPerformed
        fillAllTable();
        txtMaNV.setText("");
        txtHoTen.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        cboChucVu.setSelectedItem("");
        txtNgaySinh.setText("");
    }//GEN-LAST:event_btnCaLamNV3ActionPerformed

    private void btnCaLamNV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaLamNV4ActionPerformed
        fillAllTable();
        txtMaNV.setText("");
        txtHoTen.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        cboChucVu.setSelectedItem("");
        txtNgaySinh.setText("");
    }//GEN-LAST:event_btnCaLamNV4ActionPerformed

    private void searchTextNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextNVActionPerformed

    private void searchTextCaLamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextCaLamKeyReleased
          DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
        DefaultTableModel dtnv=(DefaultTableModel) tblCaLam.getModel();
        DefaultTableModel dtl=(DefaultTableModel) tblLuong.getModel();
        TableRowSorter<DefaultTableModel> ab = new TableRowSorter<>(dtm);
        TableRowSorter<DefaultTableModel> abs = new TableRowSorter<>(dtnv);
        TableRowSorter<DefaultTableModel> abc = new TableRowSorter<>(dtl);
        tblNhanVien.setRowSorter(ab);
        tblCaLam.setRowSorter(abs);
        tblLuong.setRowSorter(abc);
        ab.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
        abs.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
        abc.setRowFilter(RowFilter.regexFilter(searchTextNV.getText(),0,1));
    }//GEN-LAST:event_searchTextCaLamKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaLamNV;
    private javax.swing.JButton btnCaLamNV1;
    private javax.swing.JButton btnCaLamNV2;
    private javax.swing.JButton btnCaLamNV3;
    private javax.swing.JButton btnCaLamNV4;
    private javax.swing.JButton btnSuaLuongNV;
    private javax.swing.JButton btnSuaNhanVien;
    private javax.swing.JButton btnSuaNhanVientbl;
    private javax.swing.JButton btnThemNV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextField searchTextCaLam;
    private javax.swing.JTextField searchTextLuong;
    private javax.swing.JTextField searchTextNV;
    private javax.swing.JTable tblCaLam;
    private javax.swing.JTable tblLuong;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

    private void init() {
//        txtMaNV.setLabelText("Mã Nhân Viên");
//        txtHoTen.setLabelText("Họ Và Tên");
//        txtDiaChi.setLabelText("Địa Chỉ");
//        txtSDT.setLabelText("SDT");
//        txtNgaySinh.setLabelText("Ngày Sinh");
//        cboChucVu.setLabeText("Chức Vụ");
//        cboTrangThai.setLabeText("Trạng Thái");
        Object[] cboTt={"Đang làm","Đã nghỉ"};
        for (String object : nvcvs.SelectChucVu()) {
            cboChucVu.addItem(object);
        }
        for (Object object : cboTt) {
            cboTrangThai.addItem((String) object);
        }

    }

    private boolean validateform() {
        return true;
    }
}
