package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class jdbc1 {
    public static void main(String[] args) throws Exception, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Corrected driver class name
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/owais", "root", "password");
        System.out.println("Connection created");
       Statement st =  con.createStatement();
       
       ResultSet rs = st.executeQuery("select * from product");
//       
       while(rs.next()) {
    	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
       }
    
       st.close();
       con.close(); 
    }
}