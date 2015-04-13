
package com.acmici.meeting.ui;

import com.acmici.meeting.server.MeetingServer;

import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author sukha
 */
public class OngoingFrame extends javax.swing.JFrame {

    /**
     * Creates new form OngoingFrame
     */
    private MeetingServer meetingServer;

    public OngoingFrame(MeetingServer server) {
        meetingServer = server;
        initComponents();
        int w = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int h = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(w, h);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        updateButton = new javax.swing.JButton();
        readButton = new javax.swing.JButton();
        endButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("会议进行中...");
        setBounds(new java.awt.Rectangle(0, 0, 350, 260));
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.append("会议主题：");
        jTextArea1.append(meetingServer.getTopic());
        jTextArea1.append("\n与会人员：");
        jTextArea1.append(meetingServer.getMembers());
        jTextArea1.append("\n记录员：");
        jTextArea1.append(meetingServer.getRecorder());
        jTextArea1.append("\n会议时间：");
        jScrollPane1.setViewportView(jTextArea1);

        updateButton.setText("修改会议信息");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        readButton.setText("查询历史会议");
        readButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButtonActionPerformed(evt);
            }
        });

        endButton.setText("结束会议");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(updateButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(readButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                                .addComponent(endButton)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(updateButton)
                                        .addComponent(readButton)
                                        .addComponent(endButton))
                                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        UpdateDialog update_dialog = new UpdateDialog(this, true, meetingServer);
        update_dialog.setVisible(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        // TODO add your handling code here:
        RecordUpdateDialog record_update_dialog = new RecordUpdateDialog(this, true);
        record_update_dialog.setVisible(true);
    }//GEN-LAST:event_endButtonActionPerformed

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButtonActionPerformed
        // TODO add your handling code here:
        HistroyFrame histroy_frame = new HistroyFrame();
        histroy_frame.setVisible(true);
    }//GEN-LAST:event_readButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton readButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}