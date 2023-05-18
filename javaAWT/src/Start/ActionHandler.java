package Start;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{

	
	private TextField firsrtTf;
	private TextField secondTf;
	int sum, substract;
	
	public ActionHandler(TextField firstTf, TextField secondTf) {
		this.firsrtTf = firstTf;
		this.secondTf = secondTf;
	}

	public void actionPerformed(ActionEvent e) throws NumberFormatException {

		if(e.getActionCommand().equalsIgnoreCase("add")) {
		   try {
			   		int number_1 = Integer.parseInt(this.firsrtTf.getText());
			   		int number_2 = Integer.parseInt(this.secondTf.getText());
			   		sum = number_1+number_2;
//			   		System.out.println(sum);
			   		ActionHandler(sum);
		   		}	
		   catch(Exception exc) { }
		   
		}else if (e.getActionCommand().equalsIgnoreCase("subtract")) {
			int number_1 = Integer.parseInt(this.firsrtTf.getText());
	   		int number_2 = Integer.parseInt(this.secondTf.getText());
			substract= number_1-number_2;
	   		System.out.println(substract);
		}
	}
	
		public int ActionHandler(int total) {
			System.out.println("Total : "+total);
			return total;
		}
}