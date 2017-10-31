import javax.swing.*;
import java.sql.*;
public class ButtonUI extends javax.swing.JFrame {
    JButton jbut;
    int sel;
    Connection conn;
    Statement st;
    ResultSet rst;
    String iname="";
    
    public ButtonUI(JButton but) {
        jbut=but;
        initComponents(); 
        connection();
        name();
        jTextField6.setText(iname);
        jTextField1.setText(jbut.getText());
        jSpinner1.setValue(jbut.getX());
        jSpinner2.setValue(jbut.getY());
        jSpinner3.setValue(jbut.getWidth());
        jSpinner4.setValue(jbut.getHeight());
        setVisible(true);
    }
    
    
    
    public void connection(){
        try{
            Class.forName("java.sql.DriverManager");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        try{
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PSDB?user=root&password=");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void name(){
        try{
            st=conn.createStatement();
            rst=st.executeQuery("SELECT * FROM BUTTON WHERE TEXT='"+jbut.getText()+"'");
            rst.next();
            iname=rst.getString("NAME");
            int no=Integer.parseInt(rst.getString("ENABLED"));
            if(no==2){
                jCheckBox1.setSelected(false);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel2.setText("Text");

        jLabel3.setText("X");

        jLabel4.setText("Y");

        jLabel5.setText("Width");

        jLabel6.setText("Height");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Enabled");

        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1, ""));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(65, 65, 65)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel6)
                    .add(jLabel1)
                    .add(jLabel5)
                    .add(jLabel2)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(41, 41, 41)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 70, Short.MAX_VALUE)
                                .add(jButton2))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jButton1)
                                    .add(jCheckBox1)))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField1))
                                .add(0, 0, Short.MAX_VALUE)))
                        .add(40, 40, 40))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSpinner3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jSpinner4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .add(jPanel1Layout.createSequentialGroup()
                .add(41, 41, 41)
                .add(jButton3)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCheckBox1)
                    .add(jLabel1)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(jButton2))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSpinner3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jSpinner4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(24, 24, 24)
                .add(jButton3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            
            jbut.setText(jTextField1.getText());
            String name=jTextField6.getText();
            int a=Integer.parseInt(jSpinner1.getValue().toString());
            int b=Integer.parseInt(jSpinner2.getValue().toString());
            int c=Integer.parseInt(jSpinner3.getValue().toString());
            int d=Integer.parseInt(jSpinner4.getValue().toString());
            jbut.setBounds(a,b,c,d);
            if(jCheckBox1.isSelected()){
                sel=1;
            }
            else{
                sel=2;
            }
            st=conn.createStatement();
            String SQL="UPDATE BUTTON SET NAME='"+name+"', TEXT='"+jTextField1.getText()+"',"+
                    " X="+a+", Y="+b+", WIDTH="+c+",HEIGHT="+d+", ENABLED="+sel+""+
                    " WHERE NAME='"+iname+"'";
            st.executeUpdate(SQL);
            st=conn.createStatement();
            name();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO fields must be left blank,\nNo spaces should be give in the textfields except TEXT,\nNo characters shud be give in the TextFields except TEXT\n"
                    +"NOTE:No two buttons must have same names and texts");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            st.close();
            conn.close();
            dispose();
        }
        catch(Exception e){
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jbut.setVisible(false);
        jbut.setEnabled(false);
        try{
        st=conn.createStatement();
        st.executeUpdate("DELETE FROM BUTTON WHERE TEXT='"+jbut.getText()+"' AND NAME='"+iname+"'");
        JOptionPane.showMessageDialog(null,"BUTTON DELETED");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int a=Integer.parseInt(jSpinner1.getValue().toString());
        try{
        st=conn.createStatement();
        st.executeUpdate("UPDATE BUTTON SET X="+a+" WHERE NAME='"+iname+"'");
        jbut.setBounds(a,jbut.getY(),jbut.getWidth(),jbut.getHeight());
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        int a=Integer.parseInt(jSpinner2.getValue().toString());
        try{
            st=conn.createStatement();
            st.executeUpdate("UPDATE BUTTON SET Y="+a+" WHERE NAME='"+iname+"'");
            jbut.setBounds(jbut.getX(),a,jbut.getWidth(),jbut.getHeight());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        // TODO add your handling code here:
        int a=Integer.parseInt(jSpinner3.getValue().toString());
        try{
            st=conn.createStatement();
            st.executeUpdate("UPDATE BUTTON SET WIDTH="+a+" WHERE NAME='"+iname+"'");
            jbut.setBounds(jbut.getX(),jbut.getY(),a,jbut.getHeight());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        // TODO add your handling code here:
        int a=Integer.parseInt(jSpinner4.getValue().toString());
        try{
            st=conn.createStatement();
            st.executeUpdate("UPDATE BUTTON SET HEIGHT="+a+" WHERE NAME='"+iname+"'");
            jbut.setBounds(jbut.getX(),jbut.getY(),jbut.getWidth(),a);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jSpinner4StateChanged

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}