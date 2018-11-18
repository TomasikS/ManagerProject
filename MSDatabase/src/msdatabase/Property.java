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
 String type;
 String supplier;
 String country;
 String procurement;
 String disposal;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProcurement() {
        return procurement;
    }

    public void setProcurement(String procurement) {
        this.procurement = procurement;
    }

    public String getDisposal() {
        return disposal;
    }

    public void setDisposal(String disposal) {
        this.disposal = disposal;
    }

    public Property(String type, String supplier, String country, String procurement, String disposal) {
        this.type = type;
        this.supplier = supplier;
        this.country = country;
        this.procurement = procurement;
        this.disposal = disposal;
    }
}
