package view;

import java.awt.Color;
import controller.*;
import java.awt.FlowLayout;
import controller.*;

import javax.swing.*;

public class ButtonPanel extends JPanel {

	
	private JButton setDay = new JButton("set day");
	private JButton setHour = new JButton("set Hour");
	private JButton setMinute = new JButton("set minute");
	private JButton setSecond = new JButton("set second");
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
		add(setDay);
		add(setHour);
		add(setMinute);
		add(setSecond);
		add(addAlarmButton);
		add(removeAlarmButton);
		add(seeAlarmsButton);
		add(checkAlarmButton);

		setDay.addActionListener(e -> setDayWithButton());
		addAlarmButton.addActionListener(e -> setDayWithButton());
		removeAlarmButton.addActionListener(e -> setHourWithButton());
		seeAlarmsButton.addActionListener(e -> setMinuteWithButton());
		checkAlarmButton.addActionListener(e -> setSecondWithButton());
	}

	public void setDayWithButton() {
		
	}
	
	public void setHourWithButton() {

	}
	
	public void setMinuteWithButton() {

	}
	
	public void setSecondWithButton() {

	}

	public void addAlarmWithButton() {

	}

	public void removeAlarmWithButton() {

	}

	public void checkAlarmWithButton() {

	}

	public String getText() {
		return text;
	}

}
