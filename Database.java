package minip;
import java.sql.*;
public class Database 
{  Connection con;
   PreparedStatement pst,stmt1,sr,stmt2,stmt3,pinfo,stab,dtab,s1,d1;
   ResultSet rs,rs1;
   
   Database()
   {   try
	   {  con=DriverManager.getConnection("jdbc:Mysql://localhost/minip","root","root@1234");
          pst=con.prepareStatement("select * from log_reg where uname=? and pass=?"); 
          Statement stat=con.createStatement();
          
          String sql1="insert into log_reg(uname,pass,contno,email,address) values (?,?,?,?,?)";
          stmt1=con.prepareStatement(sql1);
          
          
      	  String sr="select source from place";
      	  String ds="select destination from place";
      	  stmt2=con.prepareStatement(sr);
          stmt3=con.prepareStatement(ds);
         
          
          
          String s="insert into stab(sid,src) values (?,?)";
          stab=con.prepareStatement(s);
          
          String d="insert into dtab(did,dst) values (?,?)";
          dtab=con.prepareStatement(d);
          
          s1=con.prepareStatement("select src from stab");
          //System.out.println(s1);
          d1=con.prepareStatement("select dst from dtab");
          
          
       }
   
       catch (Exception e) 
       {  System.out.println(e); }
   }
   
   public Boolean checkLogin(String uname,String pwd)
   {   try 
       { pst.setString(1, uname); 
         pst.setString(2, pwd);    
           
         rs=pst.executeQuery();
         if(rs.next())
           { 
        	 con.close();
        	 return true; }
         else
           { con.close();
        	 return false; }
        } 
   
        catch (Exception e) 
        {  System.out.println("error while validating"+e);
           return false;
        }
   }
   
   public void insert(String u,String p,int c,String ei,String a)
   { try 
    { stmt1.setString(1,u); 
      stmt1.setString(2,p);
      stmt1.setInt(3,c);
      stmt1.setString(4,ei);
      stmt1.setString(5,a); 
      stmt1.executeUpdate();
      con.close();
    }
    catch (Exception e) 
    {  System.out.println("error while validating"+e); }
   }
   
   public String[] from()
   { 
	   String[] f=new String[50];
	   int i=0;
	   try{
		   rs=stmt2.executeQuery();
		   while(rs.next())
		   {f[i++]=rs.getString(1);
		   
		   }
		   return f;
	   }
	   catch(Exception e)
	   {
		   System.out.println("error while validating"+e);
	   }
	   return f;
   }
   
  
   
   public String[] to()
   { 
	   String[] t=new String[50];
	   int i=0;
	   try{
		   rs=stmt3.executeQuery();
		   while(rs.next())
		   {t[i++]=rs.getString(1);
		   
		   }
		   return t;
	   }
	   catch(Exception e)
	   {
		   System.out.println("error while validating"+e);
	   }
	   return t;
   }
   
   public void inserts(int sid,String s)
   { try 
    { 
	 if(sid>=1)
	  {
	  stab.setInt(1,sid); 
      stab.setString(2,s);
      stab.executeUpdate();
      //con.close();
      return;
	 }
	  else
	  {
		  return;
	  }
    }
    catch (Exception e) 
    {  System.out.println("error while validating"+e); }
   }
   


   public void insertd(int did,String d)
   { try 
    { 
	   if(did>=1)
	   {   
	dtab.setInt(1,did); 
   	dtab.setString(2,d);
   	dtab.executeUpdate();
   	//con.close();
   	return;
	   }
	   else
	   {
		   return;
	   }
   }
   catch (Exception e) 
   {  System.out.println("error while validating"+e); }
   }
   
  
   public String s()
   { 
	   String ps=new String();
	 int i=0;
	   try{
		   rs=s1.executeQuery();
		   while(rs.next())
		   {ps=rs.getString(1);
		  //System.out.println(ps);
		   }
		   return ps;
	   }
	   catch(Exception e)
	   {
		   System.out.println("error while validating"+e);
	   }
	   return ps;
   }
   
   
   public String d()
   { 
	   String pd=new String();
	 int i=0;
	   try{
		   rs=d1.executeQuery();
		   while(rs.next())
		   {pd=rs.getString(1);
		  //System.out.println(ps);
		   }
		   return pd;
	   }
	   catch(Exception e)
	   {
		   System.out.println("error while validating"+e);
	   }
	   return pd;
   }
   
   
}







