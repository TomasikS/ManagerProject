/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *
 * @author Lenovo
 */
public class GUI {
MSDatabase app = new MSDatabase();
    JScrollPane scrollPane;
public static JFrame frame = new JFrame("APP FOR MANAGER");
 
    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
      
 
      
        menuBar = new JMenuBar();
 

        menu = new JMenu("Employees");
         menu.setFont( new Font("Sansserif", Font.BOLD,30));
       /// menu.setMnemonic(KeyEvent.VK_A);
     
        menuBar.add(menu);
 

        menuItem = new JMenuItem("ADD"
                                );
 
        
        
        menuItem.addActionListener(e -> {
            ADDEmployee addEmployee = new ADDEmployee();
});
        
        
        
        menu.add(menuItem);
        menuItem = new JMenuItem("UPDATE Salary");
       // menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);
 
        menuItem.addActionListener(e -> {
            UpdateForm addEmployee = new UpdateForm();
});

        
        menuItem = new JMenuItem("DELETE");
       // menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);
           menuItem.addActionListener(e -> {
            DeleteForm delEmployee = new DeleteForm();
});
           
                   menuItem = new JMenuItem("History");
       // menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);
           menuItem.addActionListener(e -> {
            try {
                TableHistory t = new TableHistory();
                
                t.createContentPane();
                
                TableHistory.createAndShowGUI();
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
});
           
          menu.add(menuItem);
        menuItem = new JMenuItem("VIEW");
        menu.add(menuItem);
 
        menuItem.addActionListener(e -> {
            try {
                ViewForm1 f1= new ViewForm1();
                f1.createContentPane();
                 ViewForm1.createAndShowGUI();
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
         
           
}); 
           
           
           
           
        
        menu = new JMenu("Contacts");
              
                 menu.setFont( new Font("Sansserif", Font.BOLD,30));
        ///menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu);
        
         menuItem = new JMenuItem("ADD",
                                 KeyEvent.VK_T);
         
          menu.add(menuItem);
         
         
 

         
                    menuItem.addActionListener(e -> {
           ADDContactForm form= new ADDContactForm();
           
          }); 
         
         
            menuItem = new JMenuItem("UPDATE"
                                );
         
          menu.add(menuItem);
          
          menuItem.addActionListener(e -> {
          UpdateContact form= new UpdateContact();
           
          }); 
          
          
              menuItem = new JMenuItem("DELETE");
         
          menu.add(menuItem);
         menuItem.addActionListener(e -> {
           DeleteContactForm form= new DeleteContactForm();
           
          }); 
         
          menu.add(menuItem);
        menuItem = new JMenuItem("VIEW");
        menu.add(menuItem);
 
 menuItem.addActionListener(e -> {
            try {
                ViewForm2 f1= new ViewForm2();
                f1.createContentPane();
                 ViewForm2.createAndShowGUI();
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
         
           
}); 

         
      menu = new JMenu("Property");  
      menu.setFont( new Font("Sansserif", Font.BOLD,30));
     // menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu); 
        
        menuItem = new JMenuItem("ADD"
                                );
  menu.add(menuItem);
  
           menuItem.addActionListener(e -> {
        Majetok form= new Majetok();
});
  
        menuItem = new JMenuItem("DELETE");
  menu.add(menuItem);
  
           menuItem.addActionListener(e -> {
        MajetokDelete form= new MajetokDelete();      
});
           
             menuItem = new JMenuItem("VIEW");
        menu.add(menuItem);
 
 menuItem.addActionListener(e -> {
            try {
                ViewForm3 f1= new ViewForm3();
                f1.createContentPane();
                 ViewForm3.createAndShowGUI();
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
         
           
}); 
        
           
            menu = new JMenu("Hires");
 menu.setFont( new Font("Sansserif", Font.BOLD,30));
     // menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu); 
        
        menuItem = new JMenuItem("VIEW"
                                );
  menu.add(menuItem);
  
           menuItem.addActionListener(e -> {
        HireForm form= new HireForm();
        form.setVisible(true);
});
        return menuBar;
    }
 
    public Container createContentPane() {
        JPanel contentPane = new JPanel(new BorderLayout());
        
        
        contentPane.setOpaque(true);
        scrollPane = new JScrollPane();
        JButton bc=new JButton("LOGOUT");
         JButton bc2=new JButton("BACK");
         
         bc.setSize(20, 20);  bc2.setSize(20, 20);
        contentPane.add(scrollPane, BorderLayout.CENTER);

   contentPane.add(new Stred2());
        return contentPane;
    }
 
  
    public static void createAndShowGUI() {
  
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       GUI demo = new   GUI();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
 
        frame.setSize(600, 360);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
 
    ///public static void main(String[] args) {
      
     /*   javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                
               
            
        });}*/
   ///}   
}


 
        
  