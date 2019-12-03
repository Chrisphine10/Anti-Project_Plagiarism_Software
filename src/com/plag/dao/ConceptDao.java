package com.plag.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.database.DatabaseConn;
import com.plag.model.Concept;

public class ConceptDao implements DatabaseConn{

	public static Connection getConnection(){  
        Connection conn=null;  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            
            conn=DriverManager.getConnection(dbURL, username, password);  
        }catch(Exception e){System.out.println("DB connection failed " + e);}  
        return conn;  
    }  
    public static int save(Concept c){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into concept_paper(title, concept_paper, reg_no, date_of_submission, status) values (?,?,?,?,?)");  
            ps.setString(1,c.getTitle());  
            ps.setString(2,c.getConcept_paper());  
            ps.setString(3,c.getReg_no());
            ps.setString(4,c.getDate_of_submission());
            ps.setString(5,c.getStatus());              
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
                         "update concept_paper set title=?,concept_paper=?,reg_no=? where reg_no=?");  
            ps.setString(1,c.getTitle());  
            ps.setString(2,c.getConcept_paper());  
            ps.setString(3,c.getReg_no());
            ps.setString(4,c.getReg_no()); 
            status=ps.executeUpdate();  
           
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from concept_paper where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Concept getConceptById(int id){  
        Concept c=new Concept();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from concept_paper where concept_paper_id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                c.setConcept_paper_id(rs.getInt(1));  
                c.setTitle(rs.getString(2));  
                c.setConcept_paper(rs.getString(3));  
                c.setReg_no(rs.getString(4));  
                c.setDate_of_submission(rs.getString(5));
                c.setDate_of_acceptance(rs.getString(6));
                c.setStatus(rs.getString(7));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return c;  
    }  
    public static Concept getConceptByStudent(int reg_no){ 
    	Concept c=new Concept(); 
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from concept_paper where reg_no=?");  
            ps.setInt(1,reg_no);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                c.setConcept_paper_id(rs.getInt(1));  
                c.setTitle(rs.getString(2));  
                c.setConcept_paper(rs.getString(3));  
                c.setReg_no(rs.getString(4));  
                c.setDate_of_submission(rs.getString(5));
                c.setDate_of_acceptance(rs.getString(6));
                c.setStatus(rs.getString(7));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return c;  
    }
    public static List<Concept> getAllConcepts(){  
        List<Concept> list=new ArrayList<Concept>();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from concept_paper");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Concept c=new Concept();  
                c.setConcept_paper_id(rs.getInt(1));  
                c.setTitle(rs.getString(2));  
                c.setConcept_paper(rs.getString(3));  
                c.setReg_no(rs.getString(4));  
                c.setDate_of_submission(rs.getString(5));
                c.setDate_of_acceptance(rs.getString(6));
                c.setStatus(rs.getString(7));  
                list.add(c);  
            }  
            con.close();  
        }catch(Exception c){c.printStackTrace();}  
          
        return list;  
    }  
    public static List<Concept> getAllConceptsByStatus(String statuss){  
        List<Concept> list=new ArrayList<Concept>();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from concept_paper where status=?"); 
            ps.setString(1,statuss);
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Concept c=new Concept();  
                c.setConcept_paper_id(rs.getInt(1));  
                c.setTitle(rs.getString(2));  
                c.setConcept_paper(rs.getString(3));  
                c.setReg_no(rs.getString(4));  
                c.setDate_of_submission(rs.getString(5));
                c.setDate_of_acceptance(rs.getString(6));
                c.setStatus(rs.getString(7));  
                list.add(c);  
            }  
            con.close();  
        }catch(Exception c){c.printStackTrace();
        }  
          
        return list;  
    }  
    
    
    public static List<Concept> getAllConceptByStudent(int reg_no){  
        List<Concept> list=new ArrayList<Concept>();  
          
        try{  
            Connection con=ConceptDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from concept_paper where reg_no=?");  
            ps.setInt(1,reg_no);
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Concept c=new Concept();  
                c.setConcept_paper_id(rs.getInt(1));  
                c.setTitle(rs.getString(2));  
                c.setConcept_paper(rs.getString(3));  
                c.setReg_no(rs.getString(4));  
                c.setDate_of_submission(rs.getString(5));
                c.setDate_of_acceptance(rs.getString(6));
                c.setStatus(rs.getString(7));  
                list.add(c);  
            }  
            con.close();  
        }catch(Exception c){c.printStackTrace();}  
          
        return list;  
    }  
}
