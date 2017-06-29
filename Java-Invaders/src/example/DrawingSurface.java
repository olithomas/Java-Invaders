package example;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingSurface extends JPanel {

	/**
	 * Create the panel.
	 */
	public DrawingSurface() {
		this.setBackground(Color.WHITE);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("test", 0, 100);
	}

}
