/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import student.studentinformationform;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import lectdata.lectdetailsform;

/**
 *
 * @author Hasindu
 */
public class enteruserdetailsform extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    public enteruserdetailsform() {
        initComponents();
    }
    
    public enteruserdetailsform(String para){
        initComponents();
        jLabel3.setText(para);
        jLabel5.setText(para);
        String s =jLabel5.getText();
        if(s.substring(0, 2).equals("le")){
            id.setText("lecturer ID:");
            lbyear.hide();
            year.hide();
        }
        else{
            id.setText("Student ID:");
        }
    }
    
    public void lect(){
       
        try{
        String up = "INSERT INTO lecturer (lecture_id, fname, lname, birth_date, gender, telephone_number, address) VALUES (?, ?, ?, ?, ?, ?, ?)"; 
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords?zeroDateTimeBehavior=convertToNull","root","");
        pst = con.prepareStatement(up);
        pst.setString(1,jLabel5.getText());
        pst.setString(2,txfn.getText());
        pst.setString(3,txln.getText());
        pst.setString(4,txtbd.getText());
        if(male.isSelected()){
            pst.setString(5,male.getText());
        }
        else if(female.isSelected()){
            pst.setString(5,female.getText());
        }
        pst.setString(6,txtp.getText());
        pst.setString(7,txadd.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Inserted Successfully...");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
           //ex.printStackTrace();
        }
    }
    
    public void std(){
        try{
        String up = "INSERT INTO student (sid, fname, lname, address, gender, birth_date, telephone_number) VALUES (?, ?, ?, ?, ?, ?, ?)"; 
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords?zeroDateTimeBehavior=convertToNull","root","");
        pst = con.prepareStatement(up);
        pst.setString(1,jLabel5.getText());
        pst.setString(2,txfn.getText());
        pst.setString(3,txln.getText());
        pst.setString(4,txadd.getText());
        if(male.isSelected()){
            pst.setString(5,male.getText());
        }
        else if(female.isSelected()){
            pst.setString(5,female.getText());
        }
        pst.setString(6,txtbd.getText());
        pst.setString(7,txtp.getText());
        pst.executeUpdate();
        pst.close();
        String in= "INSERT INTO stdyear (sid,year_id) VALUES (?, ?)";
        pst = con.prepareStatement(in);
        pst.setString(1,jLabel5.getText());
        pst.setString(2,year.getSelectedItem().toString());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Inserted Successfully...");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
           //ex.printStackTrace();
        }
        
    }
    public void enrollcourse(){
        String s =jLabel5.getText();
        if(s.substring(0, 2).equals("cs")){
            try{
        String up = "INSERT INTO enroll (sid, course_id) VALUES (?, ?)"; 
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords?zeroDateTimeBehavior=convertToNull","root","");
        pst = con.prepareStatement(up);
        pst.setString(1,jLabel5.getText());
        pst.setString(2,"BSCS");
        pst.executeUpdate();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
           //ex.printStackTrace();
        }
        }
        if(s.substring(0, 2).equals("ct")){
            try{
        String up = "INSERT INTO enroll (sid, course_id) VALUES (?, ?)"; 
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords?zeroDateTimeBehavior=convertToNull","root","");
        pst = con.prepareStatement(up);
        pst.setString(1,jLabel5.getText());
        pst.setString(2,"CTEC");
        pst.executeUpdate();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
           //ex.printStackTrace();
        }
        }
        if(s.substring(0, 2).equals("et")){
            try{
        String up = "INSERT INTO enroll (sid, course_id) VALUES (?, ?)"; 
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords?zeroDateTimeBehavior=convertToNull","root","");
        pst = con.prepareStatement(up);
        pst.setString(1,jLabel5.getText());
        pst.setString(2,"ETEC");
        pst.executeUpdate();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
           //ex.printStackTrace();
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        txfn = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        txln = new javax.swing.JTextField();
        bd = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        tp = new javax.swing.JLabel();
        txtp = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        txadd = new javax.swing.JTextField();
        lbyear = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        btn_insert = new javax.swing.JButton();
        txtbd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/University_of_Kelaniya_logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Welcome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Welcome");

        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("jLabel5");

        fname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fname.setText("First Name:");

        lname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lname.setText("Last Name:");

        bd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bd.setText("Birth Date:");

        sex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sex.setText("Gender:");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        tp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tp.setText("Mobile No:");

        address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        address.setText("Address:");

        lbyear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbyear.setText("Year:");

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        btn_insert.setBackground(new java.awt.Color(0, 102, 153));
        btn_insert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_insert.setForeground(new java.awt.Color(225, 225, 225));
        btn_insert.setText("Insert");
        btn_insert.setBorder(null);
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(id)
                                        .addGap(60, 60, 60))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lname)
                                            .addComponent(fname)
                                            .addComponent(bd)
                                            .addComponent(sex)
                                            .addComponent(tp)
                                            .addComponent(address)
                                            .addComponent(lbyear))
                                        .addGap(37, 37, 37)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(txfn)
                                    .addComponent(txln)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(female))
                                    .addComponent(txadd)
                                    .addComponent(year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbd))))
                        .addGap(97, 97, 97))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname)
                    .addComponent(txfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname)
                    .addComponent(txln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bd)
                    .addComponent(txtbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sex)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp)
                    .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(txadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbyear)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 360, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        String s =jLabel5.getText();
        String pattern = "^[0-9]{10}$";
       if(s.substring(0, 2).equals("le"))
        {
              if((txfn.getText().equals(""))||(txln.getText().equals(""))||(txtbd.getText().equals(""))||(txadd.getText().equals(""))||(txtp.getText().equals(""))||(!((male.isSelected())||(female.isSelected())))){
                JOptionPane.showMessageDialog(null, "Please Enter the Full Details of the Lecturer");
              }
              else if(!txtp.getText().matches(pattern)){
                  JOptionPane.showMessageDialog(null, "Please Enter a valid phone number");
              }
              else{
           lect();
           String msg = jLabel5.getText();
           //new lectdetailsform(msg).setVisible(true);
           this.dispose();
        }
             
        }
        else if((s.substring(0, 2).equals("cs"))||(s.substring(0, 2).equals("ct"))||(s.substring(0, 2).equals("et")))
        {
            
            if((txfn.getText().equals(""))||(txln.getText().equals(""))||(txtbd.getText().equals(""))||(txadd.getText().equals(""))||(txtp.getText().equals(""))||(!((male.isSelected())||(female.isSelected())))){
                JOptionPane.showMessageDialog(null, "Please Enter the Full Details of the Student");
            
        }
        else if(!txtp.getText().matches(pattern)){
                  JOptionPane.showMessageDialog(null, "Please Enter a valid phone number");
              }
        else{
            std();
            enrollcourse();
            String msg = jLabel5.getText();
            //new studentinformationform(msg).setVisible(true);
            this.dispose();
        }
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(enteruserdetailsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enteruserdetailsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enteruserdetailsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enteruserdetailsform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enteruserdetailsform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel bd;
    private javax.swing.JButton btn_insert;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbyear;
    private javax.swing.JLabel lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel sex;
    private javax.swing.JLabel tp;
    private javax.swing.JTextField txadd;
    private javax.swing.JTextField txfn;
    private javax.swing.JTextField txln;
    private javax.swing.JTextField txtbd;
    private javax.swing.JTextField txtp;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
