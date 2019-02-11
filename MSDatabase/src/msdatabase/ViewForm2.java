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
class ViewForm2 {
    public Container createContentPane() throws SQLException
    {   
           
        JButton b2=new JButton();
        MSDatabase d=new MSDatabase();
        
        ArrayList<Contact> e=new   ArrayList();
      
        e=(ArrayList<Contact>) d.readContacts();
        int capacity=e.size();
     
           Object[]pole1 = new Object[capacity];
            Object[]pole2 = new Object[capacity];
            Object[]pole3 = new Object[capacity];
            Object[]pole4 = new Object[capacity];
        
     for (int i=0; i<capacity;i++)    pole1[i]=e.get(i).Firstname;
            for (int i=0; i<capacity;i++)    pole2[i]=e.get(i).Lastname;
              for (int i=0; i<capacity;i++)    pole3[i]=e.get(i).Company;
                    for (int i=0; i<capacity;i++)    pole4[i]=e.get(i).Email;
        
        String[] title = {"Firstname", "Lastname",  "Company", "Email"};
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
        
        totalGUI.add(b2, new BorderLayout().SOUTH);
 
       b2.setText("BACK");
        
       
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
            
      }
       
       });
        
       
        return totalGUI;  
}
    
      static void createAndShowGUI() {
    JFrame frame = new JFrame("");
       try {
           JFrame.setDefaultLookAndFeelDecorated(true);
          
           ViewForm2 demo = new ViewForm2();
           frame.setContentPane(demo.createContentPane());
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(TableHistory.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

}
