/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import datainsert.user;
/**
 *
 * @author Hasindu
 */
public class student extends user{
    private String student_id; 
   
    
    public student(String student_id, String first_Name, String last_name, String birth_date, String gender, String mobile_no, String address) {
        super(first_Name, last_name, birth_date, gender, mobile_no, address);
        this.student_id = student_id;
    }

    
    public student()
    {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    
}
