/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.NguoiHocDAO;
import HELPER.DateHelper;
import HELPER.DialogHelper;
import HELPER.ShareHelper;
import MODEL.NguoiHoc;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanbinh
 */
public class NguoiHocJFrame extends javax.swing.JFrame {
    int index = 0;
    NguoiHocDAO dao = new NguoiHocDAO();

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblgridview.getModel();
        model.setRowCount(0);
        try {
            String keyword = txttimkiem.getText();
            List<NguoiHoc> list = dao.selectByKeyword(keyword);
            for (NguoiHoc nh : list) {
                Object[] row = {
                    nh.getMaNH(),
                    nh.getHoTen(),
                    nh.isGioiTinh() ? "Nam" : "Nữ",
                    DateHelper.toString(nh.getNgaySinh()),
                    nh.getDienThoai(),
                    nh.getEmail(),
                    nh.getMaNV(),
                    DateHelper.toString(nh.getNgayDK())
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lối truy vấn dữ liệu!");
        }
    }

    void insert() {
        NguoiHoc model = getModel();
        try {
            dao.insert(model);
            this.load();
            this.clear();
            DialogHelper.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        NguoiHoc model = getModel();
        try {
            dao.update(model);
            this.load();
            this.clear();
            DialogHelper.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            DialogHelper.alert(this, "Cập nhật thất bại!");
            System.out.println(e.toString());
        }
    }

    void delete() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
            String manh = txtmanguoihoc.getText();
            try {
                dao.delete(manh);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    void clear() {
        NguoiHoc model = new NguoiHoc();
        model.setMaNV(ShareHelper.USER.getMaNV());
        model.setNgayDK(DateHelper.now());
        this.setModel(model);
        setStatus(true);
    }

    void edit() {
        try {
            String manh = (String) tblgridview.getValueAt(this.index, 0);
            NguoiHoc model = dao.findById(manh);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void setModel(NguoiHoc model) {
        txtmanguoihoc.setText(model.getMaNH());
        txthoten.setText(model.getHoTen());
        cbogioitinh.setSelectedIndex(model.isGioiTinh() ? 0 : 1);
        txtngaysinh2.setText(DateHelper.toString(model.getNgaySinh()));
        txtdienthoai.setText(model.getDienThoai());
        txtemail.setText(model.getEmail());
        txtghichu.setText(model.getGhiChu());
    }

    NguoiHoc getModel() {
        NguoiHoc model = new NguoiHoc();
        model.setMaNH(txtmanguoihoc.getText());
        model.setHoTen(txthoten.getText());
        model.setGioiTinh(cbogioitinh.getSelectedIndex() == 0);
        model.setNgaySinh(DateHelper.toDate(txtngaysinh2.getText()));
        model.setDienThoai(txtdienthoai.getText());
        model.setEmail(txtemail.getText());
        model.setGhiChu(txtghichu.getText());
        model.setMaNV(ShareHelper.USER.getMaNV());
        model.setNgayDK(DateHelper.now());
        return model;
    }

    void setStatus(boolean inserttable) {
        txtmanguoihoc.setEditable(inserttable);
        btninsert.setEnabled(inserttable);
        btnupdate.setEnabled(!inserttable);
        btndelete.setEnabled(!inserttable);

        boolean fist = this.index > 0;
        boolean last = this.index < tblgridview.getRowCount() - 1;
        btnfirst.setEnabled(!inserttable && fist);
        btnprev.setEnabled(!inserttable && fist);
        btnlast.setEnabled(!inserttable && last);
        btnnext.setEnabled(!inserttable && last);
    }
    public boolean check(){
            
       
                if (txtmanguoihoc.getText().isEmpty()) {

                    DialogHelper.alert(this, "mã người học rỗng!");
                  return false;
              }
                if (txthoten.getText().isEmpty()) {
                  DialogHelper.alert(this, "họ tên rỗng!");
                  return false;
              }
                if (txtdienthoai.getText().isEmpty()) {
                  DialogHelper.alert(this, "số điện thoái rỗng!");
                  return false;
              }
                if (txtemail.getText().isEmpty()) {
                  DialogHelper.alert(this, "email rỗng!");
                  return false;
              }
                if (txtngaysinh2.getText().isEmpty()) {
                  DialogHelper.alert(this, "ngày sinh rỗng!");
                  return false;
              }
                if (txtghichu.getText().isEmpty()) {
                  DialogHelper.alert(this, "ghi chú rỗng!");
                  return false;
              }
       
        
        
        return true;
    }
       private boolean checkmanh(JTextField txtmanguoihoc){
            if (txtmanguoihoc.getText().length() == 7) {
                if (dao.checkID(txtmanguoihoc.getText())) {
                  return true;
              }else{
                DialogHelper.alert(this, "mã người học trùng!");
            }
            
        }else{
            DialogHelper.alert(this, "mã người học phải nhập đúng 7 kí tự!");
        }
             
           
           return false;
       }
      
       private boolean checkhoten(JTextField txthhoten){
           if (!txthoten.getText().matches("^[\\p{L}\\s]+$")) {
               DialogHelper.alert(this, "họ tên chỉ chứa alphabet và ký tự trắng!");
               return false;
        }
            return true;
       }
      
       private boolean checkNgaySinh(JTextField txtNgaySinh) {
        Date ngaysinh = null;
        try {
            ngaysinh = DateHelper.toDate(txtNgaySinh.getText());
        } catch (RuntimeException ex) {
            DialogHelper.alert(this, "Nhập sai định dạng ngày!");
            return false;
        }
        long time = getMilisecond(ngaysinh);
        if (time < 0) {
            DialogHelper.alert(this, "Ngày sinh phải trước hiện tại!");
            return false;
        }
        if (toYear(time) < 16) {
            DialogHelper.alert(this, "Người đăng ký học chưa đủ 16 tuổi!");
            return false;
        }
        return true;
       }

        private long getMilisecond(Date date){
            return (new Date().getTime() - date.getTime());
        }
        private double toYear(long milisecond) {
            double year= milisecond * (3.17 * Math.pow(10, (-11)));
            return year;
        }
        private boolean checkdienthoai(JTextField txtdienthoai){
            String phone = "0/d{9,10}";
            if (txtdienthoai.getText().matches(phone)) {
               DialogHelper.alert(this, "Số điện thoại không đúng định dạng!");
                return false;
            }
            if(txtdienthoai.getText().length() <10 || txtdienthoai.getText().length() > 11){
               DialogHelper.alert(this, "Số điện thoại sai!");
                return false;
            }
            if (!dao.checkSDT(txtdienthoai.getText())) {
                DialogHelper.alert(this, "Số điện thoại bị trùng!");  
                return false;
            }
            
            return true;
        }
        private boolean checkemail(JTextField txtemail){
             if (!txtemail.getText().matches("\\w+@\\w+(\\.\\w{2,5})")) {
                 DialogHelper.alert(this, "Email không đúng định dạng email!");
                 return false;
        }
             return true;
        }
         void init(){
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
    }


    /**
     * Creates new form NguoiHocJFrame
     */
    public NguoiHocJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnledit = new javax.swing.JPanel();
        lblmanguoihoc = new javax.swing.JLabel();
        lbldienthoai = new javax.swing.JLabel();
        lblgioitinh = new javax.swing.JLabel();
        lblhoten = new javax.swing.JLabel();
        lblghichu = new javax.swing.JLabel();
        txtmanguoihoc = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnclear = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        cbogioitinh = new javax.swing.JComboBox<>();
        lblngaysinh = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtdienthoai = new javax.swing.JTextField();
        txtngaysinh2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        pnllist = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblgridview = new javax.swing.JTable();
        pnltimkiem = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HỆ THỐNG QUÀN LÝ ĐÀO TẠO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbltitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(51, 0, 255));
        lbltitle.setText("QUẢN LÝ NGƯỜI HỌC");

        lblmanguoihoc.setText("Mã người học");

        lbldienthoai.setText("Điện thoại");

        lblgioitinh.setText("Giới tính");

        lblhoten.setText("Họ tên");

        lblghichu.setText("Ghi chú");

        btnclear.setText("Mới");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btndelete.setText("Xóa");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setText("Sửa");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btninsert.setText("Thêm");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText("<<");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnfirst)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btninsert)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnupdate)
                        .addGap(63, 63, 63)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnprev)
                        .addGap(82, 82, 82)
                        .addComponent(btnnext)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnlast))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnclear)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(btndelete)
                    .addComponent(btnupdate)
                    .addComponent(btninsert))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlast)
                    .addComponent(btnnext)
                    .addComponent(btnprev)
                    .addComponent(btnfirst))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        cbogioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        lblngaysinh.setText("Ngày sinh");

        lblemail.setText("Địa chỉ Email");

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        jScrollPane2.setViewportView(txtghichu);

        javax.swing.GroupLayout pnleditLayout = new javax.swing.GroupLayout(pnledit);
        pnledit.setLayout(pnleditLayout);
        pnleditLayout.setHorizontalGroup(
            pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnleditLayout.createSequentialGroup()
                .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnleditLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblghichu)
                            .addComponent(lblmanguoihoc)
                            .addComponent(lblhoten)
                            .addComponent(txtmanguoihoc)
                            .addComponent(txthoten)
                            .addGroup(pnleditLayout.createSequentialGroup()
                                .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblgioitinh)
                                        .addComponent(cbogioitinh, 0, 245, Short.MAX_VALUE)
                                        .addComponent(txtdienthoai))
                                    .addComponent(lbldienthoai))
                                .addGap(106, 106, 106)
                                .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblemail)
                                    .addComponent(lblngaysinh)
                                    .addComponent(txtngaysinh2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(txtemail)))
                            .addComponent(jScrollPane2))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pnleditLayout.setVerticalGroup(
            pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnleditLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblmanguoihoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmanguoihoc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblhoten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgioitinh)
                    .addComponent(lblngaysinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbogioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaysinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldienthoai)
                    .addComponent(lblemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnleditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblghichu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("CẬP NHẬT", pnledit);

        tblgridview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Người học", "Họ tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email", "Mã nhân viên", "Ngày đăng kí"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblgridview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblgridviewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblgridview);

        pnltimkiem.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btntimkiem.setText("Tìm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnltimkiemLayout = new javax.swing.GroupLayout(pnltimkiem);
        pnltimkiem.setLayout(pnltimkiemLayout);
        pnltimkiemLayout.setHorizontalGroup(
            pnltimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btntimkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnltimkiemLayout.setVerticalGroup(
            pnltimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnltimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btntimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setText("Tìm kiếm");

        javax.swing.GroupLayout pnllistLayout = new javax.swing.GroupLayout(pnllist);
        pnllist.setLayout(pnllistLayout);
        pnllistLayout.setHorizontalGroup(
            pnllistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnltimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnllistLayout.createSequentialGroup()
                .addGroup(pnllistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnllistLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(pnllistLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnllistLayout.setVerticalGroup(
            pnllistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnllistLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnltimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", pnllist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        //        if (checkupdate(btninsert)) {
            if (check()) {
                if (checkhoten(txthoten)) {
                    if (checkNgaySinh(txtngaysinh2)) {
                        if (checkdienthoai(txtdienthoai)) {
                            if (checkemail(txtemail)) {
                                update();
                            }
                        }
                    }
                }
            }
            //        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:

        //        if (checkthongtin(btninsert)) {

            if (check()) {
                if (checkmanh(txtmanguoihoc)) {
                    if (checkhoten(txthoten)) {
                        if (checkNgaySinh(txtngaysinh2)) {
                            if (checkdienthoai(txtdienthoai)) {
                                if (checkemail(txtemail)) {
                                    insert();
                                }
                            }
                        }
                    }

                }
            }

            //        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        this.index = tblgridview.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnlastActionPerformed

    private void tblgridviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblgridviewMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblgridview.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tblgridviewMouseClicked

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        this.load();
        this.clear();
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NguoiHocJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbogioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbldienthoai;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblghichu;
    private javax.swing.JLabel lblgioitinh;
    private javax.swing.JLabel lblhoten;
    private javax.swing.JLabel lblmanguoihoc;
    private javax.swing.JLabel lblngaysinh;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel pnledit;
    private javax.swing.JPanel pnllist;
    private javax.swing.JPanel pnltimkiem;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblgridview;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextArea txtghichu;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmanguoihoc;
    private javax.swing.JTextField txtngaysinh2;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
