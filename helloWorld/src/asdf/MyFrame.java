package asdf;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pa = new JPanel();
		
		Container c = getContentPane();
		
		c.add(pa);
		c.addMouseListener(new MyMouseListener(pa));
		
		setSize(500,500);
		setVisible(true);
	}
}
