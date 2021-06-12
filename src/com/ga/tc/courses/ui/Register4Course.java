/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ga.tc.courses.ui;

import com.ga.tc.authentication.bao.UserBao;
import com.ga.tc.authentication.bao.UserBaoImpl;
import com.ga.tc.authentication.dto.UserInfoDto;
import com.ga.tc.common.Constants;
import com.ga.tc.courses.bao.CourseBao;
import com.ga.tc.courses.bao.CourseBaoImpl;
import com.ga.tc.courses.dto.CourseInfoDto;
import com.ga.tc.courses.dto.CourseUserDto;
import com.ga.tc.security.dto.RoleInfoDto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Register4Course extends javax.swing.JPanel {
    private UserInfoDto loggedInUser;
    private UserBao userBusiness = new UserBaoImpl();
    private CourseBao courseBusiness= new CourseBaoImpl();
    /**
     * Creates new form Register4Course
     */
    public Register4Course() {
        initComponents();
    }

    public Register4Course(UserInfoDto userInfo) {
        initComponents();
        loggedInUser = userInfo;
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
        courseLOVCombo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Register for a Course"));

        jLabel1.setText("Opened Courses");

        fillInCoursesLOV();
        courseLOVCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseLOVComboActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 102))); // NOI18N

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        fillInStudentsTable();
        jScrollPane1.setViewportView(studentsTable);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseLOVCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(courseLOVCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            StringBuffer sb = new StringBuffer("Error:\n");
            List<CourseUserDto> creg = new ArrayList<>();
            if(((CourseInfoDto)courseLOVCombo.getSelectedItem()).getId().equals(-1))
                sb.append("Please Select a Course");
            else{
                for(int row =0;row < studentsTable.getModel().getRowCount();row++){
                //if reg changed form the original state in refRegs then send to bao with reg id.
                if(refRegs != null && !refRegs.isEmpty()){
                    for(CourseUserDto reg : refRegs){
                        if( !(boolean)studentsTable.getModel().getValueAt(row, 5) &&
                            reg.getStudentId().equals(studentsTable.getModel().getValueAt(row, 0))){
                            //reg is canceled
                            reg.setActive(false);
                            creg.add(reg);
                        }else if( (boolean)studentsTable.getModel().getValueAt(row, 5) &&
                            !reg.getStudentId().equals(studentsTable.getModel().getValueAt(row, 0))){
                            //new registeration
                            creg.add(new CourseUserDto(((CourseInfoDto)courseLOVCombo.getSelectedItem()).getId(),
                                (Integer)studentsTable.getModel().getValueAt(row, 0)));
                        }
                    }
                }else{
                    //new registeration
                    if( (boolean)studentsTable.getModel().getValueAt(row, 5))
                        creg.add(new CourseUserDto(((CourseInfoDto)courseLOVCombo.getSelectedItem()).getId(),
                            (Integer)studentsTable.getModel().getValueAt(row, 0)));
                }
                    
            }
            }
            
            
            if(creg.isEmpty()){
                    sb.append("Please Select at least one student.");
            }
            if(sb.toString().equals("Error:\n"))
                if(courseBusiness.saveCourseRegisteration(creg)>0){
                    JOptionPane.showMessageDialog(this, "Registerations were saved successfully !");
                }else{
                    JOptionPane.showMessageDialog(this, "Error occured !! please try again.");
                }
            else
                JOptionPane.showMessageDialog(this, sb.toString());
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private List<CourseUserDto> refRegs;
    private void courseLOVComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseLOVComboActionPerformed
        //change the table contents
        try{
            CourseInfoDto selectedCourse = (CourseInfoDto)courseLOVCombo.getSelectedItem();
            if(selectedCourse.getId().equals(-1)){
                for(int row = 0; row<studentsTable.getRowCount();row++)
                        studentsTable.getModel().setValueAt(false, row, 5);
            }else{
                //UNSELECT ALL
                for(int row1 = 0; row1 < studentsTable.getRowCount();row1++)
                            studentsTable.getModel().setValueAt(false, row1, 5); 
                //get selected course id and load the already registered student
                int courseId = selectedCourse.getId();
                refRegs = courseBusiness.loadCourseRegisteration(courseId);
                int tempStudentId = -1;
                for(int row = 0; row < studentsTable.getRowCount();row++){
                    tempStudentId = (Integer)studentsTable.getModel().getValueAt(row, 0);
                    if(refRegs != null && !refRegs.isEmpty()){
                        for(CourseUserDto r: refRegs){
                            if(r.getStudentId().equals(tempStudentId)){
                               studentsTable.getModel().setValueAt(true, row, 5);
                            }
                        }
                    }

                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_courseLOVComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<CourseInfoDto> courseLOVCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentsTable;
    // End of variables declaration//GEN-END:variables

    private void fillInCoursesLOV() {
        courseLOVCombo = new JComboBox<>();
        List<CourseInfoDto> lov = new ArrayList<>();
        lov.add(new CourseInfoDto(-1, "--Select--"));
        lov.addAll(courseBusiness.loadCoursesLOV());
        
        for(CourseInfoDto c:lov)
            courseLOVCombo.addItem(c);
    }

    private void fillInStudentsTable() {
         try{
            List<UserInfoDto> students = userBusiness.listAllStudents();
            if(students != null && !students.isEmpty()){
                Object [][] data = new Object [students.size()][6];
                for(int index =0; index<students.size(); index++){
                    data [index][0] = students.get(index).getId();
                    data [index][1] = students.get(index).getFullName();
                    data [index][2] = students.get(index).getEmail();
                    data [index][3] = students.get(index).getPhone();
                    data [index][4] = students.get(index).getAddress();
                    data [index][5] = false; //add column for registeration
                    
                }
                DefaultTableModel model = new javax.swing.table.DefaultTableModel(data,new String[]{"ID", "Full Name", "Email", "Phone", "Address", "Registered?"});
                studentsTable = new JTable(model){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        if(column == 5) 
                            return true;
                        return false;
                    }
                    @Override
                    public Class<?> getColumnClass(int column) {
                        switch(column){
                            case 0:
                                return Integer.class;
                            case 1:
                                return String.class;
                            case 2:
                                return String.class;
                            case 3:
                                return String.class;
                            case 4:
                                return String.class;
                            case 5:
                                return Boolean.class;    
                            default:
                                return Integer.class;
                        }
                    }  
                };
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage() ,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}