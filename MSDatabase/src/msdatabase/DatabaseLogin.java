/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class DatabaseLogin {
     private final String url = "jdbc:postgresql://localhost/acess";
    private final String user = "root";
    private final String password = "root";
    
    
    
 List read () throws SQLException{
     List<User> ae=new ArrayList();
     Connection con = DriverManager.getConnection(url, user, password);
  String query = "SELECT * FROM Logins";

      Statement st = con.createStatement();
      
   
      ResultSet rs = st.executeQuery(query);
      

      while (rs.next())
      {
        String login = rs.getString("login");
        String heslo = rs.getString("heslo");
       
      User e=new User(login, heslo);e.setLogin(login);e.setHeslo(heslo);
      ae.add(e);
      
      
      }
      st.close(); 
      
     // for (int i=0;i<ae.size();i++)System.out.print(ae.get(i).getLogin());
       // for (int i=0;i<ae.size();i++)System.out.print(ae.get(i).getHeslo());
       return ae; 
  }
    
}
