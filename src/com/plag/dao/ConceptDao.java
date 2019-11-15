package com.plag.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.plag.model.Concept;

public class ConceptDao {

	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Concept c){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user905(name,password,email,country) values (?,?,?,?)");  
            ps.setInt(1,c.getConcept_paper_id());  
            ps.setString(2,c.getTitle());  
            ps.setString(3,c.getConcept_paper_name());  
            ps.setString(4,c.getReg_no());
            ps.setString(5,c.getDate_of_submission());
            ps.setString(6,c.getDate_of_acceptance());
            ps.setString(7,c.getStatus());
            
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Concept c){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user905 set name=?,password=?,email=?,country=? where id=?");  
            ps.setInt(1,c.getConcept_paper_id());  
            ps.setString(2,c.getTitle());  
            ps.setString(3,c.getConcept_paper_name());  
            ps.setString(4,c.getReg_no());
            ps.setString(5,c.getDate_of_submission());
            ps.setString(6,c.getDate_of_acceptance());
            ps.setString(7,c.getStatus());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Concept getConceptloyeeById(int id){  
        Concept e=new Concept();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                c.setId(rs.getInt(1));  
                c.setName(rs.getString(2));  
                c.setPassword(rs.getString(3));  
                c.setEmail(rs.getString(4));  
                c.setCountry(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Concept> getAllConceptloyees(){  
        List<Concept> list=new ArrayList<Concept>();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Concept c=new Concept();  
                c.setId(rs.getInt(1));  
                c.setName(rs.getString(2));  
                c.setPassword(rs.getString(3));  
                c.setEmail(rs.getString(4));  
                c.setCountry(rs.getString(5));  
                list.add(c);  
            }  
            con.close();  
        }catch(Exception c){c.printStackTrace();}  
          
        return list;  
    }  
	
}
