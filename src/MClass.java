import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MClass extends javax.swing.JFrame {
    JButton[] jb=new JButton[100];
    JLabel[] jl=new JLabel[100];
    JTextField[] jtf=new JTextField[100];
    JTextArea[] jta=new JTextArea[100];
    JRadioButton[] jrb=new JRadioButton[100];
    JCheckBox[] jcb=new JCheckBox[100];
    JComboBox[] jcombo=new JComboBox[100];
    JList[] jlist=new JList[100];
    DefaultComboBoxModel[] dcb=new DefaultComboBoxModel[100];
    DefaultListModel[] dlm=new DefaultListModel[100];
    ButtonGroup bg1,bg2;
    public int but=0,x=0,lab=0,tex=0,texa=0,rb=0,cb=0,comb=0,list=0;
    JButton tem;
    JLabel temp;
    JTextField tempr;
    JTextArea temps;
    JRadioButton tempo;
    JCheckBox tempro;
    JComboBox tempre;
    JList temproe;
    ButtonUI bu=null;
    LabelUI la=null;
    TextFieldUI te=null;
    TextAreaUI tea=null;
    RadioButtonUI rad=null;
    CheckBoxUI chb=null;
    ComboBoxUI cbu=null;
    ListUI lu=null;
    Connection conn=null;
    Statement st=null;
    ResultSet rst=null;        
    Border border,border1;    

    public MClass() {
        initComponents();
        jdbc();
        bg1=new ButtonGroup();
        bg2=new ButtonGroup();
    }

   
    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton = new javax.swing.JButton();
        jLabel = new javax.swing.JButton();
        jTextField = new javax.swing.JButton();
        jTextArea = new javax.swing.JButton();
        jRadioButton = new javax.swing.JButton();
        jComboBox = new javax.swing.JButton();
        jCheckBox = new javax.swing.JButton();
        jList = new javax.swing.JButton();
        SRC = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setTitle("VICKY GENIE");

        jInternalFrame1.setVisible(true);
        jInternalFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInternalFrame1MouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().setLayout(null);

        jButton.setText("jButton");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jLabel.setText("jLabel");
        jLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelActionPerformed(evt);
            }
        });

        jTextField.setText("jTextField");
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jTextArea.setText("jTextArea");
        jTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAreaActionPerformed(evt);
            }
        });

        jRadioButton.setText("jRadioButton");
        jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonActionPerformed(evt);
            }
        });

        jComboBox.setText("jComboBox");
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jCheckBox.setText("jCheckBox");
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });

        jList.setText("jList");
        jList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListActionPerformed(evt);
            }
        });

        SRC.setText("SRC");
        SRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRCActionPerformed(evt);
            }
        });

        jButton1.setText("QUIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jRadioButton)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jButton1)
                                .add(SRC))
                            .add(13, 13, 13)))
                    .add(jButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jComboBox, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jList, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jTextArea, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(jInternalFrame1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton)
                    .add(jLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextField)
                    .add(jTextArea))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButton)
                    .add(jComboBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCheckBox)
                    .add(jList))
                .add(66, 66, 66)
                .add(SRC)
                .add(29, 29, 29)
                .add(jButton1)
                .addContainerGap(78, Short.MAX_VALUE))
            .add(jInternalFrame1)
        );

        pack();
    }// </editor-fold>
    
    private void jdbc(){
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
     public void input1(JButton inp){
         JButton inpu=inp;
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO BUTTON(NAME,TEXT,X,Y,WIDTH,HEIGHT,ENABLED,ACTIONL) VALUES('"+inpu.getText()+"','"+inpu.getText()+"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1,'NAL')";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     
     public void input2(JLabel inp){
         JLabel inpu=inp;
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO LABEL VALUES('"+inpu.getText()+"','"+inpu.getText()+"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1)";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     
     public void input3(JTextField inp){
         JTextField inpu=inp;
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO TEXTFIELD VALUES('"+inpu.getText()+"','"+inpu.getText()+"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1,1)";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     
     public void input4(JTextArea inp){
         JTextArea inpu=inp;
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO TEXTAREA VALUES('"+inpu.getText()+"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1,1,'"+inpu.getText()+"')";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     public void input5(JRadioButton inp){
         JRadioButton inpu=inp;
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO RADIOBUTTON VALUES('"+inpu.getText()+"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1,2,'"+inpu.getText()+"','Group1')";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     public void input6(JCheckBox inp){
         JCheckBox inpu=inp;
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO CHECKBOX VALUES('"+inpu.getText()+"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1,2,'"+inpu.getText()+"','CGroup1')";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     public void input7(JComboBox inp){
         JComboBox inpu=inp;
         ComboBoxModel dcbb=inpu.getModel();
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO COMBOBOX VALUES('"+dcbb.getElementAt(0) +"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1,'"+dcbb.getElementAt(0) +"')";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     
     public void input8(JList inp){
         JList inpu=inp;
         ListModel dcbb=inpu.getModel();
         try{
            st=conn.createStatement();
            String SQL="INSERT INTO LIST VALUES('"+dcbb.getElementAt(0) +"',"+
                    inpu.getX()+","+inpu.getY()+","+inpu.getWidth()+","+inpu.getHeight()+",1,'"+dcbb.getElementAt(0) +"')";
            st.executeUpdate(SQL);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     
     private void SRCActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
         new SRC().setVisible(true);
    }                                        

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {
       
        x=1;
    }

    private void jLabelActionPerformed(java.awt.event.ActionEvent evt) {
       
        x=2;
    }

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
       
        x=3;
    }

    private void jTextAreaActionPerformed(java.awt.event.ActionEvent evt) {
       
        x=4;
    }

    private void jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
       
        x=5;
    }

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
       
        x=7;
    }

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
     
        x=6;
    }

    private void jListActionPerformed(java.awt.event.ActionEvent evt) {
       
        x=8;
    }
    
     private void jInternalFrame1MouseClicked(java.awt.event.MouseEvent evt) {
        
        PointerInfo a=MouseInfo.getPointerInfo();
         if(x==1){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jb[but]=new JButton();
             jInternalFrame1.add(jb[but]);
             jb[but].setText("jButton"+but);
             jb[but].setBounds(xc-255,yc-71,100,25);
             input1(jb[but]);
         
             MouseAdapter buttonmouse=new MouseAdapter(){
                 public void mousePressed(MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                         JButton jbutton=(JButton)e.getSource();
                         if(bu!=null){
                             bu.dispose();
                         }
                             bu=new ButtonUI(jbutton);
                     }
                     if (e.getClickCount()==2){
                         JButton jbutton=(JButton)e.getSource();
                         Actionlistener al=new Actionlistener(jbutton);
                         al.setVisible(true);
                     }
                         
                 }
                 
                 public void mouseClicked(MouseEvent e){
                     x=-1;
                     tem=(JButton)e.getSource();
                 }
             };
             jb[but].addMouseListener(buttonmouse);
             
             
             but++;
          }
         else if(x==2){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jl[lab]=new JLabel();
             jInternalFrame1.add(jl[lab]);
             jl[lab].setText("jLabel"+lab);
             jl[lab].setBounds(xc-255,yc-71,50,25);
             input2(jl[lab]);
             
             jl[lab].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                    JLabel jlabel=(JLabel)e.getSource();
                    if(la!=null){
                        la.dispose();
                    }
                    la=new LabelUI(jlabel);
                    }
                     if (e.getClickCount()==2){
                         
                     }
                    
                }
                public void mouseClicked(MouseEvent e){
                     x=-2;
                     temp=(JLabel)e.getSource();
                 }
                public void mouseEntered(MouseEvent e){
                      border=javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0));
                      JLabel jlabel1=(JLabel)e.getSource();
                      jlabel1.setBorder(border);
                }
                public void mouseExited(MouseEvent e){
                    JLabel jlabel2=(JLabel)e.getSource();
                    jlabel2.setBorder(null);
                }
             });
             lab++;
         }
         else if(x==3){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jtf[tex]=new JTextField();
             jtf[tex].setEditable(false);
             jInternalFrame1.add(jtf[tex]);
             jtf[tex].setText("jTextField"+tex);
             jtf[tex].setBounds(xc-255,yc-71,100,25);
             input3(jtf[tex]);
         
             MouseAdapter textmouse=new MouseAdapter(){
                 public void mousePressed(MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                         JTextField jtextfield=(JTextField)e.getSource();
                         if(te!=null){
                             te.dispose();
                         }
                             te=new TextFieldUI(jtextfield);
                     }
                     if (e.getClickCount()==2){
                         
                     }       
                 }
                 
                 public void mouseClicked(MouseEvent e){
                     x=-3;
                     tempr=(JTextField)e.getSource();
                 }
             };
             jtf[tex].addMouseListener(textmouse);
             
             
             tex++;
         }
         else if(x==4){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jta[texa]=new JTextArea();
             jta[texa].setEditable(false);
             jInternalFrame1.add(jta[texa]);
             jta[texa].setBounds(xc-255,yc-71,100,100);
             jta[texa].setText("jTextArea"+texa);
             input4(jta[texa]);
         
             MouseAdapter textamouse=new MouseAdapter(){
                 public void mousePressed(MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                         JTextArea jtextarea=(JTextArea)e.getSource();
                         if(tea!=null){
                             tea.dispose();
                         }
                         tea=new TextAreaUI(jtextarea);
                     }
                     if (e.getClickCount()==2){
                         
                     }       
                 }
                 
                 public void mouseClicked(MouseEvent e){
                     x=-4;
                     temps=(JTextArea)e.getSource();
                 }
             };
             jta[texa].addMouseListener(textamouse);
             texa++;
         }
         else if(x==5){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jrb[rb]=new JRadioButton();
             jInternalFrame1.add(jrb[rb]);
             jrb[rb].setBounds(xc-255,yc-71,125,25);
             bg1.add(jrb[rb]);
             jrb[rb].setText("jRadioButton"+rb);
             input5(jrb[rb]);
         
             MouseAdapter radiomouse=new MouseAdapter(){
                 public void mousePressed(MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                         JRadioButton jradio=(JRadioButton)e.getSource();
                         if(rad!=null){
                             rad.dispose();
                         }
                         rad=new RadioButtonUI(jradio);
                     }
                     if (e.getClickCount()==2){
                         
                     }       
                 }
                 
                 public void mouseClicked(MouseEvent e){
                     x=-5;
                     tempo=(JRadioButton)e.getSource();
                 }
                 
             };
         jrb[rb].addMouseListener(radiomouse);
             rb++;
         }
         else if(x==6){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jcb[cb]=new JCheckBox();
             jInternalFrame1.add(jcb[cb]);
             jcb[cb].setBounds(xc-255,yc-71,125,25);
             bg2.add(jcb[cb]);
             jcb[cb].setText("jCheckBox"+cb);
             input6(jcb[cb]);
         
             MouseAdapter checkmouse=new MouseAdapter(){
                 public void mousePressed(MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                         JCheckBox jcheck=(JCheckBox)e.getSource();
                         if(chb!=null){
                             chb.dispose();
                         }
                         chb=new CheckBoxUI(jcheck);
                     }
                     if (e.getClickCount()==2){
                         
                     }       
                 }
                 
                 public void mouseClicked(MouseEvent e){
                     x=-6;
                     tempro=(JCheckBox)e.getSource();
                 }
             };
             jcb[cb].addMouseListener(checkmouse);
             cb++;
         }
         else if(x==7){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jcombo[comb]=new JComboBox();
             jInternalFrame1.add(jcombo[comb]);
             jcombo[comb].setModel(dcb[comb]=new DefaultComboBoxModel());
             dcb[comb].addElement("jComboBox"+comb);
             jcombo[comb].setBounds(xc-255,yc-71,110,25);
             input7(jcombo[comb]);
         
             MouseAdapter combomouse=new MouseAdapter(){
                 public void mousePressed(MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                         JComboBox jcombo=(JComboBox)e.getSource();
                         if(cbu!=null){
                             cbu.dispose();
                         }
                         cbu=new ComboBoxUI(jcombo);
                     }
                     if (e.getClickCount()==2){
                         
                     }       
                 }
                 
                 public void mouseClicked(MouseEvent e){
                     x=-7;
                     tempre=(JComboBox)e.getSource();
                 }
             };
             jcombo[comb].addMouseListener(combomouse);
             comb++;
         }
         else if(x==8){
             Point b=a.getLocation();
             int xc=(int)b.getX();
             int yc=(int)b.getY();
             jlist[list]=new JList();
             jInternalFrame1.add(jlist[list]);
             jlist[list].setModel(dlm[list]=new DefaultListModel());
             dlm[list].addElement("jList"+comb);
             jlist[list].setBounds(xc-255,yc-71,50,100);
             input8(jlist[list]);
         
             MouseAdapter listmouse=new MouseAdapter(){
                 public void mousePressed(MouseEvent e) {
                     if (e.getButton()==MouseEvent.BUTTON3){
                         JList jl=(JList)e.getSource();
                         if(lu!=null){
                             lu.dispose();
                         }
                         lu=new ListUI(jl);
                     }
                     if (e.getClickCount()==2){
                         
                     }       
                 }
                 
                 public void mouseClicked(MouseEvent e){
                     x=-8;
                     temproe=(JList)e.getSource();
                 }
             };
             jlist[list].addMouseListener(listmouse);
             list++;
         }
         
         if(x==-1){
             PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=tem.getWidth();
             int height=tem.getHeight();
             tem.setBounds(x-255,y-71,width,height);
             try{
                st=conn.createStatement();
                st.executeUpdate("UPDATE BUTTON SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+tem.getText()+"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         if(x==-2){
             PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=temp.getWidth();
             int height=temp.getHeight();
             temp.setBounds(x-255,y-71,width,height);
             try{
                st=conn.createStatement();
                st.executeUpdate("UPDATE LABEL SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+temp.getText()+"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         if(x==-3){
             PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=tempr.getWidth();
             int height=tempr.getHeight();
             tempr.setBounds(x-255,y-71,width,height);
             try{
                st=conn.createStatement();
                st.executeUpdate("UPDATE TEXTFIELD SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+tempr.getText()+"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         if(x==-4){
             PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=temps.getWidth();
             int height=temps.getHeight();
             temps.setBounds(x-255,y-71,width,height);
             try{
                st=conn.createStatement();
                st.executeUpdate("UPDATE TEXTAREA SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+temps.getText()+"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         if(x==-5){
             PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=tempo.getWidth();
             int height=tempo.getHeight();
             tempo.setBounds(x-255,y-71,width,height);
             try{
                st=conn.createStatement();
                st.executeUpdate("UPDATE RADIOBUTTON SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+tempo.getText()+"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         if(x==-6){
             PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=tempro.getWidth();
             int height=tempro.getHeight();
             tempro.setBounds(x-255,y-71,width,height);
             try{
                st=conn.createStatement();
                st.executeUpdate("UPDATE CHECKBOX SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+tempro.getText()+"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         if(x==-7){
             PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=tempre.getWidth();
             int height=tempre.getHeight();
             tempre.setBounds(x-255,y-71,width,height);
             try{
                ListModel l=tempre.getModel();
                st=conn.createStatement();
                st.executeUpdate("UPDATE COMBOBOX SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+l.getElementAt(0) +"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         if(x==-8){
              PointerInfo c=MouseInfo.getPointerInfo();
             Point p=c.getLocation();
             int x=(int)p.getX();
             int y=(int)p.getY();
             int width=temproe.getWidth();
             int height=temproe.getHeight();
             temproe.setBounds(x-255,y-71,width,height);
             try{
                ListModel l=temproe.getModel();
                st=conn.createStatement();
                st.executeUpdate("UPDATE LIST SET X="+(x-255)+", Y="+(y-71)+" WHERE TEXT='"+l.getElementAt(0) +"'");
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e.getMessage());
             }
         }
         x=0;
    }
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         jdbc();
         try{
             st=conn.createStatement();
             st.executeUpdate("DELETE FROM BUTTON");
             st.executeUpdate("DELETE FROM LABEL");
             st.executeUpdate("DELETE FROM TEXTFIELD");
             st.executeUpdate("DELETE FROM TEXTAREA");
             st.executeUpdate("DELETE FROM RADIOBUTTON");
             st.executeUpdate("DELETE FROM CHECKBOX");
             st.executeUpdate("DELETE FROM COMBOBOX");
             st.executeUpdate("DELETE FROM COMBOITEMS");
             st.executeUpdate("DELETE FROM LIST");
             st.executeUpdate("DELETE FROM LISTITEMS");
             rst.close();
             st.close();
             conn.close();
             System.exit(0);
         }
         catch(Exception e){
             System.exit(0);
         }
    }
     
   
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MClass().setVisible(true);
            }
        });
    }
   
    private javax.swing.JButton jButton;
    private javax.swing.JButton SRC;
    private javax.swing.JButton jCheckBox;
    private javax.swing.JButton jList;
    private javax.swing.JButton jComboBox;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton jLabel;
    private javax.swing.JButton jRadioButton;
    private javax.swing.JButton jTextArea;
    private javax.swing.JButton jTextField;
    private javax.swing.JButton jButton1;
  
}