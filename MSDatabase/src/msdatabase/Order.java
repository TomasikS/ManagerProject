/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Order {
Date OrderDate;
        
        Date   RemoteDate;
        
        
      String  name;
        
        
      int  price; 
        
        
        
      int CustomerID ;
    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Date getRemoteDate() {
        return RemoteDate;
    }

    public void setRemoteDate(Date RemoteDate) {
        this.RemoteDate = RemoteDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

      
      
      
    public Order(Date OrderDate, Date RemoteDate, String name, int price, int CustomerID) {
        this.OrderDate = OrderDate;
        this.RemoteDate = RemoteDate;
        this.name = name;
        this.price = price;
        this.CustomerID = CustomerID;
    }
    
    


    

}
