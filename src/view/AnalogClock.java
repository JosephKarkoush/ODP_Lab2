package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

public class AnalogClock extends JPanel {

	private double angle;

	public AnalogClock() {
		setBackground(Color.red);
		angle = Math.PI / 3;
		Timer timer = new Timer(1000, e -> {
			updateAngle();
			repaint();
		});
		timer.start();

	}

	private void updateAngle() {
		angle += 0.2;
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(Color.white);

		int width = getWidth();
		int height = getHeight();

		int xCenter = width / 2;
		int yCenter = height / 2;

		g.drawLine(0, yCenter, width, yCenter);

		g.drawLine(xCenter, 0, xCenter, height);

		g.drawOval(0, 0, width, height);

		double radius = height / 2;
		double xEnd = xCenter + radius * Math.cos(angle);
		double yEnd = yCenter - radius * Math.sin(angle);
		g.setColor(Color.red);
		g.drawLine(xCenter, yCenter, (int) xEnd, (int) yEnd);
	}

}
