/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convoy.gui;

import java.awt.Image;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.jdesktop.xswingx.PromptSupport;
        
/**
 *
 * @author Siddharth
 */
public class AddVehiclePopUp extends javax.swing.JFrame {

    /**
     * Creates new form AddVehiclePopUp
     */
    private VehiclePanel newVehiclePanel;
    private VehicleGrid vehicleGridObj;
    private String vehicleName;
    private String numberOfSeats;
    private URL imageUrl;
    private Image img;

    public AddVehiclePopUp() {

        initComponents();
        PromptSupport.setPrompt("Driver", personnel1Field);
        newVehiclePanel = new VehiclePanel();
        this.setLocationRelativeTo(null); //centers frame
        this.setTitle("Add a New Vehicle"); //adds title
        this.setIconImage(new ImageIcon(getClass().getResource("/convoy/resources/images/humveeIcon.png")).getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        createEditButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vehicleNameField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        personnel1Field = new javax.swing.JTextField();
        personnel2Field = new javax.swing.JTextField();
        personnel3Field = new javax.swing.JTextField();
        personnel4Field = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        vehicleInfo1Field = new javax.swing.JTextField();
        vehicleInfo2Field = new javax.swing.JTextField();
        vehicleInfo3Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addVehicleButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 0));

        jLayeredPane1.setBackground(new java.awt.Color(194, 178, 128));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setForeground(new java.awt.Color(194, 178, 128));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1888, 718));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        createEditButton.setText("Create/Edit");
        createEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEditButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("VEHICLE SELECTION");

        vehicleNameField.setText("Search vehicle");
        vehicleNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleNameFieldActionPerformed(evt);
            }
        });
        vehicleNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehicleNameFieldFocusGained(evt);
            }
        });

        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addGap(181, 181, 181))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vehicleNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createEditButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vehicleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(createEditButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("PERSONNEL");

        personnel1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personnel1FieldActionPerformed(evt);
            }
        });
        personnel1Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                personnel1FieldFocusGained(evt);
            }
        });

        personnel2Field.setText("Commander Name");
        personnel2Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                personnel2FieldFocusGained(evt);
            }
        });

        personnel3Field.setText("Passenger Name");
        personnel3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personnel3FieldActionPerformed(evt);
            }
        });
        personnel3Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                personnel3FieldFocusGained(evt);
            }
        });

        personnel4Field.setText("Passenger Name");
        personnel4Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                personnel4FieldFocusGained(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "CC", "ACC", "Medic", "Passenger" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "CC", "ACC", "Medic", "Passenger" }));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*1");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*2");

        jLabel6.setText(" 3");

        jLabel7.setText(" 4");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Driver");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "CC", "ACC", "Medic", "Passenger" }));

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("* Required");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)
                        .addGap(157, 157, 157))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(personnel2Field)
                            .addComponent(personnel1Field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personnel4Field)
                            .addComponent(personnel3Field, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnel1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnel2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnel3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personnel4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("VEHICLE INFORMATION");

        vehicleInfo1Field.setText("Bumper Number");
        vehicleInfo1Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehicleInfo1FieldFocusGained(evt);
            }
        });

        vehicleInfo2Field.setText("Callsign");
        vehicleInfo2Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehicleInfo2FieldFocusGained(evt);
            }
        });

        vehicleInfo3Field.setText("Additional Information");
        vehicleInfo3Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehicleInfo3FieldFocusGained(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(157, 157, 157))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleInfo2Field)
                            .addComponent(vehicleInfo3Field)
                            .addComponent(vehicleInfo1Field, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleInfo1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleInfo2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vehicleInfo3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        addVehicleButton.setText("Add Vehicle");
        addVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addVehicleButton)
                            .addComponent(cancelButton))))
                .addGap(20, 20, 20))
        );
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addVehicleButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEditButtonActionPerformed
        // TODO add your handling code here:
        CreateVehiclePopUp createVehicle = new CreateVehiclePopUp();
        createVehicle.setObject(this);
        createVehicle.setVisible(true);
        //this.hide();
        createVehicle.show();

    }//GEN-LAST:event_createEditButtonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        //dispose();
        //System.exit(0);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleButtonActionPerformed
        // TODO add your handling code here:
        addValuesToVehiclePanel();
        System.out.println("Adding New Vehicle");
        vehicleGridObj.replaceAddNewVehiclePanel(newVehiclePanel);
        this.setVisible(false);
    }//GEN-LAST:event_addVehicleButtonActionPerformed

    private void personnel1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personnel1FieldActionPerformed

    }//GEN-LAST:event_personnel1FieldActionPerformed

    private void vehicleNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleNameFieldActionPerformed
        vehicleNameField.setText("");
    }//GEN-LAST:event_vehicleNameFieldActionPerformed

    private void personnel3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personnel3FieldActionPerformed
        //personnel3Field.setText(vehicleName);
    }//GEN-LAST:event_personnel3FieldActionPerformed

    private void personnel1FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personnel1FieldFocusGained
        personnel1Field.setText("");
    }//GEN-LAST:event_personnel1FieldFocusGained

    private void personnel2FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personnel2FieldFocusGained
        personnel2Field.setText("");
    }//GEN-LAST:event_personnel2FieldFocusGained

    private void personnel3FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personnel3FieldFocusGained
        personnel3Field.setText("");
    }//GEN-LAST:event_personnel3FieldFocusGained

    private void personnel4FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personnel4FieldFocusGained
        personnel4Field.setText("");
    }//GEN-LAST:event_personnel4FieldFocusGained

    private void vehicleInfo1FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehicleInfo1FieldFocusGained
        // TODO add your handling code here:
        vehicleInfo1Field.setText("");
    }//GEN-LAST:event_vehicleInfo1FieldFocusGained

    private void vehicleInfo2FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehicleInfo2FieldFocusGained
        // TODO add your handling code here:
        vehicleInfo2Field.setText("");
    }//GEN-LAST:event_vehicleInfo2FieldFocusGained

    private void vehicleInfo3FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehicleInfo3FieldFocusGained
        // TODO add your handling code here:
        vehicleInfo3Field.setText("");
    }//GEN-LAST:event_vehicleInfo3FieldFocusGained

    private void vehicleNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehicleNameFieldFocusGained
        // TODO add your handling code here:
        vehicleNameField.setText("");
    }//GEN-LAST:event_vehicleNameFieldFocusGained

    public void setObject(VehicleGrid vehicleGrid) {
        vehicleGridObj = vehicleGrid;
    }

    public void setVehicleName(String name) {
        vehicleName = name;
    }

    public void setNumberOfSeats(String seats) {
        numberOfSeats = seats;
    }

    public void setImageUrl(URL imgUrl) {
        imageUrl = imgUrl;
    }

    public void addValuesToVehiclePanel() {
        
        newVehiclePanel.setDriverName(personnel1Field.getText());
        newVehiclePanel.setPassenger1(personnel2Field.getText());
        newVehiclePanel.setPassenger2(personnel3Field.getText());
        newVehiclePanel.setPassenger3(personnel4Field.getText());
        newVehiclePanel.setBumperNumber(vehicleInfo1Field.getText());
        newVehiclePanel.setCallSign(vehicleInfo2Field.getText());
        newVehiclePanel.setAdditionalInfo(vehicleInfo3Field.getText());
        newVehiclePanel.setImage(img);
      
        }

    public void modifyPopUp() {

        vehicleNameField.setText(vehicleName);
        setImage();
        switch (numberOfSeats) {
            
            case "1":
                setAllFieldsVisible();
                personnel2Field.setVisible(false);
                personnel2Field.setText("");
                personnel3Field.setVisible(false);
                personnel3Field.setText("");
                personnel4Field.setVisible(false);
                personnel4Field.setText("");
                jComboBox1.setVisible(false);
                jComboBox2.setVisible(false);
                jComboBox3.setVisible(false);
                jLabel5.setVisible(false);
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                break;
            
            case "2":
                setAllFieldsVisible();
                personnel3Field.setVisible(false);
                personnel3Field.setText("");
                personnel4Field.setVisible(false);
                personnel4Field.setText("");
                jComboBox2.setVisible(false);
                jComboBox3.setVisible(false);
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                break;
            
            case "3":
                setAllFieldsVisible();
                personnel4Field.setVisible(false);
                personnel4Field.setText("");
                jComboBox3.setVisible(false);
                jLabel7.setVisible(false);
                break;
            
            case "4":
                setAllFieldsVisible();
                break;
            
            case "5":
                setAllFieldsVisible();
                //Keep a roster
                personnel1Field.setVisible(false);
                personnel1Field.setText("");
                personnel2Field.setVisible(false);
                personnel2Field.setText("");
                personnel3Field.setVisible(false);
                personnel3Field.setText("");
                personnel4Field.setVisible(false);
                personnel4Field.setText("");
                jComboBox1.setVisible(false);
                jComboBox2.setVisible(false);
                jComboBox3.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                break;
            default:
                //trailer or some unmanned vehicle
                jPanel2.hide();
                break;
        }

    }
    
    public void setAllFieldsVisible(){
                jPanel2.setVisible(true);
                personnel1Field.setVisible(true);
                personnel2Field.setVisible(true);
                personnel3Field.setVisible(true);
                personnel4Field.setVisible(true);
                jComboBox1.setVisible(true);
                jComboBox2.setVisible(true);
                jComboBox3.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel6.setVisible(true);
                jLabel7.setVisible(true);
                jLabel8.setVisible(true);
    }

    public void setImage() {

        try {

            img = ImageIO.read(imageUrl);
            img = img.getScaledInstance(268, 209, java.awt.Image.SCALE_SMOOTH);

            ImageIcon icon = new ImageIcon(img);
            imageLabel.setIcon(icon);

            revalidate();
            repaint();
        } catch (Exception ex) {
            Logger.getLogger(AddVehiclePopUp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Image Error");
        }
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
            java.util.logging.Logger.getLogger(AddVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVehiclePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVehiclePopUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVehicleButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createEditButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField personnel1Field;
    private javax.swing.JTextField personnel2Field;
    private javax.swing.JTextField personnel3Field;
    private javax.swing.JTextField personnel4Field;
    private javax.swing.JTextField vehicleInfo1Field;
    private javax.swing.JTextField vehicleInfo2Field;
    private javax.swing.JTextField vehicleInfo3Field;
    private javax.swing.JTextField vehicleNameField;
    // End of variables declaration//GEN-END:variables
}
