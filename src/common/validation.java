/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;


import static java.lang.System.exit;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hasindu
 */
public class validation {
     public static void val(JTextField p){
         if(p.getText().equals("")){
             JOptionPane.showMessageDialog(null,"please Enter Values To TextFields..");
             //return;
         }
         //return;
     }

    public static void val(JComboBox<String> cmb_subject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
