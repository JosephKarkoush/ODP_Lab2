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
	private JButton removeAllAlarms = new JButton("remove all alarms");
	private JButton setActiveInActive = new JButton("Set ON/OFF");
	private Controller controller;
	String text;

	public ButtonPanel(Controller controller) {
		this.controller = controller;
		setBackground(Color.blue);
		setLayout(new FlowLayout());
		add(setDayButton);
		add(setHourButton);
		add(setMinuteButton);
		add(setSecondButton);
		add(addAlarmButton);
		add(removeAlarmButton);
		add(removeAllAlarms);
		add(seeAlarmsButton);
		add(checkAlarmButton);
		add(setActiveInActive);

		setDayButton.addActionListener(e -> controller.setDay());
		setHourButton.addActionListener(e -> controller.setHour());
		setMinuteButton.addActionListener(e -> controller.setMinute());
		setSecondButton.addActionListener(e -> controller.setSecond());
		addAlarmButton.addActionListener(e -> controller.addLarm());
		removeAlarmButton.addActionListener(e -> controller.removeLarm());
		seeAlarmsButton.addActionListener(e -> controller.checkAlarms());
		removeAllAlarms.addActionListener(e -> controller.removeAllLarms());
		checkAlarmButton.addActionListener(e -> controller.checkLarm());
		setActiveInActive.addActionListener(e -> controller.setActivInActive());
	}

	public String getText() {
		return text;
	}

}
