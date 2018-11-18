/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdatabase;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
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
    private Employee Employee;
 
    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
      
 
      
        menuBar = new JMenuBar();
 

        menu = new JMenu("Employees");
        menu.setMnemonic(KeyEvent.VK_A);
     
        menuBar.add(menu);
 

        menuItem = new JMenuItem("ADD",
                                 KeyEvent.VK_T);
 
        
        
        menuItem.addActionListener(e -> {
            ADDEmployee addEmployee = new ADDEmployee();
});
        
        
        
        menu.add(menuItem);
        menuItem = new JMenuItem("UPDATE Salary");
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);
 
        menuItem.addActionListener(e -> {
            UpdateForm addEmployee = new UpdateForm();
});

        
        menuItem = new JMenuItem("DELETE");
        menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);
           menuItem.addActionListener(e -> {
            DeleteForm delEmployee = new DeleteForm();
});
        
        menu = new JMenu("Contacts");
        menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu);
        
         menuItem = new JMenuItem("ADD",
                                 KeyEvent.VK_T);
         
          menu.add(menuItem);
         
         
 
         menuItem.addActionListener(e -> {
           ADDContactForm form= new ADDContactForm();
           
          }); 
         
         
         
            menuItem = new JMenuItem("UPDATE",
                                 KeyEvent.VK_T);
         
          menu.add(menuItem);
              menuItem = new JMenuItem("DELETE",
                                 KeyEvent.VK_T);
         
          menu.add(menuItem);

         
         
         
      menu = new JMenu("Property");
        menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu); 
        
        menuItem = new JMenuItem("ADD",
                                 KeyEvent.VK_T);
  menu.add(menuItem);
  
        menuItem = new JMenuItem("DELETE",
                                 KeyEvent.VK_T);
  menu.add(menuItem);
  
  
         menuItem.addActionListener(e -> {
        Majetok form= new Majetok();
});
        return menuBar;
    }
 
    public Container createContentPane() {
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);
        scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
 
        return contentPane;
    }
 
  
    private static void createAndShowGUI() {
  
        JFrame frame = new JFrame("MenuLookDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
       GUI demo = new   GUI();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
 
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
      
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                
               
            }
        });
    }   
}


 
        
  