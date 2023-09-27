package view;

import java.awt.Color;
import controller.*;
import java.awt.FlowLayout;
import controller.*;

import javax.swing.*;

public class ButtonPanel extends JPanel {

	
	private JButton setDayButton = new JButton("set day");
	private JButton setHourButton = new JButton("set Hour");
	private JButton setMinuteButton = new JButton("set minute");
	private JButton setSecondButton = new JButton("set second");
	private JButton addAlarmButton = new JButton("add alarm");
	private JButton removeAlarmButton = new JButton("remove alarm");
	private JButton seeAlarmsButton = new JButton("see alarms");
	private JButton checkAlarmButton = new JButton("check alarm");
	private Controller controller;
	String text;

	public ButtonPanel(Controller controller) {
		this.controller = controller;
		setBackground(Color.blue);
		setLayout(new FlowLayout());
//		this.text = textBoxPanel.toString();
		add(setDayButton);
		add(setHourButton);
		add(setMinuteButton);
		add(setSecondButton);
		add(addAlarmButton);
		add(removeAlarmButton);
		add(seeAlarmsButton);
		add(checkAlarmButton);

		setDayButton.addActionListener(e -> controller.setDay());
		setHourButton.addActionListener(e -> controller.setHour());
		setMinuteButton.addActionListener(e -> controller.setMinute());
		setSecondButton.addActionListener(e -> controller.setSecond());
//		addAlarmButton.addActionListener(e -> controller.get());
//		removeAlarmButton.addActionListener(e -> setHourWithButton());
//		seeAlarmsButton.addActionListener(e -> setMinuteWithButton());
//		checkAlarmButton.addActionListener(e -> setSecondWithButton());
	}

	public String getText() {
		return text;
	}

}
