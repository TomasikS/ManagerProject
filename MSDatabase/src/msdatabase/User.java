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
public class User {
public String login;
    public String heslo;
 int id;
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    
    public User( int i, String login, String heslo) {
        this.login = login;
        this.heslo = heslo;
        this.id=i;
    }
    public String ToString(){
         return " "+this.login+" "+this.heslo;
     }
}
