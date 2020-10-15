package JavaFrame;

import javax.swing.JFrame;


/**
 *
 * @author pc
 */
public class FrameBT1_C0 extends javax.swing.JFrame {

    public FrameBT1_C0() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        number1 = new javax.swing.JTextField();
        number2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cong = new javax.swing.JRadioButton();
        tru = new javax.swing.JRadioButton();
        nhan = new javax.swing.JRadioButton();
        chia = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        resultTextField = new javax.swing.JTextField();
        btnTinh = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        bntThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TÍNH TOÁN SỐ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
        );

        jLabel2.setText("Số thứ nhất: ");

        jLabel3.setText("Số thứ hai:");

        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Phép tính:");

        buttonGroup1.add(cong);
        cong.setText("Cộng");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });

        buttonGroup1.add(tru);
        tru.setText("Trừ");

        buttonGroup1.add(nhan);
        nhan.setText("Nhân");

        buttonGroup1.add(chia);
        chia.setText("Chia");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });

        jLabel5.setText("Kết quả:");

        btnTinh.setText("Tính");
        btnTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        bntThoat.setText("Thoát");
        bntThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nhan)
                                .addGap(74, 74, 74)
                                .addComponent(chia))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cong)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                    .addComponent(tru))
                                .addComponent(number1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(number2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(resultTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnTinh)
                        .addGap(31, 31, 31)
                        .addComponent(btnXoa)
                        .addGap(28, 28, 28)
                        .addComponent(bntThoat)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cong)
                    .addComponent(tru))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhan)
                    .addComponent(chia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTinh)
                    .addComponent(btnXoa)
                    .addComponent(bntThoat))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chiaActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number1ActionPerformed

    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_congActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        number1.setText("");
        number2.setText("");
        resultTextField.setText("");  
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhActionPerformed
        // TODO add your handling code here:
        float x = Integer.parseInt(number1.getText()); 
        float y = Integer.parseInt(number2.getText());
        float result = 0;
        if(cong.isSelected()){
            result = x + y;
        }
        if(tru.isSelected()){
            result = x - y;
        }
        if(nhan.isSelected()){
            result = x * y;
        }
        if(chia.isSelected()){
            result = x / y;
        }
        resultTextField.setText("" + result);
    }//GEN-LAST:event_btnTinhActionPerformed

    private void bntThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThoatActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Thoát chương trình
    }//GEN-LAST:event_bntThoatActionPerformed

    public static void main(String args[]) {
       
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBT1_C0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntThoat;
    private javax.swing.JButton btnTinh;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chia;
    private javax.swing.JRadioButton cong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton nhan;
    private javax.swing.JTextField number1;
    private javax.swing.JTextField number2;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JRadioButton tru;
    // End of variables declaration//GEN-END:variables
}
