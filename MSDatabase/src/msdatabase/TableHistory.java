/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

import java.awt.Container;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Lenovo
 */
public class TableHistory {
    
   public Container createContentPane() throws SQLException
    { 
        
        MSDatabase d=new MSDatabase();
        
        ArrayList<Employee> e=new   ArrayList();
         Object[]pole1 = new Object[4];
            Object[]pole2 = new Object[4];
            Object[]pole3 = new Object[4];
            Object[]pole4 = new Object[4];
        e=(ArrayList<Employee>) d.read();
        
     for (int i=0; i<3;i++)    pole1[i]=e.get(i).firstname;
            for (int i=0; i<3;i++)    pole2[i]=e.get(i).lastname;
                for (int i=0; i<3;i++)    pole3[i]=e.get(i).salary;
                    for (int i=0; i<3;i++)    pole4[i]=e.get(i).adress;
        
        String[] title = {"firstname", "lastname", "salary", "adress"};
        Object[][] playerdata = new Object [4][4];
        
        for (int i=0; i<3;i++)playerdata[i][0]=pole1[i];
        for (int i=0; i<3;i++)playerdata[i][1]=pole2[i];
        for (int i=0; i<3;i++)playerdata[i][2]=pole3[i];
        for (int i=0; i<3;i++)playerdata[i][3]=pole4[i];
        
     
        JTable table = new JTable(playerdata, title);
  
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500, 150));
    
        JPanel totalGUI = new JPanel();
        totalGUI.add(scrollPane);
        totalGUI.setOpaque(true);
        return totalGUI;  
}
   
    static void createAndShowGUI() {

       try {
           JFrame.setDefaultLookAndFeelDecorated(true);
           JFrame frame = new JFrame("");
           TableHistory demo = new TableHistory();
           frame.setContentPane(demo.createContentPane());
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(TableHistory.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
  }