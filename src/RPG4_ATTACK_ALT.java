/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERMCB6406
 */
public class RPG4_ATTACK_ALT extends javax.swing.JFrame {

    /**
     * Creates new form RPG4_ATTACK_ALT
     */
    public RPG4_ATTACK_ALT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        RPG4_ATTACK_ALT = new javax.swing.JPanel();
        GameText2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgwolf_morecolour_fringe.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgwolf_morecolour_fringe.png"))); // NOI18N
        jLabel5.setText("jLabel2");

        Title.setFont(new java.awt.Font("Wet Pet", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("In the mists of aeriden");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RPG4_ATTACK_ALT.setBackground(new java.awt.Color(0, 0, 0));

        GameText2.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText2.setForeground(new java.awt.Color(255, 255, 255));
        GameText2.setText("<html> * You decided to attack the guard <br> * You draw your long sword and <br> &nbsp;\nswing at the sentry <br> * You have either overestimated your skill <br> &nbsp; or the guard has god level power <br> * You lose 2 HP");

        continueButton.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        continueButton.setText("CONTINUE");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgwolf_morecolour_fringe.png"))); // NOI18N
        jLabel6.setText("jLabel2");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgwolf_morecolour_fringe.png"))); // NOI18N
        jLabel7.setText("jLabel2");

        Title1.setFont(new java.awt.Font("Dinarjev Republika", 0, 48)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("In the mists of aeriden");
        Title1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout RPG4_ATTACK_ALTLayout = new javax.swing.GroupLayout(RPG4_ATTACK_ALT);
        RPG4_ATTACK_ALT.setLayout(RPG4_ATTACK_ALTLayout);
        RPG4_ATTACK_ALTLayout.setHorizontalGroup(
            RPG4_ATTACK_ALTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG4_ATTACK_ALTLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Title1)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG4_ATTACK_ALTLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG4_ATTACK_ALTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueButton)
                .addGap(242, 242, 242))
        );
        RPG4_ATTACK_ALTLayout.setVerticalGroup(
            RPG4_ATTACK_ALTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG4_ATTACK_ALTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title1)
                .addGroup(RPG4_ATTACK_ALTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPG4_ATTACK_ALTLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RPG4_ATTACK_ALTLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(RPG4_ATTACK_ALTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(continueButton)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG4_ATTACK_ALT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG4_ATTACK_ALT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed

        this.setVisible(false);
        new RPG3().setVisible(true);

        RPG3.playerHP = RPG3.playerHP - 2;
    }//GEN-LAST:event_continueButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RPG4_ATTACK_ALT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPG4_ATTACK_ALT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPG4_ATTACK_ALT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPG4_ATTACK_ALT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPG4_ATTACK_ALT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameText2;
    private javax.swing.JPanel RPG4_ATTACK_ALT;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
