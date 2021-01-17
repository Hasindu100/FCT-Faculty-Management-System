/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class calculation {
     public double gpacalculation(JTable t,JLabel l){
        try{
        DefaultTableModel model = (DefaultTableModel)t.getModel();
        int i = 0;
        double result=0,gpa=0,total=0;
        int credit=0,credittol=0;
        String mark;
        int count = t.getRowCount();
        for(i=0;i<count;i++){
            mark = model.getValueAt(i, 2).toString();
            switch(mark){
                case "A+" :
                    result = 4;
                    break;
                case "A" :
                    result = 4;
                    break;
                case "A-" :
                    result = 3.7;
                    break;
                case "B+" :
                    result = 3.4;
                    break;
                case "B" :
                    result = 3.1;
                    break;
                case "B-" :
                    result = 2.7;
                    break;
                case "C+" :
                    result = 2.4;
                    break;
                case "C" :
                    result = 2.1;
                    break;
                case "C-" :
                    result = 1.8;
                    break;
                case "D" :
                    result = 1;
                    break;
                case "F" :
                    result = 0;
                    break;
            }
            credit = Integer.parseInt(model.getValueAt(i, 0).toString().substring(9,10));
            credittol=credittol + credit;
            total=total+result*credit;
            gpa=total/credittol;
        }
        l.setText(String.valueOf(gpa));
        //return gpa;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return 0;
    }
}
