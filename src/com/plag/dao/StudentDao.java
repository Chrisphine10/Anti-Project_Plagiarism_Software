package com.plag.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.plag.model.Student;

public class StudentDao {
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Student s){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user905(name,password,email,country) values (?,?,?,?)");  
            ps.setInt(1,s.getReg_no());  
            ps.setString(2,s.getFirst_name());  
            ps.setString(3,s.getLast_name());  
            ps.setString(4,s.getLecturer_id_no());
            ps.setString(5,s.getPassword());
            ps.setString(6,s.getPhone_number());
            ps.setString(7,s.getEmail());
            
              
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
                         "update user905 set name=?,password=?,email=?,country=? where id=?");  
            ps.setInt(1,s.getReg_no());  
            ps.setString(2,s.getFirst_name());  
            ps.setString(3,s.getLast_name());  
            ps.setString(4,s.getLecturer_id_no());
            ps.setString(5,s.getPassword());
            ps.setString(6,s.getPhone_number());
            ps.setString(7,s.getEmail());
                          
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
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
            PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                s.setReg_no(rs.getInt(1));  
                s.setEmail(rs.getString(2));  
                s.setFirst_name(rs.getString(3));  
                s.setLast_name(rs.getString(4));  
                s.setPassword(rs.getString(5));
                s.setPhone_number(rs.getString(6));
                s.setLecturer_id_no(rs.getString(7));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return s;  
    }  
    public static List<Student> getAllStudents(){  
        List<Student> list=new ArrayList<Student>();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Student s=new Student();  

                s.setReg_no(rs.getInt(1));  
                s.setEmail(rs.getString(2));  
                s.setFirst_name(rs.getString(3));  
                s.setLast_name(rs.getString(4));  
                s.setPassword(rs.getString(5));
                s.setPhone_number(rs.getString(6));
                s.setLecturer_id_no(rs.getString(7));
                list.add(s);  
            }  
            con.close();  
        }catch(Exception c){c.printStackTrace();}  
          
        return list;  
    }  
	
}
