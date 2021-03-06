/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFrame;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XuanNguyen
 */
public class FrameDSSV extends javax.swing.JFrame {

    ArrayList<Student> dssv = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form FrameDSSV
     */
    public FrameDSSV() {
        initComponents();
        tblDSSV.setComponentPopupMenu(tblDSSVPopupMenu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblDSSVPopupMenu = new javax.swing.JPopupMenu();
        deleteMenuItem = new javax.swing.JMenuItem();
        editMenuItem = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnFemale = new javax.swing.JRadioButton();
        comboBoxAddress = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSSV = new javax.swing.JTable();

        deleteMenuItem.setText("Xóa");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        tblDSSVPopupMenu.add(deleteMenuItem);

        editMenuItem.setText("Sửa");
        editMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuItemActionPerformed(evt);
            }
        });
        tblDSSVPopupMenu.add(editMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("Ngày sinh:");

        jLabel10.setText("Lớp:");

        jLabel11.setText("Địa chỉ: ");

        jLabel13.setText("MSSV: ");

        jLabel14.setText("Họ: ");

        jLabel16.setText("Tên: ");

        jLabel15.setText("SDT:");

        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Giới tính: ");

        buttonGroup1.add(radiobtnMale);
        radiobtnMale.setText("Nam");
        radiobtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtnFemale);
        radiobtnFemale.setText("Nữ");

        comboBoxAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TP.Hồ Chí Minh", "Bà Rịa Vũng Tàu", "Đà Nẵng", "Hà Nội", "Cần Thơ", "Hải Phòng" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMSSV)
                    .addComponent(txtFirstName)
                    .addComponent(txtName)
                    .addComponent(txtBirthday)
                    .addComponent(txtClass)
                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radiobtnMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radiobtnFemale))
                    .addComponent(comboBoxAddress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(comboBoxAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(radiobtnMale)
                    .addComponent(radiobtnFemale))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("DANH SÁCH SINH VIÊN");

        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblDSSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Họ", "Tên", "Ngày sinh", "Lớp", "Địa chỉ", "SDT", "Giới tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(325, 325, 325)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(btnThem)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSua)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnXoa)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(btnRefresh))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblDSSV.getModel();
        Student student = new Student();
        student.setMSSV(txtMSSV.getText());
        student.setFirstName(txtFirstName.getText());
        student.setName(txtName.getText());
        student.setBirthday(txtBirthday.getText());
        student.setSClass(txtClass.getText());

        int choose = comboBoxAddress.getSelectedIndex();
        if(choose == 0){
            student.setAddress("TP.Hồ Chí Minh");
        }
        if(choose == 1){
            student.setAddress("Bà Rịa Vũng Tàu");
        }
        if(choose == 2){
            student.setAddress("Đà Nẵng");
        }
        if(choose == 3){
            student.setAddress("Hà Nội");
        }
        if(choose == 4){
            student.setAddress("Cần Thơ");
        }
        if(choose == 5){
            student.setAddress("Hải Phòng");
        }
        
        student.setPhone(txtPhone.getText());
        if(radiobtnMale.isSelected()){
            student.setSex("Nam");
        }
        if(radiobtnFemale.isSelected()){
            student.setSex("Nữ");
        }
        
        dssv.add(student);
       
        model.addRow(new Object[]{student.getMSSV(), student.getFirstName(), student.getName(), 
            student.getBirthday(), student.getSClass(), student.getAddress(), student.getPhone(), student.getSex()});
        
       
    }//GEN-LAST:event_btnThemActionPerformed

    
    
    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSSVActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtMSSV.setText("");
        txtFirstName.setText("");
        txtName.setText("");
        txtBirthday.setText("");
        txtClass.setText("");
        //txtAddress.setText("");
        txtPhone.setText("");
        
        radiobtnMale.setSelected(false);
        radiobtnFemale.setSelected(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDSSV.getModel();
        
        try{
            int i = tblDSSV.getSelectedRow();
            model.removeRow(i);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        tblDSSV.setModel(model);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int i = tblDSSV.getSelectedRow();
        Student student = new Student();
        DefaultTableModel model = (DefaultTableModel) tblDSSV.getModel();
        
        model.setValueAt(txtMSSV.getText(), i, 0);
        model.setValueAt(txtFirstName.getText(), i, 1);
        model.setValueAt(txtName.getText(), i, 2);
        model.setValueAt(txtBirthday.getText(), i, 3);
        model.setValueAt(txtClass.getText(), i, 4);
        
        int choose = comboBoxAddress.getSelectedIndex();
        if(choose == 0){
            model.setValueAt("TP.Hồ Chí Minh", i, 5);
        }
        if(choose == 1){
            model.setValueAt("Bà Rịa Vũng Tàu", i, 5);
        }
        if(choose == 2){
            model.setValueAt("Đà Nẵng", i, 5);
        }
        if(choose == 3){
            model.setValueAt("Hà Nội", i, 5);
        }
        if(choose == 4){
            model.setValueAt("Cần Thơ", i, 5);
        }
        if(choose == 5){
            model.setValueAt("Hải Phòng", i, 5);
        }
        
        model.setValueAt(txtPhone.getText(), i, 6);
        
        if(radiobtnMale.isSelected()){
            model.setValueAt("Nam", i, 7);
        }
        if(radiobtnFemale.isSelected()){
            model.setValueAt("Nữ", i, 7);
        }
        
        tblDSSV.setModel(model);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblDSSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSVMouseClicked
        // TODO add your handling code here:
        int i = tblDSSV.getSelectedRow();
        if(i >= 0){
            Student student = new Student();
            student = dssv.get(i);
            txtMSSV.setText(student.getMSSV());
            txtFirstName.setText(student.getFirstName());
            txtName.setText(student.getName());
            txtBirthday.setText(student.getBirthday());
            txtClass.setText(student.getSClass());
            //comboBoxAddress.setText(student.getAddress());
            txtPhone.setText(student.getPhone());
        }
    }//GEN-LAST:event_tblDSSVMouseClicked

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDSSV.getModel();
        
        try{
            int i = tblDSSV.getSelectedRow();
            model.removeRow(i);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        tblDSSV.setModel(model);
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void editMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuItemActionPerformed
        // TODO add your handling code here:
        int i = tblDSSV.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDSSV.getModel();
        
        Student student = new Student();
        student.setMSSV(txtMSSV.getText());
        student.setFirstName(txtFirstName.getText());
        student.setName(txtName.getText());
        student.setBirthday(txtBirthday.getText());
        student.setSClass(txtClass.getText());
        //student.setAddress(txtAddress.getText());
        student.setPhone(txtPhone.getText());
        
        Student old = dssv.set(i, student);
        model.setValueAt(student.getMSSV(), i, 0);
        model.setValueAt(student.getFirstName(), i, 1);
        model.setValueAt(student.getName(), i, 2);
        model.setValueAt(student.getBirthday(), i, 3);
        model.setValueAt(student.getMSSV(), i, 4);
        model.setValueAt(student.getMSSV(), i, 5);
        model.setValueAt(student.getMSSV(), i, 6);
        
        tblDSSV.setModel(model);
    }//GEN-LAST:event_editMenuItemActionPerformed

    private void radiobtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnMaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radiobtnMaleActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDSSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDSSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDSSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDSSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDSSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxAddress;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem editMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JTable tblDSSV;
    private javax.swing.JPopupMenu tblDSSVPopupMenu;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
