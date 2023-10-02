package view;

import controller.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.Timer;

import controller.Controller;

public class AnalogClock extends JPanel {

	private double secundAngle;
	private double minuteAngle;
	private double hourAngle;
	private Controller controller;

	public AnalogClock(Controller controller) {
		this.controller = controller;
		setBackground(Color.red);
		secundAngle = Math.PI / 2;
		minuteAngle = Math.PI / 2;
		hourAngle = Math.PI / 2;

	}

	public void resetHourAngles() {
		hourAngle = Math.PI / 2;
	}

	public void resetMinuteAngles() {
		minuteAngle = Math.PI / 2;
	}

	public void resetSecondAngles() {
		secundAngle = Math.PI / 2;
	}

	public void updateHourAngle() {
		hourAngle = -controller.getHourController() * (2 * Math.PI / 12) + Math.PI / 2;
	}

	public void updateMinuteAngle() {
		minuteAngle = -controller.getMinuteController() * (2 * Math.PI / 60) + Math.PI / 2;
	}

	public void updateSecondAngle() {
		secundAngle = -controller.getSecondController() * (2 * Math.PI / 60) + Math.PI / 2;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(4));
		
		g.setColor(Color.white);

		int width = getWidth();
		int height = getHeight();

		int xCenter = width / 2;
		int yCenter = height / 2;

//		g.drawLine(0, yCenter, width, yCenter);
//		g.drawLine(xCenter, 0, xCenter, height);
		g.drawOval(0, 0, width, height);

		double radius = height / 2;

		double secondHandLength = radius * 0.5;
		double xsecondEnd = xCenter + secondHandLength * Math.cos(secundAngle);
		double ysecondEnd = yCenter - secondHandLength * Math.sin(secundAngle);
		g.setColor(Color.white);
		g.drawLine(xCenter, yCenter, (int) xsecondEnd, (int) ysecondEnd);

		double minuteHandLength = radius * 0.9;
		double xMinuteEnd = xCenter + minuteHandLength * Math.cos(minuteAngle);
		double yMinuteEnd = yCenter - minuteHandLength * Math.sin(minuteAngle);
		g.setColor(Color.black);
		g.drawLine(xCenter, yCenter, (int) xMinuteEnd, (int) yMinuteEnd);

		double hourHandLength = radius * 0.6;
		double xHourEnd = xCenter + hourHandLength * Math.cos(hourAngle);
		double yHourEnd = yCenter - hourHandLength * Math.sin(hourAngle);
		g.setColor(Color.black);
		g.drawLine(xCenter, yCenter, (int) xHourEnd, (int) yHourEnd);

	}
}
