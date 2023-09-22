package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnalogClock extends JPanel {

    private double hourAngle;
    private double minuteAngle;

    public AnalogClock() {
        setBackground(Color.red);
        hourAngle = Math.PI / 3;
        minuteAngle = Math.PI / 3;

        Timer timer = new Timer(1000, e -> {
            updateAngles();
            repaint();
        });
        timer.start();
    }

    private void updateAngles() {
        
    	
        hourAngle -= Math.PI / 180;
        minuteAngle -= Math.PI / 30;
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

        
        double hourHandLength = radius * 0.5;
        double xHourEnd = xCenter + hourHandLength * Math.cos(hourAngle);
        double yHourEnd = yCenter - hourHandLength * Math.sin(hourAngle);
        g.setColor(Color.blue);
        g.drawLine(xCenter, yCenter, (int) xHourEnd, (int) yHourEnd);

        
        double minuteHandLength = radius * 0.7;
        double xMinuteEnd = xCenter + minuteHandLength * Math.cos(minuteAngle);
        double yMinuteEnd = yCenter - minuteHandLength * Math.sin(minuteAngle);
        g.setColor(Color.green);
        g.drawLine(xCenter, yCenter, (int) xMinuteEnd, (int) yMinuteEnd);

    }
}
