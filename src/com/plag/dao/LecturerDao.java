package com.plag.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.plag.model.Lecturer;

public class LecturerDao {
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Lecturer l){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into lecturer_details(lecturer_id_no,fname, lname, password, email, payroll_number, email) values (?,?,?,?)");  
            ps.setInt(1,l.getLecturer_id_no());  
            ps.setString(2,l.getFirst_name());  
            ps.setString(3,l.getLast_name());  
            ps.setString(4,l.getPassword());
            ps.setString(5,l.getPayroll_number());
            ps.setString(6,l.getPhone_number());
            ps.setString(7,l.getEmail());
            
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Lecturer l){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update lecturer_details set lecturer_id_no=?,fname=?, lname=?, password=?, email=?, payroll_number=?, email=? where lecturer_id_no=?");  
            ps.setInt(1,l.getLecturer_id_no());  
            ps.setString(2,l.getFirst_name());  
            ps.setString(3,l.getLast_name());  
            ps.setString(4,l.getPassword());
            ps.setString(5,l.getPayroll_number());
            ps.setString(6,l.getPhone_number());
            ps.setString(7,l.getEmail());
            
              
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from lecturer_details where lecturer_id_no=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Lecturer getLecturerById(int id){  
        Lecturer c=new Lecturer();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from lecturer_details where lecturer_id_no=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                c.setLecturer_id_no(rs.getInt(1));  
                c.setFirst_name(rs.getString(2));  
                c.setLast_name(rs.getString(3));  
                c.setPassword(rs.getString(4));  
                c.setPayroll_number(rs.getString(5));
                c.setPhone_number(rs.getString(6));
                c.setEmail(rs.getString(7));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return c;  
    }  
    public static List<Lecturer> getAllLecturers(){  
        List<Lecturer> list=new ArrayList<Lecturer>();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from lecturer_details");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Lecturer c=new Lecturer();  
                c.setLecturer_id_no(rs.getInt(1));  
                c.setFirst_name(rs.getString(2));  
                c.setLast_name(rs.getString(3));  
                c.setPassword(rs.getString(4));  
                c.setPayroll_number(rs.getString(5));
                c.setPhone_number(rs.getString(6));
                c.setEmail(rs.getString(7));  
                list.add(c);  
            }  
            con.close();  
        }catch(Exception c){c.printStackTrace();}  
          
        return list;  
    }  
}