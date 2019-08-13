/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author megha
 */
public class Operations {
    
    public static int subjectId;
    public int studentLogin(StudentTeacher student)
    {
        int flag=0;
        try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Student WHERE studentId=? AND studentPassword=MD5(?)");
			ps.setInt(1, student.loginId);
			ps.setString(2, student.loginPassword);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
                        {
                            flag=1;
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return flag;
    }
    
    public int teacherLogin(StudentTeacher teacher)
    {
        int flag=0;
        try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Teacher WHERE teacherId=? AND teacherPassword=MD5(?)");
			ps.setInt(1, teacher.loginId);
			ps.setString(2, teacher.loginPassword);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
                        {
                            subjectId=rs.getInt(3);
                            flag=1;
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return flag;
    }
    
    public int uploadAssignmentTeacher(String assignmentId,String assignmentName,String date,String path) throws ParseException, FileNotFoundException
    {
        int flag=0;
        int AssignmentId=Integer.parseInt(assignmentId);
        String AssignmentName=assignmentName;
        String filePath=path;
    
        DateFormat formatter=new SimpleDateFormat("yyyy-mm-dd");
        Date mydate=formatter.parse(date);
        java.sql.Date sqlDate=new java.sql.Date(mydate.getTime());
        FileInputStream inputstream=new FileInputStream(new File(path));
     
         try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO Assignment VALUES(?,?,?,?,?)");
			ps.setInt(1,AssignmentId);
			ps.setString(2, AssignmentName);
                        ps.setBlob(3,inputstream);
                        ps.setInt(4,subjectId);
                        ps.setDate(5,sqlDate);
			flag=ps.executeUpdate();
			
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
    
    return flag;
    }
  
    public int uploadSolutionTeacher(String assignmentId,String solutionName,String path) throws FileNotFoundException
    {
        int flag=0;
        String filePath=path;
        FileInputStream inputstream=new FileInputStream(new File(filePath));
        try 
	{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO Solution(solutionName,solutionFile,assignmentId,subjectId) VALUES(?,?,?,?)");                        
			ps.setString(1, solutionName);
                        ps.setBlob(2,inputstream);
                        ps.setInt(3,Integer.parseInt(assignmentId));
                        ps.setInt(4,subjectId);
			flag=ps.executeUpdate();
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
    
    return flag;
    }
    
     public ArrayList displayAssignmentStudent(){
        ArrayList<StudentTeacher>TableEntries=new ArrayList<StudentTeacher>();
        int AssignmentId;
        String AssignmentName;
        Date DueDate;
        int subjectId;
        String subjectName = null;
        try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Assignment");
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        AssignmentId=rs.getInt("assignmentId");
                        AssignmentName=rs.getString("assignmentName");
                        DueDate=rs.getDate("submissionDate");
                        subjectId=rs.getInt("subjectId");
                        
                        PreparedStatement ps1=con.prepareStatement("SELECT * FROM Subject where subjectId=?");
                        ps1.setInt(1, subjectId);
			ResultSet rs1=ps1.executeQuery();
                        while(rs1.next())
                        {
                            subjectName=rs1.getString("subjectName");
                        }
                        
                        //StudentTeacher obj=new StudentTeacher(AssignmentId, AssignmentName, (java.sql.Date) DueDate);
                        StudentTeacher obj=new StudentTeacher(AssignmentId, AssignmentName,subjectId, subjectName, (java.sql.Date) DueDate);
                        TableEntries.add(obj);
                        }
                        DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return TableEntries;
    }
    
    public String viewSolution(int assignmentId)
    {
        String contents="";
        String str;
        
        try 	
        {
            Connection con=DatabaseConnectivity.getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM Solution WHERE assignmentId=?");
            ps.setInt(1,assignmentId);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                java.sql.Blob myBlob=rs.getBlob("solutionFile");
                java.io.InputStream in=(InputStream) myBlob.getBinaryStream();
                java.io.BufferedReader bufferedreader;
                bufferedreader = new BufferedReader(new InputStreamReader(in));
                while((str=bufferedreader.readLine())!=null)
                {
                    contents=contents+str+"\n";
                }
                in.close();
             }
             DatabaseConnectivity.closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return contents;
    }
     
    public int uploadAssignmentStudent(String AssignmentId,String SubjectId,String path) throws FileNotFoundException
    {
        int flag=0;
        int AssignmentId1=Integer.parseInt(AssignmentId);
        int SubjectId1=Integer.parseInt(SubjectId);
        
        String filePath=path;
        FileInputStream inputstream=new FileInputStream(new File(filePath));
     
         try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
                        
                        PreparedStatement psCheck = con.prepareStatement("SELECT * FROM AssignmentSubmitted WHERE studentId=? and assignmentId=?");
                        psCheck.setInt(1, LoginFrame.studentId);
                        psCheck.setInt(2, AssignmentId1);
                        ResultSet rs = psCheck.executeQuery();
                        if(rs.next())
                        {
                            flag=0;
                        }
                        else
                        {
                            PreparedStatement ps=con.prepareStatement("INSERT INTO AssignmentSubmitted(studentId,assignmentId,subjectId,marks,file) VALUES(?,?,?,?,?)");
                            ps.setInt(1,LoginFrame.studentId);
                            ps.setInt(2, AssignmentId1);
                            ps.setInt(3,SubjectId1);
                            ps.setInt(4,0);
                            ps.setBlob(5,inputstream);
                            flag=ps.executeUpdate();
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
    
    return flag;
    }
    
    public static String displayStudentAssignment(int assignmentId, int studentId)
    {
        String contents="";
        String str;
        
        try 	
        {
            Connection con=DatabaseConnectivity.getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM AssignmentSubmitted WHERE assignmentId=? and studentId=?");
            ps.setInt(1,assignmentId);
            ps.setInt(2, studentId);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                java.sql.Blob myBlob=rs.getBlob("file");
                java.io.InputStream in=(InputStream) myBlob.getBinaryStream();
                java.io.BufferedReader bufferedreader;
                bufferedreader = new BufferedReader(new InputStreamReader(in));
                while((str=bufferedreader.readLine())!=null)
                {
                    contents=contents+str+"\n";
                }
                in.close();
             }
             DatabaseConnectivity.closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return contents;
    }
    
    public int gradeAssignment(int assignmentId,int studentId,int marks)
    {
        int flag=0;
        try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("UPDATE AssignmentSubmitted SET marks=? WHERE assignmentId=? AND studentId=?");
			ps.setInt(1, marks);
			ps.setInt(2, assignmentId);
                        ps.setInt(3, studentId);
			flag=ps.executeUpdate();
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return flag;
    }
    
    public ArrayList displayAssignmentTeacher()
    {
        ArrayList<StudentTeacher>TableEntries=new ArrayList<StudentTeacher>();
        int assignmentId = 0;
        int subjectId=0;
        String assignmentName = null;
        int studentId = 0;
        String studentName = null;

        try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
                        
                        PreparedStatement psGetId=con.prepareStatement("SELECT * FROM Teacher WHERE teacherId=?");
                        psGetId.setInt(1, LoginFrame.teacherId);
                        ResultSet rsGetId=psGetId.executeQuery();
                        while(rsGetId.next())
                        {
                            subjectId=rsGetId.getInt("subjectId");
                        }
                        
			PreparedStatement ps=con.prepareStatement("SELECT * FROM AssignmentSubmitted WHERE subjectId=?");
			ps.setInt(1, subjectId);
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        assignmentId=rs.getInt("assignmentId");
                        studentId=rs.getInt("studentId");
                        
                        PreparedStatement ps1=con.prepareStatement("SELECT * FROM Student WHERE studentId=?");
			ps1.setInt(1, studentId);
                        ResultSet rs1=ps1.executeQuery();
                        while(rs1.next())
                        {
                            studentName=rs1.getString("studentName");
                        }
                        
                        PreparedStatement ps2=con.prepareStatement("SELECT * FROM Assignment WHERE assignmentId=?");
			ps2.setInt(1, assignmentId);
                        ResultSet rs2=ps2.executeQuery();
                        while(rs2.next())
                        {
                            assignmentName=rs2.getString("assignmentName");
                        }
                        
                        StudentTeacher obj=new StudentTeacher(assignmentId, assignmentName, studentId, studentName);
                        TableEntries.add(obj);
                        }
                                             
                        DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return TableEntries;
    }
    
    public ArrayList displaySolutionStudent()
    {
        ArrayList<StudentTeacher>TableEntries=new ArrayList<StudentTeacher>();
        int assignmentId = 0;
        String solutionName;
        String subjectName = null;
        int subjectId;

        try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Solution");
			ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        assignmentId=rs.getInt("assignmentId");
                        solutionName=rs.getString("solutionName");
                        subjectId=rs.getInt("subjectId");
                        
                        PreparedStatement ps1=con.prepareStatement("SELECT * FROM Subject WHERE subjectId=?");
			ps1.setInt(1, subjectId);
                        ResultSet rs1=ps1.executeQuery();
                        while(rs1.next())
                        {
                            subjectName=rs1.getString("subjectName");
                        }
              
                        StudentTeacher obj=new StudentTeacher(assignmentId, solutionName, subjectName);
                        TableEntries.add(obj);
                        }
                                             
                        DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return TableEntries;
    }
    
    public ArrayList displayGradedAssignmentStudent()
    {
        ArrayList<StudentTeacher>TableEntries=new ArrayList<StudentTeacher>();
        int assignmentId = 0;
        String assignmentName = null;
        String subjectName = null;
        int marks;
        int subjectId;

        try 
		{
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM AssignmentSubmitted");
			ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        assignmentId=rs.getInt("assignmentId");
                        subjectId=rs.getInt("subjectId");
                        marks=rs.getInt("marks");
                        
                        PreparedStatement ps1=con.prepareStatement("SELECT * FROM Subject WHERE subjectId=?");
			ps1.setInt(1, subjectId);
                        ResultSet rs1=ps1.executeQuery();
                        while(rs1.next())
                        {
                            subjectName=rs1.getString("subjectName");
                        }
                        
                        PreparedStatement ps2=con.prepareStatement("SELECT * FROM Assignment WHERE assignmentId=?");
			ps2.setInt(1, assignmentId);
                        ResultSet rs2=ps2.executeQuery();
                        while(rs2.next())
                        {
                            assignmentName=rs2.getString("assignmentName");
                        }
              
                        StudentTeacher obj=new StudentTeacher(assignmentId, assignmentName, subjectName, marks);
                        TableEntries.add(obj);
                        }
                                             
                        DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return TableEntries;
    }
    
    public StudentTeacher getStudentInformation(int studentId)
    {
        StudentTeacher obj = null;
        try 
		{           
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Student WHERE studentId=?");
			ps.setInt(1, studentId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
                        {
                            obj = new StudentTeacher(rs.getString("studentName"), rs.getString("studentClass"));
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return obj;
    }
    
    public StudentTeacher getTeacherInformation(int teacherId)
    {
        StudentTeacher obj = null;
        try 
		{           
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Teacher WHERE teacherId=?");
			ps.setInt(1, teacherId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
                        {
                            PreparedStatement ps1=con.prepareStatement("SELECT * FROM Subject WHERE subjectId=?");
                            ps1.setInt(1, rs.getInt("subjectId"));
                            ResultSet rs1=ps1.executeQuery();
                            if(rs1.next())
                            {
                                obj = new StudentTeacher(rs.getString("teacherName"), rs1.getString("subjectName"), rs.getInt("subjectId"));
                            }
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return obj;
    }
    
    public int CheckExistingSolution(int AssignmentId){
 
        int flag=0;
        try 
		{           
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Solution WHERE assignmentId=?");
			ps.setInt(1,AssignmentId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
                        {
                            flag=1;
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return flag;
    }
    
    public int checkStudentAssignment(int assignmentId, int studentId)
    {
        int flag=0;
        try 
		{           
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM AssignmentSubmitted WHERE assignmentId=? and studentId=?");
			ps.setInt(1,assignmentId);
                        ps.setInt(2,studentId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
                        {
                            flag=1;
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return flag;  
    }
    
    public int checkExistingAssignmentTeacher(int AssignmentId){
        int flag=0;
        try 
		{           
                        Connection con=DatabaseConnectivity.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM Assignment WHERE assignmentId=?");
			ps.setInt(1,AssignmentId);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
                        {
                            flag=1;
                        }
			DatabaseConnectivity.closeConnection();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
        return flag;
    }
    
     public String viewAssignment(int assignmentId,int subjectId)
    {
        String contents="";
        String str;
        
        try 	
        {
            Connection con=DatabaseConnectivity.getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM Assignment WHERE assignmentId=? AND subjectId=?");
            ps.setInt(1,assignmentId);
            ps.setInt(2, subjectId);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                java.sql.Blob myBlob=rs.getBlob("assignmentFile");
                java.io.InputStream in=(InputStream) myBlob.getBinaryStream();
                java.io.BufferedReader bufferedreader;
                bufferedreader = new BufferedReader(new InputStreamReader(in));
                while((str=bufferedreader.readLine())!=null)
                {
                    contents=contents+str+"\n";
                }
                in.close();
             }
             DatabaseConnectivity.closeConnection();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return contents;
    }
}