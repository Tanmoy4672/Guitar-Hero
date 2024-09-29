
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class UpdateStudent extends javax.swing.JFrame {

    String fn, add;
    String mbl;
    String mail;
    String ids;
    String pass;
    // String dat;

    static Connection connect;
    static PreparedStatement pres;

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public static void setvalue(String name, String phone, String mail, String pass, String id, String add) throws SQLException {

        String query = "INSERT INTO student (id, name, phone, mail, password,student_id, address) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
        pres = (PreparedStatement) connect.prepareStatement(query);

        pres.setString(1, name);
        pres.setString(2, phone);
        pres.setString(3, mail);
        pres.setString(4, pass);
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //   dat =sdf.format( dateval.getDate());

        pres.setString(5, id);
        pres.setString(6, add);
        pres.execute();

        pres.close();
        connect.close();
    }

    /**
     * Creates new form UpdateStudent
     */
    public UpdateStudent() {
        super("student");
        initComponents();
        conn = databaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnamer = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        dateval = new com.toedter.calendar.JDateChooser();
        idvalue = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btndsub = new javax.swing.JButton();
        btnclr = new javax.swing.JButton();
        btnbk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 83, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 53, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 51, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 82, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 45, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student Id");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 82, -1));
        jPanel3.add(txtnamer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 250, -1));
        jPanel3.add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 250, -1));
        jPanel3.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 250, -1));
        jPanel3.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 250, -1));

        dateval.setDateFormatString("dd-MM-yyyy");
        jPanel3.add(dateval, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 250, -1));
        jPanel3.add(idvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 250, -1));
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 25, 189, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 25, 32, 22));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Student Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 4, 138, -1));
        jPanel3.add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 250, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 82, -1));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 544, -1, -1));

        btndsub.setBackground(new java.awt.Color(0, 204, 255));
        btndsub.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndsub.setText("SUBMIT");
        btndsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndsubActionPerformed(evt);
            }
        });
        jPanel3.add(btndsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 503, -1, -1));

        btnclr.setBackground(new java.awt.Color(0, 204, 255));
        btnclr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnclr.setText("CLEAR");
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });
        jPanel3.add(btnclr, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 503, 73, -1));

        btnbk.setBackground(new java.awt.Color(0, 204, 255));
        btnbk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbk.setText("BACK");
        btnbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbkActionPerformed(evt);
            }
        });
        jPanel3.add(btnbk, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 503, 73, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guitar home.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 230, 140, 170));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guitar home.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1460, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //search name
        fn = txtnamer.getText().trim();
        mbl = txtmob.getText();
        mail = txtmail.getText();
        pass = txtpass.getText();
        //  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //  String date =sdf.format( dateval.getCalendar());
        // dat = sdf.format(dateval.getDate());
        ids = idvalue.getText();
        add = txtadd.getText();

        connect = databaseConnection.connection();
        //   Registration.setvalue(fn, mbl, mail, pass, ids, add);

        try {

            stmt = conn.createStatement();

            int stdId = Integer.parseInt(id.getText());
            String sql = stdId + "SELECT * FROM STUDENT where id='" + stdId + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                txtnamer.setText(rs.getString(fn));
                txtmob.setText(rs.getString(mbl));
                txtmail.setText(rs.getString(mail));
                txtpass.setText(rs.getString(pass));
                idvalue.setText(rs.getString(ids));
                idvalue.setText(rs.getString(add));

            } else {
                JOptionPane.showMessageDialog(null, "Record not available");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndsubActionPerformed
        //save

        fn = txtnamer.getText().trim();
        mbl = txtmob.getText();
        mail = txtmail.getText();
        pass = txtpass.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //  String date =sdf.format( dateval.getCalendar());
        //   dat = sdf.format(dateval.getDate());
        ids = idvalue.getText();
        add = txtadd.getText();

        connect = databaseConnection.connection();

        //
        //    getAllRecord();
        if (txtnamer.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter your Name.");
            txtnamer.requestFocus();
            //behind else will be close(mobile to student id)
        } else {
            if (txtmob.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Give your Mobile Number.");
                txtmob.requestFocus();

            } else {

                if (txtmail.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Please Give your Email.");
                    txtmail.requestFocus();
                } else {
                    if (txtpass.getName().isEmpty()) {
                        JOptionPane.showMessageDialog(rootPane, "Please Give your Password.");
                        txtpass.requestFocus();
                    } else {
                        if (dateval.getName().isEmpty()) {
                            JOptionPane.showMessageDialog(rootPane, "Please fill in Date.");
                            dateval.requestFocus();
                        } else {
                            if (idvalue.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(rootPane, "Please Give Student's Id no.");
                                idvalue.requestFocus();
                                //behind else the block area form mob ile number
                            } else {
                                //after i coppied
                                if (txtadd.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(rootPane, "Please Give your Address.");
                                    txtadd.requestFocus();

                                    //show data in another table
//                                    after the second bracket provide the else string
//                                                        } else {
//                                                            fc = new JFileChooser(drt);
//                                                            //add file filter
//                                                            FileNameExtensionFilter filter;
//                                                            filter = new FileNameExtensionFilter("*.txt", new String[]{"txt"});
//                                                            fc.addChoosableFileFilter(filter);
//                                                            int option = fc.showSaveDialog(this);
//                                                            if (option == JFileChooser.APPROVE_OPTION) {
//                                                                drt = fc.getCurrentDirectory();
//                                                                model.addRow(new Object[]{fn, mbl, mail, ids, pass,/* dat,*/ add});
//                                    
//                                                                file = fc.getSelectedFile();
//                                                                try {
//                                                                    writeAll();
//                                                                } catch (IOException ex) {
//                                                                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
//                                                                }
//                                                            }
                                }
                                //there will be taken

                            }

                        }
                    }
                }
            }
           
        }
        //        //here put mobile if

        clear();
    }//GEN-LAST:event_btndsubActionPerformed

    private void btnbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbkActionPerformed
        // TODO add your handling code here:
        dispose();
        AdminPortal object = new AdminPortal();
        object.show();
    }//GEN-LAST:event_btnbkActionPerformed

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
        //clear
        clear();
    }//GEN-LAST:event_btnclrActionPerformed

    private void clear() {
        txtnamer.setText("");
        txtadd.setText("");
        //mobile to id   
        txtmob.setText("");
        txtpass.setText("");
        txtmail.setText("");
        dateval.setName("");
        idvalue.setText("");

    }

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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbk;
    private javax.swing.JButton btnclr;
    private javax.swing.JButton btndsub;
    private com.toedter.calendar.JDateChooser dateval;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idvalue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtnamer;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
