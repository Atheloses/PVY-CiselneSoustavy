/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CiselneSoustavy;

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Okno extends javax.swing.JFrame {
    
    private int s = 2;
    
    /**
     * Creates new form Okno
     */
    public Okno() {
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

        Vysledek = new javax.swing.JButton();
        cislo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Soustava = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        BIN = new javax.swing.JLabel();
        OCT = new javax.swing.JLabel();
        DEC = new javax.swing.JLabel();
        HEX = new javax.swing.JLabel();
        BINV = new javax.swing.JLabel();
        OCTV = new javax.swing.JLabel();
        DECV = new javax.swing.JLabel();
        HEXV = new javax.swing.JLabel();
        konec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Vysledek.setText("Výpočet");
        Vysledek.setToolTipText("Po kliknutí se zobrazí výsledky");
        Vysledek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VysledekActionPerformed(evt);
            }
        });

        cislo.setText("0");
        cislo.setToolTipText("Zadej libovolné číslo");

        jLabel1.setText("Zadej číslo:");

        jLabel2.setText("Vyber soustavu:");

        Soustava.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binární", "Oktálová", "Decimální", "Hexadecimální" }));
        Soustava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoustavaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vyjádření čísla v číselných soustavách");
        jLabel3.setToolTipText("");
        jLabel3.setOpaque(true);

        BIN.setForeground(new java.awt.Color(255, 0, 0));
        BIN.setText("BIN");

        OCT.setForeground(new java.awt.Color(0, 0, 255));
        OCT.setText("OCT");

        DEC.setForeground(new java.awt.Color(0, 153, 0));
        DEC.setText("DEC");

        HEX.setText("HEX");

        BINV.setForeground(new java.awt.Color(255, 0, 0));
        BINV.setText("0");

        OCTV.setForeground(new java.awt.Color(0, 0, 255));
        OCTV.setText("0");

        DECV.setForeground(new java.awt.Color(0, 153, 0));
        DECV.setText("0");

        HEXV.setText("0");

        konec.setText("Konec");
        konec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cislo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Soustava, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Vysledek, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BIN)
                            .addComponent(OCT)
                            .addComponent(DEC)
                            .addComponent(HEX))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HEXV)
                            .addComponent(DECV)
                            .addComponent(OCTV)
                            .addComponent(BINV))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(konec)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vysledek)
                    .addComponent(cislo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soustava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BIN)
                    .addComponent(BINV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCT)
                    .addComponent(OCTV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEC)
                    .addComponent(DECV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HEX)
                    .addComponent(HEXV))
                .addGap(18, 18, 18)
                .addComponent(konec)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konecActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_konecActionPerformed

    private void VysledekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VysledekActionPerformed
        try {
        String dec = Integer.toString(Integer.parseInt(cislo.getText(), s));
        DECV.setText(dec); 
        String bin = Integer.toBinaryString(Integer.parseInt(cislo.getText(), s));
        BINV.setText(bin);
        String oct = Integer.toOctalString(Integer.parseInt(cislo.getText(), s));
        OCTV.setText(oct);
        String hex = Integer.toHexString(Integer.parseInt(cislo.getText(), s));
        HEXV.setText(hex);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Neplatné zadání", "Chyba!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_VysledekActionPerformed

    private void SoustavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoustavaActionPerformed
        int[] poleSoustav={2,8,10,16};
        s = poleSoustav[Soustava.getSelectedIndex()];
    }//GEN-LAST:event_SoustavaActionPerformed

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
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BIN;
    private javax.swing.JLabel BINV;
    private javax.swing.JLabel DEC;
    private javax.swing.JLabel DECV;
    private javax.swing.JLabel HEX;
    private javax.swing.JLabel HEXV;
    private javax.swing.JLabel OCT;
    private javax.swing.JLabel OCTV;
    private javax.swing.JComboBox Soustava;
    private javax.swing.JButton Vysledek;
    private javax.swing.JTextField cislo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton konec;
    // End of variables declaration//GEN-END:variables
}
