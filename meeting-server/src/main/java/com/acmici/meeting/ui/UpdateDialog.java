/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acmici.meeting.ui;

import com.acmici.meeting.server.MeetingServer;
import com.acmici.meeting.server.MeetingServerImpl;
import org.apache.ftpserver.ftplet.FtpException;

import javax.swing.*;
import java.awt.Toolkit;

/**
 * @author sukha
 */
public class UpdateDialog extends javax.swing.JDialog {
    /**
     * Creates new form WizardDialog
     */
    private MeetingServer meetingServer;
    private String filePath;
    public UpdateDialog(java.awt.Frame parent, boolean modal, MeetingServer server) {
        super(parent, modal);
        meetingServer = server;
        initComponents();
        int w = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int h = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(w, h);
        
        //设置各个信息栏的默认值
        topicTextField.setText(meetingServer.getTopic());
        participantsTextField.setText(meetingServer.getMembers());
        recorderTextField.setText(meetingServer.getRecorder());
        filePathTextField.setText(meetingServer.getFile_path());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        topicLabel = new javax.swing.JLabel();
        participantsLabel = new javax.swing.JLabel();
        recorderLabel = new javax.swing.JLabel();
        filePathLabel = new javax.swing.JLabel();
        topicTextField = new javax.swing.JTextField();
        recorderTextField = new javax.swing.JTextField();
        participantsTextField = new javax.swing.JTextField();
        filePathTextField = new javax.swing.JTextField();
        filePathButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        recorderButton = new javax.swing.JButton();
        participantsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("创建会议向导");

        updateLabel.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        updateLabel.setText("修改会议信息");

        topicLabel.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        topicLabel.setText("会议主题：");

        participantsLabel.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        participantsLabel.setText("与会人员：");

        recorderLabel.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        recorderLabel.setText("记 录 员：");

        filePathLabel.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        filePathLabel.setText("会议文件：");

        topicTextField.setEditable(false);

        recorderTextField.setMaximumSize(new java.awt.Dimension(2147483647, 151));

        participantsTextField.setMaximumSize(new java.awt.Dimension(2147483647, 151));

        filePathTextField.setMaximumSize(new java.awt.Dimension(2147483647, 151));
        filePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathTextFieldActionPerformed(evt);
            }
        });

        filePathButton.setText("浏览");
        filePathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("确定");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("取消");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        recorderButton.setText("选择");
        recorderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorderButtonActionPerformed(evt);
            }
        });

        participantsButton.setText("选择");
        participantsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(participantsLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(participantsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(participantsButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(topicLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(topicTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(recorderLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(recorderTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(filePathLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(confirmButton)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(recorderButton)
                                        .addComponent(filePathButton))))
                            .addComponent(updateLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(updateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicLabel)
                    .addComponent(topicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(participantsLabel)
                    .addComponent(participantsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(participantsButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recorderLabel)
                    .addComponent(recorderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recorderButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filePathLabel)
                    .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filePathButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filePathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("请选择会议文件存放目录");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().toString();
            filePathTextField.setText(filePath);
        }
    }//GEN-LAST:event_filePathButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        this.getOwner().setVisible(true);

        try {
            meetingServer.setHome(filePath);
        } catch (FtpException e) {
            e.printStackTrace();
            // todo hecan 弹出错误提示
        }
        OngoingFrame ongoing_frame = new OngoingFrame(meetingServer);
        ongoing_frame.setVisible(true);
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void filePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filePathTextFieldActionPerformed

    private void recorderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recorderButtonActionPerformed

    private void participantsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participantsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton filePathButton;
    private javax.swing.JLabel filePathLabel;
    private javax.swing.JTextField filePathTextField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton participantsButton;
    private javax.swing.JLabel participantsLabel;
    private javax.swing.JTextField participantsTextField;
    private javax.swing.JButton recorderButton;
    private javax.swing.JLabel recorderLabel;
    private javax.swing.JTextField recorderTextField;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JTextField topicTextField;
    private javax.swing.JLabel updateLabel;
    // End of variables declaration//GEN-END:variables
}
