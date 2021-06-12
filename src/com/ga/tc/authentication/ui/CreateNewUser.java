/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ga.tc.authentication.ui;

import com.ga.tc.authentication.bao.UserBao;
import com.ga.tc.authentication.bao.UserBaoImpl;
import com.ga.tc.authentication.dto.UserInfoDto;
import com.ga.tc.common.Constants;
import com.ga.tc.common.LAF;
import com.ga.tc.common.ui.MainFrame;
import com.ga.tc.security.bao.SecurityBaoImpl;
import com.ga.tc.security.dto.RoleInfoDto;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import com.ga.tc.security.bao.SecurityBao;

/**
 *
 * @author pc
 */
public class CreateNewUser extends javax.swing.JPanel {
    private UserBao business = new UserBaoImpl();
    /**
     * Creates new form CreateNewUser
     */
    private SecurityBao secBusiness = new SecurityBaoImpl();
    public CreateNewUser() {
        initComponents();
        errorMsg.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JTextField();
        phonTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        lafsCombo = new javax.swing.JComboBox<>();
        rolesCombo = new javax.swing.JComboBox<>();
        createUserBtn = new javax.swing.JButton();
        defaultChk = new javax.swing.JCheckBox();
        errorMsg = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Create new user account"));

        jLabel1.setText("Full Name (*)");

        jLabel2.setText("Email:(*)");

        jLabel3.setText("Password (*):");

        jLabel4.setText("Phone:");

        jLabel5.setText("Address");

        jLabel6.setText("LAF:");

        jLabel7.setText("Role (*):");

        fillInLAFs();

        rolesCombo.setToolTipText("");
        fillInRoles();

        createUserBtn.setText("Save");
        createUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserBtnActionPerformed(evt);
            }
        });

        defaultChk.setText("use default?");
        defaultChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultChkActionPerformed(evt);
            }
        });

        errorMsg.setForeground(new java.awt.Color(255, 0, 51));
        errorMsg.setText("Enter the fields marked with (*)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(rolesCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                            .addComponent(lafsCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phonTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passTxt)
                                            .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fNameTxt))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(defaultChk))))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 213, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultChk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lafsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rolesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createUserBtn)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void defaultChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultChkActionPerformed
        
    }//GEN-LAST:event_defaultChkActionPerformed

    private void createUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserBtnActionPerformed
        try{
            boolean hasError = false, useDefaultPassword = false;
            
            if("".equals(fNameTxt.getText().trim())){
                hasError = true;
            }
            if("".equals(emailTxt.getText().trim())){
                hasError = true;
            }
            if(defaultChk.getModel().isSelected()){
                useDefaultPassword = true;
            }
            if("".equals(passTxt.getText().trim()) &&
                   !useDefaultPassword){
                hasError = true;
            }
            if(hasError){
                errorMsg.setVisible(true);
            }else{
                errorMsg.setVisible(false);
                UserInfoDto user  = new UserInfoDto();
                //fill-in the user information from the UI
                user.setFullName(fNameTxt.getText().trim());
                user.setEmail(emailTxt.getText().trim());
                user.setPassword(useDefaultPassword ? null : passTxt.getText());
                user.setPhone(phonTxt.getText().trim());
                user.setAddress(addressTxt.getText().trim());
                LAF selected = (LAF)lafsCombo.getModel().getSelectedItem();
                user.setLaf(selected.getClassName());
                
                //Role code
                RoleInfoDto selctedRole = (RoleInfoDto)rolesCombo.getModel().getSelectedItem();
                user.setRole(new RoleInfoDto(selctedRole.getId()));
                //
                if(business.save(user) == 1){
                    JOptionPane.showMessageDialog(this, "User is saved sucessfully" ,"Success", JOptionPane.INFORMATION_MESSAGE);
                    resetCreationPanel();
                }else
                    JOptionPane.showMessageDialog(this, "User is NOT saved sucessfully" ,"Error", JOptionPane.ERROR_MESSAGE);
            }
    
        }catch(Exception e){
            JOptionPane.showConfirmDialog(this, "Error :"+e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_createUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton createUserBtn;
    private javax.swing.JCheckBox defaultChk;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> lafsCombo;
    private javax.swing.JTextField passTxt;
    private javax.swing.JTextField phonTxt;
    private javax.swing.JComboBox<String> rolesCombo;
    // End of variables declaration//GEN-END:variables

    private void fillInLAFs() {
        //INITIATE LAF COMBO.
        Vector<LAF> model = new Vector<>();
//        model.addElement(new LAF("-- Select --",null));
        model.addElement(new LAF("Aero","com.jtattoo.plaf.aero.AeroLookAndFeel"));
        model.addElement(new LAF("Aluminium","com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"));
        model.addElement(new LAF("Bernstein","com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"));
        model.addElement(new LAF("HI FI","com.jtattoo.plaf.hifi.HiFiLookAndFeel"));
        model.addElement(new LAF("Luna", "com.jtattoo.plaf.luna.LunaLookAndFeel"));
        model.addElement(new LAF("McWin","com.jtattoo.plaf.mcwin.McWinLookAndFeel"));
        model.addElement(new LAF("Mint","com.jtattoo.plaf.mint.MintLookAndFeel"));
        model.addElement(new LAF("Noire","com.jtattoo.plaf.noire.NoireLookAndFeel"));
        model.addElement(new LAF("SmarT","com.jtattoo.plaf.smart.SmartLookAndFeel"));
        model.addElement(new LAF("Texture","com.jtattoo.plaf.texture.TextureLookAndFeel"));
        model.addElement(new LAF("Acry","com.jtattoo.plaf.acryl.AcrylLookAndFeel"));
        model.addElement(new LAF("Aluminium","com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"));
        model.addElement(new LAF("Texture","com.jtattoo.plaf.texture.TextureLookAndFeel"));
        lafsCombo = new JComboBox(model);
    }

    private void resetCreationPanel() {
       fNameTxt.setText("");
       passTxt.setText("");
       phonTxt.setText("");
       addressTxt.setText("");
       emailTxt.setText("");
    }

    private void fillInRoles() {
        Vector<RoleInfoDto> model = new Vector<>();
        try{
            List<RoleInfoDto> allRoles = secBusiness.listAll(Constants.STATUS_ACTIVE);
            if(allRoles != null && !allRoles.isEmpty())
                for(RoleInfoDto role : allRoles)
                    model.addElement(role);
            rolesCombo = new JComboBox(model);
        }catch(Exception e){
            e.printStackTrace();
        }    
    }
}