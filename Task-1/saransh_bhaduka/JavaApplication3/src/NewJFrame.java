import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public NewJFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JFrame();
        deluxeradio = new javax.swing.JRadioButton();
        semideluxeradio = new javax.swing.JRadioButton();
        ordinaryradio = new javax.swing.JRadioButton();
        guidecheckbox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        numberofdaysfeild = new javax.swing.JTextField();
        calculatebutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        amountfeild = new javax.swing.JTextField();
        guidefeild = new javax.swing.JTextField();
        totalfeild = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passfeild = new javax.swing.JPasswordField();
        okbutton = new javax.swing.JButton();

        buttonGroup1.add(deluxeradio);
        deluxeradio.setText("deluxe car");

        buttonGroup1.add(semideluxeradio);
        semideluxeradio.setText("semi deluxe car");

        buttonGroup1.add(ordinaryradio);
        ordinaryradio.setText("ordinary car");

        guidecheckbox.setText("guide required");

        jLabel3.setText("number of days required for");

        calculatebutton.setText("calculate");
        calculatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebuttonActionPerformed(evt);
            }
        });

        clearbutton.setText("clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        exitbutton.setText("exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        jLabel4.setText("amount");

        jLabel5.setText("guide charges");

        jLabel6.setText("total");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard.getContentPane());
        dashboard.getContentPane().setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ordinaryradio)
                            .addComponent(semideluxeradio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(guidecheckbox)
                        .addGap(69, 69, 69))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(deluxeradio)
                        .addContainerGap(311, Short.MAX_VALUE))))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberofdaysfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(calculatebutton))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(44, 44, 44)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(clearbutton)
                        .addGap(62, 62, 62)
                        .addComponent(exitbutton))
                    .addComponent(amountfeild, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(totalfeild)
                    .addComponent(guidefeild))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deluxeradio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semideluxeradio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordinaryradio))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(guidecheckbox)))
                .addGap(28, 28, 28)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numberofdaysfeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculatebutton)
                    .addComponent(clearbutton)
                    .addComponent(exitbutton))
                .addGap(35, 35, 35)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amountfeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(guidefeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(totalfeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel1.setText("ABC CAR RENTALS");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel2.setText("Enter password ");

        okbutton.setText("OK");
        okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(passfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(okbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(okbutton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbuttonActionPerformed
          String password =new String(passfeild.getPassword());
          if(password.equals("let me in"))
          {
                  this.dispose();
                  dashboard.setVisible(true);
          }
          else
          {
              JOptionPane.showMessageDialog(null, "wrong password");
          }
    }//GEN-LAST:event_okbuttonActionPerformed

    private void calculatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebuttonActionPerformed
       int x = Integer.parseInt(numberofdaysfeild.getText());
       int amount =0;
       if(deluxeradio.isSelected()){
           amount=x*1000;
       }
       else if(semideluxeradio.isSelected()){
           amount=x*800;
       }
       else if(ordinaryradio.isSelected()){
           amount=x*700;
       }
       int y=0;
       if(guidecheckbox.isSelected()){
           y=x*500;
       }
       int z=y+amount;
       amountfeild.setText(""+amount);
       guidefeild.setText(""+y);
       totalfeild.setText(""+z);
       
    }//GEN-LAST:event_calculatebuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        buttonGroup1.clearSelection();
        deluxeradio.setSelected(false);
        semideluxeradio.setSelected(false);
        ordinaryradio.setSelected(false);
        guidecheckbox.setSelected(false);
        amountfeild.setText("");
        guidefeild.setText("");
        totalfeild.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountfeild;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton calculatebutton;
    private javax.swing.JButton clearbutton;
    private javax.swing.JFrame dashboard;
    private javax.swing.JRadioButton deluxeradio;
    private javax.swing.JButton exitbutton;
    private javax.swing.JCheckBox guidecheckbox;
    private javax.swing.JTextField guidefeild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField numberofdaysfeild;
    private javax.swing.JButton okbutton;
    private javax.swing.JRadioButton ordinaryradio;
    private javax.swing.JPasswordField passfeild;
    private javax.swing.JRadioButton semideluxeradio;
    private javax.swing.JTextField totalfeild;
    // End of variables declaration//GEN-END:variables

}