/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class TableHistory {
    
   public Container createContentPane() throws SQLException
    { 
        JButton b1=new JButton();
        JButton b2=new JButton();
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
        totalGUI.add(scrollPane, new BorderLayout().NORTH);
        totalGUI.add(b1, new BorderLayout().SOUTH);    totalGUI.add(b2, new BorderLayout().WEST);
        b1.setText("SORT");   b2.setText("BACK");
        
       b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    ArrayList<Employee> ee = (ArrayList<Employee>) d.read();
                    for (int i=0; i<3;i++)    pole3[i]=ee.get(i).salary;
                    Vector<Integer> t= new Vector();
                    for (int i=0; i<3;i++) t.add(ee.get(i).salary);
                    Collections.sort(t);
                    String[] String_Array = new  String[3];
                    
                   for (int i=0; i<3;i++)
                     String_Array[i]=t.toArray()[i].toString();
                   
                     for (int i=0; i<3;i++)
                   
                      playerdata[i][2]=Integer.parseInt(String_Array[i] );
                   
                     JTable table2 = new JTable(playerdata, title);
  
        JScrollPane scrollPane = new JScrollPane(table2);
        
        
        scrollPane.setPreferredSize(new Dimension(500, 150));
    
        JPanel totalGUI = new JPanel();
        totalGUI.add(scrollPane, new BorderLayout().NORTH);
                   
                   
                    
                    totalGUI.setOpaque(true);      
                } catch (SQLException ex) {
                    Logger.getLogger(TableHistory.class.getName()).log(Level.SEVERE, null, ex);
                }
            
      }
       
       });
       
       
       
       
       
       
       
       
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               GUI m= new GUI();
        m.createAndShowGUI();   
              
            
      }
       
       });
        
       
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