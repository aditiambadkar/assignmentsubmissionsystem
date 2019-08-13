
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
public class CheckAssignmentsPage extends javax.swing.JFrame {
    public static int assignmentId=0;
    public static int studentId=0;
    /**
     * Creates new form CheckAssignmentsPage
     */
    public CheckAssignmentsPage() {
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
        jLabel1 = new javax.swing.JLabel();
        LowerPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        MarksTextArea = new javax.swing.JTextField();
        StudentIdLabel = new javax.swing.JLabel();
        AssignmentIdTextArea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FileContents = new javax.swing.JTextArea();
        ViewButton = new javax.swing.JButton();
        AssignmentIdLabel1 = new javax.swing.JLabel();
        StudentIdTextArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        UpperPanel.setBackground(new java.awt.Color(167, 167, 231));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assignment Evaluation");

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
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

        SubmitButton.setBackground(new java.awt.Color(255, 255, 255));
        SubmitButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(0, 0, 51));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        MarksTextArea.setText("Enter Marks Here");

        javax.swing.GroupLayout LowerPanelLayout = new javax.swing.GroupLayout(LowerPanel);
        LowerPanel.setLayout(LowerPanelLayout);
        LowerPanelLayout.setHorizontalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LowerPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(MarksTextArea)
                .addGap(18, 18, 18)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LowerPanelLayout.setVerticalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(SubmitButton)
                    .addComponent(MarksTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        StudentIdLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        StudentIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StudentIdLabel.setText("Enter Student ID:");

        AssignmentIdTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignmentIdTextAreaActionPerformed(evt);
            }
        });

        FileContents.setColumns(20);
        FileContents.setRows(5);
        jScrollPane1.setViewportView(FileContents);

        ViewButton.setForeground(new java.awt.Color(0, 0, 0));
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        AssignmentIdLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        AssignmentIdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AssignmentIdLabel1.setText("Enter Assignment ID:");

        StudentIdTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIdTextAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StudentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AssignmentIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ViewButton))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StudentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AssignmentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AssignmentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AssignmentIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        TeacherLoginPage teacherlogin=new TeacherLoginPage();
        teacherlogin.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        if(MarksTextArea.getText()=="")
        {
            JOptionPane.showMessageDialog(this,"Fields cannot be empty!!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
            int marks=Integer.parseInt(MarksTextArea.getText());
            int flag=LoginFrame.op.gradeAssignment(assignmentId,studentId,marks);
            if(flag==1)
            {
                JOptionPane.showMessageDialog(this,"Assignment graded successfully","Success",JOptionPane.ERROR_MESSAGE);
                AssignmentIdTextArea.setText("");
                StudentIdTextArea.setText("");
                MarksTextArea.setText("Enter Marks Here");
                assignmentId=0;
                studentId=0;
                FileContents.setText("");
           }
           }
           catch(Exception e)
           {
             JOptionPane.showMessageDialog(this,"Marks is an integer value","Error",JOptionPane.ERROR_MESSAGE);
             MarksTextArea.setText("");
           }
        }
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void AssignmentIdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignmentIdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignmentIdTextAreaActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        if(AssignmentIdTextArea.getText().isEmpty() || StudentIdTextArea.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Fields cannot be empty!!","Error",JOptionPane.ERROR_MESSAGE);
            AssignmentIdTextArea.setText("");
            StudentIdTextArea.setText("");
       }
        else
        {
            try
            {
                int flag=0;
            assignmentId=Integer.parseInt(AssignmentIdTextArea.getText());
            studentId=Integer.parseInt(StudentIdTextArea.getText());
            flag=LoginFrame.op.checkStudentAssignment(assignmentId,studentId);
            if(flag==0)
            {
                JOptionPane.showMessageDialog(this,"Student Assignment does not exist","Error",JOptionPane.ERROR_MESSAGE);
                AssignmentIdTextArea.setText("");
                StudentIdTextArea.setText("");
                FileContents.setText("");
            }
            else
            {
            String assignmentContents=LoginFrame.op.displayStudentAssignment(assignmentId,studentId);
            FileContents.setText(assignmentContents);
            FileContents.setLineWrap(true);
            FileContents.setWrapStyleWord(true);
            FileContents.setEditable(false);
            }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Assignment Id and Student Id are numeric values!!","Error",JOptionPane.ERROR_MESSAGE);
                AssignmentIdTextArea.setText("");
                StudentIdTextArea.setText("");
            }
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void StudentIdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentIdTextAreaActionPerformed

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
            java.util.logging.Logger.getLogger(CheckAssignmentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckAssignmentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckAssignmentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckAssignmentsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckAssignmentsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssignmentIdLabel1;
    private javax.swing.JTextField AssignmentIdTextArea;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextArea FileContents;
    private javax.swing.JPanel LowerPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField MarksTextArea;
    private javax.swing.JLabel StudentIdLabel;
    private javax.swing.JTextField StudentIdTextArea;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
