package mypackage;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

public class f extends javax.swing.JFrame 
{
    String file="c";
    int counter=0,i=0,cq=0,min=0,sec=0;
    int marks[]={0,0,0,0,0,0,0,0,0,0};
    String ansrec[]={"","","","","","","","","",""};
    String strsec=null;
    String strmin=null;
    Date date = new Date();
    String ans=null;
    public f() 
     {   
        initComponents();
        l1.setVisible(false);
         l2.setVisible(false);
         stb.setVisible(false);
         adb.setVisible(false);
         tfstname.setVisible(false);
         tfadmin.setVisible(false);
        
        tfdate.setText("Logged in AT: "+date.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        root = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        tfstname = new javax.swing.JTextField();
        tfadmin = new javax.swing.JPasswordField();
        stb = new javax.swing.JButton();
        adb = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbs = new javax.swing.JRadioButton();
        rbad = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        adminpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        resultpanel = new javax.swing.JPanel();
        finalresult = new javax.swing.JTextField();
        finalresultname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        testpanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfans = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfq = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        opa = new javax.swing.JRadioButton();
        opb = new javax.swing.JRadioButton();
        opc = new javax.swing.JRadioButton();
        opd = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        bnext = new javax.swing.JButton();
        bnext1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        showtimer = new javax.swing.JTextField();
        tfqnum = new javax.swing.JTextField();
        tfdate = new javax.swing.JTextField();
        tfdate1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OnlineTest-Version2 ");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        root.setLayout(new java.awt.CardLayout());

        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setText("Admin");
        Home.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 40, -1));

        l1.setText("Student Name");
        Home.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        tfstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfstnameActionPerformed(evt);
            }
        });
        Home.add(tfstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 200, -1));
        Home.add(tfadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 200, -1));

        stb.setText("Start");
        stb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stbActionPerformed(evt);
            }
        });
        Home.add(stb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 140, -1));

        adb.setText("Login as Admin");
        adb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbActionPerformed(evt);
            }
        });
        Home.add(adb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 140, -1));

        l3.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        l3.setForeground(new java.awt.Color(102, 0, 0));
        l3.setText("ONLINE TEST SYSTEM");
        Home.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(161, 194, 208));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N

        buttonGroup1.add(rbs);
        rbs.setText("Student");
        rbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbad);
        rbad.setText("Admin");

        jButton1.setMnemonic('l');
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Login Mode");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        Home.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/back1.jpg"))); // NOI18N
        Home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        root.add(Home, "card2");

        adminpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/back1.jpg"))); // NOI18N
        adminpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 530, 190));

        root.add(adminpanel, "card2");

        resultpanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                resultpanelPropertyChange(evt);
            }
        });
        resultpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finalresult.setEditable(false);
        finalresult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        finalresult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finalresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalresultActionPerformed(evt);
            }
        });
        resultpanel.add(finalresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 60));

        finalresultname.setEditable(false);
        finalresultname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalresultnameActionPerformed(evt);
            }
        });
        resultpanel.add(finalresultname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 160, 30));

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Result");
        resultpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, 50));

        root.add(resultpanel, "card2");

        testpanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                testpanelPropertyChange(evt);
            }
        });
        testpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfans.setEditable(false);
        tfans.setColumns(10);
        tfans.setFont(new java.awt.Font("Century Schoolbook", 1, 16)); // NOI18N
        tfans.setForeground(new java.awt.Color(153, 0, 0));
        tfans.setRows(5);
        jScrollPane2.setViewportView(tfans);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        testpanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 540, 180));

        tfq.setEditable(false);
        tfq.setColumns(20);
        tfq.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        tfq.setForeground(new java.awt.Color(102, 0, 0));
        tfq.setRows(5);
        jScrollPane1.setViewportView(tfq);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        testpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 770, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Correct Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Footlight MT Light", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        buttonGroup2.add(opa);
        opa.setText("A");

        buttonGroup2.add(opb);
        opb.setText("B");

        buttonGroup2.add(opc);
        opc.setText("C");

        buttonGroup2.add(opd);
        opd.setText("D");

        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bnext.setText("Next");
        bnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnextActionPerformed(evt);
            }
        });

        bnext1.setText("Prev");
        bnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnext1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opc)
                    .addComponent(opb)
                    .addComponent(opd)
                    .addComponent(opa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnext1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnext1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(opa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opd)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        testpanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 180, 190));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jButton5.setText("First");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);

        jButton7.setText("Last");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);

        jButton11.setText("End Test");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11);

        jButton10.setText("Set Invalid");
        jPanel5.add(jButton10);

        testpanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 530, 30));

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel6.add(b1);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel6.add(b2);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel6.add(b3);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel6.add(b4);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel6.add(b5);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel6.add(b6);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel6.add(b7);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel6.add(b8);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel6.add(b9);

        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel6.add(b10);

        testpanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 620, 30));

        showtimer.setEditable(false);
        showtimer.setBackground(new java.awt.Color(234, 246, 36));
        showtimer.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        showtimer.setForeground(new java.awt.Color(136, 22, 22));
        showtimer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        showtimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtimerActionPerformed(evt);
            }
        });
        testpanel.add(showtimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 10, 70, 50));

        tfqnum.setEditable(false);
        tfqnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfqnum.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tfqnumPropertyChange(evt);
            }
        });
        testpanel.add(tfqnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 53, 50));

        root.add(testpanel, "card2");

        tfdate.setEditable(false);
        tfdate.setBackground(new java.awt.Color(204, 204, 255));
        tfdate.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        tfdate.setForeground(new java.awt.Color(0, 51, 51));
        tfdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdateActionPerformed(evt);
            }
        });

        tfdate1.setEditable(false);
        tfdate1.setBackground(new java.awt.Color(204, 204, 255));
        tfdate1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        tfdate1.setForeground(new java.awt.Color(0, 51, 51));
        tfdate1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdate1.setText("Project By Rushikesh Solanke");
        tfdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tfdate, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       void jumptopanel(JPanel p1)
   {
        root.removeAll();
        root.add(p1);
        root.repaint();
        root.revalidate();
   }
   
   void displayq(int i)
      {
           file f=new file();
           String n,n1,n2;
           n=f.getq(i);
           n1=f.getans(i);
           n2=f.getop(i);
           tfq.setText(n);
           tfans.setText(n1);
           ans=n2;
           ansrec[i]=ans;
}      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(rbs.isSelected())
        {l1.setVisible(true);
         l2.setVisible(false);
        
         stb.setVisible(true);
         adb.setVisible(false);
         tfstname.setVisible(true);
         tfadmin.setVisible(false);
        }
       if(rbad.isSelected())
        {l1.setVisible(false);
         l2.setVisible(true);
        
         stb.setVisible(false);
         adb.setVisible(true);
         tfstname.setVisible(false);
         tfadmin.setVisible(true);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    void starttimer()
{
      Timer timer = new Timer();      //new timer
        counter = 65;                   //setting the counter to 10 sec
        TimerTask task = new TimerTask() {         
            public void run() {
                int i=0,sum=0;
                min=counter/60;
                sec=counter%60;
                strsec=Integer.toString(sec);
                strmin=Integer.toString(min);
                        showtimer.setText(strmin+":"+strsec);
                counter --;
                if (counter == -1)
                {
                timer.cancel();   
                 
                for(i=0;i<10;i++)
                {
                    sum=sum+marks[i];
                }
                finalresult.setText(""+sum+"/10");
                jumptopanel(resultpanel);
                
                } 
                else if(counter==60)
                {
                  showtimer.setBackground(Color.red);
                }
                
            }
        };
    timer.scheduleAtFixedRate(task, 1000, 1000);

}
   
    private void stbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stbActionPerformed
        // TODO add your handling code here:
        finalresultname.setText(tfstname.getText());
        jumptopanel(testpanel);  
        starttimer();
        
        tfqnum.setText(""+(cq+1));
        displayq(cq);
    }//GEN-LAST:event_stbActionPerformed

    private void rbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbsActionPerformed

    private void adbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_adbActionPerformed

    private void bnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnextActionPerformed
        // TODO add your handling code here:
        if(cq<9)
         {
             ++cq; 
             tfqnum.setText(""+(cq+1));
             displayq(cq);
               
         }
         else
         {
          tfqnum.setText(""+(cq+1));
          displayq(9);
         }
         
    }//GEN-LAST:event_bnextActionPerformed
void getcolored(int i)
{
    if(i==0)  
    b1.setBackground(Color.red);
    if(i==1)  
    b2.setBackground(Color.red);
    if(i==2)  
    b3.setBackground(Color.red);
    if(i==3)  
    b4.setBackground(Color.red);
    if(i==4)  
    b5.setBackground(Color.red);
    if(i==5)  
    b6.setBackground(Color.red);
    if(i==6)  
    b7.setBackground(Color.red);
    if(i==7)  
    b8.setBackground(Color.red);
    if(i==8)  
    b9.setBackground(Color.red);
    if(i==9)  
    b10.setBackground(Color.red);
   
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:    
        if(ans.endsWith("A")  && opa.isSelected())
        marks[cq]=1;
        else if(ans.endsWith("B")  && opb.isSelected())
             marks[cq]=1;
        else if(ans.endsWith("C")  && opc.isSelected())
             marks[cq]=1;
        else if(ans.endsWith("D")  && opd.isSelected())
             marks[cq]=1;
        else
            marks[cq]=0;
        
        System.out.println("Marks of Q "+(cq+1)+":"+marks[cq]);
        getcolored(cq);
        
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void testpanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_testpanelPropertyChange
        // TODO add your handling code here:
   
    }//GEN-LAST:event_testpanelPropertyChange

    private void resultpanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_resultpanelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_resultpanelPropertyChange

    private void bnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnext1ActionPerformed
        // TODO add your handling code here:
        if(cq>=1)
         {
             cq=cq-1;
             displayq(cq);         
         }
        else
        {   cq=0;
            displayq(cq); 
        }
          tfqnum.setText(""+(cq+1));
      
    }//GEN-LAST:event_bnext1ActionPerformed

    private void tfqnumPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tfqnumPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tfqnumPropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         cq=0;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        cq=9;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
         cq=0;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        cq=1;
        
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         cq=2;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here: 
        cq=3;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         cq=4;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         cq=5;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         cq=6;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         cq=7;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         cq=8;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
         cq=9;
         displayq(cq);
          tfqnum.setText(""+(cq+1));
    }//GEN-LAST:event_b10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int i=0,sum=0;
        for(i=0;i<10;i++)
        {
        System.out.print(" "+i);
        System.out.print(" "+ansrec[i]);
        System.out.print(" "+marks[i]); 
        System.out.print("\n");
        sum=sum+marks[i];
        }
        
        jumptopanel(resultpanel);
        finalresult.setText(""+sum+"/10");
          
    }//GEN-LAST:event_jButton11ActionPerformed

    private void showtimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showtimerActionPerformed

    private void tfstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfstnameActionPerformed

    private void finalresultnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalresultnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalresultnameActionPerformed

    private void finalresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalresultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalresultActionPerformed

    private void tfdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdateActionPerformed

    private void tfdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdate1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new f().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JButton adb;
    private javax.swing.JPanel adminpanel;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bnext;
    private javax.swing.JButton bnext1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField finalresult;
    private javax.swing.JTextField finalresultname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JRadioButton opa;
    private javax.swing.JRadioButton opb;
    private javax.swing.JRadioButton opc;
    private javax.swing.JRadioButton opd;
    private javax.swing.JRadioButton rbad;
    private javax.swing.JRadioButton rbs;
    private javax.swing.JPanel resultpanel;
    private javax.swing.JPanel root;
    private javax.swing.JTextField showtimer;
    private javax.swing.JButton stb;
    private javax.swing.JPanel testpanel;
    private javax.swing.JPasswordField tfadmin;
    private javax.swing.JTextArea tfans;
    private javax.swing.JTextField tfdate;
    private javax.swing.JTextField tfdate1;
    private javax.swing.JTextArea tfq;
    private javax.swing.JTextField tfqnum;
    private javax.swing.JTextField tfstname;
    // End of variables declaration//GEN-END:variables
}
