package com.swing.view;

import java.util.*;

import com.swing.controller.ChuyenManHinh;

import com.swing.obj.*;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        this.setTitle("Quản lý sinh viên");

        // set cái trang chủ là cái nhìn thấy đầu tiên lúc mở c.tr lên 
        ChuyenManHinh controller = new ChuyenManHinh(ContentMainFrame);
        controller.setView(TrangChu, TrangChuLabel, "TrangChu");

        List<DanhMuc> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMuc("TrangChu", TrangChu, TrangChuLabel));
        listDanhMuc.add(new DanhMuc("QLLopHoc", QLLopHoc, QLLopHocLabel));
        listDanhMuc.add(new DanhMuc("QLMonHoc", QLMonHoc, QLMonHocLabel));
        listDanhMuc.add(new DanhMuc("QLTKB", QLTKB, QLTKBLabel));
        listDanhMuc.add(new DanhMuc("QLDiem", QLDiem, QLDiemLabel));
        listDanhMuc.add(new DanhMuc("ThongKeDuLieu", ThongKeDuLieu, ThongKeDuLieuLabel));

        controller.setEvent(listDanhMuc);
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
        TabMainFrame = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        TrangChu = new javax.swing.JPanel();
        TrangChuLabel = new javax.swing.JLabel();
        QLLopHoc = new javax.swing.JPanel();
        QLLopHocLabel = new javax.swing.JLabel();
        QLTKB = new javax.swing.JPanel();
        QLTKBLabel = new javax.swing.JLabel();
        QLDiem = new javax.swing.JPanel();
        QLDiemLabel = new javax.swing.JLabel();
        QLMonHoc = new javax.swing.JPanel();
        QLMonHocLabel = new javax.swing.JLabel();
        ThongKeDuLieu = new javax.swing.JPanel();
        ThongKeDuLieuLabel = new javax.swing.JLabel();
        ContentMainFrame = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabMainFrame.setBackground(new java.awt.Color(204, 255, 255));

        Title.setBackground(new java.awt.Color(255, 102, 102));

        TitleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/swing/images/iconChuongTrinh.png"))); // NOI18N
        TitleLabel.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        TrangChu.setBackground(new java.awt.Color(0, 204, 204));

        TrangChuLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        TrangChuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/swing/images/homeScreen.png"))); // NOI18N
        TrangChuLabel.setText("Trang chủ");

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TrangChuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TrangChuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        QLLopHoc.setBackground(new java.awt.Color(0, 204, 204));

        QLLopHocLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        QLLopHocLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/swing/images/class.png"))); // NOI18N
        QLLopHocLabel.setText("Quản lý lớp học");

        javax.swing.GroupLayout QLLopHocLayout = new javax.swing.GroupLayout(QLLopHoc);
        QLLopHoc.setLayout(QLLopHocLayout);
        QLLopHocLayout.setHorizontalGroup(
            QLLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLLopHocLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(QLLopHocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        QLLopHocLayout.setVerticalGroup(
            QLLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLLopHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QLLopHocLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        QLTKB.setBackground(new java.awt.Color(0, 204, 204));

        QLTKBLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        QLTKBLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/swing/images/tkb.png"))); // NOI18N
        QLTKBLabel.setText("Quản lý TKB");

        javax.swing.GroupLayout QLTKBLayout = new javax.swing.GroupLayout(QLTKB);
        QLTKB.setLayout(QLTKBLayout);
        QLTKBLayout.setHorizontalGroup(
            QLTKBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLTKBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QLTKBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        QLTKBLayout.setVerticalGroup(
            QLTKBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLTKBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QLTKBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        QLDiem.setBackground(new java.awt.Color(0, 204, 204));

        QLDiemLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        QLDiemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/swing/images/score.png"))); // NOI18N
        QLDiemLabel.setText("Quản lý điểm");

        javax.swing.GroupLayout QLDiemLayout = new javax.swing.GroupLayout(QLDiem);
        QLDiem.setLayout(QLDiemLayout);
        QLDiemLayout.setHorizontalGroup(
            QLDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLDiemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QLDiemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        QLDiemLayout.setVerticalGroup(
            QLDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QLDiemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        QLMonHoc.setBackground(new java.awt.Color(0, 204, 204));

        QLMonHocLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        QLMonHocLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/swing/images/addOrRemoveCourse.png"))); // NOI18N
        QLMonHocLabel.setText("Quản lý môn học");

        javax.swing.GroupLayout QLMonHocLayout = new javax.swing.GroupLayout(QLMonHoc);
        QLMonHoc.setLayout(QLMonHocLayout);
        QLMonHocLayout.setHorizontalGroup(
            QLMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLMonHocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QLMonHocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        QLMonHocLayout.setVerticalGroup(
            QLMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLMonHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QLMonHocLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        ThongKeDuLieu.setBackground(new java.awt.Color(0, 204, 204));

        ThongKeDuLieuLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        ThongKeDuLieuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/swing/images/tyLeQuaMon.png"))); // NOI18N
        ThongKeDuLieuLabel.setText("Thống kê dữ liệu ");

        javax.swing.GroupLayout ThongKeDuLieuLayout = new javax.swing.GroupLayout(ThongKeDuLieu);
        ThongKeDuLieu.setLayout(ThongKeDuLieuLayout);
        ThongKeDuLieuLayout.setHorizontalGroup(
            ThongKeDuLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeDuLieuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ThongKeDuLieuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ThongKeDuLieuLayout.setVerticalGroup(
            ThongKeDuLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeDuLieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThongKeDuLieuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout TabMainFrameLayout = new javax.swing.GroupLayout(TabMainFrame);
        TabMainFrame.setLayout(TabMainFrameLayout);
        TabMainFrameLayout.setHorizontalGroup(
            TabMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QLLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QLTKB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QLDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QLMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThongKeDuLieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TabMainFrameLayout.setVerticalGroup(
            TabMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabMainFrameLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QLLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QLTKB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QLMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThongKeDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContentMainFrameLayout = new javax.swing.GroupLayout(ContentMainFrame);
        ContentMainFrame.setLayout(ContentMainFrameLayout);
        ContentMainFrameLayout.setHorizontalGroup(
            ContentMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        ContentMainFrameLayout.setVerticalGroup(
            ContentMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TabMainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentMainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabMainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentMainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentMainFrame;
    private javax.swing.JPanel QLDiem;
    private javax.swing.JLabel QLDiemLabel;
    private javax.swing.JPanel QLLopHoc;
    private javax.swing.JLabel QLLopHocLabel;
    private javax.swing.JPanel QLMonHoc;
    private javax.swing.JLabel QLMonHocLabel;
    private javax.swing.JPanel QLTKB;
    private javax.swing.JLabel QLTKBLabel;
    private javax.swing.JPanel TabMainFrame;
    private javax.swing.JPanel ThongKeDuLieu;
    private javax.swing.JLabel ThongKeDuLieuLabel;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JLabel TrangChuLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}