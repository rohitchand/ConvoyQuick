/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convoy.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

/**
 *
 * @author dizoo548
 */
public class MainWindow extends javax.swing.JFrame {
    
    private static MainWindow frame = new MainWindow();

    /**
     * Creates new form mainWindow
     */
    public MainWindow() {
        
        initComponents();
        makeSelectPanelsTransparent();
        doMainWindowFont();
        setMainWindowButtonColor();
        picturePanel2 = new PicturePanel("/convoy/resources/images/camo.jpg");
        revalidate();
        repaint();
        
        
        
        //addMenuBar();
    }
    
    public void makeSelectPanelsTransparent() {
        missionNumberPanel.setOpaque(false);
        //vehiclePanel.setOpaque(false);
        additionalInfoPanel.setOpaque(false);
        //buttonsPanel.setOpaque(false);
    }
    
    private void addMenuBar(){
        
        frame.add(menuBar);
        
    }
    
    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // added 
        frame.setTitle("Convoy QuicMaink - Convoy documentation creator to help save lives");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setIconImage(new ImageIcon(getClass().getResource("/convoy/resources/images/humveeIcon.png")).getImage());
        frame.setVisible(true);        
        revalidate();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        picturePanel2 = new convoy.gui.PicturePanel("");
        missionNumberPanel = new javax.swing.JPanel();
        classificationDropBox = new javax.swing.JComboBox();
        missionTextField = new javax.swing.JTextField();
        additionalInfoPanel = new javax.swing.JPanel();
        missionNumberPanel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        picturePanel2.setBackground(new java.awt.Color(255, 255, 255));

        missionNumberPanel.setBackground(new java.awt.Color(255, 255, 255));
        missionNumberPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        classificationDropBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "For Official Use Only", "Unclassified", "Classified", "Secret", "Top Secret" }));

        missionTextField.setText("Mission #");
        missionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missionTextFieldActionPerformed(evt);
            }
        });
        missionTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                missionTextFieldFocusGained(evt);
            }
        });

        javax.swing.GroupLayout missionNumberPanelLayout = new javax.swing.GroupLayout(missionNumberPanel);
        missionNumberPanel.setLayout(missionNumberPanelLayout);
        missionNumberPanelLayout.setHorizontalGroup(
            missionNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionNumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(missionNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classificationDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(missionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        missionNumberPanelLayout.setVerticalGroup(
            missionNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionNumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classificationDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(missionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        additionalInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        additionalInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        javax.swing.GroupLayout additionalInfoPanelLayout = new javax.swing.GroupLayout(additionalInfoPanel);
        additionalInfoPanel.setLayout(additionalInfoPanelLayout);
        additionalInfoPanelLayout.setHorizontalGroup(
            additionalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        additionalInfoPanelLayout.setVerticalGroup(
            additionalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        missionNumberPanel1.setBackground(new java.awt.Color(255, 255, 255));
        missionNumberPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 178, 128)));
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Add New Vehicle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout missionNumberPanel1Layout = new javax.swing.GroupLayout(missionNumberPanel1);
        missionNumberPanel1.setLayout(missionNumberPanel1Layout);
        missionNumberPanel1Layout.setHorizontalGroup(
            missionNumberPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionNumberPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1567, Short.MAX_VALUE))
        );
        missionNumberPanel1Layout.setVerticalGroup(
            missionNumberPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(missionNumberPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout picturePanel2Layout = new javax.swing.GroupLayout(picturePanel2);
        picturePanel2.setLayout(picturePanel2Layout);
        picturePanel2Layout.setHorizontalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(additionalInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(missionNumberPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(missionNumberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        picturePanel2Layout.setVerticalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picturePanel2Layout.createSequentialGroup()
                .addComponent(missionNumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(missionNumberPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(additionalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(picturePanel2);

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText("File");
        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void missionTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_missionTextFieldFocusGained
        missionTextField.setText("");
    }//GEN-LAST:event_missionTextFieldFocusGained

    private void missionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missionTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().display();
                
                
            }
        });
    }
    
    private void doMainWindowFont() {
        try {
            
            Font topSecretFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/convoy/resources/fonts/topSecret.ttf"));
            
            Font captureItFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/convoy/resources/fonts/captureIt.ttf"));
            captureItFont = captureItFont.deriveFont(Font.ITALIC, 15f);
                        
            //finalizeLabel.setFont(captureItFont);
            //mainMenuLabel.setFont(captureItFont);
            //printLabel.setFont(captureItFont);
            //saveLabel.setFont(captureItFont);
            
            classificationDropBox.setFont(captureItFont);
            missionTextField.setFont(captureItFont);

            
        } catch (Exception ex) {
            ex.printStackTrace();;
        }

    }
    
    private void setMainWindowButtonColor(){
        
       Color desertStormColor = new  Color(194, 178, 128);
       /*
       finalizePanel.setBackground(desertStormColor);
       mainMenuPanel.setBackground(desertStormColor);
       printPanel.setBackground(desertStormColor);
       savePanel.setBackground(desertStormColor);
       
       finalizePanel.setBorder(new BevelBorder(BevelBorder.RAISED));
       mainMenuPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
       printPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
       savePanel.setBorder(new BevelBorder(BevelBorder.RAISED));
       */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel additionalInfoPanel;
    private javax.swing.JComboBox classificationDropBox;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel missionNumberPanel;
    private javax.swing.JPanel missionNumberPanel1;
    private javax.swing.JTextField missionTextField;
    private convoy.gui.PicturePanel picturePanel2;
    // End of variables declaration//GEN-END:variables
}
