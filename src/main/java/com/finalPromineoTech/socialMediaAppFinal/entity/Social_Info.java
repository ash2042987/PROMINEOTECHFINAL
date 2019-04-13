package com.finalPromineoTech.socialMediaAppFinal.entity;
import java.sql.Connection;
import java.sql.DriverManager;





public class Social_Info {
	
	    private static String dbname = "social_db";
	    private static String username = "root";
	    private static String password = "root";
	    
	       static Connection con=null;
	    public static Connection getConnection()
	    {
	        if (con != null) return con;
	        // get db, user, pass from settings file
	        return getConnection(dbname, username, password);
	    }

	    private static Connection getConnection(String db_name,String user_name,String password)
	    {
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:8080/");
	            System.out.println("connected");
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        return con;        
	    }
	    
}    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  /*  
	    public static Connection getConnection(){
	        
	        Connection con = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:8080/");
	            System.out.println("connected");
	        } catch (Exception ex) {
	            System.out.println("not connected");
	        }
	        
	        return con;
	        
	    }
	    
	   */ 
	

