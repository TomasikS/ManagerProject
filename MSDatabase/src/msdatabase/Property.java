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
public class Property {
String  Kind;
String Supplier; 
String Providing; 
String Junking;
String Name;
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public String getKind() {
        return Kind;
    }

    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

  

    public String getProviding() {
        return Providing;
    }

    public void setProviding(String Providing) {
        this.Providing = Providing;
    }

    public String getJunking() {
        return Junking;
    }

    public void setJunking(String Junking) {
        this.Junking = Junking;
    }

    public Property(String Kind, String Name, String Supplier, String Providing, String Junking) {
        this.Kind = Kind;
        
        this.Name=Name;
        this.Supplier = Supplier;
 
        this.Providing = Providing;
        this.Junking = Junking;
    }

}
