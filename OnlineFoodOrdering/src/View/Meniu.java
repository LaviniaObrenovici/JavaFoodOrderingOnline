/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import View.Restaurant;
import java.awt.event.WindowEvent;

/**
 *
 * @author lavin
 */
public class Meniu extends javax.swing.JFrame {

    /**
     * Creates new form Meniu
     */
    public Meniu() {
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

        jbtnInapoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnInapoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnInapoi.setText("INAPOI LA COMANDA");
        jbtnInapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInapoiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnInapoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setText("SUPE/CIORBE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel2.setText("SUPA DE TAIETEI    20 LEI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 65, -1, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel3.setText("SUPA DE LEGUME    18 LEI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 102, -1, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel4.setText("CIORBA DE VACUTA 25 LEI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 139, -1, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel5.setText("CIORBA DE BURTA   25 LEI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 176, -1, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel6.setText("PIZZA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 221, -1, -1));

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel7.setText("PIZZA CAPRICOSA      30 LEI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 271, -1, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel8.setText("PIZZA MARGhERITA   23 LEI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel9.setText("PIZZA SALAMI           25 LEI");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel10.setText("PIZZA CU PUI             25 LEI");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel11.setText("FEL PRINCIPAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 11, -1, -1));

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel12.setText("PIEPT DE PUI CU CARTOFI      30 LEI");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 65, -1, -1));

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel13.setText("COTLET DE PORC                     20 LEI");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 102, -1, -1));

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel14.setText("SOMON CU BROCOLLI              35 LEI");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 139, -1, -1));

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel15.setText("TOCANA DE PORC                    33 LEI");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 176, -1, -1));

        jLabel16.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel16.setText("DESERT ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 213, -1, -1));

        jLabel17.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel17.setText("LAVA CAKE                  15 LEI");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 260, -1, -1));

        jLabel18.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel18.setText("TIRAMISU                     15 LEI");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel19.setText("CHEESECAKE                15 LEI");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        jLabel20.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel20.setText("TARTA CU MERE           15 LEI");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\lavin\\OneDrive\\Desktop\\meniu3.jpg")); // NOI18N
        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInapoiActionPerformed
        Restaurant Info = new Restaurant();
        Info.setVisible(true);
    }//GEN-LAST:event_jbtnInapoiActionPerformed

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
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meniu().setVisible(true);
            }
        });
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnInapoi;
    // End of variables declaration//GEN-END:variables

    private void systemExit()
    {
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}
