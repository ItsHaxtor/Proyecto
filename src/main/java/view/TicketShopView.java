package view;

import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicketShopView extends javax.swing.JPanel {

    private DefaultComboBoxModel<String> experiences;

    public TicketShopView() {
        initComponents();
        fillCombo();
        setVisibilidad();

    }

    private void setVisibilidad() {
        txtPurchaseInProgress.setVisible(false);
        btnNextStage.setVisible(false);
    }

    public void setCleaning() {
        btnCalculate.setVisible(true);
        btnMore.setVisible(true);
        btnLess.setVisible(true);
        setVisibilidad();
        txtNumberOfTickets.setText("1");
        txtTotal.setText("");
        txtId.setText(generateRoomCode());
    }

    private void fillCombo() {
        experiences = new DefaultComboBoxModel<>();
        String[] blankCategories = {"Vip", "General"};// arreglo simple de strings
        experiences.addAll(Arrays.asList(blankCategories)); // metodo para convertir un arreglo en un array
        cmbExperience.setModel(experiences);
    }

    public JPanel getTicketShopPanel() {
        return ticketShopPanel;
    }

    public JButton getBtnNextStage() {
        return btnNextStage;
    }

    public JLabel getTxtPurchaseInProgress() {
        return txtPurchaseInProgress;
    }

    public JLabel getSelectedMovie() {
        return selectedMovie;
    }

    public JLabel getTxtTotal() {
        return txtTotal;
    }

    public JButton getBtnMore() {
        return btnMore;
    }

    public JButton getBtnLess() {
        return btnLess;
    }

    public JComboBox getCmbExperience() {
        return cmbExperience;
    }

    public JLabel getTxtNumberOfTickets() {
        return txtNumberOfTickets;
    }

    public String getTxtId() {
        return txtId.getText();
    }

    public JLabel getTxtI() {
        return txtId;
    }

    public int getTxtNumberOfTicketsInt() {
        return Integer.parseInt(txtNumberOfTickets.getText());
    }

    public void SetTotal(double totalNow) {
        txtTotal.setText("Total: $" + totalNow);
    }

    public JButton getBtnCalculate() {
        return btnCalculate;
    }

    public String generateRoomCode() {
        //algoritmo para generar numeros
        String cod;
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddHHmmss"); //timestamp
        cod = ahora.format(formatter);
        return cod;
    }

    public void addPrincipalListener(ActionListener l) {
        btnLess.addActionListener(l);
        btnMore.addActionListener(l);
        btnCalculate.addActionListener(l);
        cmbExperience.addActionListener(l);
        btnNextStage.addActionListener(l);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtNumberOfTickets1 = new javax.swing.JLabel();
        ticketShopPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        selectedMovie = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumberOfTickets = new javax.swing.JLabel();
        btnMore = new javax.swing.JButton();
        btnLess = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        cmbExperience = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnNextStage = new javax.swing.JButton();
        txtPurchaseInProgress = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("number of tickets");

        txtNumberOfTickets1.setBackground(new java.awt.Color(153, 153, 153));
        txtNumberOfTickets1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtNumberOfTickets1.setForeground(new java.awt.Color(255, 255, 255));
        txtNumberOfTickets1.setOpaque(true);

        ticketShopPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Sans Serif Collection", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ticket Shop");

        selectedMovie.setBackground(new java.awt.Color(153, 153, 153));
        selectedMovie.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        selectedMovie.setForeground(new java.awt.Color(255, 255, 255));
        selectedMovie.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selected Movie:");

        jLabel3.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Movie Information");

        jLabel9.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Number of Tickets:");

        txtNumberOfTickets.setBackground(new java.awt.Color(153, 153, 153));
        txtNumberOfTickets.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtNumberOfTickets.setForeground(new java.awt.Color(255, 255, 255));
        txtNumberOfTickets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumberOfTickets.setText("1");
        txtNumberOfTickets.setOpaque(true);

        btnMore.setBackground(new java.awt.Color(0, 204, 51));
        btnMore.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnMore.setText("+");

        btnLess.setBackground(new java.awt.Color(255, 0, 0));
        btnLess.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnLess.setText("-");

        jLabel11.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total:");

        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setOpaque(true);

        cmbExperience.setBackground(new java.awt.Color(153, 153, 153));

        jLabel12.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Experience:");

        jLabel13.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID:");

        txtId.setBackground(new java.awt.Color(153, 153, 153));
        txtId.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setOpaque(true);

        btnCalculate.setBackground(new java.awt.Color(0, 153, 51));
        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(this::btnCalculateActionPerformed);

        btnNextStage.setBackground(new java.awt.Color(255, 255, 0));
        btnNextStage.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        btnNextStage.setText("NextStage");

        txtPurchaseInProgress.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        txtPurchaseInProgress.setForeground(new java.awt.Color(255, 255, 255));
        txtPurchaseInProgress.setText("Purchase in progress...");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrada_cinema_262x224_.png"))); // NOI18N

        javax.swing.GroupLayout ticketShopPanelLayout = new javax.swing.GroupLayout(ticketShopPanel);
        ticketShopPanel.setLayout(ticketShopPanelLayout);
        ticketShopPanelLayout.setHorizontalGroup(
            ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketShopPanelLayout.createSequentialGroup()
                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticketShopPanelLayout.createSequentialGroup()
                        .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ticketShopPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ticketShopPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ticketShopPanelLayout.createSequentialGroup()
                                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ticketShopPanelLayout.createSequentialGroup()
                                        .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNumberOfTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addComponent(btnMore, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLess, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ticketShopPanelLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ticketShopPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtPurchaseInProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ticketShopPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ticketShopPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(451, 451, 451)
                        .addComponent(btnNextStage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2713, Short.MAX_VALUE))
        );
        ticketShopPanelLayout.setVerticalGroup(
            ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketShopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(selectedMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMore, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLess, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ticketShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCalculate)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(ticketShopPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPurchaseInProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnNextStage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ticketShopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ticketShopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnLess;
    private javax.swing.JButton btnMore;
    private javax.swing.JButton btnNextStage;
    private javax.swing.JComboBox<String> cmbExperience;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel selectedMovie;
    private javax.swing.JPanel ticketShopPanel;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtNumberOfTickets;
    private javax.swing.JLabel txtNumberOfTickets1;
    private javax.swing.JLabel txtPurchaseInProgress;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
