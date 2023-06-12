package asdf;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyMouseListener extends MouseAdapter{
	
	JPanel p1;
	
	MyMouseListener(JPanel p1){
		this.p1 = p1;
	}
	public void mousePressed(MouseEvent e) {
		Graphics g = p1.getGraphics();
		g.drawRect(e.getX(), e.getY(), 20, 20);
	}
}
