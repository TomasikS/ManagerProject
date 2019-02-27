/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import msdatabase.MSDatabase;
import msdatabase.Property;
import org.junit.Test;

/**
 *
 * @author Lenovo
 */
public class MajetokTest {
    
    MSDatabase ms=new MSDatabase();
    String  Kind="Finance";
String Supplier="Gonos"; 
String Providing=" "; 
String Junking=" ";
String Name=" ";


    @Test
    public void Test() throws SQLException{
      Property p=new Property(Kind, Name, Supplier,Providing,Junking);
      
          List <Property> l1=ms.readMajetok();
    ms.add(p);
    List <Property> l2=ms.readMajetok();
    
      assertTrue(l1.size() < l2.size());
    
    }
       @Test
    public void Test2() throws SQLException{
      Property p=new Property(Kind, Name, Supplier,Providing,Junking);
      
          List <Property> l1=ms.readMajetok();
    ms.deletemajetok(p.getName());
    List <Property> l2=ms.readMajetok();
    
      assertTrue(l1.size() != l2.size());
    
    }
    
}
