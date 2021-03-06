/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ga.tc.authentication.ui.tables.models;

import com.ga.tc.security.dto.RoleInfoDto;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author pc
 */
public class UserTableCellRenderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent
        (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof RoleInfoDto){
            RoleInfoDto role = (RoleInfoDto) value;
            setText(role.getName());
        }
//        if(isSelected)
//            setBackground(table.getSelectionBackground());
//        else
//            setBackground(table.getSelectionForeground());
        
        return this;
            
    }
    
}
