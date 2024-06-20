package AddressBook;

import java.sql.*;

public class Dconnection {
    
    Connection c;
    Statement s;
       
    public Dconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); // important code to coonect
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab","root","");
            s = c.createStatement();           
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
