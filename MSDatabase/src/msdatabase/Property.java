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

    public Property(String type, String supplier, String country, String procurement, String disposal) {
        this.type = type;
        this.supplier = supplier;
        this.country = country;
        this.procurement = procurement;
        this.disposal = disposal;
    }
}
