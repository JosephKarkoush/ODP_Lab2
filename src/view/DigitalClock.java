package view;

import javax.swing.*;

import controller.Controller;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JPanel {
	private String newCurrentTime;
    private JLabel digitalClockLabel;

    public DigitalClock() {
        setLayout(new BorderLayout());
        digitalClockLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        digitalClockLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        add(digitalClockLabel, BorderLayout.CENTER);

//        Timer timer = new Timer(1000, e -> {
//        	updateDigitalClock(newCurrentTime);
//        });
//        timer.start();
    }

    public void updateDigitalClock(String newCurrentTime) {
    	this.newCurrentTime = newCurrentTime;
//    	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//    	String currentTime = dateFormat.format(new Date());
       digitalClockLabel.setText(newCurrentTime);
       System.out.println("update digital");
    }

}
