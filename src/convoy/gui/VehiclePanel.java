/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convoy.gui;

import convoy.objects.Mission;
import convoy.objects.Personnel;
import convoy.objects.Vehicle;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Oakes
 */
public class VehiclePanel extends javax.swing.JPanel {

    
    private static int vehicleCount = 0;
    private String imageName;
    private URL url;
    private Image finalImage;

    /**
     * Creates new form VehiclePanel
     */
    public VehiclePanel() {
        //this.setOpaque(false);
        initComponents();
        doMainMenuFont();
        setTransparent();
        
        ++vehicleCount;
        //loadImage();
        deleteButton.setMargin(new Insets(0, 0, 0, 0));
        deleteButton.setBorder(null);
        revalidate();
        repaint();
    }

    public void setImage(Image img) {
        try {

            finalImage = img.getScaledInstance(92, 50, java.awt.Image.SCALE_SMOOTH); // getScaledInstance(width, hieght, algorithm)
            ImageIcon icon = new ImageIcon(finalImage);
            imageLabel.setIcon(icon);
            revalidate();
            repaint();

        } catch (Exception ex) {
            //Logger.getLogger(CreateVehiclePopUp.class.getName()).log(Level.SEVERE, null, ex);
            //System.out.print("Image Error");
        }
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }
    
    public String getDriverName() {
        return driverLabel.getText();
    }

    public void setDriverName(String driverName) {
        driverLabel.setText(driverName);
    }

    public void setPassenger1(String passenger1) {
        passenger1Label.setText(passenger1);
    }

    public void setPassenger2(String passenger2) {
        passenger2Label.setText(passenger2);
    }

    public void setPassenger3(String passenger3) {
        passenger3Label.setText(passenger3);
    }

    public void setBumperNumber(String bumperNumber) {
        bumperNumberLabel.setText(bumperNumber);
    }

    public void setCallSign(String callSign) {
        callSignLabel.setText(callSign);
    }

    public void setTransparent() {
        //componentPanel.setOpaque(false);
    }
    public void setAdditionalInfo(String additionalInfo){
        additionalInfoField.setText(additionalInfo);
    }
    
    /**
     * batchVehicleGet(Vehicle v) sets bumperNumber, callSign, driver and all
     *  passengers in v according to the values in the corresponding JLabels. 
     * @param v the vehicle object that will be receiving the values from the 
     *  various JLabels associated with this class
     */
    public void batchVehicleGet(Vehicle v) {
        v.setBumperNumber(bumperNumberLabel.getText());
        v.setCallSign(callSignLabel.getText());        
        v.setDriver(driverLabel.getText());
        
        if (!additionalInfoField.getText().equals("")) 
            v.setAdditionalInfo(additionalInfoField.getText());
        
        if (!passenger1Label.getText().equals(""))
            v.addPassengers(passenger1Label.getText());
        
        if (!passenger2Label.getText().equals(""))
            v.addPassengers(passenger2Label.getText());
        
        if (!passenger3Label.getText().equals(""))
            v.addPassengers(passenger3Label.getText());
        
    }
    
    /**
     * batchVehcileSet(Vehicle v) gets bumperNumber, callSign, driver and all
     *  passengers according from v 
     * @param v the vehicle object that will be receiving the values from the 
     *  various JLabels associated with this class
     */
    public void batchVehicleSet(Vehicle v) {
        bumperNumberLabel.setText(v.getBumperNumber());
        callSignLabel.setText(v.getCallSign());
        driverLabel.setText(v.getDriverName());
        
        if (v.getPassengers().size() >= 1)
            passenger1Label.setText(v.getPassengers().get(0).getName());
        
        if (v.getPassengers().size() >= 2)
            passenger2Label.setText(v.getPassengers().get(1).getName());
        
        if (v.getPassengers().size() >= 3)
            passenger3Label.setText(v.getPassengers().get(2).getName());
    }
    
   
    
    

    private void doMainMenuFont() {
        try {

            Font woodCutter = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/convoy/resources/fonts/lucidaGrande.ttf"));
            woodCutter = woodCutter.deriveFont(Font.TRUETYPE_FONT, 12);

            driverLabel.setFont(woodCutter);
            passenger1Label.setFont(woodCutter);
            passenger2Label.setFont(woodCutter);
            passenger3Label.setFont(woodCutter);
            bumperNumberLabel.setFont(woodCutter);
            callSignLabel.setFont(woodCutter);

        } catch (Exception ex) {
            ex.printStackTrace();;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componentPanel = new javax.swing.JPanel();
        passenger1Label = new javax.swing.JLabel();
        passenger3Label = new javax.swing.JLabel();
        bumperNumberLabel = new javax.swing.JLabel();
        driverLabel = new javax.swing.JLabel();
        passenger2Label = new javax.swing.JLabel();
        callSignLabel = new javax.swing.JLabel();
        picturePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        additionalInfoField = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(194, 178, 128));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 178, 128)));
        setName(""); // NOI18N

        componentPanel.setBackground(new java.awt.Color(194, 178, 128));

        passenger1Label.setText("Passenger");
        passenger1Label.setMaximumSize(new java.awt.Dimension(50, 11));
        passenger1Label.setMinimumSize(new java.awt.Dimension(50, 11));
        passenger1Label.setName(""); // NOI18N
        passenger1Label.setPreferredSize(new java.awt.Dimension(50, 11));

        passenger3Label.setText("Passenger");
        passenger3Label.setMaximumSize(new java.awt.Dimension(50, 11));
        passenger3Label.setMinimumSize(new java.awt.Dimension(50, 10));
        passenger3Label.setName(""); // NOI18N
        passenger3Label.setPreferredSize(new java.awt.Dimension(50, 11));

        bumperNumberLabel.setBackground(new java.awt.Color(102, 102, 255));
        bumperNumberLabel.setText("Bumper Number");
        bumperNumberLabel.setMaximumSize(new java.awt.Dimension(50, 11));
        bumperNumberLabel.setMinimumSize(new java.awt.Dimension(50, 11));
        bumperNumberLabel.setName(""); // NOI18N
        bumperNumberLabel.setPreferredSize(new java.awt.Dimension(50, 11));

        driverLabel.setBackground(new java.awt.Color(102, 102, 255));
        driverLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        driverLabel.setForeground(new java.awt.Color(0, 204, 0));
        driverLabel.setText("Driver");
        driverLabel.setMaximumSize(new java.awt.Dimension(50, 11));
        driverLabel.setMinimumSize(new java.awt.Dimension(50, 11));
        driverLabel.setName(""); // NOI18N
        driverLabel.setPreferredSize(new java.awt.Dimension(50, 11));

        passenger2Label.setText("Passenger");
        passenger2Label.setMaximumSize(new java.awt.Dimension(50, 11));
        passenger2Label.setMinimumSize(new java.awt.Dimension(50, 11));
        passenger2Label.setName(""); // NOI18N
        passenger2Label.setPreferredSize(new java.awt.Dimension(50, 11));

        callSignLabel.setBackground(new java.awt.Color(102, 102, 255));
        callSignLabel.setText("Call Sign");
        callSignLabel.setMaximumSize(new java.awt.Dimension(50, 11));
        callSignLabel.setMinimumSize(new java.awt.Dimension(50, 11));
        callSignLabel.setName(""); // NOI18N
        callSignLabel.setPreferredSize(new java.awt.Dimension(50, 11));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/convoy/resources/images/humveeIconLarge.png"))); // NOI18N

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picturePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        additionalInfoField.setText("Adittional Info");

        javax.swing.GroupLayout componentPanelLayout = new javax.swing.GroupLayout(componentPanel);
        componentPanel.setLayout(componentPanelLayout);
        componentPanelLayout.setHorizontalGroup(
            componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passenger3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(passenger2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(passenger1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(driverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bumperNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(callSignLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(additionalInfoField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        componentPanelLayout.setVerticalGroup(
            componentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(driverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(passenger1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(passenger2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(passenger3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(bumperNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(callSignLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(additionalInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        driverLabel.getAccessibleContext().setAccessibleName("driver");
        driverLabel.getAccessibleContext().setAccessibleDescription("driver");

        deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("X");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setPreferredSize(new java.awt.Dimension(15, 22));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(componentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(componentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additionalInfoField;
    private javax.swing.JLabel bumperNumberLabel;
    private javax.swing.JLabel callSignLabel;
    private javax.swing.JPanel componentPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel driverLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel passenger1Label;
    private javax.swing.JLabel passenger2Label;
    private javax.swing.JLabel passenger3Label;
    private javax.swing.JPanel picturePanel;
    // End of variables declaration//GEN-END:variables

}
