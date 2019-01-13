/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

/**
 *
 * @author Lenovo
 */
public class Contact {

    public Contact(String Lastname, String Email) {
        this.Lastname = Lastname;
        this.Email = Email;
    }

    public Contact(String Firstname, String Lastname, String Company, String Email) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Company = Company;
        this.Email = Email;
    }
String Firstname ;
 String Lastname ;
  String Company;  
  
  String Email;
 

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
          
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

  

  
  
 
 
 
}
