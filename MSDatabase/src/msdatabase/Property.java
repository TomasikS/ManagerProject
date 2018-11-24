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

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
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

    public Property(String Kind, String Supplier, String Country, String Providing, String Junking) {
        this.Kind = Kind;
        this.Supplier = Supplier;
        this.Country = Country;
        this.Providing = Providing;
        this.Junking = Junking;
    }
String  Kind;
String Supplier; 
String Country; 
String Providing; 
String Junking;
}
