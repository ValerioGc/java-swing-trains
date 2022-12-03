package org.swing.test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  

public class App {
	
	public static void main(String[] args) {  
	    JFrame app = new JFrame("Button Example");  
	    
    //UserDistance
	    JLabel l1 = new JLabel("Inserisci la distanza da percorrere");  
	    final JTextField userDistance = new JTextField();
	    l1.setBounds(70,50, 150,30);  
	    userDistance.setBounds(70,70, 150,30);  
	    
    // user age
	    JLabel l2 = new JLabel("Inserisci la tua età");  
	    final JTextField userAge = new JTextField();  
	    l2.setBounds(140,50, 150,30);  
	    userAge.setBounds(140,70, 150,30); 
	    
    // Button
	    JButton btn = new JButton("Calcola");  
	    btn.setBounds(100,250,100,30);  
	    
    // CheckBox
	    JCheckBox cb1 = new JCheckBox("Flessibile?");  
        cb1.setBounds(100,100,150,20);  

    // Event listner bottone
	    btn.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				userDistance.setText("");  
				userAge.setText("");  
			    app.setVisible(false); 
	        }  
	    });  
    // ElementsAdd|
	    app.add(userDistance);app.add(userAge);  
	    app.add(l1); app.add(l2);app.add(cb1);
	    app.add(btn);
	    
    // Window properties
	    app.setSize(1000,700);  
	    app.setLayout(null);  
	    app.setVisible(true);   
	}  
	  
}
