package Start;

import java.awt.*;
public class MyButtons extends Button{
	
	MyButtons(String lable, int x, int y, int width, int height) {
		this.setLabel(lable);
		this.setBounds(x, y, width, height);
	}
}