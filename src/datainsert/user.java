/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datainsert;

/**
 *
 * @author Hasindu
 */
public class user {
    public String first_Name;
    public String last_name;
    public String birth_date;
    public String gender;
    public String mobile_no;
    public String address;   

    public user(String first_Name, String last_name, String birth_date, String gender, String mobile_no, String address) {
        this.first_Name = first_Name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.gender = gender;
        this.mobile_no = mobile_no;
        this.address = address;
    }
    public user(){
        
    }
    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
