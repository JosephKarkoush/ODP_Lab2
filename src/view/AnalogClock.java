package view;

import controller.*;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;

import controller.Controller;

public class AnalogClock extends JPanel {
	private Controller controller;
    private double secundAngle;
    private double minuteAngle;
    private double hourAngle;

    public AnalogClock() {
        setBackground(Color.red);
        secundAngle = Math.PI / 2;
        minuteAngle = Math.PI / 2;
        hourAngle = Math.PI / 2;

    }
    
    public void SetControllerForAnalog(Controller controller) {
    	this.controller = controller;
    }
    
    
    
    public void updateAngles() {
        secundAngle -= Math.PI / 30;
        minuteAngle -= ((Math.PI / 30)/60);
        hourAngle -= (((Math.PI / 30)/60)/60);
        repaint();
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

        
        double secondHandLength = radius * 0.5;
        double xsecondEnd = xCenter + secondHandLength * Math.cos(secundAngle);
        double ysecondEnd = yCenter - secondHandLength * Math.sin(secundAngle);
        g.setColor(Color.white);
        g.drawLine(xCenter, yCenter, (int) xsecondEnd, (int) ysecondEnd);

        
        double minuteHandLength = radius * 0.7;
        double xMinuteEnd = xCenter + minuteHandLength * Math.cos(minuteAngle);
        double yMinuteEnd = yCenter - minuteHandLength * Math.sin(minuteAngle);
        g.setColor(Color.black);
        g.drawLine(xCenter, yCenter, (int) xMinuteEnd, (int) yMinuteEnd);
        
        
        double hourHandLength = radius * 0.7;
        double xHourEnd = xCenter + hourHandLength * Math.cos(hourAngle);
        double yHourEnd = yCenter - hourHandLength * Math.sin(hourAngle);
        g.setColor(Color.black);
        g.drawLine(xCenter, yCenter, (int) xHourEnd, (int) yHourEnd);

    }
}
