package view;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class CreditsView extends javax.swing.JPanel {

    public CreditsView() {
        initComponents();
    }

    public JPanel getPnlCredits() {
        return pnlCredits;
    }
     public void addPrincipalListener(ActionListener l) {
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCredits = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        pnlCredits.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrellas_230x248.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Créditos ");

        jTextPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("                             Proyecto: \n                             FISNEMA\n\n                       Desarrollado por:\n        Pazmiño Bonilla Mateo Sebastián\n      Chamorro Ramos Darlyn Valentina\n            León Centeno Dilan Ismael\n\n  Institución: Escuela Politécnica Nacional\n          Asignatura: Programación II\n Docente: Ing. Rivera Guevara Richard Paul\n                         Año: 2026\n  \n         ¡Gracias por visitar nuestro cine!");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrellasrotada_230x248.png"))); // NOI18N

        javax.swing.GroupLayout pnlCreditsLayout = new javax.swing.GroupLayout(pnlCredits);
        pnlCredits.setLayout(pnlCreditsLayout);
        pnlCreditsLayout.setHorizontalGroup(
            pnlCreditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditsLayout.createSequentialGroup()
                .addGroup(pnlCreditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditsLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCreditsLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1)))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(pnlCreditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCreditsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(373, 373, 373)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        pnlCreditsLayout.setVerticalGroup(
            pnlCreditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditsLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(pnlCreditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCreditsLayout.createSequentialGroup()
                    .addGroup(pnlCreditsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCreditsLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel3)
                            .addGap(113, 113, 113))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditsLayout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(jLabel2)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCredits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCredits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel pnlCredits;
    // End of variables declaration//GEN-END:variables
}
