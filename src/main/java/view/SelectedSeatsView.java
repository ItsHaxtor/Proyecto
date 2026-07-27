package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class SelectedSeatsView extends javax.swing.JPanel {


    public SelectedSeatsView() {
        initComponents();
    }
  

    public JPanel getPnlSelectedSeatsView() {
        return pnlSelectedSeatsView;
    }
    
// set colors
    public void setColorPnlBtn1(Color color) {
        pnlBtn1.setBackground(color);
    }

    public void setColorPnlBtn2(Color color) {
        pnlBtn2.setBackground(color);
    }

    public void setColorPnlBtn3(Color color) {
        pnlBtn3.setBackground(color);
    }

    public void setColorPnlBtn4(Color color) {
        pnlBtn4.setBackground(color);
    }

    public void setColorPnlBtn5(Color color) {
        pnlBtn5.setBackground(color);
    }

    public void setColorPnlBtn6(Color color) {
        pnlBtn6.setBackground(color);
    }

    public void setColorPnlBtn7(Color color) {
        pnlBtn7.setBackground(color);
    }

    public void setColorPnlBtn8(Color color) {
        pnlBtn8.setBackground(color);
    }
    //get colors
    public Color getColorPnlBtn1(){
     return pnlBtn1.getBackground();
    }
     public Color getColorPnlBtn2(){
     return pnlBtn2.getBackground();
    }
      public Color getColorPnlBtn3(){
     return pnlBtn3.getBackground();
    }
      public Color getColorPnlBtn4(){
     return pnlBtn4.getBackground();
    }
      public Color getColorPnlBtn5(){
     return pnlBtn5.getBackground();
    }
      public Color getColorPnlBtn6(){
     return pnlBtn6.getBackground();
    }
      public Color getColorPnlBtn7(){
     return pnlBtn7.getBackground();
    }
      public Color getColorPnlBtn8(){
     return pnlBtn8.getBackground();
    }

    //getters buttons
    public JButton getBtnNextStage() {
        return btnNextStage;
    }

    //getters toggle buttons
    public JToggleButton getBtnSeat1() {
        return btnSeat1;
    }

    public JToggleButton getBtnSeat2() {
        return btnSeat2;
    }

    public JToggleButton getBtnSeat3() {
        return btnSeat3;
    }

    public JToggleButton getBtnSeat4() {
        return btnSeat4;
    }

    public JToggleButton getBtnSeat5() {
        return btnSeat5;
    }

    public JToggleButton getBtnSeat6() {
        return btnSeat6;
    }

    public JToggleButton getBtnSeat7() {
        return btnSeat7;
    }

    public JToggleButton getBtnSeat8() {
        return btnSeat8;
    }

    //getters labels
    public JLabel getTxtNumberOfSeats() {
        return txtNumberOfSeats;
    }



    //listener
    public void addPrincipalListener(ActionListener l) {
        btnSeat1.addActionListener(l);
        btnSeat2.addActionListener(l);
        btnSeat3.addActionListener(l);
        btnSeat4.addActionListener(l);
        btnSeat5.addActionListener(l);
        btnSeat6.addActionListener(l);
        btnSeat7.addActionListener(l);
        btnSeat8.addActionListener(l);
        btnNextStage.addActionListener(l);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSelectedSeatsView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBtn1 = new javax.swing.JPanel();
        btnSeat1 = new javax.swing.JToggleButton();
        txtNumberOfSeats = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlBtn2 = new javax.swing.JPanel();
        btnSeat2 = new javax.swing.JToggleButton();
        pnlBtn3 = new javax.swing.JPanel();
        btnSeat3 = new javax.swing.JToggleButton();
        pnlBtn4 = new javax.swing.JPanel();
        btnSeat4 = new javax.swing.JToggleButton();
        pnlBtn8 = new javax.swing.JPanel();
        btnSeat8 = new javax.swing.JToggleButton();
        pnlBtn7 = new javax.swing.JPanel();
        btnSeat7 = new javax.swing.JToggleButton();
        pnlBtn6 = new javax.swing.JPanel();
        btnSeat6 = new javax.swing.JToggleButton();
        pnlBtn5 = new javax.swing.JPanel();
        btnSeat5 = new javax.swing.JToggleButton();
        btnNextStage = new javax.swing.JButton();

        pnlSelectedSeatsView.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/screen.png"))); // NOI18N

        pnlBtn1.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat1.setText("A1");

        javax.swing.GroupLayout pnlBtn1Layout = new javax.swing.GroupLayout(pnlBtn1);
        pnlBtn1.setLayout(pnlBtn1Layout);
        pnlBtn1Layout.setHorizontalGroup(
            pnlBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn1Layout.setVerticalGroup(
            pnlBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNumberOfSeats.setBackground(new java.awt.Color(255, 255, 255));
        txtNumberOfSeats.setFont(new java.awt.Font("Sans Serif Collection", 0, 18)); // NOI18N
        txtNumberOfSeats.setText("0");
        txtNumberOfSeats.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number of Seats to Select");

        pnlBtn2.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat2.setText("A2");

        javax.swing.GroupLayout pnlBtn2Layout = new javax.swing.GroupLayout(pnlBtn2);
        pnlBtn2.setLayout(pnlBtn2Layout);
        pnlBtn2Layout.setHorizontalGroup(
            pnlBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn2Layout.setVerticalGroup(
            pnlBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBtn3.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat3.setText("A3");

        javax.swing.GroupLayout pnlBtn3Layout = new javax.swing.GroupLayout(pnlBtn3);
        pnlBtn3.setLayout(pnlBtn3Layout);
        pnlBtn3Layout.setHorizontalGroup(
            pnlBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn3Layout.setVerticalGroup(
            pnlBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBtn4.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat4.setText("A4");

        javax.swing.GroupLayout pnlBtn4Layout = new javax.swing.GroupLayout(pnlBtn4);
        pnlBtn4.setLayout(pnlBtn4Layout);
        pnlBtn4Layout.setHorizontalGroup(
            pnlBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn4Layout.setVerticalGroup(
            pnlBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBtn8.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat8.setText("A8");

        javax.swing.GroupLayout pnlBtn8Layout = new javax.swing.GroupLayout(pnlBtn8);
        pnlBtn8.setLayout(pnlBtn8Layout);
        pnlBtn8Layout.setHorizontalGroup(
            pnlBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn8Layout.setVerticalGroup(
            pnlBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn8Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBtn7.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat7.setText("A7");

        javax.swing.GroupLayout pnlBtn7Layout = new javax.swing.GroupLayout(pnlBtn7);
        pnlBtn7.setLayout(pnlBtn7Layout);
        pnlBtn7Layout.setHorizontalGroup(
            pnlBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat7, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn7Layout.setVerticalGroup(
            pnlBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBtn6.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat6.setText("A6");

        javax.swing.GroupLayout pnlBtn6Layout = new javax.swing.GroupLayout(pnlBtn6);
        pnlBtn6.setLayout(pnlBtn6Layout);
        pnlBtn6Layout.setHorizontalGroup(
            pnlBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat6, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn6Layout.setVerticalGroup(
            pnlBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBtn5.setBackground(new java.awt.Color(204, 255, 204));

        btnSeat5.setText("A5");

        javax.swing.GroupLayout pnlBtn5Layout = new javax.swing.GroupLayout(pnlBtn5);
        pnlBtn5.setLayout(pnlBtn5Layout);
        pnlBtn5Layout.setHorizontalGroup(
            pnlBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeat5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBtn5Layout.setVerticalGroup(
            pnlBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtn5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnSeat5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnNextStage.setBackground(new java.awt.Color(255, 255, 0));
        btnNextStage.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnNextStage.setText("Next Stage");
        btnNextStage.setToolTipText("");

        javax.swing.GroupLayout pnlSelectedSeatsViewLayout = new javax.swing.GroupLayout(pnlSelectedSeatsView);
        pnlSelectedSeatsView.setLayout(pnlSelectedSeatsViewLayout);
        pnlSelectedSeatsViewLayout.setHorizontalGroup(
            pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNextStage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                        .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                                .addComponent(pnlBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(pnlBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                                .addComponent(pnlBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(pnlBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)
                        .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );
        pnlSelectedSeatsViewLayout.setVerticalGroup(
            pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                        .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                                .addComponent(pnlBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelectedSeatsViewLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlBtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSelectedSeatsViewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(pnlSelectedSeatsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextStage))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSelectedSeatsView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSelectedSeatsView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNextStage;
    private javax.swing.JToggleButton btnSeat1;
    private javax.swing.JToggleButton btnSeat2;
    private javax.swing.JToggleButton btnSeat3;
    private javax.swing.JToggleButton btnSeat4;
    private javax.swing.JToggleButton btnSeat5;
    private javax.swing.JToggleButton btnSeat6;
    private javax.swing.JToggleButton btnSeat7;
    private javax.swing.JToggleButton btnSeat8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlBtn1;
    private javax.swing.JPanel pnlBtn2;
    private javax.swing.JPanel pnlBtn3;
    private javax.swing.JPanel pnlBtn4;
    private javax.swing.JPanel pnlBtn5;
    private javax.swing.JPanel pnlBtn6;
    private javax.swing.JPanel pnlBtn7;
    private javax.swing.JPanel pnlBtn8;
    private javax.swing.JPanel pnlSelectedSeatsView;
    private javax.swing.JLabel txtNumberOfSeats;
    // End of variables declaration//GEN-END:variables
}
