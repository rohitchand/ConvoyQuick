/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convoy.gui;

import java.awt.FileDialog;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chand_000
 */
public class CreateVehiclePopUp extends javax.swing.JFrame {

    private String vehicleName;
    private AddVehiclePopUp addVehicleObject;
    private ImageIcon icon;
    private Image img;
    private Image finalImage;
    private String imageName;
    private CreateVehiclePopUp abc;
    private String numberOfSeats;
    private URL url;

    /**
     * Creates new form CreateVehiclePopUp
     */
    public CreateVehiclePopUp() {
        numberOfSeats = "0";
        initComponents();
        this.setLocationRelativeTo(null); //centers frame
        this.setTitle("Create New Vehicle"); //adds title
        this.setIconImage(new ImageIcon(getClass().getResource("/convoy/resources/images/humveeIcon.png")).getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. // <editor-fold defaultstate="collapsed"
     * desc="Generated Code">
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        enterVehicleField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numberOfSeatsComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        selectImageButton = new javax.swing.JButton();
        addVehicleButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(194, 174, 128));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(650, 525));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Vehicle Name");

        enterVehicleField.setText("Enter Vehicle Name");
        enterVehicleField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterVehicleFieldMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Number Of Seats");

        numberOfSeatsComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberOfSeatsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "> 4" }));
        numberOfSeatsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfSeatsComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numberOfSeatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterVehicleField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterVehicleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfSeatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        selectImageButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectImageButton.setText("Select Image");
        selectImageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectImageButtonMouseClicked(evt);
            }
        });

        addVehicleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addVehicleButton.setText("Add Vehicle");
        addVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Create Vehicle");

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(addVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1)))
                .addGap(20, 20, 20))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectImageButton)
                    .addComponent(addVehicleButton)
                    .addComponent(cancelButton))
                .addGap(20, 20, 20))
        );
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(selectImageButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        selectImageButton.getAccessibleContext().setAccessibleName("");
        jLayeredPane1.setLayer(addVehicleButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectImageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectImageButtonMouseClicked
        try {
            // TODO add your handling code here:
            FileDialog loadFile;
            loadFile = new FileDialog(this, "Choose a file", FileDialog.LOAD);
            loadFile.setFile("*.jpg;*.jpeg;*.png;*.gif");
            //loadFile.setDirectory("C:\\");
            loadFile.setVisible(true);
            imageName = loadFile.getFile();
            File file = new File(loadFile.getFile());
            //System.out.print(loadFile.getDirectory());

            url = new URL("file:\\" + loadFile.getDirectory() + file);
            //String y = url.toString();
            //String x = (url.toString().substring(6,9));
            //String fileLocation = y.replace(x,"");
            //String fileLocation = loadFile.getDirectory()+file;
            //String url2 = new String("file:\\"+loadFile.getDirectory()+file);
            System.out.print(url);
            img = ImageIO.read(url);
            finalImage = img.getScaledInstance(268, 209, java.awt.Image.SCALE_SMOOTH); // getScaledInstance(width, hieght, algorithm)
            //img.getScaledInstance(8, 10, Image.SCALE_SMOOTH);
            //System.out.print(fileLocation);
            //System.out.println(url2);
            //ImagePanel imgPanel = new ImagePanel(fileLocation);

            // jLabel2.setIcon(new javax.swing.ImageIcon(fileLocation)); // NOI18N
            //this.add(imgPanel);           
            ImageIcon icon = new ImageIcon(finalImage);
            jLabel2.setIcon(icon);

            //jPanel4.add(label);
            revalidate();
            repaint();

        } catch (Exception ex) {
            Logger.getLogger(CreateVehiclePopUp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Image Error");
        }
    }//GEN-LAST:event_selectImageButtonMouseClicked


    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:   
        //System.exit(0);
        addVehicleObject.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void numberOfSeatsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfSeatsComboBoxActionPerformed
        if (numberOfSeatsComboBox.getSelectedItem().equals("0")) {
            numberOfSeats = "0";
        } else if (numberOfSeatsComboBox.getSelectedItem().equals("1")) {
            numberOfSeats = "1";
        } else if (numberOfSeatsComboBox.getSelectedItem().equals("2")) {
            numberOfSeats = "2";
        } else if (numberOfSeatsComboBox.getSelectedItem().equals("3")) {
            numberOfSeats = "3";
        } else if (numberOfSeatsComboBox.getSelectedItem().equals("4")) {
            numberOfSeats = "4";
        } else if (numberOfSeatsComboBox.getSelectedItem().equals("> 4")) {
            numberOfSeats = "5";
        }

        System.out.println(numberOfSeats);
    }//GEN-LAST:event_numberOfSeatsComboBoxActionPerformed

    private void addVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleButtonActionPerformed
        // TODO add your handling code here:
        vehicleName = enterVehicleField.getText();
        System.out.print(vehicleName);
        
        if (url == null){
            if ("".equals(enterVehicleField.getText())){
                JOptionPane.showMessageDialog(null, "Select an a name", "Alert Message", JOptionPane.WARNING_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "Select an Image", "Alert Message", JOptionPane.WARNING_MESSAGE);
        }
         else if ("".equals(enterVehicleField.getText())){
                JOptionPane.showMessageDialog(null, "Select an a name", "Alert Message", JOptionPane.WARNING_MESSAGE);
            }
          /*
         if(vehicleName == null){
            JOptionPane.showMessageDialog(null, "Enter Vehicle name", "Alert Message", JOptionPane.WARNING_MESSAGE);
        }
*/            
        else{
        addVehicleObject.setVehicleName(enterVehicleField.getText());
        addVehicleObject.setNumberOfSeats(numberOfSeats);
        addVehicleObject.setImageUrl(url);

        addVehicleObject.modifyPopUp();

        addVehicleObject.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_addVehicleButtonActionPerformed

    private void enterVehicleFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterVehicleFieldMouseClicked
        // TODO add your handling code here:
        enterVehicleField.setText("");
    }//GEN-LAST:event_enterVehicleFieldMouseClicked

    public void setObject(AddVehiclePopUp obj1) {

        addVehicleObject = obj1;
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
            java.util.logging.Logger.getLogger(CreateVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateVehiclePopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVehicleButton;
    private javax.swing.JButton cancelButton;
    public javax.swing.JTextField enterVehicleField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox numberOfSeatsComboBox;
    private javax.swing.JButton selectImageButton;
    // End of variables declaration//GEN-END:variables

}
