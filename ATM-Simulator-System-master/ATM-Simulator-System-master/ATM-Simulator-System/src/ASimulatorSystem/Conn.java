package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","W7301@jqir#");    
            s =c.createStatement(); 
            System.out.println("connectd mysql successfully");
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
