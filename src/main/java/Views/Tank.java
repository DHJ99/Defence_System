
package Views;
import Controller.Observable;
import Controller.Observer;

public class Tank extends javax.swing.JFrame implements Observer {
    private Observable ob;
    private MainPage  main;
    private int value;

    public Tank(MainPage main, Observable ob) {
        this.ob=ob;
        this.main=main;
        
        initComponents();
        
        btnShoot.setEnabled(false);
        btnRotateShoot.setEnabled(false);
        btnMissileOp.setEnabled(false);
        btnRedarOp.setEnabled(false);
        setTitle("Tank");
        setVisible(true);
    }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider = new javax.swing.JSlider();
        lblSoldierCount = new javax.swing.JLabel();
        lblAmmoCount = new javax.swing.JLabel();
        txtMessageType = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        btnSend = new javax.swing.JButton();
        lblAreaClear = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnRotateShoot = new javax.swing.JButton();
        btnMissileOp = new javax.swing.JButton();
        btnRedarOp = new javax.swing.JButton();
        chkBtn = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessageView = new javax.swing.JTextArea();
        jSpinner3 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(10);
        jSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);
        jSlider.setValue(0);
        jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStateChanged(evt);
            }
        });

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoldierCount.setText("Soldier Count ");

        lblAmmoCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAmmoCount.setText("Ammo Count ");

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

        btnRotateShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRotateShoot.setText("Rotate Shooting");
        btnRotateShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateShootActionPerformed(evt);
            }
        });

        btnMissileOp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMissileOp.setText("Missile Operation");
        btnMissileOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileOpActionPerformed(evt);
            }
        });

        btnRedarOp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRedarOp.setText("Redar Operation");
        btnRedarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedarOpActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnMissileOp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(chkBtn)
                                .addComponent(lblAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRedarOp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnRotateShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtMessageType, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMissileOp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRedarOp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRotateShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(lblAmmoCount)
                                .addGap(18, 18, 18)
                                .addComponent(chkBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessageType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged
        int amount = jSlider.getValue();
        main.fuelAmt(amount);
    }//GEN-LAST:event_jSliderStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg1 = txtMessageType.getText();
        main.passSms("Tank : "+msg1);
        txtMessageView.append("Me : "+msg1 +"\n" );
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
         main.passBtnAction("Tank -> Shooting ");
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnRotateShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateShootActionPerformed
        main.passBtnAction("Tank -> Started Rotate Shoot  ");
    }//GEN-LAST:event_btnRotateShootActionPerformed

    private void btnMissileOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileOpActionPerformed
       main.passBtnAction("Tank -> Started Missile Operation  ");
    }//GEN-LAST:event_btnMissileOpActionPerformed

    private void btnRedarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedarOpActionPerformed
        main.passBtnAction("Tank -> Started Redar Operation  ");
    }//GEN-LAST:event_btnRedarOpActionPerformed

    private void chkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBtnActionPerformed
        if(chkBtn.isSelected()){
            main.possitionSelect("Tank -> Positioned ");
            updateOn();  
        }else{
            btnShoot.setEnabled(false);
            btnRotateShoot.setEnabled(false);
            btnMissileOp.setEnabled(false);
            btnRedarOp.setEnabled(false);
            main.possitionSelect("Tank -> Taking Position ");
        }
        
        
    }//GEN-LAST:event_chkBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMissileOp;
    private javax.swing.JButton btnRedarOp;
    private javax.swing.JButton btnRotateShoot;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox chkBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JLabel lblSoldierCount;
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
        txtMessageView.append("Main Controller : "+msg +"\n" );
    }

    @Override
    public void warStrength(int value) {
        this.value=value;
        if(chkBtn.isSelected()){
            updateOn();  
        }else{
            btnShoot.setEnabled(false);
            btnRotateShoot.setEnabled(false);
            btnMissileOp.setEnabled(false);
            btnRedarOp.setEnabled(false);
        }
             
    }
    
    public void updateOn(){
        if(value <40){
            btnShoot.setEnabled(false);
        }else if(value >=40){
            btnShoot.setEnabled(true);
        }
        if(value <50){
            btnMissileOp.setEnabled(false);
        }else if(value >=50){
            btnMissileOp.setEnabled(true);
        }
        if(value <60){
            btnRedarOp.setEnabled(false);
        }else if(value >=60){
            btnRedarOp.setEnabled(true);
        }
         if(value <70){
            btnRotateShoot.setEnabled(false);
        }else if(value >=70){
            btnRotateShoot.setEnabled(true);
        }
    }

    @Override
    public void updatePvtMsg(String msgPvt) {
        txtMessageView.append("Main Controller : "+msgPvt+"\n");
    }

    
}
