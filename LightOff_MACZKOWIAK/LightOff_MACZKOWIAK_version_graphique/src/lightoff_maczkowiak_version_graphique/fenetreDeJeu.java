/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_maczkowiak_version_graphique;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static lightoff_maczkowiak_version_graphique.Partie.rand;

/**
 *
 * @author lukha
 */
public class fenetreDeJeu extends javax.swing.JFrame {
    
    private GrilleDeJeu grille;
    private int nbCoups;
    private static int difficulty = 0;
    int[] coord = new int[2];
    static int img_size = 60;
    int x, y;

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        int x = (getWidth() - panneau_difficultés.getWidth()) / 2;
        
        panneau_difficultés.setLocation(x, panneau_difficultés.getHeight());
        panneau_difficultés.setMaximumSize(new Dimension(530, 540));
        panneau_ligne.setMaximumSize(new Dimension(60, 540));
        panneau_colonne_diagD.setMaximumSize(new Dimension(530, 50));
        panneau_diagM.setMaximumSize(new Dimension(530, 50));
        
        panneau_difficultés.repaint();
        panneau_grille.setVisible(false);
        panneau_diagM.setVisible(false);
        panneau_colonne_diagD.setVisible(false);
        panneau_ligne.setVisible(false);
        panneau_info_partie.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_colonne_diagD = new javax.swing.JPanel();
        panneau_grille = new javax.swing.JPanel();
        panneau_diagM = new javax.swing.JPanel();
        panneau_ligne = new javax.swing.JPanel();
        panneau_difficultés = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Difficile = new javax.swing.JButton();
        Facile = new javax.swing.JButton();
        Normal = new javax.swing.JButton();
        panneau_info_partie = new javax.swing.JPanel();
        label_txt_nbCoups = new javax.swing.JLabel();
        label_nbCoups = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_colonne_diagD.setBackground(new java.awt.Color(204, 204, 204));
        panneau_colonne_diagD.setLayout(new java.awt.GridLayout());
        getContentPane().add(panneau_colonne_diagD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(7, 9));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        panneau_diagM.setBackground(new java.awt.Color(204, 204, 204));
        panneau_diagM.setLayout(new java.awt.GridLayout());
        getContentPane().add(panneau_diagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 50));

        panneau_ligne.setBackground(new java.awt.Color(204, 204, 204));
        panneau_ligne.setLayout(new java.awt.GridLayout(1, 1));
        getContentPane().add(panneau_ligne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, -1));

        panneau_difficultés.setBackground(new java.awt.Color(102, 102, 102));
        panneau_difficultés.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panneau_difficultés.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sélectionner une difficulté :");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panneau_difficultés.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Difficile.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Difficile.setText("Difficile");
        Difficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DifficileActionPerformed(evt);
            }
        });
        panneau_difficultés.add(Difficile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        Facile.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Facile.setText("Facile");
        Facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacileActionPerformed(evt);
            }
        });
        panneau_difficultés.add(Facile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Normal.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Normal.setText("Normal");
        Normal.setAlignmentY(0.0F);
        Normal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });
        panneau_difficultés.add(Normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        getContentPane().add(panneau_difficultés, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 370, 150));

        panneau_info_partie.setBackground(new java.awt.Color(0, 51, 51));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_txt_nbCoups.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        label_txt_nbCoups.setForeground(new java.awt.Color(255, 255, 255));
        label_txt_nbCoups.setText("Nombre de coups effectués :");
        panneau_info_partie.add(label_txt_nbCoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        label_nbCoups.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        label_nbCoups.setForeground(new java.awt.Color(255, 255, 255));
        label_nbCoups.setText("jLabel4");
        panneau_info_partie.add(label_nbCoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 370, 140));

        setBounds(0, 0, 1040, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void FacileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacileActionPerformed
        difficulty = 1;
        coord[0] = 4;
        coord[1] = 4;
        initialiserPartie();
    }//GEN-LAST:event_FacileActionPerformed

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
        difficulty = 2;
        coord[0] = 6;
        coord[1] = 6;
        initialiserPartie();
    }//GEN-LAST:event_NormalActionPerformed

    private void DifficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DifficileActionPerformed
        difficulty = 3;
        while (coord[0] == coord[1]) {
            coord[0] = rand.nextInt(7, 10);
            coord[1] = rand.nextInt(7, 10);
            
        }
        initialiserPartie();
    }//GEN-LAST:event_DifficileActionPerformed
    private void initialiserPartie() {

        //création des grilles
        this.grille = new GrilleDeJeu(coord[0], coord[1]);
        
        panneau_grille.setLayout(new GridLayout(coord[0], coord[1]));
        panneau_ligne.setLayout(new GridLayout(coord[0], 1));
        panneau_colonne_diagD.setLayout(new GridLayout(1, coord[1] * 2));
        panneau_diagM.setLayout(new GridLayout(1, coord[1]));
        
        for (int i = 0; i < coord[0]; ++i) {
            for (int j = 0; j < coord[1]; ++j) {
                CelluleGraphique cellGraph = new CelluleGraphique(grille.matriceCellules[i][j]);
                panneau_grille.add(cellGraph);
            }
        }
        for (int i = 0; i < coord[0]; ++i) {
            JButton button = new JButton();
            button.setText("→");
            panneau_ligne.add(button);
            button.add(ActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Retrieve the cell information from the ActionCommand
                        String cellInfo = e.getActionCommand();

                        // Perform actions when a button is clicked
                    JButton clickedButton = (JButton) e.getSource();
                }
            }));
        }
        for (int i = 0; i < coord[1]; ++i) {
            JButton button = new JButton();
            button.setText("↗");
            panneau_diagM.add(button);
            button.add(ActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Retrieve the cell information from the ActionCommand
                        String cellInfo = e.getActionCommand();

                        // Perform actions when a button is clicked
                    JButton clickedButton = (JButton) e.getSource();
                }
            }));
        }
        for (int i = 0; i < coord[1] * 2; ++i) {
            JButton button = new JButton();
            if (i % 2 == 0) {
                button.setText("↓");
            } else {
                button.setText("↘");
            }
            panneau_colonne_diagD.add(button);
            
            button.add(ActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Retrieve the cell information from the ActionCommand
                        String cellInfo = e.getActionCommand();

                        // Perform actions when a button is clicked
                    JButton clickedButton = (JButton) e.getSource();
                }
            }));
        }

        //definition de dimension des grilles
        int dimy = img_size * coord[0];
        int dimx = img_size * coord[1];
        
        panneau_grille.setPreferredSize(new Dimension(dimx, dimy));
        panneau_ligne.setPreferredSize(new Dimension(60, dimy));
        panneau_colonne_diagD.setPreferredSize(new Dimension(dimx, 50));
        panneau_diagM.setPreferredSize(new Dimension(dimx, 60));
        
        getContentPane().add(panneau_diagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, dimy + 50, -1, 60));
        
        grille.melangerMatriceAleatoirement(20);
        disablePanneauDifficulté();
        pack();

        //Session();
    }
    
    
    private void disablePanneauDifficulté() {
        Facile.setEnabled(false);
        Normal.setEnabled(false);
        Difficile.setEnabled(false);
        panneau_difficultés.setVisible(false);
        panneau_grille.repaint();
        
        if (difficulty == 3) {
            label_txt_nbCoups.setText("Nombre de coups restant :");
            nbCoups = 40;
        } else {
            nbCoups = 0;
        }
        label_nbCoups.setText(nbCoups + "");
        panneau_grille.setVisible(true);
        panneau_diagM.setVisible(true);
        panneau_colonne_diagD.setVisible(true);
        panneau_ligne.setVisible(true);
        panneau_info_partie.setVisible(true);
        panneau_info_partie.repaint();
        
    }

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Difficile;
    private javax.swing.JButton Facile;
    private javax.swing.JButton Normal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_nbCoups;
    private javax.swing.JLabel label_txt_nbCoups;
    private javax.swing.JPanel panneau_colonne_diagD;
    private javax.swing.JPanel panneau_diagM;
    private javax.swing.JPanel panneau_difficultés;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JPanel panneau_ligne;
    // End of variables declaration//GEN-END:variables

    private PopupMenu ActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}