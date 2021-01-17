/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectdata;

import common.javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import student.student;

/**
 *
 * @author Hasindu
 */
public class lecturer_functions {
    public lecturer Show_lecturer (String lecture_id){
        lecturer le = new lecturer();
        
        Connection con = javaconnect.connectdb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT * FROM lecturer WHERE lecture_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, lecture_id);
            rs = ps.executeQuery();
            if(rs.next()){
                le.setLecture_id(rs.getString("lecture_id"));
                le.setFirst_Name(rs.getString("fname"));
                le.setLast_name(rs.getString("lname"));
                le.setBirth_date(rs.getString("birth_date"));
                le.setMobile_no(rs.getString("telephone_number"));
                le.setGender(rs.getString("gender"));
                le.setAddress(rs.getString("address"));
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return le;
    }
    
    public void Update_lecturer(lecturer l, String lecturer_id){
        Connection con = javaconnect.connectdb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "UPDATE lecturer SET telephone_number = ?, address = ? WHERE lecture_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, l.getMobile_no());
            ps.setString(2, l.getAddress());
            ps.setString(3, lecturer_id);
            
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void Insert_result(String sub_id, student s, String result, String status){
        Connection con = javaconnect.connectdb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "INSERT INTO result (subject_id, sid, results, status) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, sub_id);
            ps.setString(2, s.getStudent_id());
            ps.setString(3, result);
            ps.setString(4, status);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public ResultSet Show_resulttable(lecturer l){
        Connection con = javaconnect.connectdb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT sid,subject.subject_id,subject_name,results,status FROM result,subject,lectsub WHERE subject.subject_id=result.subject_id AND subject.subject_id=lectsub.subject_id AND lectsub.lecture_id='"+l.getLecture_id()+"'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "345");
        }
        return rs;
    }
    
    public ResultSet Show_subjects(lecturer l){
        Connection con = javaconnect.connectdb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT subject_id From lectsub WHERE lecture_id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, l.getLecture_id());
            rs = ps.executeQuery();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "123");
        }
        return rs;
    }
}