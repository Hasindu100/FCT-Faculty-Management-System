/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hasindu
 */
public class colorsettings {
     public static void setcolor(JPanel p){
        p.setBackground(new Color(51,51,51));
    }
    
    public static void resetcolor(JPanel p1){
        p1.setBackground(new Color(153,153,153));
    }

    public static void setcolor(JLabel jLabel3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void resetcolor(JLabel jLabel3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
