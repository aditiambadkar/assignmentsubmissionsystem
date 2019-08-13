
import java.io.FileNotFoundException;
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
public class UploadSolutionFrame extends javax.swing.JFrame {

    /**
     * Creates new form UploadSolutionFrame
     */
    public UploadSolutionFrame() {
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
        UploadSolutionLabel = new javax.swing.JLabel();
        LowerPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        AssignmentIdLabel = new javax.swing.JLabel();
        AssignmentIdTextArea = new javax.swing.JTextField();
        SolutionNameLabel = new javax.swing.JLabel();
        SolutionNameTextArea = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        UploadFilePathLabel = new javax.swing.JLabel();
        FilePathTextArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        UpperPanel.setBackground(new java.awt.Color(167, 167, 231));

        UploadSolutionLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        UploadSolutionLabel.setForeground(new java.awt.Color(255, 255, 255));
        UploadSolutionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UploadSolutionLabel.setText("Upload Solutions here");

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(UploadSolutionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(UploadSolutionLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        LowerPanel.setBackground(new java.awt.Color(167, 167, 231));

        BackButton.setBackground(new java.awt.Color(255, 255, 255));
        BackButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(0, 0, 51));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LowerPanelLayout = new javax.swing.GroupLayout(LowerPanel);
        LowerPanel.setLayout(LowerPanelLayout);
        LowerPanelLayout.setHorizontalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LowerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        LowerPanelLayout.setVerticalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        AssignmentIdLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        AssignmentIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AssignmentIdLabel.setText("Enter Assignment ID:");

        AssignmentIdTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignmentIdTextAreaActionPerformed(evt);
            }
        });

        SolutionNameLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SolutionNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SolutionNameLabel.setText("Enter Solution Name:");

        SolutionNameTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolutionNameTextAreaActionPerformed(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(255, 255, 255));
        SubmitButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(0, 0, 51));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        UploadFilePathLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UploadFilePathLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UploadFilePathLabel.setText("Upload File Path:");

        FilePathTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilePathTextAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(UploadFilePathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FilePathTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SolutionNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AssignmentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AssignmentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SolutionNameTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AssignmentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignmentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SolutionNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SolutionNameTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadFilePathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilePathTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(SubmitButton)
                .addGap(31, 31, 31)
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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        TeacherLoginPage teacherlogin=new TeacherLoginPage();
        teacherlogin.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        if(AssignmentIdTextArea.getText().isEmpty() ||SolutionNameTextArea.getText().isEmpty() || FilePathTextArea.getText().isEmpty()){
            AssignmentIdTextArea.setText("");
            SolutionNameTextArea.setText("");
            FilePathTextArea.setText("");
            JOptionPane.showMessageDialog(this,"Fields cannot be empty!!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {   
           try{
            int flag1=0;
            int flag2=0;
            int Id=Integer.parseInt(AssignmentIdTextArea.getText());
            flag1=LoginFrame.op.CheckExistingSolution(Id);
            flag2=LoginFrame.op.checkExistingAssignmentTeacher(Id);
            if(flag2==0){
                JOptionPane.showMessageDialog(this,"Assignment Does not exists!!!!","Error",JOptionPane.ERROR_MESSAGE);
                AssignmentIdTextArea.setText("");
                SolutionNameTextArea.setText("");
                FilePathTextArea.setText("");
            }
            else{
            if(flag1==1){
                JOptionPane.showMessageDialog(this,"Solution already exists!!","Error",JOptionPane.ERROR_MESSAGE);
                AssignmentIdTextArea.setText("");
                SolutionNameTextArea.setText("");
                FilePathTextArea.setText("");
            
            }
            else{
            int flag = 0;
           
                flag = LoginFrame.op.uploadSolutionTeacher(AssignmentIdTextArea.getText(),SolutionNameTextArea.getText(),FilePathTextArea.getText());
                if(flag!=0)
                {
                    JOptionPane.showMessageDialog(this,"Solution uploaded successfully!!","Success",JOptionPane.ERROR_MESSAGE);
                }
            } 
           }
           }
           catch(FileNotFoundException e){
               JOptionPane.showMessageDialog(this,"Incorrect file path!!","Error",JOptionPane.ERROR_MESSAGE);
                UploadSolutionFrame uploadsolutionFrame = new UploadSolutionFrame();
                uploadsolutionFrame.setVisible(true);
                this.setVisible(false);
                dispose();
           }
            catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(this,"Assignment Id is a numeric value","Error",JOptionPane.ERROR_MESSAGE);
                UploadSolutionFrame uploadsolutionFrame = new UploadSolutionFrame();
                uploadsolutionFrame.setVisible(true);
                this.setVisible(false);
                dispose();
            }
            
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void AssignmentIdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignmentIdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignmentIdTextAreaActionPerformed

    private void SolutionNameTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolutionNameTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SolutionNameTextAreaActionPerformed

    private void FilePathTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilePathTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilePathTextAreaActionPerformed

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
            java.util.logging.Logger.getLogger(UploadSolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadSolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadSolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadSolutionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadSolutionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssignmentIdLabel;
    private javax.swing.JTextField AssignmentIdTextArea;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField FilePathTextArea;
    private javax.swing.JPanel LowerPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel SolutionNameLabel;
    private javax.swing.JTextField SolutionNameTextArea;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel UploadFilePathLabel;
    private javax.swing.JLabel UploadSolutionLabel;
    private javax.swing.JPanel UpperPanel;
    // End of variables declaration//GEN-END:variables
}