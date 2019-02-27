/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import msdatabase.Contact;
import msdatabase.MSDatabase;
import org.junit.Test;

/**
 *
 * @author Lenovo
 */
public class ADDContactFormTest {
     MSDatabase ms=new MSDatabase();
    
    String Firstname;
      String      Lastname;
            String Company;
       String     Email;
   
       @Test
   public void test() throws SQLException{
      Firstname="Ján"; Lastname="Novák"; 
      Company="Hotovo"; Email="Novak@gmail.com";
   Contact Contact =new Contact( Firstname, Lastname, Company, Email);
  
         List<Contact> emp=new ArrayList() ;
    emp=ms.readContacts();
      ms.add(Contact);
        List<Contact> emp2=new ArrayList() ;
    emp2=ms.readContacts();
assertTrue(emp2.size()  > emp.size());
    }
   
   
    @Test
   public void test2() throws SQLException{
     List<Contact> emp=new ArrayList() ;
 emp=ms.readContacts();
     Contact e;
     e=emp.get(0);
     e.setEmail("sajko@gmail.com");
     ms.updateContact(e);
     List<Contact> emp2=new ArrayList() ;
 emp2=ms.readContacts();
 
     assertTrue(emp2.get(0).getEmail()!= emp.get(0).getEmail());
    }
   
     @Test
   public void test22() throws SQLException{
     List<Contact> emp=new ArrayList() ;
 emp=ms.readContacts();
     Contact e;
     e=emp.get(0);
  ms.deleteContact(e.getLastname());
   
List<Contact> emp2=new ArrayList() ;
 emp2=ms.readContacts();
 
     assertTrue(emp2.size() !=emp.size());
    }
}
