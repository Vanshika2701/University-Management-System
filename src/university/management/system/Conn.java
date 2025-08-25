
package university.management.system;
import java.sql.*;

public class Conn {
    
    Connection C;
    Statement S;
    
    Conn (){
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        C = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "vanshika@27");
        S = C.createStatement();
      }catch(Exception e){
          e.printStackTrace();
      } 
    }
}
