package com.Juggler;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JugglerFrame extends Frame{
	private TextField number1Txt;
	private TextField number2Txt;
	private TextField number3Txt;
	Button BtnclockWise,BtnAnitclockWise;

	public JugglerFrame() {
	
		setBounds(100,100,500,450);
		setTitle("Juggler Game");
		setVisible(true);
		this.setLayout(null);
	
	number1Txt = new TextField();    
	number1Txt.setBounds(100,50,80,30);
	
	number2Txt = new TextField();    
	number2Txt.setBounds(250,50,80,30);
	
	number3Txt = new TextField();    
	number3Txt.setBounds(175, 100, 80, 30);
	
	BtnclockWise= new Button("Clock-Wise");
	BtnclockWise.setBounds(100,200,80,30);
	
	BtnAnitclockWise= new Button("Anti-ClockWise");
	BtnAnitclockWise.setBounds(250,200,90,30);
	
	
	this.add(number1Txt);
	this.add(number2Txt);
	this.add(number3Txt);
	this.add(BtnclockWise);
	this.add(BtnAnitclockWise);
	
	setLayout(null); 
	
	// close the Calculator
			this.addWindowListener((WindowListener) new WindowAdapter() {
			 @Override
			public void windowClosing(WindowEvent e) {
				 JugglerFrame jf = (JugglerFrame)e.getSource();
				 jf.dispose();
			 }
			});
			
		BtnclockWise.addActionListener(new JugglerOperation(number1Txt,number2Txt,number3Txt));
		BtnAnitclockWise.addActionListener(new JugglerOperation(number1Txt,number2Txt,number3Txt));

	}
}