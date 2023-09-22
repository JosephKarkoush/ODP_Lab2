package view;

import java.awt.Color;
import controller.*;
import java.awt.FlowLayout;
import controller.*;

import javax.swing.*;

public class ButtonPanel extends JPanel {
	
	private JButton setButton = new JButton("set time");
	private JButton addAlarmButton = new JButton("add alarm");
	private JButton removeAlarmButton = new JButton("remove alarm");
	private JButton seeAlarmsButton = new JButton("see alarms");
	private JButton checkAlarmButton = new JButton("check alarm");
	private String text;
	
	public ButtonPanel(JPanel textBoxPanel) {
		setBackground(Color.blue);
		setLayout(new FlowLayout());
		this.text = textBoxPanel.toString();
		add(setButton);
		add(addAlarmButton);
		add(removeAlarmButton);
		add(seeAlarmsButton);
		add(checkAlarmButton);
		
		setButton.addActionListener(e-> settimeWithButton());
		addAlarmButton.addActionListener(e-> settimeWithButton());
		removeAlarmButton.addActionListener(e-> settimeWithButton());
		seeAlarmsButton.addActionListener(e-> settimeWithButton());
		checkAlarmButton.addActionListener(e-> settimeWithButton());
	}
	
	public void settimeWithButton() {
		
		
	}
	
	public void addAlarmWithButton() {
		
	}
	
	public void removeAlarmWithButton() {
		
	}
	
	public void checkAlarmWithButton(){
		
	}
	
	public String getText() {
		return text;
	}
	
	

}
