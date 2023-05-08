package Start;

import java.awt.TextField;

public class Entry extends ActionHandler{
	public Entry(TextField firstTf, TextField secondTf) {
		super(firstTf, secondTf);
		// TODO Auto-generated constructor stub
	}
	
	public int ActionHandler(int total) {
		// TODO Auto-generated method stub
	int tot= super.ActionHandler(total);
	return tot;
	}
	
	public static void main(String args[]){
		  new MyFrame(true, "My First Calci ", 100, 100, 500, 500);
  }
}