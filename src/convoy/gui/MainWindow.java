/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convoy.gui;

import convoy.objects.Mission;
import convoy.pdf.*;
import java.awt.Cursor;

import java.awt.FileDialog;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dizoo548
 */
public final class MainWindow extends javax.swing.JFrame {

    private static final MainWindow frame = new MainWindow();

    private String imagePath;

    public String getImagePath() {
        return this.imagePath;
    }
    
    

    String missionNumberText;

    /**
     * Creates new form mainWindow
     */
    public MainWindow() {
        this.imagePath = getClass().getResource("/convoy/resources/images/2id.png").getPath().substring(1).replace("/", "\\");
        
        initComponents();
        makeSelectPanelsTransparent();
        doMainWindowFont();
        setMainWindowButtonColor();
        picturePanel2 = new PicturePanel("/convoy/resources/images/camo.jpg");
        revalidate();
        repaint();

        missionNumberPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        additionalInfoPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    }
    
    public MainWindow(  String missionNumber,
                        String classification,
                        String stagingArea,
                        String acc,
                        String cc,
                        String fromLinkUpTime,
                        String fromSPTime,
                        String leftFrom,
                        String rightFrom,
                        String leftTo,
                        String rightTo,
                        String toLinkUpTime,
                        String toSPTime,
                        String leftAdditionalText,
                        String rightAdditionalText,
                        String additionalText, 
                        String unitPatch) {
        //this.imagePath = getClass().getResource("/convoy/resources/images/2id.png").getPath().substring(1).replace("/", "\\");

        initComponents();
        makeSelectPanelsTransparent();
        doMainWindowFont();
        setMainWindowButtonColor();
        picturePanel2 = new PicturePanel("/convoy/resources/images/camo.jpg");
        revalidate();
        repaint();

        missionNumberPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        additionalInfoPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        this.leftMissionInfoPanel1.setMissionNumber(missionNumber);
        this.leftMissionInfoPanel1.setClassification(classification);
        this.leftMissionInfoPanel1.setFrom(leftFrom);
        this.leftMissionInfoPanel1.setTo(leftTo);
        this.leftMissionInfoPanel1.setAdditionalText(leftAdditionalText);
        this.rightMissionInfoPanel2.setCC(cc);
        this.rightMissionInfoPanel2.setACC(acc);
        this.rightMissionInfoPanel2.setStagingArea(stagingArea);
        this.rightMissionInfoPanel2.setFrom(rightFrom);
        this.rightMissionInfoPanel2.setFromLU(fromLinkUpTime);
        this.rightMissionInfoPanel2.setFromSP(fromSPTime);
        this.rightMissionInfoPanel2.setTo(rightTo);
        this.rightMissionInfoPanel2.setToLU(toLinkUpTime);
        this.rightMissionInfoPanel2.setToSP(toSPTime);
        this.rightMissionInfoPanel2.setAddtionalText(rightAdditionalText);
        this.additionalTextPanel1.setAdditionalText(additionalText);
        
        Image img = new ImageIcon(unitPatch).getImage().getScaledInstance(202, 168, java.awt.Image.SCALE_SMOOTH);
        
        this.leftMissionInfoPanel1.setIcon(new ImageIcon(img));
    }

    public void makeSelectPanelsTransparent() {
        missionNumberPanel.setOpaque(false);
        additionalInfoPanel.setOpaque(false);
    }

    public void display() {
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
        leftMissionInfoPanel1 = new convoy.gui.LeftMissionInfoPanel();
        rightMissionInfoPanel2 = new convoy.gui.RightMissionInfoPanel();
        additionalInfoPanel = new javax.swing.JPanel();
        additionalTextPanel1 = new convoy.gui.AdditionalTextPanel();
        vehicleGrid1 = new convoy.gui.VehicleGrid();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        finalizeMenu = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        wateMarkMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

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

        picturePanel2.setBackground(new java.awt.Color(194, 178, 128));

        missionNumberPanel.setBackground(new java.awt.Color(255, 255, 255));
        missionNumberPanel.setLayout(new javax.swing.BoxLayout(missionNumberPanel, javax.swing.BoxLayout.LINE_AXIS));
        missionNumberPanel.add(leftMissionInfoPanel1);
        missionNumberPanel.add(rightMissionInfoPanel2);

        additionalInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        additionalInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        additionalInfoPanel.setLayout(new java.awt.BorderLayout());
        additionalInfoPanel.add(additionalTextPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout picturePanel2Layout = new javax.swing.GroupLayout(picturePanel2);
        picturePanel2.setLayout(picturePanel2Layout);
        picturePanel2Layout.setHorizontalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picturePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(missionNumberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picturePanel2Layout.createSequentialGroup()
                        .addGroup(picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(additionalInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicleGrid1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        picturePanel2Layout.setVerticalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picturePanel2Layout.createSequentialGroup()
                .addComponent(missionNumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(vehicleGrid1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(additionalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(picturePanel2);

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText("<html> <strong>File</strong> </html>");

        newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenuItem.setText("<html> <strong>New</strong> </html>");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("<html><strong>Load</strong></html>");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("<html><strong>Save</strong></html>");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        finalizeMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        finalizeMenu.setText("<html><strong>Finalize</strong></html>");
        finalizeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizeMenuActionPerformed(evt);
            }
        });
        fileMenu.add(finalizeMenu);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("<html><strong>Print</strong></html>");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem4);

        menuBar.add(fileMenu);

        editMenu.setText("<html>\n<strong>Edit</strong>\n</html>");

        wateMarkMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        wateMarkMenu.setText("<html><strong>Unit Patch</strong></html>");
        wateMarkMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wateMarkMenuActionPerformed(evt);
            }
        });
        editMenu.add(wateMarkMenu);

        menuBar.add(editMenu);

        helpMenu.setText("<html>\n<strong>Help</strong>\n</html>");

        helpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        helpMenuItem.setText("<html><strong>Help</strong></html>");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(helpMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setText("<html><strong>About</strong></html>");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to start a new convoy?\nAll unsaved data will be lost!", "New Convoy?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);
            mainWindow.setTitle("Convoy QuicMaink - Convoy documentation creator to help save lives");
            mainWindow.setIconImage(new ImageIcon(getClass().getResource("/convoy/resources/images/humveeIcon.png")).getImage());
            mainWindow.setExtendedState(MainWindow.MAXIMIZED_BOTH);
            mainWindow.toFront();
            repaint();
            revalidate();
        }
    }//GEN-LAST:event_newMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        String missionNumber = null;
        String classification = null;
        String stagingArea = null;
        String acc = null;
        String cc = null;
        String fromLinkUpTime = null;
        String fromSPTime = null;
        String leftFrom = null;
        String rightFrom = null;
        String leftTo = null;
        String rightTo = null;
        String toLinkUpTime = null;
        String toSPTime = null;
        String leftAdditionalText = null;
        String rightAdditionalText = null;
        String additionalText = null;
        String unitPatch = null;
        
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to load a convoy?\n All unsaved data will be lost.", "Load Convoy?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {

            JFileChooser chooser = new JFileChooser();
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.addChoosableFileFilter((new FileNameExtensionFilter("Convoy Quick Files", "conx")));
            chooser.setSelectedFile(new File("*.conx"));
            chooser.setCurrentDirectory(new File("src/convoy/convoy"));

            int option = chooser.showOpenDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {

                try {
                    BufferedReader br;
                    File file = chooser.getSelectedFile();
                    String line;
                    String cvsSplitBy = ",";
                    
                    br = new BufferedReader(new FileReader(file));
                    while ((line = br.readLine()) != null) {
 
		        // use comma as separator
			String[] mission = line.split(cvsSplitBy);
                        
                        missionNumber = mission[0];
                        classification = mission[1];
                        stagingArea = mission[2];
                        acc = mission[3];
                        cc = mission[4];
                        fromLinkUpTime = mission[5];
                        fromSPTime = mission[6];
                        leftFrom = mission[7];
                        rightFrom = mission[8];
                        leftTo = mission[9];
                        rightTo = mission[10];
                        toLinkUpTime = mission[11];
                        toSPTime = mission[12];
                        leftAdditionalText = mission[13];
                        rightAdditionalText = mission[14];
                        unitPatch = mission[16];
                        
                    }
                    
                    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                    this.setVisible(false);
                    MainWindow mainWindow = new MainWindow( missionNumber, 
                                                            classification,
                                                            stagingArea, 
                                                            acc,
                                                            cc,
                                                            fromLinkUpTime, 
                                                            fromSPTime,
                                                            leftFrom,
                                                            rightFrom,
                                                            leftTo,
                                                            rightTo,
                                                            toLinkUpTime,
                                                            toSPTime,
                                                            leftAdditionalText,
                                                            rightAdditionalText,
                                                            additionalText,
                                                            unitPatch);
                    mainWindow.setVisible(true);
                    mainWindow.setTitle("Convoy QuicMaink - Convoy documentation creator to help save lives");
                    mainWindow.setIconImage(new ImageIcon(getClass().getResource("/convoy/resources/images/humveeIcon.png")).getImage());
                    mainWindow.setExtendedState(MainWindow.MAXIMIZED_BOTH);
                    mainWindow.toFront();
                    repaint();
                    revalidate();

                } catch (IOException ex) {

                } finally {
                    this.setCursor(Cursor.getDefaultCursor());
                }
            }
        }
        
        
        /*int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to load a convoy?\nAll unsaved data will be lost!", "New Convoy?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            //To load a previously saved convoy
            FileDialog loadFile;
            loadFile = new FileDialog(this, "Choose a file", FileDialog.LOAD);
            loadFile.setDirectory("src/convoy/save");
            loadFile.setVisible(true);
        }*/
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed

        Object[] stuff = {new ImageIcon(getClass().getResource("/convoy/resources/images/logo.png")), "About Content Goes Here"};

        JOptionPane.showMessageDialog(null, stuff, "About", JOptionPane.INFORMATION_MESSAGE, null);

    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed

        JOptionPane.showMessageDialog(null, "Help Content Goes Here", "Help", JOptionPane.QUESTION_MESSAGE, null);


    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void finalizeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizeMenuActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to finalize the convoy?", "Finalize Convoy?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {

            JFileChooser chooser = new JFileChooser();
            //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.addChoosableFileFilter((new FileNameExtensionFilter("PDF Files", "pdf")));
            //chooser.setFileFilter(ff);

            missionNumberText = this.leftMissionInfoPanel1.getMissionNumber();

            if (missionNumberText.equalsIgnoreCase("")) {

                missionNumberText = "Untitled";

            }

            chooser.setSelectedFile(new File(missionNumberText));
            chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "\\My Documents"));
            //chooser

            int option = chooser.showSaveDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {

                try {

                    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                    GenerateHtml gh = new GenerateHtml();

                    //System.out.print(this.rightMissionInfoPanel2.getFreqs().get(0).getFreq());
                    gh.generateHtml(
                            this.getImagePath(),
                            this.leftMissionInfoPanel1.getClassification(),
                            this.leftMissionInfoPanel1.getMissionNumber(),
                            this.leftMissionInfoPanel1.getFrom(),
                            this.leftMissionInfoPanel1.getTo(),
                            this.leftMissionInfoPanel1.getAdditionalText(),
                            this.rightMissionInfoPanel2.getCC(),
                            this.rightMissionInfoPanel2.getACC(),
                            this.rightMissionInfoPanel2.getStagingArea(),
                            this.rightMissionInfoPanel2.getFrom(),
                            this.rightMissionInfoPanel2.getTo(),
                            this.rightMissionInfoPanel2.getFromLU(),
                            this.rightMissionInfoPanel2.getToLU(),
                            this.rightMissionInfoPanel2.getFromSP(),
                            this.rightMissionInfoPanel2.getToSP(),
                            this.rightMissionInfoPanel2.getFreqs(),
                            this.rightMissionInfoPanel2.getAdditionalText(),
                            this.additionalTextPanel1.getAdditionalText()
                    );

                    CreatePDF cp = new CreatePDF(chooser.getSelectedFile().getPath());
                    cp.createPDF();

                } catch (Exception ex) {

                } finally {
                    this.setCursor(Cursor.getDefaultCursor());
                }
            }
        }

    }//GEN-LAST:event_finalizeMenuActionPerformed

    @SuppressWarnings("empty-statement")
    private void wateMarkMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wateMarkMenuActionPerformed
        try {
            FileDialog loadFile;
            loadFile = new FileDialog(this, "Choose an Image", FileDialog.LOAD);
            //loadFile.set
            loadFile.setFile("*.jpg;*.jpeg;*.png;*.gif");
            //loadFile.setDirectory("C:\\");
            loadFile.setVisible(true);
            //imageName = loadFile.getFile();

            if (loadFile.getFile() != null) {

                File file = new File(loadFile.getFile());

                URL url = null;
                try {
                    url = new URL("file:\\" + loadFile.getDirectory() + file);

                    imagePath = loadFile.getDirectory() + file;

                } catch (MalformedURLException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                //String y = url.toString();
                //String x = (url.toString().substring(6,9));
                //String fileLocation = y.replace(x,"");
                //String fileLocation = loadFile.getDirectory()+file;
                //String url2 = new String("file:\\"+loadFile.getDirectory()+file);
                //System.out.print(url);
                Image img = null;
                try {
                    if (url != null) {
                        img = ImageIO.read(url);
                    } else {
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (img != null) {
                    Image finalImage = img.getScaledInstance(202, 168, java.awt.Image.SCALE_SMOOTH); // getScaledInstance(width, hieght, algorithm)
                    ImageIcon icon = new ImageIcon(finalImage);
                    this.leftMissionInfoPanel1.setIcon(icon);
                }//img.getScaledInstance(8, 10, Image.SCALE_SMOOTH);
                //System.out.print(fileLocation);
                //System.out.println(url2);
                //ImagePanel imgPanel = new ImagePanel(fileLocation);

                // jLabel2.setIcon(new javax.swing.ImageIcon(fileLocation)); // NOI18N
                //this.add(imgPanel);  
            }
        } catch (Exception ex) {
            ;
        }

    }//GEN-LAST:event_wateMarkMenuActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to print the convoy?", "Print Convoy?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JFileChooser chooser = new JFileChooser();
            //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.addChoosableFileFilter((new FileNameExtensionFilter("PDF Files", "pdf")));
            //chooser.setFileFilter(ff);

            missionNumberText = this.leftMissionInfoPanel1.getMissionNumber();

            if (missionNumberText.equalsIgnoreCase("")) {

                missionNumberText = "Untitled";

            }

            chooser.setSelectedFile(new File(missionNumberText));
            chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "\\My Documents"));
            //chooser

            int option = chooser.showSaveDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {
                try {

                    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                    GenerateHtml gh = new GenerateHtml();

                    gh.generateHtml(
                            this.getImagePath(),
                            this.leftMissionInfoPanel1.getClassification(),
                            this.leftMissionInfoPanel1.getMissionNumber(),
                            this.leftMissionInfoPanel1.getFrom(),
                            this.leftMissionInfoPanel1.getTo(),
                            this.leftMissionInfoPanel1.getAdditionalText(),
                            this.rightMissionInfoPanel2.getCC(),
                            this.rightMissionInfoPanel2.getACC(),
                            this.rightMissionInfoPanel2.getStagingArea(),
                            this.rightMissionInfoPanel2.getFrom(),
                            this.rightMissionInfoPanel2.getTo(),
                            this.rightMissionInfoPanel2.getFromLU(),
                            this.rightMissionInfoPanel2.getToLU(),
                            this.rightMissionInfoPanel2.getFromSP(),
                            this.rightMissionInfoPanel2.getToSP(),
                            this.rightMissionInfoPanel2.getFreqs(),
                            this.rightMissionInfoPanel2.getAdditionalText(),
                            this.additionalTextPanel1.getAdditionalText()
                    );

                    CreatePDF cp = new CreatePDF(chooser.getSelectedFile().getPath());
                    cp.createPDFPrint();

                } catch (Exception ex) {

                } finally {
                    try {
                        this.setCursor(Cursor.getDefaultCursor());
                        PrintPDF p = new PrintPDF();
                        p.print(chooser.getSelectedFile().getPath());
                    } catch (Exception ex) {
                        this.setCursor(Cursor.getDefaultCursor());
                        PrintPDF p = new PrintPDF();
                        p.print(chooser.getSelectedFile().getPath());
                    }
                }
            }
        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Mission mission = new Mission(  this.leftMissionInfoPanel1.getMissionNumber(),
                                        this.rightMissionInfoPanel2.getStagingArea(),
                                        this.leftMissionInfoPanel1.getTo(),
                                        this.rightMissionInfoPanel2.getTo(),
                                        this.leftMissionInfoPanel1.getFrom(),
                                        this.rightMissionInfoPanel2.getFrom(),
                                        this.rightMissionInfoPanel2.getCC(),
                                        this.rightMissionInfoPanel2.getACC(),
                                        this.rightMissionInfoPanel2.getFromLU(),
                                        this.rightMissionInfoPanel2.getFromSP(),
                                        this.rightMissionInfoPanel2.getToLU(),
                                        this.rightMissionInfoPanel2.getToSP(),
                                        this.leftMissionInfoPanel1.getClassification(),
                                        this.leftMissionInfoPanel1.getAdditionalText(),
                                        this.rightMissionInfoPanel2.getAdditionalText(),
                                        this.additionalTextPanel1.getAdditionalText(),
                                        this.getImagePath()
                                      );
        try{
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Save sf = new Save(mission);
            sf.save();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(this, "Mission failed to save, please try agian.");
        }finally{            
            this.setCursor(Cursor.getDefaultCursor());
        }
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().display();
            }
        });
    }

    @SuppressWarnings("empty-statement")
    private void doMainWindowFont() {
        try {

            //Font topSecretFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/convoy/resources/fonts/topSecret.ttf"));
            //Font captureItFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/convoy/resources/fonts/captureIt.ttf"));
            //captureItFont = captureItFont.deriveFont(Font.ITALIC, 15f);
            //finalizeLabel.setFont(captureItFont);
            //mainMenuLabel.setFont(captureItFont);
            //printLabel.setFont(captureItFont);
            //saveLabel.setFont(captureItFont);
        } catch (Exception ex) {
            ;
        }

    }

    private void setMainWindowButtonColor() {

        //Color desertStormColor = new  Color(194, 178, 128);
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
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel additionalInfoPanel;
    private convoy.gui.AdditionalTextPanel additionalTextPanel1;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem finalizeMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private convoy.gui.LeftMissionInfoPanel leftMissionInfoPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel missionNumberPanel;
    private javax.swing.JMenuItem newMenuItem;
    private convoy.gui.PicturePanel picturePanel2;
    private convoy.gui.RightMissionInfoPanel rightMissionInfoPanel2;
    private convoy.gui.VehicleGrid vehicleGrid1;
    private javax.swing.JMenuItem wateMarkMenu;
    // End of variables declaration//GEN-END:variables
}
