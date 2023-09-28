package controller;

import counter.*;
import clock.*;
import time.*;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import alarm.*;
import view.*;

public class Controller {
	  
	private WeekAlarmClock weekAlarmclock = new WeekAlarmClock();
	private AnalogClock analogClock;
	private DigitalClock digitalClock;
	private ButtonPanel buttonPanel;
	private TextBoxPanel textBoxPanel;
	private ConsolPanel consolkPanel;
	private TimeType time;
	

	public void SetController(AnalogClock analogClock, DigitalClock digitalClock, ButtonPanel buttonPanel,
			TextBoxPanel textBoxPanel, ConsolPanel consolkPanel) {
		this.analogClock = analogClock;
		this.digitalClock = digitalClock;
		this.buttonPanel = buttonPanel;
		this.textBoxPanel = textBoxPanel;
		this.consolkPanel = consolkPanel;

	}

	public void tickTackWeekAlarm() {

		Timer timer = new Timer(1000, e -> {
			weekAlarmclock.tickTack();
			analogClock.updateHourAngle();
			analogClock.updateMinuteAngle();
			analogClock.updateSecondAngle();
			analogClock.repaint();
			digitalClock.updateDigitalClock(weekAlarmclock.getTime().toString());
		});
		timer.start();
		
	}

	public String getTimeController() {
		return weekAlarmclock.getTime().toString();
	}

	public void setDay() {
		String text = textBoxPanel.getString();
		int dayNumber = Integer.parseInt(text);
		weekAlarmclock.setDay(dayNumber);

	}

	public void setHour() {
		analogClock.resetHourAngles();
		String text = textBoxPanel.getString();
		int hourNumber = Integer.parseInt(text);
		weekAlarmclock.setHour(hourNumber);
		updateHourClock();

	}

	public void setMinute() {
		analogClock.resetMinuteAngles();
		String text = textBoxPanel.getString();
		int minuteNumber = Integer.parseInt(text);
		weekAlarmclock.setMinute(minuteNumber);
		updateMinuteClock();
	}

	public void setSecond() {
		analogClock.resetSecondAngles();
		String text = textBoxPanel.getString();
		int secondNumber = Integer.parseInt(text);
		weekAlarmclock.setSecond(secondNumber);
		updateSecondClock();

	}

	public void updateHourClock() {
		int newHour = weekAlarmclock.getHour();
		for (int i = 0; i <= newHour; i++) {
			analogClock.updateHourAngle();
		}
		analogClock.repaint();
	}

	public void updateMinuteClock() {
		int newMinute = weekAlarmclock.getMinute();
		for (int i = 0; i <= newMinute; i++) {
			analogClock.updateMinuteAngle();
		}
		analogClock.repaint();
	}

	public void updateSecondClock() {
		int newSecond = weekAlarmclock.getSecond();
		for (int i = 0; i <= newSecond; i++) {
			analogClock.updateSecondAngle();
		}
		analogClock.repaint();
	}

	public int getHourController() {
		return weekAlarmclock.getHour();
	}

	public int getMinuteController() {
		return weekAlarmclock.getMinute();
	}

	public int getSecondController() {
		return weekAlarmclock.getSecond();
	}

	

	public void addAlarmWithcontroller(String alarmToAdd) {
		time = weekAlarmclock.getTime();
		
	}

	public void removeAlarmWithcontroller(String alarmToRemove) {

	}

	public void checkAlarmWithcontroller(String alarmToCheck) {

	}

}
