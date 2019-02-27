/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static junit.framework.Assert.assertTrue;
import msdatabase.Employee;
import msdatabase.MSDatabase;
import org.junit.Test;



 




/**
 *
 * @author Lenovo
 */
public class ADDEmployeeTest   {
    MSDatabase ms=new MSDatabase();
    
    
 

    @Test
   public void t2() throws SQLException{
    Random Random=new Random();
   String firstname="Ján"; 
   String lastname="Novák"; 
   int salary=Random.nextInt(500)+100; 
   String adress="Košice";
   
Employee p=new Employee(firstname,lastname,salary,adress); p.setFirstname(firstname);
  ms.add(p);
     List<Employee> emp=new ArrayList() ;
    emp=ms.read();
 
assertTrue((emp.get( emp.size()-1).getFirstname()).substring(0,3).equals("Ján"));
assertTrue((emp.get(emp.size()-1).getLastname()).substring(0, 5).equals("Novák"));
assertTrue((emp.get(emp.size()-1).getAdress()).substring(0, 6).equals("Košice"));
 
    }
   
   
    @Test
   public void t22() throws SQLException{
    
   
     List<Employee> emp=new ArrayList() ; 
     List<Employee> emp2=new ArrayList() ;
    emp=ms.read();
   int count=emp.size();
     Random Random=new Random();
if(emp.size()>1){  
    
  int k=Random.nextInt(emp.size()-1);
    Employee e;
    e=emp.get(k);
   ms.delete(e.getFirstname());
     emp2=ms.read();
      int count2=emp2.size();
     assertTrue(count!=count2);
    } }
   
       @Test
   public void t222() throws SQLException{
          List<Employee> emp=new ArrayList() ; 
    emp=ms.read();
    Employee e;
if(emp.size()>0){    e=emp.get(0);
    e.setSalary(40000);
  ms.updateEmployee(e);
  List<Employee> emp2=new ArrayList() ;
  emp2=ms.read();
   assertTrue(emp2.get(0).getSalary() ==40000);
  
    }
   

    }



}
