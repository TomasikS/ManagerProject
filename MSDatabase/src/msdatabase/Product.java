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
public class Product {
 int  ProductID;
int OrderID ;
String name;  
int OnOrder ;
int InStock ;


    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnOrder() {
        return OnOrder;
    }

    public void setOnOrder(int OnOrder) {
        this.OnOrder = OnOrder;
    }

    public int getInStock() {
        return InStock;
    }

    public void setInStock(int InStock) {
        this.InStock = InStock;
    }
   




}

