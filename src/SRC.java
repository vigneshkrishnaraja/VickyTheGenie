import java.sql.*;
import javax.swing.*;
public class SRC extends javax.swing.JFrame {
    Connection conn=null;
    Statement st=null,st1=null;
    ResultSet rst=null,rst1=null;
    String s1="import java.awt.*;\n"+
"import java.awt.event.*;\n"+
"import javax.swing.*;\n\n"+
"public class MyFrame extends JFrame {\n"+
"   private JPanel jp;\n";
    String s2="\n\n   public MyFrame(){\n"+
                "      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n"+
		"      setSize (new Dimension (480, 370));\n"+
		"      setTitle(\"MyFrame\");\n"+
		"      add(jp=new JPanel());\n"+
		"      jp.setLayout(null);\n";
    String s3="\n      setVisible(true);\n"+
   "   }\n";
    String s4="";
    String s5="\n\n   public static void main (String[] args) {\n"+
	       "      MyFrame myf=new MyFrame();\n"+
   "   }\n"+
"}";
    String a1="";
    String a2="";
    String a3="";
    String a4="";
    String a5="";
    
    public SRC() {
        initComponents();
        gettingvalues();
        jTextArea1.setText(s1+""+a1+""+s2+""+a2+"\n"+a3+"\n"+a4+""+a5+""+s3+""+s4+""+s5);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Refresh");
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

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 357, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(96, 96, 96)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 214, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new SRC().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void gettingvalues(){
        try{
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PSDB?user=root&password=");
            st=conn.createStatement();
            rst=st.executeQuery("SELECT * FROM BUTTON");
            while(rst.next()){
                a1=a1+"\n"+"   private JButton "+rst.getString("NAME")+";";
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new JButton(\""+rst.getString("TEXT")+"\"));";
                a3=a3+"\n"+"      "+rst.getString("NAME")+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";
                int no=Integer.parseInt(rst.getString("ENABLED"));
                if(no==2){
                    a4=a4+"      "+rst.getString("NAME")+".setEnabled(false);";
                    
                }
                if(rst.getString("ACTIONL")!=null){
                    a5=a5+"\n"+"      "+rst.getString("NAME")+".addActionListener(new ActionListener(){"
                        +"\n"+"         public void actionPerformed(ActionEvent e){"
                        +"\n            "+rst.getString("NAME")+"actionPerformed();"
                        +"\n         }"
                        +"\n"+"      });";
                    String string=rst.getString("ACTIONL");
                    if(string.equals("NAL")){
                        string="";
                    }
                    s4=s4+"\n"+"   public void "+rst.getString("NAME")+"actionPerformed(){"
                        +"\n      "+string+
                        "\n   }";
                }
                
            }
            st=conn.createStatement();
            rst=st.executeQuery("SELECT * FROM LABEL");
            while(rst.next()){
                a1=a1+"\n"+"   private JLabel "+rst.getString("NAME")+";";
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new JLabel(\""+rst.getString("TEXT")+"\"));";
                a3=a3+"\n"+"      "+rst.getString("NAME")+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";
                int no=Integer.parseInt(rst.getString("ENABLED"));
                if(no==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEnabled(false);";
                }
            }
            st=conn.createStatement();
            rst=st.executeQuery("SELECT * FROM TEXTFIELD");
            while(rst.next()){
                a1=a1+"\n"+"   private JTextField "+rst.getString("NAME")+";";
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new JTextField(\""+rst.getString("TEXT")+"\"));";
                a3=a3+"\n"+"      "+rst.getString("NAME")+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";
                int no=Integer.parseInt(rst.getString("ENABLED"));
                int no1=Integer.parseInt(rst.getString("EDITABLE"));
                if(no==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEnabled(false);";
                }
                if(no1==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEditable(false);";
                }
            }
            rst=st.executeQuery("SELECT * FROM TEXTAREA");
            int sp=0;
            while(rst.next()){
                a1=a1+"\n"+"   private JTextArea "+rst.getString("NAME")+";";
                a1=a1+"\n"+"   private JScrollPane jScrollPane"+sp+";";
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new JTextArea());";
                a2=a2+"\n"+"      jp.add(jScrollPane"+sp+"=new JScrollPane("+rst.getString("NAME")+"));";
                a3=a3+"\n"+"      jScrollPane"+sp+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";
                sp++;
                int no=Integer.parseInt(rst.getString("ENABLED"));
                int no1=Integer.parseInt(rst.getString("EDITABLE"));
                if(no==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEnabled(false);";
                }
                if(no1==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEditable(false);";
                }
            }
            rst=st.executeQuery("SELECT DISTINCT(BUTTONGROUP) FROM RADIOBUTTON");
            while(rst.next()){
                a1=a1+"\n"+"   private ButtonGroup "+rst.getString("BUTTONGROUP")+";";
                a2=a2+"\n"+"   "+rst.getString("BUTTONGROUP")+"=new ButtonGroup();";
            }
            rst=st.executeQuery("SELECT * FROM RADIOBUTTON");
            while(rst.next()){
                a1=a1+"\n"+"   private JRadioButton "+rst.getString("NAME")+";";
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new JRadioButton());";
                a3=a3+"\n"+"      "+rst.getString("NAME")+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";
                a3=a3+"\n"+"       "+rst.getString("BUTTONGROUP")+".add("+rst.getString("NAME")+");";
                int no=Integer.parseInt(rst.getString("ENABLED"));
                int no1=Integer.parseInt(rst.getString("SELECTED"));
                if(no==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEnabled(false);";
                }
                if(no1==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setSelected(false);";
                }
                else if(no1==1){
                    a4=a4+"\n      "+rst.getString("NAME")+".setSelected(true);";
                }
            }
            rst=st.executeQuery("SELECT DISTINCT(BUTTONGROUP) FROM CHECKBOX");
            while(rst.next()){
                a1=a1+"\n"+"   private ButtonGroup "+rst.getString("BUTTONGROUP")+";";
                a2=a2+"\n"+"   "+rst.getString("BUTTONGROUP")+"=new ButtonGroup();";
            }
            rst=st.executeQuery("SELECT * FROM CHECKBOX");
            while(rst.next()){
                a1=a1+"\n"+"   private CheckBox "+rst.getString("NAME")+";";
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new CheckBox());";
                a3=a3+"\n"+"      "+rst.getString("NAME")+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";
                a3=a3+"\n"+"       "+rst.getString("BUTTONGROUP")+".add("+rst.getString("NAME")+");";
                int no=Integer.parseInt(rst.getString("ENABLED"));
                int no1=Integer.parseInt(rst.getString("SELECTED"));
                if(no==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEnabled(false);";
                }
                if(no1==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setSelected(false);";
                }
                else if(no1==1){
                    a4=a4+"\n      "+rst.getString("NAME")+".setSelected(true);";
                }
            }
            int ap=0;
            rst=st.executeQuery("SELECT * FROM COMBOBOX");
            while(rst.next()){
                a1=a1+"\n"+"   private JComboBox "+rst.getString("NAME")+";";             
                st1=conn.createStatement();
                rst1=st1.executeQuery("SELECT * FROM COMBOITEMS WHERE NAME='"+rst.getString("NAME")+"'");
                
                if(rst1.next()){
                if(!rst1.getString("ITEM").equals("")){
                    a2=a2+"\n      String[] stringcomb"+ap+"={";
                    a2=a2+"\""+rst1.getString("ITEM")+"\"";
                }
                while(rst1.next()){
                    if(rst1.last()){
                        a2=a2+",\""+rst1.getString("ITEM")+"\"";
                    }
                    else{ 
                        a2=a2+",\""+rst1.getString("ITEM")+"\",";
                    }
                }
                    a2=a2+"};";
                }
                else{
                    a2=a2+"\n      String[] stringcomb"+ap+"={};";
                }
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new JComboBox(stringcomb"+ap+"));";
                a3=a3+"\n"+"      "+rst.getString("NAME")+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";                
                int no=Integer.parseInt(rst.getString("ENABLED"));
                if(no==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEnabled(false);";
                }                
            }
            int apo=0;
            rst=st.executeQuery("SELECT * FROM LIST");
            while(rst.next()){
                a1=a1+"\n"+"   private JList "+rst.getString("NAME")+";";
                st1=conn.createStatement();
                rst1=st1.executeQuery("SELECT * FROM LISTITEMS WHERE NAME='"+rst.getString("NAME")+"'");
                
                if(rst1.next()){
                if(!rst1.getString("ITEM").equals("")){
                    a2=a2+"\n      String[] stringlist"+apo+"={";
                    a2=a2+"\""+rst1.getString("ITEM")+"\",";
                }
                while(rst1.next()){
                    if(rst1.last()){
                        a2=a2+"\""+rst1.getString("ITEM")+"\"";
                    }
                    else{
                        a2=a2+"\""+rst1.getString("ITEM")+"\",";
                    }
                }
                    a2=a2+"};";
                }
                else{
                    a2=a2+"\n      String[] stringlist"+apo+"={};";
                }
                a2=a2+"\n"+"      jp.add("+rst.getString("NAME")+"=new JList(stringlist"+apo+"));";
                a3=a3+"\n"+"      "+rst.getString("NAME")+".setBounds("+rst.getString("X")+","+rst.getString("Y")
                        +","+rst.getString("WIDTH")+","+rst.getString("HEIGHT")+");";                
                int no=Integer.parseInt(rst.getString("ENABLED"));
                if(no==2){
                    a4=a4+"\n      "+rst.getString("NAME")+".setEnabled(false);";
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}