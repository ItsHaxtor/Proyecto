package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainView extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainView.class.getName());

    public MainView() {
        initComponents();
    }

    public JButton getBtnBillBoard() {
        return btnBillBoard;
    }

    public JButton getBtnCandyShop() {
        return btnCandyShop;
    }

    public JButton getBtnLogo() {
        return btnLogo;
    }

    public JButton getBtnSynopsis() {
        return btnSynopsis;
    }

    public JButton getBtnCreditos() {
        return btnCredits;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void addPrincipalListener(ActionListener l) {
        btnLogo.addActionListener(l);
        btnCandyShop.addActionListener(l);
        btnBillBoard.addActionListener(l);
        btnSynopsis.addActionListener(l);
        btnCredits.addActionListener(l);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCred = new javax.swing.JPanel();
        btnLogo = new javax.swing.JButton();
        btnBillBoard = new javax.swing.JButton();
        btnCandyShop = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        btnSynopsis = new javax.swing.JButton();
        btnCredits = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnCred.setBackground(new java.awt.Color(51, 51, 51));

        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N

        btnBillBoard.setBackground(new java.awt.Color(0, 0, 0));
        btnBillBoard.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnBillBoard.setForeground(new java.awt.Color(255, 255, 255));
        btnBillBoard.setText("BillBoard");

        btnCandyShop.setBackground(new java.awt.Color(0, 0, 0));
        btnCandyShop.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnCandyShop.setForeground(new java.awt.Color(255, 255, 255));
        btnCandyShop.setText("Candys");

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        btnSynopsis.setBackground(new java.awt.Color(0, 0, 0));
        btnSynopsis.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnSynopsis.setForeground(new java.awt.Color(255, 255, 255));
        btnSynopsis.setText("Synopsis");

        btnCredits.setBackground(new java.awt.Color(0, 0, 0));
        btnCredits.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        btnCredits.setForeground(new java.awt.Color(255, 255, 255));
        btnCredits.setText("Credits");

        javax.swing.GroupLayout btnCredLayout = new javax.swing.GroupLayout(btnCred);
        btnCred.setLayout(btnCredLayout);
        btnCredLayout.setHorizontalGroup(
            btnCredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBillBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(btnSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnCandyShop, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnCredLayout.setVerticalGroup(
            btnCredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCredLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnCredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCredLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(btnCredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCandyShop, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBillBoard, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillBoard;
    private javax.swing.JButton btnCandyShop;
    private javax.swing.JPanel btnCred;
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnLogo;
    private javax.swing.JButton btnSynopsis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
