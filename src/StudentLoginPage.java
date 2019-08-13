
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chetana
 */
public class StudentLoginPage extends javax.swing.JFrame {

    public static String studentName;
    public static String studentClass;
    /**
     * Creates new form StudentLoginPage
     */
    public StudentLoginPage() {
        initComponents();
        displayStudentInformation();
        DisplayTable();
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
        StudentNameLabel = new javax.swing.JLabel();
        LowerPanel = new javax.swing.JPanel();
        LogoutButton = new javax.swing.JButton();
        ViewGradedAssignmentButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AssignmentListTable = new javax.swing.JTable();
        ViewSolutionButton = new javax.swing.JButton();
        SubmitAssignmentButton = new javax.swing.JButton();
        ViewAssignmentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        UpperPanel.setBackground(new java.awt.Color(167, 167, 231));

        StudentNameLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        StudentNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        StudentNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentNameLabel.setText("student name");

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(StudentNameLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        LowerPanel.setBackground(new java.awt.Color(167, 167, 231));

        LogoutButton.setBackground(new java.awt.Color(255, 255, 255));
        LogoutButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(0, 0, 51));
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        ViewGradedAssignmentButton.setBackground(new java.awt.Color(255, 255, 255));
        ViewGradedAssignmentButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ViewGradedAssignmentButton.setForeground(new java.awt.Color(0, 0, 51));
        ViewGradedAssignmentButton.setText("View Graded Assignments");
        ViewGradedAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewGradedAssignmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LowerPanelLayout = new javax.swing.GroupLayout(LowerPanel);
        LowerPanel.setLayout(LowerPanelLayout);
        LowerPanelLayout.setHorizontalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewGradedAssignmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        LowerPanelLayout.setVerticalGroup(
            LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LowerPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(LowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewGradedAssignmentButton)
                    .addComponent(LogoutButton))
                .addContainerGap())
        );

        AssignmentListTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AssignmentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Assignment No", "Assignment Name", "Due DateSubject Id", "Subject Name", "Due Date"
            }
        ));
        jScrollPane1.setViewportView(AssignmentListTable);

        ViewSolutionButton.setBackground(new java.awt.Color(255, 255, 255));
        ViewSolutionButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ViewSolutionButton.setForeground(new java.awt.Color(0, 0, 51));
        ViewSolutionButton.setText("View Solution");
        ViewSolutionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSolutionButtonActionPerformed(evt);
            }
        });

        SubmitAssignmentButton.setBackground(new java.awt.Color(255, 255, 255));
        SubmitAssignmentButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        SubmitAssignmentButton.setForeground(new java.awt.Color(0, 0, 51));
        SubmitAssignmentButton.setText("Submit Assignment");
        SubmitAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitAssignmentButtonActionPerformed(evt);
            }
        });

        ViewAssignmentButton.setBackground(new java.awt.Color(255, 255, 255));
        ViewAssignmentButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ViewAssignmentButton.setForeground(new java.awt.Color(0, 0, 51));
        ViewAssignmentButton.setText("View Assignment");
        ViewAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAssignmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(SubmitAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(ViewAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewSolutionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewSolutionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmitAssignmentButton)
                    .addComponent(ViewAssignmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ViewSolutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSolutionButtonActionPerformed
        ViewSolutionFrame viewsolution=new ViewSolutionFrame();
        viewsolution.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ViewSolutionButtonActionPerformed

    private void ViewGradedAssignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewGradedAssignmentButtonActionPerformed
        // TODO add your handling code here:
        ViewGradedAssignmentsFrame viewframe=new ViewGradedAssignmentsFrame();
        viewframe.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ViewGradedAssignmentButtonActionPerformed

    private void SubmitAssignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitAssignmentButtonActionPerformed
        // TODO add your handling code here:
        UploadFileFrame uploadfileframe=new UploadFileFrame();
        uploadfileframe.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_SubmitAssignmentButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        
        LoginFrame loginframe=new LoginFrame();
        loginframe.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ViewAssignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAssignmentButtonActionPerformed
        // TODO add your handling code here:
        ViewAssignment viewassignment=new ViewAssignment();
        viewassignment.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_ViewAssignmentButtonActionPerformed
    
    public void DisplayTable(){
        DefaultTableModel Model=new DefaultTableModel(new String[]{"Assignment No","Assignment Name","Subject Id","Subject Name","Due Date"},0);
        ArrayList<StudentTeacher>TableEntries=LoginFrame.op.displayAssignmentStudent();
        int assignmentId;
        String assignmentName;
        Date dueDate;
        int subjectId;
        String subjectName;
        Iterator itr=TableEntries.iterator();
        
        while(itr.hasNext()){
           StudentTeacher obj=(StudentTeacher) itr.next();
           assignmentId=obj.assignmentId;
           assignmentName=obj.assignmentName;
           dueDate=obj.dueDate;
           subjectId=obj.subjectId;
           subjectName=obj.subjectName;
           Model.addRow(new Object[]{assignmentId,assignmentName,subjectId, subjectName,dueDate});
        }
       
        AssignmentListTable.setModel(Model);
        
        TableColumn col=AssignmentListTable.getColumnModel().getColumn(0);
        DefaultTableCellRenderer obj1=new DefaultTableCellHeaderRenderer();
        obj1.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
         AssignmentListTable.getColumnModel().getColumn(0).setHeaderRenderer(obj1);
        
        col.setCellRenderer(obj1);
        
        TableColumn col1=AssignmentListTable.getColumnModel().getColumn(1);
        DefaultTableCellRenderer obj2=new DefaultTableCellHeaderRenderer();
        obj2.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        AssignmentListTable.getColumnModel().getColumn(1).setHeaderRenderer(obj2);
        col1.setCellRenderer(obj2);
        
        TableColumn col2=AssignmentListTable.getColumnModel().getColumn(2);
        DefaultTableCellRenderer obj3=new DefaultTableCellHeaderRenderer();
        obj3.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        AssignmentListTable.getColumnModel().getColumn(2).setHeaderRenderer(obj3);
        col2.setCellRenderer(obj3);   
        
        TableColumn col3=AssignmentListTable.getColumnModel().getColumn(3);
        DefaultTableCellRenderer obj4=new DefaultTableCellHeaderRenderer();
        obj4.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        AssignmentListTable.getColumnModel().getColumn(3).setHeaderRenderer(obj4);
        col3.setCellRenderer(obj4);
        
        TableColumn col4=AssignmentListTable.getColumnModel().getColumn(4);
        DefaultTableCellRenderer obj5=new DefaultTableCellHeaderRenderer();
        obj5.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        AssignmentListTable.getColumnModel().getColumn(4).setHeaderRenderer(obj5);
        col4.setCellRenderer(obj5);    
        
    }

    public void displayStudentInformation()
    {
        StudentTeacher obj = LoginFrame.op.getStudentInformation(LoginFrame.studentId);
        StudentNameLabel.setText(LoginFrame.studentId+"   "+obj.studentName+"   "+obj.studentClass);
        StudentLoginPage.studentName=obj.studentName;
        StudentLoginPage.studentClass=obj.studentClass;
    }
    
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
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AssignmentListTable;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel LowerPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel StudentNameLabel;
    private javax.swing.JButton SubmitAssignmentButton;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JButton ViewAssignmentButton;
    private javax.swing.JButton ViewGradedAssignmentButton;
    private javax.swing.JButton ViewSolutionButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
