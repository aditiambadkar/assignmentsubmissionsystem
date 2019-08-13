
import java.io.Serializable;
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author megha
 */
public class StudentTeacher {
    public int loginId;
    public String loginPassword=null;
    int assignmentId;
    String assignmentName=null;
    Date dueDate;
    int studentId;
    int marks;
    String studentName;
    String subjectName;
    String solutionName;
    String studentClass;
    String teacherName;
    int subjectId;
    
    public StudentTeacher(int loginId,String loginPassword) {
        this.loginId=loginId;
        this.loginPassword=loginPassword;
    }
    
    public StudentTeacher(int assignmentId, String assignmentName, int subjectId, String subjectName, Date dueDate)
    {
        this.assignmentId=assignmentId;
        this.assignmentName=assignmentName;
        this.subjectId=subjectId;
        this.subjectName=subjectName;
        this.dueDate=dueDate;
    }
    
    public StudentTeacher(int assignmentId, String assignmentName, int studentId, String studentName)
    {
        this.assignmentId=assignmentId;
        this.assignmentName=assignmentName;
        this.studentId=studentId;
        this.studentName=studentName;
    }
    
    public StudentTeacher(int assignmentId, String solutionName, String subjectName)
    {
        this.assignmentId=assignmentId;
        this.solutionName=solutionName;
        this.subjectName=subjectName;
    }
    
    public StudentTeacher(int assignmentId, String assignmentName, String subjectName, int marks)
    {
        this.assignmentId=assignmentId;
        this.assignmentName=assignmentName;
        this.subjectName=subjectName;
        this.marks=marks;
    }
   
    public StudentTeacher(String studentName, String studentClass)
    {
        this.studentName=studentName;
        this.studentClass=studentClass;
    }
    
    public StudentTeacher(String teacherName, String subjectName, int subjectId)
    {
        this.teacherName=teacherName;
        this.subjectName=subjectName;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author megha
 */

  