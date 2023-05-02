package Start;

import java.awt.Frame;

public class MyFrame extends Frame{
	// create own frame constructor to accept all required properties of FRAME
	MyFrame(boolean visible, String title, int x, int y, int width, int height) {
		this.setTitle(title);
		this.setVisible(visible);
		this.setBounds(x, y, width, height);
	
	}
}