package Start;

//import java.awt.Frame;
//import java.awt.Color;
import java.awt.*;

public class Entry{
	public static void main(String args[]) throws InterruptedException {
		
//		MyFrame.setBounds(200, 200, 500, 500);
//		MyFrame.setTitle("Encora Calculator 1.0");
//		MyFrame.setVisible(true);
		
		MyFrame f1 = new MyFrame(true, "FRAME - 1", 0,0,500,500);   //extends MyFrame class
//		MyFrame f2 = new MyFrame(true, "FRAME - 2", 300,0,300,300);   //extends MyFrame class
//		MyFrame f3 = new MyFrame(true, "FRAME - 3", 500,500,600,600);   //extends MyFrame class
		
		Color c = new Color(-900);
		
//		Button b = new Button();
//		b.setLabel("1");
//		b.setBounds(50,100,30,30);
		
		MyButtons b1 = new MyButtons("1", 50, 100, 30, 30);
		MyButtons b2 = new MyButtons("2", 85, 100, 30, 30);
		MyButtons b3 = new MyButtons("3", 120, 100, 30, 30);
		
		final TextField tf=new TextField();  
	    tf.setBounds(50,50, 150,20);
	    tf.setText("Result");
	    tf.setVisible(true);
		
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(tf);
		
		f1.setLayout(null);
//		f1.setBackground(c);
//		System.out.println(f1.getWidth());
		
		Thread.sleep(5000);
		f1.dispose();
//		f2.dispose();
//		f3.dispose();

	}
}