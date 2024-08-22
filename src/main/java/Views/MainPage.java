
package Views;

import Controller.Observable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends javax.swing.JFrame {
    private Observable ob;
   // private String name;

    public MainPage(Observable ob) {
        this.ob=ob;
        
        initComponents();
        setTitle("Main Page");
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectCmb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSend = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaRecive = new javax.swing.JTextArea();
        lblSoldierCount = new javax.swing.JLabel();
        lblFuelAmount = new javax.swing.JLabel();
        lblAmmoAmount = new javax.swing.JLabel();
        chkArea = new javax.swing.JCheckBox();
        chkSendPrivate = new javax.swing.JCheckBox();
        jSlider = new javax.swing.JSlider();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnCollect = new javax.swing.JButton();
        txtFuelAmt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        selectCmb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence All", "Helicopter", "Tank", "Submarine" }));
        selectCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCmbActionPerformed(evt);
            }
        });

        txtAreaSend.setColumns(20);
        txtAreaSend.setRows(5);
        jScrollPane1.setViewportView(txtAreaSend);

        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtAreaRecive.setColumns(20);
        txtAreaRecive.setRows(5);
        jScrollPane2.setViewportView(txtAreaRecive);

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSoldierCount.setText("Soldier Count");

        lblFuelAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFuelAmount.setText("Fuel Amount");

        lblAmmoAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAmmoAmount.setText("Ammo Amount");

        chkArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkArea.setText("Area Clear");
        chkArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAreaActionPerformed(evt);
            }
        });

        chkSendPrivate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkSendPrivate.setText("Send Private");
        chkSendPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSendPrivateActionPerformed(evt);
            }
        });

        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(10);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);
        jSlider.setValue(0);
        jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStateChanged(evt);
            }
        });

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane3.setViewportView(txtMessage);

        btnCollect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCollect.setText("Collect Info");
        btnCollect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectActionPerformed(evt);
            }
        });

        txtFuelAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuelAmtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(selectCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnCollect)
                        .addGap(76, 76, 76)
                        .addComponent(chkArea))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAmmoAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFuelAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkSendPrivate)
                            .addComponent(btnSend)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnCollect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(chkArea)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkSendPrivate)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFuelAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(lblAmmoAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCmbActionPerformed
        
    }//GEN-LAST:event_selectCmbActionPerformed

    private void chkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAreaActionPerformed
        boolean value=chkArea.isSelected();
        ob.selectedCheckBox(value);
        
    }//GEN-LAST:event_chkAreaActionPerformed

    private void chkSendPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSendPrivateActionPerformed
        
    }//GEN-LAST:event_chkSendPrivateActionPerformed

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged
        int value =  jSlider.getValue(); 
        ob.updateBtn(value); 
                
    }//GEN-LAST:event_jSliderStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg =txtMessage.getText();
        ob.sendMsg(msg); 
        txtAreaSend.append("Me : "+msg+"\n");
        
//        if (chkSendPrivate.isSelected()==true){
//            
//        }
        
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectActionPerformed
       if(selectCmb.getSelectedItem().equals("Tank") ){
       
       }
        
    }//GEN-LAST:event_btnCollectActionPerformed

    private void txtFuelAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuelAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuelAmtActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollect;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox chkArea;
    private javax.swing.JCheckBox chkSendPrivate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider;
    private javax.swing.JLabel lblAmmoAmount;
    private javax.swing.JLabel lblFuelAmount;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JComboBox<String> selectCmb;
    public javax.swing.JTextArea txtAreaRecive;
    private javax.swing.JTextArea txtAreaSend;
    private javax.swing.JTextField txtFuelAmt;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables

    public void passSms(String msg1) {
        txtAreaSend.append(msg1+"\n");      
    }

    public void passBtnAction(String submarine__Shooting_) {
        txtAreaRecive.append("\n"+submarine__Shooting_);
    }

    public void possitionSelect(String helicopter__Positioned_) {
        txtAreaRecive.append("\n"+helicopter__Positioned_);
    }
    
    public void cmbSelect(boolean v){
        if(v==true){
           
            
        }
    }

    void fuelAmt(int amount) {
//        txtFuelAmt.set(amount);
    }
    
    
}
