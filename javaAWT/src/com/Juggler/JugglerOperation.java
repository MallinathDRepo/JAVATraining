package com.Juggler;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugglerOperation implements ActionListener{
	private TextField number1;	
	private TextField number2;
	private TextField number3;
	
	
	JugglerOperation(TextField number1Txt, TextField number2Txt,TextField number3Txt){
		this.number1 = number1Txt;
		this.number2 = number2Txt;
		this.number3 = number3Txt;
	}

	public void actionPerformed(ActionEvent e) {
		
		String firstValue=this.number1.getText();
		String secondValue=this.number2.getText();
		String thirdValue=this.number3.getText();
		
		int firstNumber=Integer.parseInt(firstValue);
		int secondNumber=Integer.parseInt(secondValue);
		int thirdNumber=Integer.parseInt(thirdValue);		
		
		int newFirstNumber=0;
		int newsecondNumber=0;
		int newThirdNumber=0;		
		
		if (e.getActionCommand().equalsIgnoreCase("Clock-Wise")) {
				newFirstNumber=firstNumber+1;
				String newFirstValue=String.valueOf(newFirstNumber);
				number2.setText(newFirstValue);
				
				newsecondNumber=secondNumber+1;
				String newsecondValue=String.valueOf(newsecondNumber);
				number3.setText(newsecondValue);
				
				newThirdNumber=thirdNumber+1;
				String newThirdValue=String.valueOf(newThirdNumber);
				number1.setText(newThirdValue);			
				
				
			
		}else if (e.getActionCommand().equalsIgnoreCase("Anti-ClockWise")) {
			newFirstNumber=firstNumber-1;
			String newFirstValue=String.valueOf(newFirstNumber);
			number3.setText(newFirstValue);
			
			newsecondNumber=secondNumber-1;
			String newsecondValue=String.valueOf(newsecondNumber);
			number1.setText(newsecondValue);
			
			newThirdNumber=thirdNumber-1;
			String newThirdValue=String.valueOf(newThirdNumber);
			number2.setText(newThirdValue);
			
		}	
	}
}