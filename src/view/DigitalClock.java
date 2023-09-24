package view;

import javax.swing.*;

import controller.Controller;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JPanel {

    private JLabel digitalClockLabel;

    public DigitalClock() {
        setLayout(new BorderLayout());
        digitalClockLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        digitalClockLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        add(digitalClockLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, e -> {
        	updateDigitalClock();
        });
        timer.start();
    }

    private void updateDigitalClock() {
    	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    	String currentTime = dateFormat.format(new Date());
       digitalClockLabel.setText(currentTime);
    }

}
