package com.plag.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.database.DatabaseConn;
import com.plag.model.Student;

public class StudentDao implements DatabaseConn{
	public static Connection getConnection(){  
        Connection conn=null;  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            
            conn=DriverManager.getConnection(dbURL, username, password);  
        }catch(Exception e){System.out.println("DB connection failed " + e);}  
        return conn;  
    }  
    public static int save(Student s){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into student_details (reg_no, first_name, last_name, email, phone_no, password) values (?,?,?,?,?,?)");  
            ps.setInt(1,s.getReg_no());  
            ps.setString(2,s.getFirst_name());  
            ps.setString(3,s.getLast_name());
            ps.setString(4,s.getEmail());
            ps.setString(5,s.getPhone_number());
            ps.setString(6,s.getPassword());    
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Student s){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update student_details set reg_no=?, first_name=?, last_name=?, email=?, phone_no=?, password=? where reg_no=?");  
            ps.setInt(1,s.getReg_no());  
            ps.setString(2,s.getFirst_name());  
            ps.setString(3,s.getLast_name());
            ps.setString(4,s.getPassword());
            ps.setString(5,s.getPhone_number());
            ps.setString(6,s.getEmail());
                          
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from student_details where reg_no=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Student getStudentById(int id){  
        Student s=new Student();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student_details where reg_no=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                s.setReg_no(rs.getInt(1));  
                s.setEmail(rs.getString(2));  
                s.setFirst_name(rs.getString(3));  
                s.setLast_name(rs.getString(4));  
                s.setPassword(rs.getString(5));
                s.setPhone_number(rs.getString(6));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return s;  
    }  
    public static List<Student> getAllStudents(){  
        List<Student> list=new ArrayList<Student>();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student_details");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Student s=new Student();  

                s.setReg_no(rs.getInt(1));  
                s.setEmail(rs.getString(2));  
                s.setFirst_name(rs.getString(3));  
                s.setLast_name(rs.getString(4));  
                s.setPassword(rs.getString(5));
                s.setPhone_number(rs.getString(6));
                list.add(s);  
            }  
            con.close();  
        }catch(Exception c){c.printStackTrace();}  
          
        return list;  
    }  
	
}
