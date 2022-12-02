package org.swing.test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  

public class Main {
	
	public static void main(String[] args) {  
	    JFrame f = new JFrame("Button Example");  
	    final JTextField userDistance = new JTextField();
	    
	    JLabel l1,l2;  
	    l1 = new JLabel("First Label.");  
	    l1.setBounds(50,50, 100,30);  
	    l2 = new JLabel("First Label.");  
	    l2.setBounds(50,50, 100,30);  
	    
	    f.add(l1); f.add(l2);
	    final JTextField userAge = new JTextField();  
	    userDistance.setBounds(70,50, 100,30);  
	    userAge.setBounds(50,50, 100,10); 
	    JButton b = new JButton("Calcola");  
	    b.setBounds(70,100,95,30);  
	    
	    b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				userDistance.setText("");  
				userAge.setText("");  
			    f.setVisible(false); 
	        }  
	    });  
	    f.add(b);
	    f.add(userDistance);
	    f.add(userAge);  
	    f.setSize(500,300);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}  
	  
}
