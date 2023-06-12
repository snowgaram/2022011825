package assign11;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
		JPanel panel = new JPanel();
		
		Container c = getContentPane();
		c.add(panel);
		c.addMouseListener(new PanelMouseAdapter(panel));
	}
}
