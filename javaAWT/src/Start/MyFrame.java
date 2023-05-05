package Start;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ComponentListener;

import javax.swing.text.LabelView;

public class MyFrame extends Frame {

	
	public MyFrame(boolean visible,String title, int x,int y, int width ,int height) {
		this.setVisible(visible);
		this.setTitle(title);
		this.setBounds(x,y,width,height);
		this.setLayout(null);
		
		Label firstNo, secondNo, result_text, result ;
		
		
		/*  First no label and input text field */
		firstNo = new Label("First No");
		firstNo.setBounds(100,50,50,30);
		add(firstNo);
		
		TextField firstTf = new TextField();
		firstTf.setBounds(180,50,80,30);
		add(firstTf);
		
		/* Second no label and input text field */
		secondNo = new Label("Second No");
		secondNo.setBounds(280,50,80,30);
		add(secondNo);
		TextField secondTf = new TextField();
		secondTf.setBounds(380,50,80,30);
		add(secondTf);
		
		/* Result label and text field */
		result_text = new Label("Answer is : ");
		result_text.setBounds(100,100,80,30);
		add(result_text);
		//result = result.getText();
		
		Button addButton = new Button("Add");
		addButton.setBounds(200, 150, 80, 30);
		
		Button subButton = new Button("Subtract");
		subButton.setBounds(350, 150, 80, 30);
		
		this.add(addButton);
		this.add(subButton);
		
		addButton.addActionListener(new ActionHandler(firstTf,secondTf));
		subButton.addActionListener(new ActionHandler(firstTf,secondTf));

		// Single delegate for all types of events
		this.addWindowListener(new MasterWindowHandler());
		this.addMouseListener(new MasterWindowHandler());
		this.addMouseMotionListener(new MasterWindowHandler());
		
	}
}





// multiple delgates for multiple events
//this.addWindowListener(new WindowHandler());
//this.addMouseListener(new MouseHandler());
//this.addMouseMotionListener(new MouseMotionHandler());
