/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.pro.software.academicosexta;

/**
 *
 * @author Andreia
 */
public class MostraAlunosCursoTela extends javax.swing.JFrame {

    /**
     * Creates new form alunosCursoFrame
     */
    public MostraAlunosCursoTela(Curso curso) {
        super("Alunos por Curso");
        initComponents();
        idCursoLabel.setText(Integer.toString(curso.getId()));
        nomeCursoLabel.setText(curso.getNome());
        linkexercicioCursoLabel.setText(curso.getLinkexercicio());
        linkvideoaulaCursoLabel.setText(curso.getLinkexercicio());
        setLocationRelativeTo(null);
    }

    MostraAlunosCursoTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alunosCursoPanel = new javax.swing.JPanel();
        idCursoLabel = new javax.swing.JLabel();
        nomeCursoLabel = new javax.swing.JLabel();
        linkexercicioCursoLabel = new javax.swing.JLabel();
        voltarAlunosCursoButtom = new javax.swing.JButton();
        sairAlunosCursoButtom = new javax.swing.JButton();
        linkvideoaulaCursoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idCursoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("id curso"));

        nomeCursoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("nome curso"));

        linkexercicioCursoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("tipo curso"));

        voltarAlunosCursoButtom.setText("Voltar");
        voltarAlunosCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarAlunosCursoButtomActionPerformed(evt);
            }
        });

        sairAlunosCursoButtom.setText("Sair");
        sairAlunosCursoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairAlunosCursoButtomActionPerformed(evt);
            }
        });

        linkvideoaulaCursoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("tipo curso"));

        javax.swing.GroupLayout alunosCursoPanelLayout = new javax.swing.GroupLayout(alunosCursoPanel);
        alunosCursoPanel.setLayout(alunosCursoPanelLayout);
        alunosCursoPanelLayout.setHorizontalGroup(
            alunosCursoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosCursoPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(idCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(nomeCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunosCursoPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(voltarAlunosCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(sairAlunosCursoButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunosCursoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(linkexercicioCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(alunosCursoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunosCursoPanelLayout.createSequentialGroup()
                    .addContainerGap(256, Short.MAX_VALUE)
                    .addComponent(linkvideoaulaCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(233, 233, 233)))
        );
        alunosCursoPanelLayout.setVerticalGroup(
            alunosCursoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosCursoPanelLayout.createSequentialGroup()
                .addGroup(alunosCursoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alunosCursoPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(nomeCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alunosCursoPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(idCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addComponent(linkexercicioCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(alunosCursoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltarAlunosCursoButtom, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(sairAlunosCursoButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(alunosCursoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(alunosCursoPanelLayout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(linkvideoaulaCursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(alunosCursoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(alunosCursoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairAlunosCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairAlunosCursoButtomActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairAlunosCursoButtomActionPerformed

    private void voltarAlunosCursoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarAlunosCursoButtomActionPerformed
        CursosTela ct = new CursosTela();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarAlunosCursoButtomActionPerformed

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
            java.util.logging.Logger.getLogger(MostraAlunosCursoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostraAlunosCursoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostraAlunosCursoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostraAlunosCursoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MostraAlunosCursoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alunosCursoPanel;
    private javax.swing.JLabel idCursoLabel;
    private javax.swing.JLabel linkexercicioCursoLabel;
    private javax.swing.JLabel linkvideoaulaCursoLabel;
    private javax.swing.JLabel nomeCursoLabel;
    private javax.swing.JButton sairAlunosCursoButtom;
    private javax.swing.JButton voltarAlunosCursoButtom;
    // End of variables declaration//GEN-END:variables
}
