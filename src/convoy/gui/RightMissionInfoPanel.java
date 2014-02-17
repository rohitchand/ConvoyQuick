/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convoy.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

/**
 *
 * @author MTM5313
 */
public class RightMissionInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form rightMissionInfoPanel
     */
    public RightMissionInfoPanel() {
        initComponents();
        doFonts();
    }
    
    private void doFonts(){
        
       try{ 
           
        Font captureItFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/convoy/resources/fonts/captureIt.ttf"));
        captureItFont = captureItFont.deriveFont(Font.ITALIC, 16f);
        
        accLabel.setFont(captureItFont);
        ccLabel.setFont(captureItFont);
        fromLabel.setFont(captureItFont);
        fromSPLabel.setFont(captureItFont);
        fromLinkUpLabel.setFont(captureItFont);
        toLabel.setFont(captureItFont);
        toSPLabel.setFont(captureItFont);
        toLinkUpLabel.setFont(captureItFont);
        stagingAreaLabel.setFont(captureItFont);
        
        
       }catch(FontFormatException | IOException ex){
           //ex.printStackTrace();
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

        ccLabel = new javax.swing.JLabel();
        ccTextField = new javax.swing.JTextField();
        accLabel = new javax.swing.JLabel();
        accTextField = new javax.swing.JTextField();
        stagingAreaLabel = new javax.swing.JLabel();
        stagingAreaTextField = new javax.swing.JTextField();
        fromLabel = new javax.swing.JLabel();
        toSPTextField = new javax.swing.JTextField();
        fromLinkUpLabel = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        fromSPLabel = new javax.swing.JLabel();
        fromLinkUpTextField = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        toLinkUpLabel = new javax.swing.JLabel();
        toLinkUpTextField = new javax.swing.JTextField();
        toSPLabel = new javax.swing.JLabel();
        fromSPTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        ccLabel.setText("CC - ");

        accLabel.setText("ACC - ");

        stagingAreaLabel.setText("Staging Area - ");

        fromLabel.setText("From - ");

        fromLinkUpLabel.setText("L/U -");

        fromSPLabel.setText("SP -");

        toLabel.setText("To -");

        toLinkUpLabel.setText("L/U -");

        toSPLabel.setText("SP -");

        jTextArea1.setColumns(50);
        jTextArea1.setRows(5);
        jTextArea1.setText("1\n2\n3\n4\n5\n6");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromLabel)
                            .addComponent(toLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromTextField)
                            .addComponent(toTextField))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toLinkUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromLinkUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fromLinkUpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toLinkUpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toSPLabel)
                            .addComponent(fromSPLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(toSPTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(fromSPTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ccLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stagingAreaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stagingAreaTextField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccLabel)
                    .addComponent(ccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accLabel)
                    .addComponent(accTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stagingAreaLabel)
                    .addComponent(stagingAreaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLabel)
                    .addComponent(fromSPLabel)
                    .addComponent(fromLinkUpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLinkUpLabel)
                    .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromSPTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLinkUpLabel)
                    .addComponent(toLinkUpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toSPLabel)
                    .addComponent(toSPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accLabel;
    private javax.swing.JTextField accTextField;
    private javax.swing.JLabel ccLabel;
    private javax.swing.JTextField ccTextField;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel fromLinkUpLabel;
    private javax.swing.JTextField fromLinkUpTextField;
    private javax.swing.JLabel fromSPLabel;
    private javax.swing.JTextField fromSPTextField1;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel stagingAreaLabel;
    private javax.swing.JTextField stagingAreaTextField;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel toLinkUpLabel;
    private javax.swing.JTextField toLinkUpTextField;
    private javax.swing.JLabel toSPLabel;
    private javax.swing.JTextField toSPTextField;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables
}
