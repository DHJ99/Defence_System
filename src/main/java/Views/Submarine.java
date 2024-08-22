
package Views;
import Controller.Observable;
import Controller.Observer;

public class Submarine extends javax.swing.JFrame implements Observer {
    private  Observable ob;
    private MainPage  main;
    private int value;
    
    public Submarine(MainPage main, Observable ob) {
        this.ob=ob;
        this.main=main;
        
        initComponents();
        
        
        btnShoot.setEnabled(false);
        btnTridentShoot.setEnabled(false);
        btnSonarOp.setEnabled(false);
        btnTomahawkOp.setEnabled(false);
        setTitle("Submarine");
        setVisible(true);
        
        
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider2 = new javax.swing.JSlider();
        btnTomahawkOp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        lblSoldierCount1 = new javax.swing.JLabel();
        lblAmmoCount1 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        lblAreaClear = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        btnShoot = new javax.swing.JButton();
        txtMessageType = new javax.swing.JTextField();
        btnTridentShoot = new javax.swing.JButton();
        jSpinner4 = new javax.swing.JSpinner();
        btnSonarOp = new javax.swing.JButton();
        chkBtn = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessageView = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        btnTomahawkOp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTomahawkOp.setText("Tomahawk Operation");
        btnTomahawkOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawkOpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Energy");

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Oxigen");

        lblSoldierCount1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoldierCount1.setText("Soldier Count ");

        lblAmmoCount1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAmmoCount1.setText("Ammo Count ");

        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setText("SEND");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblAreaClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaClear.setText("Area Not Clear");

        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnTridentShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTridentShoot.setText("Trident-2 Shooting");
        btnTridentShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentShootActionPerformed(evt);
            }
        });

        btnSonarOp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSonarOp.setText("Sonar Operation");
        btnSonarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarOpActionPerformed(evt);
            }
        });

        chkBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkBtn.setText("Position");
        chkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBtnActionPerformed(evt);
            }
        });

        txtMessageView.setColumns(20);
        txtMessageView.setRows(5);
        jScrollPane1.setViewportView(txtMessageView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(lblSoldierCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(btnSonarOp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTomahawkOp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(btnTridentShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAmmoCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkBtn)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMessageType, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoldierCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSonarOp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTomahawkOp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTridentShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblAmmoCount1)
                                .addGap(31, 31, 31)
                                .addComponent(chkBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMessageType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        System.out.println(jSlider2.getValue());
    }//GEN-LAST:event_jSlider2StateChanged

    private void btnTomahawkOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawkOpActionPerformed
       main.passBtnAction("Submarine -> Started Tomahawk Operation");
    }//GEN-LAST:event_btnTomahawkOpActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        System.out.println(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg1 = txtMessageType.getText();
        main.passSms("Submarine :"+msg1);
        txtMessageView.append("Me : "+msg1 +"\n" );
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        main.passBtnAction("Submarine -> Shooting ");    
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnTridentShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTridentShootActionPerformed
        main.passBtnAction("Submarine -> Started Trident-2 Shooting ");
    }//GEN-LAST:event_btnTridentShootActionPerformed

    private void btnSonarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarOpActionPerformed
        main.passBtnAction("Submarine -> Started Sonar Operation");
    }//GEN-LAST:event_btnSonarOpActionPerformed

    private void chkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBtnActionPerformed
       if(chkBtn.isSelected()){
            main.possitionSelect("Submarine -> Positioned ");
            updateOn();
        }else{
            btnShoot.setEnabled(false);
            btnSonarOp.setEnabled(false);
            btnTomahawkOp.setEnabled(false);
            btnTridentShoot.setEnabled(false);
            main.possitionSelect("Submarine -> Taking the Position ");
        }
        
    }//GEN-LAST:event_chkBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonarOp;
    private javax.swing.JButton btnTomahawkOp;
    private javax.swing.JButton btnTridentShoot;
    private javax.swing.JCheckBox chkBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JLabel lblAmmoCount1;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JLabel lblSoldierCount1;
    private javax.swing.JTextField txtMessageType;
    private javax.swing.JTextArea txtMessageView;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaMsg(boolean value) {
         if(value==false){
             lblAreaClear.setText("Area Not Clear");
        }
        else if(value==true){
            lblAreaClear.setText("Area Clear");
            
        }
    }


    @Override
    public void updateMsg(String msg) {
        txtMessageView.append("Main Controller : "+msg+"\n");
       
    }

    @Override
    public void warStrength(int value) {
        this.value=value;
        if(chkBtn.isSelected()){
            updateOn();  
        }else{
            btnShoot.setEnabled(false);
            btnSonarOp.setEnabled(false);
            btnTomahawkOp.setEnabled(false);
            btnTridentShoot.setEnabled(false);
        }
        
    }
    public void updateOn(){
        if(value <40){
            btnShoot.setEnabled(false);
        }else if(value >=40){
            btnShoot.setEnabled(true);
        }
        if(value <50){
            btnSonarOp.setEnabled(false);
        }else if(value >=50){
            btnSonarOp.setEnabled(true);
        }
        if(value <60){
            btnTomahawkOp.setEnabled(false);
        }else if(value >=60){
            btnTomahawkOp.setEnabled(true);
        }
         if(value <70){
            btnTridentShoot.setEnabled(false);
        }else if(value >=70){
            btnTridentShoot.setEnabled(true);
        }
    }

    @Override
    public void updatePvtMsg(String msg) {
        txtMessageView.append("Main Controller : "+msg+"\n");
    }
}
