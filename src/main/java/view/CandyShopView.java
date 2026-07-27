package view;

import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandyShopView extends javax.swing.JPanel {

    public CandyShopView() {
        initComponents();
        txtId.setText(generateRoomCode());
    }

    public void Cleaning() {
        txtSelected.setText("0");
        txtTotal.setText("");
        txtId.setText(generateRoomCode());
    }

    public JPanel getCandyPanel() {
        return candyPanel;
    }

    public JButton getSaveBuy() {
        return btnSaveBuy;
    }

    public JButton getBtnMore1() {
        return btnMore1;
    }

    public JButton getBtnMore2() {
        return btnMore2;
    }

    public JButton getBtnMore3() {
        return btnMore3;
    }

    public JButton getBtnLess1() {
        return btnLess1;
    }

    public JButton getBtnLess2() {
        return btnLess2;
    }

    public JButton getBtnLess3() {
        return btnLess3;
    }

    public String getLabelPopCorn() {
        return txtLabelPopCorn.getText();
    }

    public JLabel getTxtSelectedCandys() {
        return txtSelected;
    }

    public String getTxtId() {
        return txtId.getText();
    }

    public JLabel getTxtTotal() {
        return txtTotal;
    }

    public void addPrincipalListener(ActionListener l) {
        btnSaveBuy.addActionListener(l);
        btnLess1.addActionListener(l);
        btnLess2.addActionListener(l);
        btnLess3.addActionListener(l);
        btnMore1.addActionListener(l);
        btnMore2.addActionListener(l);
        btnMore3.addActionListener(l);
    }

    public String generateRoomCode() {
        //algoritmo para generar numeros
        String cod;
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddHHmmss"); //timestamp
        cod = ahora.format(formatter);
        return cod;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        candyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMore1 = new javax.swing.JButton();
        btnLess1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLabelPopCorn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnMore2 = new javax.swing.JButton();
        btnMore3 = new javax.swing.JButton();
        btnLess2 = new javax.swing.JButton();
        btnLess3 = new javax.swing.JButton();
        btnSaveBuy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtSelected = new javax.swing.JLabel();

        candyPanel.setBackground(new java.awt.Color(228, 184, 80));
        candyPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Canguil.jpeg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));

        jLabel1.setFont(new java.awt.Font("Sans Serif Collection", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CandyShopTitle (1).png"))); // NOI18N

        btnMore1.setBackground(new java.awt.Color(0, 204, 51));
        btnMore1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        btnMore1.setText("+");

        btnLess1.setBackground(new java.awt.Color(255, 51, 0));
        btnLess1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        btnLess1.setText("-");
        btnLess1.addActionListener(this::btnLess1ActionPerformed);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nachos.jpeg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CocaCola.jpeg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));

        txtLabelPopCorn.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        txtLabelPopCorn.setText("PopCorn");

        jLabel6.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel6.setText("Nachos");

        jLabel7.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel7.setText("Gaseosa");

        btnMore2.setBackground(new java.awt.Color(0, 204, 51));
        btnMore2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        btnMore2.setText("+");

        btnMore3.setBackground(new java.awt.Color(0, 204, 51));
        btnMore3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        btnMore3.setText("+");

        btnLess2.setBackground(new java.awt.Color(255, 51, 0));
        btnLess2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        btnLess2.setText("-");
        btnLess2.addActionListener(this::btnLess2ActionPerformed);

        btnLess3.setBackground(new java.awt.Color(255, 51, 0));
        btnLess3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        btnLess3.setText("-");
        btnLess3.addActionListener(this::btnLess3ActionPerformed);

        btnSaveBuy.setBackground(new java.awt.Color(255, 255, 0));
        btnSaveBuy.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnSaveBuy.setText("Save Buy");
        btnSaveBuy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel8.setText("Selected Candy's");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel9.setText("Total");
        jLabel9.setOpaque(true);

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        txtTotal.setOpaque(true);

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        txtId.setOpaque(true);

        txtSelected.setBackground(new java.awt.Color(255, 255, 255));
        txtSelected.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        txtSelected.setText("0");
        txtSelected.setOpaque(true);

        javax.swing.GroupLayout candyPanelLayout = new javax.swing.GroupLayout(candyPanel);
        candyPanel.setLayout(candyPanelLayout);
        candyPanelLayout.setHorizontalGroup(
            candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(jLabel3)
                .addGap(184, 184, 184)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(candyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLabelPopCorn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(candyPanelLayout.createSequentialGroup()
                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(candyPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(candyPanelLayout.createSequentialGroup()
                                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(candyPanelLayout.createSequentialGroup()
                                        .addComponent(btnMore1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLess1)))
                                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(candyPanelLayout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(btnMore2)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLess2))
                                    .addGroup(candyPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(candyPanelLayout.createSequentialGroup()
                                                .addComponent(txtSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(candyPanelLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)))
                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(candyPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnMore3)
                        .addGap(18, 18, 18)
                        .addComponent(btnLess3)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, candyPanelLayout.createSequentialGroup()
                        .addComponent(btnSaveBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        candyPanelLayout.setVerticalGroup(
            candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(candyPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLabelPopCorn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(candyPanelLayout.createSequentialGroup()
                        .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(candyPanelLayout.createSequentialGroup()
                                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMore1)
                                    .addComponent(btnLess1)))
                            .addGroup(candyPanelLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLess2)
                                    .addComponent(btnMore2))))
                        .addGap(14, 14, 14)
                        .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(candyPanelLayout.createSequentialGroup()
                                .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSaveBuy)
                                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(candyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(candyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMore3)
                            .addComponent(btnLess3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(candyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(candyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLess1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLess1ActionPerformed

    private void btnLess2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLess2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLess2ActionPerformed

    private void btnLess3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLess3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLess3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLess1;
    private javax.swing.JButton btnLess2;
    private javax.swing.JButton btnLess3;
    private javax.swing.JButton btnMore1;
    private javax.swing.JButton btnMore2;
    private javax.swing.JButton btnMore3;
    private javax.swing.JButton btnSaveBuy;
    private javax.swing.JPanel candyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtLabelPopCorn;
    private javax.swing.JLabel txtSelected;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
