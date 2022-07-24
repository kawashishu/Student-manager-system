package com.swing.view;

import javax.swing.JOptionPane;
import javax.swing.event.*;

import com.hibernate.dao.*;
import com.swing.controller.QLTKBController;

import java.awt.event.*;
import java.sql.SQLException;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddTKB extends javax.swing.JPanel {

    public AddTKB() {
        initComponents();

        setEvent();
    }

    // set event cho cái nút để import data
    public void setEvent() {
        ImportDataButton.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (!isNotNull()) {
                        showDialogAgain("Vui lòng nhập tất cả các trường dữ liệu!");
                    }
                    else {
                        if (showDialog()) {
                            String path = PathTextField.getText();
                            String tenLop = MonHoc_LopHocDAO.importTKB(path);
                            QLTKBController controller = new QLTKBController(ContentAddTKB);
                            controller.XemTKBLop(tenLop);
                            showDialogAgain("!!! Import data thành công !!!");
                        }
                    }
                }
                catch (SQLException se) {
                    showDialogAgain(se.getMessage());
                    System.out.println(se);
                }
                catch (Exception ex) {
                    showDialogAgain("Đã có lỗi xảy ra, hãy kiểm tra input");
                    System.err.println(ex);
                }
            }
        });
    }

    public boolean isNotNull() {
        return PathTextField.getText() != null && !PathTextField.getText().equalsIgnoreCase("");
    }

    private boolean showDialog() {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "!!! Hành động này sẽ lưu thông tin xuống CDSL !!!", "Thông báo", JOptionPane.YES_NO_OPTION);
        return dialogResult == JOptionPane.YES_OPTION;
    }

    private void showDialogAgain(String str) {
        JOptionPane.showMessageDialog(null, str);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PathTextField = new javax.swing.JTextField();
        ChooseFileButton = new javax.swing.JButton();
        ImportDataButton = new javax.swing.JButton();
        ContentAddTKB = new javax.swing.JPanel();

        jLabel1.setText("Chọn đường dẫn file: ");

        ChooseFileButton.setText("Chọn file");
        ChooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseFileButtonActionPerformed(evt);
            }
        });

        ImportDataButton.setText("Import dữ liệu");

        javax.swing.GroupLayout ContentAddTKBLayout = new javax.swing.GroupLayout(ContentAddTKB);
        ContentAddTKB.setLayout(ContentAddTKBLayout);
        ContentAddTKBLayout.setHorizontalGroup(
            ContentAddTKBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentAddTKBLayout.setVerticalGroup(
            ContentAddTKBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImportDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChooseFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addComponent(ContentAddTKB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImportDataButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentAddTKB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseFileButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("file csv thoi nha các bé", "csv"));
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Chọn file");
        if (x == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            PathTextField.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_ChooseFileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChooseFileButton;
    private javax.swing.JPanel ContentAddTKB;
    private javax.swing.JButton ImportDataButton;
    private javax.swing.JTextField PathTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}