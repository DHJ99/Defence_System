
package Views;

import Controller.Observable;
import Controller.Observer;

public class Helicopter extends javax.swing.JFrame implements Observer {
    private  Observable ob;
    private MainPage main;
    private int value;

    public Helicopter( MainPage main, Observable ob) {
        this.ob=ob;
        this.main=main;
        
        initComponents();
        
        btnShoot.setEnabled(false);
        btnLaserOp.setEnabled(false);
        btnMissileOp.setEnabled(false);
        setTitle("Helicopter");
        setVisible(true);
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        lblAreaClear = new javax.swing.JLabel();
        txtMessageType = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnShoot = new javax.swing.JButton();
        jSlider = new javax.swing.JSlider();
        btnMissileOp = new javax.swing.JButton();
        btnLaserOp = new javax.swing.JButton();
        lblSoldierCount = new javax.swing.JLabel();
        lblAmmoCount = new javax.swing.JLabel();
        chkBtn = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessageView = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblAreaClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAreaClear.setText("Area Not Clear");

        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setText("SEND");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(10);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);
        jSlider.setSnapToTicks(true);
        jSlider.setValue(0);
        jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStateChanged(evt);
            }
        });

        btnMissileOp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMissileOp.setText("Missile Operation");
        btnMissileOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileOpActionPerformed(evt);
            }
        });

        btnLaserOp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLaserOp.setText("Laser Operation");
        btnLaserOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserOpActionPerformed(evt);
            }
        });

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoldierCount.setText("Soldier Count ");

        lblAmmoCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAmmoCount.setText("Ammo Count ");

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
                        .addComponent(txtMessageType, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLaserOp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMissileOp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jSpinner2))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
                                            .addComponent(chkBtn))
                                        .addGap(17, 17, 17))
                                    .addComponent(jSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMissileOp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAmmoCount)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkBtn)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLaserOp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMessageType, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg1 = txtMessageType.getText();
        main.passSms("Helicopter :"+msg1);
        txtMessageView.append("Me : "+msg1 +"\n" );
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        main.passBtnAction("Helicopter -> Shooting ");
    }//GEN-LAST:event_btnShootActionPerformed

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged
        
    }//GEN-LAST:event_jSliderStateChanged

    private void btnMissileOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileOpActionPerformed
        main.passBtnAction("Helicopter -> Started Missile Operation  ");
    }//GEN-LAST:event_btnMissileOpActionPerformed

    private void btnLaserOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserOpActionPerformed
        main.passBtnAction("Helicopter -> Started Laser Operation  ");
    }//GEN-LAST:event_btnLaserOpActionPerformed

    private void chkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBtnActionPerformed
        if(chkBtn.isSelected()){
            main.possitionSelect("Helicopter -> Positioned ");
            updateOn();
        }else{
            btnShoot.setEnabled(false);
            btnLaserOp.setEnabled(false);
            btnMissileOp.setEnabled(false);
            main.possitionSelect("Helicopter -> Taking the Position ");
        }
        
        
    }//GEN-LAST:event_chkBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaserOp;
    private javax.swing.JButton btnMissileOp;
    public javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox chkBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JLabel lblSoldierCount;
    public javax.swing.JTextField txtMessageType;
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
            btnLaserOp.setEnabled(false);
            btnMissileOp.setEnabled(false);
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
            btnLaserOp.setEnabled(false);
        }else if(value >=60){
            btnLaserOp.setEnabled(true);   
        }
    }

    @Override
    public void updatePvtMsg(String msg) {
        txtMessageView.append("Main Controller : "+msg+"\n");
    }

    
}
