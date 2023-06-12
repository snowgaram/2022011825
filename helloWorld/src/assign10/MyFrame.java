package assign10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		JButton button1 = new JButton("Combination Pizza");
		JButton button2 = new JButton("Potato Pizza");
		JButton button3 = new JButton("Roasted meat Pizza");
		
		JPanel label_panel = new JPanel();
		JPanel button_panel = new JPanel();

		JLabel label1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
		JLabel label2 = new JLabel("count");
		
		JTextField text = new JTextField(10);
		
		setLayout(new FlowLayout());

		label_panel.add(label1);
		
		button_panel.add(button1);
		button_panel.add(button2);
		button_panel.add(button3);
		
		button_panel.add(label2);
		button_panel.add(text);
		
		this.add(label_panel);
		this.add(button_panel);
		
		setSize(600,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}
}
