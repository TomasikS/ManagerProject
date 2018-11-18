/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class MSDatabase {
 private final String url = "jdbc:postgresql://localhost/test";
    private final String user = "root";
    private final String password = "root";
    /**
     * @param args the command line arguments
 
 
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
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

    void add(Employee p) throws SQLException {
         Connection conn = null;
         try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
          String sql = "insert into employee(Firstname, Lastname, Salary, Adress)"
                        + "values (?, ?, ?, ?)";
                
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                
                preparedStmt.setString (1, p.getFirstname());
                preparedStmt.setString   (2, p.getLastname());
                preparedStmt.setInt (3, p.getSalary());
                preparedStmt.setString (4, p.getAdress());
                
              
                    preparedStmt.execute();
           
             
                
            }
            
  void delete(int id) throws SQLException{
  
  
   Connection con = DriverManager.getConnection(url, user, password);
            String sql = "delete from employee where id = ?";
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setInt(1, id);
            preparedStmt.execute();
            con.close();
  
  
  }
  
  
 List read () throws SQLException{
     List<Employee> ae=new ArrayList();
     Connection con = DriverManager.getConnection(url, user, password);
  String query = "SELECT * FROM employee";

      Statement st = con.createStatement();
      
   
      ResultSet rs = st.executeQuery(query);
      

      while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("firstname");
        String lastName = rs.getString("lastname");
        int salary= rs.getInt("salary");
              String adress = rs.getString("Adress");
      Employee e=new Employee(firstName,lastName, salary, adress);
      ae.add(e);
      
      
      }
      st.close();
       return ae; 
  }

}

    
 
