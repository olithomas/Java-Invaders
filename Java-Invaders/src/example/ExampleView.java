package example;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExampleView extends JFrame {

	private DrawingSurface drawingSurface;

	/**
	 * Create the frame.
	 */
	public ExampleView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		drawingSurface = new DrawingSurface();
		drawingSurface.setBorder(new EmptyBorder(5, 5, 5, 5));
		drawingSurface.setLayout(new BorderLayout(0, 0));
		setContentPane(drawingSurface);
		setTitle("Java Invaders Simple Example");
	}

}
