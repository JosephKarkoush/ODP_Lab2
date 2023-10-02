package view;

import javax.swing.*;

import controller.Controller;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JPanel {
	private String newCurrentTime;
	private JLabel digitalClockLabel;
	private Controller controller;

	public DigitalClock(Controller controller) {
		this.controller = controller;
		setLayout(new BorderLayout());
		setBackground(Color.red);
		digitalClockLabel = new JLabel("00:00:00", SwingConstants.CENTER);
		digitalClockLabel.setFont(new Font("Arial", Font.PLAIN, 55));
		digitalClockLabel.setForeground(Color.white);
		add(digitalClockLabel, BorderLayout.CENTER);
	}

	public void updateDigitalClock(String newCurrentTime) {
		this.newCurrentTime = newCurrentTime;
		digitalClockLabel.setText(this.newCurrentTime);
	}

}
