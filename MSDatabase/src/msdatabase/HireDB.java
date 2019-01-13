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
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class HireDB {
     private final String url = "jdbc:postgresql://localhost/test";
    private final String user = "root";
    private final String password = "root";
    
    
     public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
     
     
    List readOrder () throws SQLException{
     List<Order> ae=new ArrayList();
     Connection con = DriverManager.getConnection(url, user, password);
  String query = "SELECT * FROM Orders";

      Statement st = con.createStatement();
      
   
      ResultSet rs = st.executeQuery(query);
      

      while (rs.next())
      {
//        int id = rs.getInt("ID");
       Date OrderDate = rs.getDate("OrderDate");
        Date RemoteDate = rs.getDate("RemoteDate");
         
              String name = rs.getString("name");
              int price = rs.getInt("price");
              int CustomerID = rs.getInt("CustomerID");
              
      Order e=new Order(OrderDate, RemoteDate, name, price, CustomerID );
      ae.add(e);
      
      
      }
      st.close(); //for (int i=0;i<ae.size();i++)System.out.print(ae.get(i).getId());
       return ae; 
  }
    
    
    
     List readCustomer () throws SQLException{
     List<Customer> ae=new ArrayList();
     Connection con = DriverManager.getConnection(url, user, password);
  String query = "SELECT * FROM Customers";

      Statement st = con.createStatement();
      
   
      ResultSet rs = st.executeQuery(query);
      

      while (rs.next())
      {
//        int id = rs.getInt("ID");
     
         
              String  Firstname= rs.getString("Firstname");
         String Lastname = rs.getString("Lastname");
             // String  City  = rs.getString("name");
              
     Customer e=new Customer( Firstname, Lastname );
      ae.add(e);
      
      
      }
      st.close(); //for (int i=0;i<ae.size();i++)System.out.print(ae.get(i).getId());
       return ae; 
  }
    
    
    
    
    
 
}
