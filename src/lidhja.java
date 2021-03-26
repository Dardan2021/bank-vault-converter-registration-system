

import java.sql.Connection;
import java.sql.DriverManager;
public class lidhja {
    
    public static Connection  getConnection(){
       Connection con=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/java_databaz","root","");
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());}
       return con;
      
    }
    
}
