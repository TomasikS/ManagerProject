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
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class DatabaseLogin {
     private  static   final String url = "jdbc:postgresql://localhost/acess";
    private static final String user = "root";
    private static  final String password = "root";
    
    
    
 HashMap read () throws SQLException{
     User u;
     HashMap<Integer,User> map = new HashMap<Integer,User>();
     
     List<User> ae=new ArrayList();
     Connection con = DriverManager.getConnection(url, user, password);
  String query = "SELECT * FROM Logins";

      Statement st = con.createStatement();
      
   
      ResultSet rs = st.executeQuery(query);
      

      while (rs.next())
      { Integer id = rs.getInt("id");
        String login = rs.getString("login");
        String heslo = rs.getString("heslo");
       
      User e=new User(id, login, heslo);e.setLogin(login);e.setHeslo(heslo);
      ae.add(e);
      u = new User(id, login,heslo);
                

                map.put(id, u);
      
      }
      st.close(); 
      
     // for (int i=0;i<ae.size();i++)System.out.print(ae.get(i).getLogin());
       // for (int i=0;i<ae.size();i++)System.out.print(ae.get(i).getHeslo());
       return map; 
  }
 
 
 public  static  int getindex() throws SQLException {
   int i=0;
   List<User> ae=new ArrayList();
     Connection con = DriverManager.getConnection(url, user, password);
  String query = "SELECT max(id) FROM Logins";

      Statement st = con.createStatement();
      
   
      ResultSet rs = st.executeQuery(query);
      

      while (rs.next())
      { Integer id = rs.getInt("id");
        
       
  i=id;
                

              
      
      }
      st.close(); 
      
 System.out.println(i);
 
   
   return i;
    }
      
      }
 
