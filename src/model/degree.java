/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hasindu
 */
public class degree {
    private String degree_id;
    private String degree_name;

    public degree(String degree_id, String degree_name) {
        this.degree_id = degree_id;
        this.degree_name = degree_name;
    }
    public degree(){
        
    }
    public String getDegree_id() {
        return degree_id;
    }

    public void setDegree_id(String degree_id) {
        this.degree_id = degree_id;
    }

    public String getDegree_name() {
        return degree_name;
    }

    public void setDegree_name(String degree_name) {
        this.degree_name = degree_name;
    }
}
