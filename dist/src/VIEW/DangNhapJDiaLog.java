/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.NhanVienDAO;
import HELPER.DialogHelper;
import HELPER.ShareHelper;
import MODEL.NhanVien;

/**
 *
 * @author tanbinh
 */
public class DangNhapJDiaLog extends java.awt.Dialog {
      NhanVienDAO dao = new NhanVienDAO();
      
    void init(){
        setLocationRelativeTo(null);
        
        txtmanv.setText("nv01");
        txtmatkhau.setText("123");
    }
    void login(){
        
        String manv = txtmanv.getText();
       String matkhau = new String(txtmatkhau.getPassword());
        
        try {
            NhanVien nhanvien = dao.findByld(manv);
            if(nhanvien != null){
                String matkhau2 = nhanvien.getMatkhau();
            if (matkhau.equals(matkhau2)) {
                ShareHelper.USER = nhanvien;
                DialogHelper.alert(this, "Đăng nhập thành công !");
                this.dispose();
            }else{
                DialogHelper.alert(this, "Sai mật khẩu");
            }
            }else{
                DialogHelper.alert(this, "Sai tên đăng nhập");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
    void exit(){
        if (DialogHelper.confirm(this, "Bạn có muốn thoát khỏi ứng dụng không ?")) {
            System.exit(0);
        }
    }

    /**
     * Creates new form DangNhapJDiaLog
     */
    public DangNhapJDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblmatkhau = new javax.swing.JLabel();
        lbtitle = new javax.swing.JLabel();
        btndangnhap1 = new javax.swing.JButton();
        btnketthuc = new javax.swing.JButton();
        txtmatkhau = new javax.swing.JPasswordField();
        txtmanv = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();

        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tên đăng nhập");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblmatkhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblmatkhau.setText("Mật khẩu");

        lbtitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbtitle.setForeground(new java.awt.Color(0, 153, 0));
        lbtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtitle.setText("ĐĂNG NHẬP");
        lbtitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btndangnhap1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btndangnhap1.setText("Đăng nhập");
        btndangnhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap1ActionPerformed(evt);
            }
        });

        btnketthuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnketthuc.setText("Kết thúc");
        btnketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnketthucActionPerformed(evt);
            }
        });

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/security.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndangnhap1)
                        .addGap(52, 52, 52)
                        .addComponent(btnketthuc))
                    .addComponent(lblmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtmatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addComponent(txtmanv))
                    .addComponent(jLabel1))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(lbtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblmatkhau)
                        .addGap(18, 18, 18)
                        .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndangnhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
//        dispose();
    }//GEN-LAST:event_closeDialog

    private void btndangnhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap1ActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btndangnhap1ActionPerformed

    private void btnketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnketthucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnketthucActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDiaLog dialog = new DangNhapJDiaLog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangnhap1;
    private javax.swing.JButton btnketthuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblmatkhau;
    private javax.swing.JLabel lbtitle;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JPasswordField txtmatkhau;
    // End of variables declaration//GEN-END:variables
}
