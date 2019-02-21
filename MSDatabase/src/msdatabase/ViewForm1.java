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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 

/**
 *
 * @author Lenovo
 */
public class ViewForm1 {
    
 static JFrame frame = new JFrame("");
    
 
 public Container createContentPane() throws SQLException
    {   
           
        JButton b2=new JButton();
        MSDatabase d=new MSDatabase();
        
        ArrayList<Employee> e=new   ArrayList();
      
        e=(ArrayList<Employee>) d.read();
        int capacity=e.size();
     
           Object[]pole1 = new Object[capacity];
            Object[]pole2 = new Object[capacity];
            Object[]pole3 = new Object[capacity];
            Object[]pole4 = new Object[capacity];
        
     for (int i=0; i<capacity;i++)    pole1[i]=e.get(i).firstname;
            for (int i=0; i<capacity;i++)    pole2[i]=e.get(i).lastname;
              for (int i=0; i<capacity;i++)    pole3[i]=e.get(i).salary;
                    for (int i=0; i<capacity;i++)    pole4[i]=e.get(i).adress;
        
        String[] title = {"firstname", "lastname", "salary", "adress"};
        Object[][] playerdata = new Object [capacity][4];
        
        for (int i=0; i<capacity;i++)playerdata[i][0]=pole1[i];
        for (int i=0; i<capacity;i++)playerdata[i][1]=pole2[i];
        for (int i=0; i<capacity;i++)playerdata[i][2]=pole3[i];
        for (int i=0; i<capacity;i++)playerdata[i][3]=pole4[i];
        
     
        JTable table = new JTable(playerdata, title);
  
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500, 150));
    
        JPanel totalGUI = new JPanel();
        totalGUI.add(scrollPane, new BorderLayout().NORTH);
        //totalGUI.add(b1, new BorderLayout().SOUTH);
        totalGUI.add(b2, new BorderLayout().SOUTH);
       // b1.setText("SORT"); 
       b2.setText("BACK");
        
       
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          frame.dispose();
            
      }
       
       });
        
       
        return totalGUI;  
}
    
      static void createAndShowGUI() {
    
       try {
           JFrame.setDefaultLookAndFeelDecorated(true);
          
           ViewForm1 demo = new ViewForm1();
           frame.setContentPane(demo.createContentPane());
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(TableHistory.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    
    
    
}
