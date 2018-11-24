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
           
             conn.close();
                
            }
            
  void delete(int id) throws SQLException{
  
    Connection con = null;
   con = DriverManager.getConnection(url, user, password);
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
        int id = rs.getInt("ID");
        String firstName = rs.getString("Firstname");
        String lastName = rs.getString("Lastname");
        int salary= rs.getInt("Salary");
              String adress = rs.getString("Adress");
      Employee e=new Employee(id,firstName,lastName, salary, adress);
      ae.add(e);
      
      
      }
      st.close(); for (int i=0;i<ae.size();i++)System.out.print(ae.get(i).getId());
       return ae; 
  }
 
 
 
 
  void add(Contact p) throws SQLException {
         Connection conn = null;
         try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
          String sql = "insert into Contacts(Firstname, Lastname, Company, City, Email)"
                        + "values (?, ?, ?, ?, ?)";
                
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                
                preparedStmt.setString (1, p.getFirstname());
                preparedStmt.setString   (2, p.getLastname());
                preparedStmt.setString (3, p.getCompany());
                preparedStmt.setString (4, p.getCity());
                 preparedStmt.setString (5, p.getEmail());
              
                    preparedStmt.execute();
           
             
                
            }
void add(Property p) throws SQLException {
         Connection conn = null;
         try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
          String sql = "insert into Contacts(Kind, Supplier, Country, Providing, Junking)"
                        + "values (?, ?, ?, ?, ?)";
                
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                
                preparedStmt.setString (1, p.getKind());
                preparedStmt.setString   (2, p.getSupplier());
                preparedStmt.setString (3, p.getCountry());
                preparedStmt.setString (4, p.getProviding());
                    preparedStmt.setString (5, p.getJunking());
              
                    preparedStmt.execute();
           
             
                
}

    List<Property> readMajetok() throws SQLException {
      
        List<Property >am=new ArrayList();
 Connection con = DriverManager.getConnection(url, user, password);
  String query = "SELECT * FROM Property";

      Statement st = con.createStatement();
      
   
      ResultSet rs = st.executeQuery(query);
      

      while (rs.next())
      {
       
        String Kind =rs.getString("Kind");
        String  Supplier = rs.getString("Supplier");
        String Country= rs.getString("Country");
              String Providing = rs.getString("Providing");
               String Junking = rs.getString("Junking");
        

      Property e=new Property(Kind, Supplier, Country, Providing, Junking);
      am.add(e);
      
      
      }
      st.close();
       return am; 


     }

    void deletemajetok(String kind) {
     try {
         Connection con = DriverManager.getConnection(url, user, password);
         String sql = "delete from Property where Kind = ?";
         PreparedStatement preparedStmt = con.prepareStatement(sql);
         preparedStmt.setString(1, kind);
         preparedStmt.execute();
         con.close();
     } catch (SQLException ex) {
         Logger.getLogger(MSDatabase.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

 List<Contact> readContacts() {
       List<Contact> u=new ArrayList<>();
     try {
       
         Connection con = DriverManager.getConnection(url, user, password);
 Statement st = con.createStatement();
        String sql = "select * from contacts";
   
      ResultSet rs = st.executeQuery(sql);
      

      while (rs.next())
      {
      
        String Firstname= rs.getString("Firstname");
     String Lastname= rs.getString("Lastname");
       String Company    = rs.getString("Company");   
          String City   = rs.getString("City");
              String Email  = rs.getString("Email");    
      Contact e=new Contact(Firstname, Lastname, Company,City, Email);
      u.add(e);
      
      
      }
      st.close();
         
     } catch (SQLException ex) {
         Logger.getLogger(MSDatabase.class.getName()).log(Level.SEVERE, null, ex);
     }
      return u;  
    }

    void updateContact(Contact g) {
        
     try {
         Connection conn = DriverManager.getConnection(url, user, password);
         
         String query = "update contacts set email = ? where Firstname = ?";
         PreparedStatement preparedStmt = conn.prepareStatement(query);
         preparedStmt.setString   (1, g.getEmail());
         preparedStmt.setString(2, g.getFirstname());
         
         preparedStmt.executeUpdate();
         
         conn.close();
     } catch (SQLException ex) {
         Logger.getLogger(MSDatabase.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    void updateEmployee(Employee e) {
    try {
         Connection conn = DriverManager.getConnection(url, user, password);
         
         String query = "update employee set  salary = ? where id = ?";
         PreparedStatement preparedStmt = conn.prepareStatement(query);
         preparedStmt.setInt   (1, e.getSalary());
         preparedStmt.setInt(2, e.getId());
         
         preparedStmt.executeUpdate();
         
         conn.close();
     } catch (SQLException ex) {
         Logger.getLogger(MSDatabase.class.getName()).log(Level.SEVERE, null, ex);
     }

    
    }
    
      void deleteContact(String s) throws SQLException{
  
    Connection con = null;
   con = DriverManager.getConnection(url, user, password);
            String sql = "delete from contacts where Lastname = ?";
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, s);
            preparedStmt.execute();
            con.close();
  
  
  }
    
    
}


    
 
