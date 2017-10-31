import javax.swing.*;
import java.sql.*;
public class RadioButtonUI extends javax.swing.JFrame {
    JRadioButton ra;
    int k,x=0,sel1,sel2;
    Connection conn=null;
    Statement st=null;
    ResultSet rst=null;
    String iname="";
    DefaultComboBoxModel cbm;
    
    public RadioButtonUI(JRadioButton rb) {
        initComponents();
        jComboBox1.setModel(cbm=new DefaultComboBoxModel());
        ra=rb;
        connection();
        name();
        jTextField6.setText(iname);
        jTextField1.setText(ra.getText());
        jSpinner1.setValue(ra.getX());
        jSpinner2.setValue(ra.getY());
        jSpinner3.setValue(ra.getWidth());
        jSpinner4.setValue(ra.getHeight());
        setVisible(true);
    }
    public void connection(){
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
            rst=st.executeQuery("SELECT * FROM RADIOBUTTON WHERE TEXT='"+ra.getText()+"'");
            rst.next();
            iname=rst.getString("NAME");
            cbm.setSelectedItem(rst.getString("BUTTONGROUP"));
            int ch=Integer.parseInt(rst.getString("ENABLED"));
            if(ch==2){
                jCheckBox2.setSelected(false);
            }
            int ch2=Integer.parseInt(rst.getString("SELECTED"));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
            try{
                st=conn.createStatement();  
                rst=st.executeQuery("SELECT DISTINCT(BUTTONGROUP) FROM RADIOBUTTON");
                while(rst.next()){
                    cbm.addElement(rst.getString("BUTTONGROUP"));
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Text");

        jLabel3.setText("X");

        jLabel4.setText("Y");

        jLabel5.setText("Width");

        jLabel6.setText("Height");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Enabled");

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

        jCheckBox1.setText("Selected");

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

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton4.setText("Add Group");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(78, 78, 78)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel6)
                                    .add(jLabel5)
                                    .add(jLabel4)
                                    .add(jLabel2)
                                    .add(jLabel1)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel3)))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jTextField6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .add(jTextField1))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner3)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner2)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner1)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jButton1)
                                .add(jCheckBox2)
                                .add(jButton2)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jCheckBox1))
                            .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton4)))
                    .add(layout.createSequentialGroup()
                        .add(121, 121, 121)
                        .add(jButton3)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jCheckBox2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jCheckBox1))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jSpinner1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel4)
                                .add(18, 18, 18)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSpinner3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jSpinner4)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(18, 18, 18)
                        .add(jButton3)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)
                        .add(18, 18, 18)
                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton4)
                        .add(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            ra.setText(jTextField1.getText());
            String name=jTextField6.getText();
            int a=Integer.parseInt(jSpinner1.getValue().toString());
            int b=Integer.parseInt(jSpinner2.getValue().toString());
            int c=Integer.parseInt(jSpinner3.getValue().toString());
            int d=Integer.parseInt(jSpinner4.getValue().toString());
            ra.setBounds(a,b,c,d);
            if(jCheckBox1.isSelected()){
                sel2=1;
            }
            else{
                sel2=2;
            }
            if(jCheckBox2.isSelected()){
                sel1=1;
            }
            else{
                sel1=2;
            }
            st=conn.createStatement();
            String SQL="UPDATE RADIOBUTTON SET NAME='"+name+"', TEXT='"+jTextField1.getText()+"',"+
                    " X="+a+", Y="+b+", WIDTH="+c+",HEIGHT="+d+", ENABLED="+sel1+", SELECTED="+sel2+""+
                    " WHERE NAME='"+iname+"'";
            if(sel1==1){
                ra.setSelected(true);
            }
            if(sel1==2){
                ra.setSelected(false);
            }
            st.executeUpdate(SQL);
            st=conn.createStatement();
            name();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO fields must be left blank,\nNo spaces should be give in the textfields except TEXT,\nNo characters shud be give in the TextFields except TEXT\n"
                    +"NOTE:No two radiobuttons must have same names and texts");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{
            st.close();
            conn.close();
        }
        catch(Exception e){
            dispose();
        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ra.setEnabled(false);
        ra.setVisible(false);
        try{
        st=conn.createStatement();
        st.executeUpdate("DELETE FROM RADIOBUTTON WHERE TEXT='"+ra.getText()+"' AND NAME='"+iname+"'");
        JOptionPane.showMessageDialog(null,"RADIOBUTTON DELETED");
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
        st.executeUpdate("UPDATE RADIOBUTTON SET X="+a+" WHERE NAME='"+iname+"'");
        ra.setBounds(a,ra.getY(),ra.getWidth(),ra.getHeight());
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
        st.executeUpdate("UPDATE RADIOBUTTON SET Y="+a+" WHERE NAME='"+iname+"'");
        ra.setBounds(ra.getX(),a,ra.getWidth(),ra.getHeight());
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        // TODO add your handling code here:
        int a=Integer.parseInt(jSpinner3.getValue().toString());
        try{
        st=conn.createStatement();
        st.executeUpdate("UPDATE RADIOBUTTON SET WIDTH="+a+" WHERE NAME='"+iname+"'");
        ra.setBounds(ra.getX(),ra.getY(),a,ra.getHeight());
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        // TODO add your handling code here:
        int a=Integer.parseInt(jSpinner4.getValue().toString());
        try{
        st=conn.createStatement();
        st.executeUpdate("UPDATE RADIOBUTTON SET HEIGHT="+a+" WHERE NAME='"+iname+"'");
        ra.setBounds(ra.getX(),ra.getY(),ra.getWidth(),a);
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String b=JOptionPane.showInputDialog("ENTER THE NAME OF THE GROUP");
        cbm.addElement(b);
        cbm.setSelectedItem(b);
        try{
            st=conn.createStatement();
            st.executeUpdate("UPDATE RADIOBUTTON SET BUTTONGROUP='"+b+"'WHERE NAME='"+iname+"'");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        try{
            st=conn.createStatement();
            st.executeUpdate("UPDATE RADIOBUTTON SET BUTTONGROUP='"+cbm.getSelectedItem()+"' WHERE NAME='"+iname+"'");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}