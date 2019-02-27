/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import msdatabase.Customer;
import msdatabase.HireDB;
import msdatabase.Order;
import org.junit.Test;

/**
 *
 * @author Lenovo
 */
public class HireTest {
    HireDB hd=new HireDB();
    
    /**
     *
     * @throws SQLException
     */
    @Test
    public void Test() throws SQLException{
    
    List<Order> item=hd.readOrder();
   List<Customer> item2=hd.readCustomer(); 
   assertTrue(item.size()>0);
    assertTrue(item2.size()>0);
         }
         
}
