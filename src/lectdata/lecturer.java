/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectdata;

import datainsert.user;
/**
 *
 * @author Hasindu
 */
public class lecturer extends user{
    private String lecture_id;
    public lecturer(String first_Name, String last_name, String birth_date, String gender, String mobile_no, String address, String lecture_id) {
        super(first_Name, last_name, birth_date, gender, mobile_no, address);
        this.lecture_id = lecture_id;
    }

    public  lecturer() {

    }

    public String getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(String lecture_id) {
        this.lecture_id = lecture_id;
    }
}

