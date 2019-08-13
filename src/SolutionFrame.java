
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chetana
 */
public class SolutionFrame extends javax.swing.JFrame {

    /**
     * Creates new form SolutionFrame
     */
    public SolutionFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        UpperPanel = new javax.swing.JPanel();
        ViewSolutionLabel = new javax.swing.JLabel();
        LowerPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        AssignmentIdlabel = new javax.swing.JLabel();
        AssignmentIdTextArea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SolutionContent = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        UpperPanel.setBackground(new java.awt.Color(167, 167, 231));

        ViewSolutionLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ViewSolutionLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewSolutionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewSolutionLabel.setText("View Solutions");

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(ViewSolutionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ViewSolutionLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        LowerPanel.setBackground(new java.awt.Color(167, 167, 231));

        BackButton.setForeground(new java.awt.Color(0, 0, 0));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ViewButton.setForeground(new java.awt.Color(0, 0, 0));
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LowerPanelLayout = new javax.swing.GroupLayout(LowerPanel);
        LowerPanel.setLayout(LowerPanelLayout);
        LowerPanelLayout.setHorizontalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LowerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        LowerPanelLayout.setVerticalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(ViewButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        AssignmentIdlabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        AssignmentIdlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AssignmentIdlabel.setText("Enter Assignment ID:");

        AssignmentIdTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignmentIdTextAreaActionPerformed(evt);
            }
        });

        SolutionContent.setColumns(20);
        SolutionContent.setRows(5);
        jScrollPane1.setViewportView(SolutionContent);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(AssignmentIdlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AssignmentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AssignmentIdlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignmentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(LowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AssignmentIdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignmentIdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignmentIdTextAreaActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        SolutionContent.setText("");
        StudentLoginPage studentlogin=new StudentLoginPage();
        studentlogin.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        SolutionContent.setText("");
        if(AssignmentIdTextArea.getText()=="")
        {
            JOptionPane.showMessageDialog(this,"Fields cannot be empty!!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
            int flag=0;
            int assignmentId=Integer.parseInt(AssignmentIdTextArea.getText());
            flag=LoginFrame.op.CheckExistingSolution(assignmentId);
            if(flag==1){
            String str=LoginFrame.op.viewSolution(assignmentId);
            SolutionContent.setText(str);
            SolutionContent.setLineWrap(true);
            SolutionContent.setWrapStyleWord(true);
            SolutionContent.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(this,"Solution does not exists!!","Error",JOptionPane.ERROR_MESSAGE);
                AssignmentIdTextArea.setText("");
                SolutionContent.setText("");
            }
        }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Assignment Id is numeric value!!","Error",JOptionPane.ERROR_MESSAGE);
                AssignmentIdTextArea.setText("");
                SolutionContent.setText("");
            }
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolutionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AssignmentIdTextArea;
    private javax.swing.JLabel AssignmentIdlabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel LowerPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextArea SolutionContent;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel ViewSolutionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
