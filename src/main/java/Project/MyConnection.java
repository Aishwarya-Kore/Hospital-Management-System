package Project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aishwarya
 */
public class MyConnection {
    
    public static Connection getConnection()
    {
        Connection con=null;
     try   
    {
        
            Class.forName("org.postgresql.Driver");
            con=(Connection)
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaprojects","postgres","aishwarya");
            
            return con;
    }
      
    catch(Exception e){
    return con;
    }
}
}