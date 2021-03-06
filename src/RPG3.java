/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErMcB6406
 */
public class RPG3 extends javax.swing.JFrame {
    public static int playerHP = 10;
    public static int ghoulHP = 15;
    public static String playerWeapon = "rusty sword";

    /**
     * Creates new form RPG3
     */
            
            
    public RPG3() {
        
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        RPG3 = new javax.swing.JPanel();
        talkButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        GameText2 = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        Title.setFont(new java.awt.Font("Wet Pet", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("In the mists of aeriden");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RPG3.setBackground(new java.awt.Color(0, 0, 0));

        talkButton.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        talkButton.setText("TALK");
        talkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talkButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel3.setText("jLabel2");

        GameText2.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText2.setForeground(new java.awt.Color(255, 255, 255));
        GameText2.setText("<html> * You now come to a stop infront <br> &nbsp; of the gates of the town <br> * A guard stands rigid on their surveillance post<br> * You can feel their serious demeanor and wonder <br> &nbsp; if you are able to pass <br> * What do you want to do?  <html>");

        attackButton.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        attackButton.setText("Attack");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        leaveButton.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        leaveButton.setText("LEAVE");
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel5.setText("jLabel2");

        Title1.setFont(new java.awt.Font("Dinarjev Republika", 0, 48)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("In the mists of aeriden");
        Title1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout RPG3Layout = new javax.swing.GroupLayout(RPG3);
        RPG3.setLayout(RPG3Layout);
        RPG3Layout.setHorizontalGroup(
            RPG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(RPG3Layout.createSequentialGroup()
                .addGroup(RPG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPG3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(talkButton)
                        .addGap(67, 67, 67)
                        .addComponent(attackButton)
                        .addGap(61, 61, 61)
                        .addComponent(leaveButton))
                    .addGroup(RPG3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        RPG3Layout.setVerticalGroup(
            RPG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title1)
                .addGap(30, 30, 30)
                .addGroup(RPG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(RPG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talkButton)
                    .addComponent(attackButton)
                    .addComponent(leaveButton))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void talkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talkButtonActionPerformed
        
        this.setVisible(false);
        new RPG4_TALK().setVisible(true);
    }//GEN-LAST:event_talkButtonActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        this.setVisible(false);
        new RPG4_ATTACK().setVisible(true);
    }//GEN-LAST:event_attackButtonActionPerformed

    private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtonActionPerformed
        this.setVisible(false);
        new RPG4_LEAVE().setVisible(true);
    }//GEN-LAST:event_leaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPG3().setVisible(true);
            }
            
           // playerHPOut.setText("" + playerHP + "");
            
        
          });
        
    
    
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameText2;
    private javax.swing.JPanel RPG3;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton attackButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton leaveButton;
    private javax.swing.JButton talkButton;
    // End of variables declaration//GEN-END:variables
}



