/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import common.javaconnect;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Vector;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import model.academic_year;
import model.course;

/**
 *
 * @author Hasindu
 */
public class student_functions {
    public Pair<student,course> Show_students(String sid){
        student s = new student();
        course c = new course();
        
        Connection con = javaconnect.connectdb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT student.sid,fname,lname,address,course.course_id,course_name,year FROM student,enroll,course,year,stdyear WHERE student.sid=enroll.sid AND course.course_id=enroll.course_id AND student.sid=stdyear.sid AND year.year_id=stdyear.year_id AND student.sid=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, sid);
            rs = ps.executeQuery();
            while(rs.next()){
                
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return new Pair<student,course>(s,c);
    }
    
    public Vector abc(String sid){
        student s = new student();
        course c = new course();
         academic_year y = new academic_year();
        
        Connection con = javaconnect.connectdb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT student.sid,fname,lname,address,course.course_id,course_name,year FROM student,enroll,course,year,stdyear WHERE student.sid=enroll.sid AND course.course_id=enroll.course_id AND student.sid=stdyear.sid AND year.year_id=stdyear.year_id AND student.sid=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, sid);
            rs = ps.executeQuery();
            while(rs.next()){
                s.setStudent_id(rs.getString("sid"));
                s.setFirst_Name(rs.getString("fname"));
                s.setLast_name(rs.getString("lname"));
                s.setAddress(rs.getString("address"));
                c.setCourse_id(rs.getString("course_id"));
                c.setCourse_name(rs.getString("course_name"));
                y.setYear(rs.getString("year"));
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        Vector<student> v = new Vector<student>();
        v.add(s);
       
        return v;
    }
}
