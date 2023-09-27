package controller;

import counter.*;
import clock.*;
import time.*;
import view.TextBoxPanel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.Timer;

import alarm.*;
import view.*;

public class Controller {

	private WeekAlarmClock weekAlarmclock = new WeekAlarmClock();
	private AnalogClock analogClock;
	private DigitalClock digitalClock;
	private JButton setDay;

	public Controller(AnalogClock analogClock,DigitalClock digitalClock, JButton setDay) {
		this.analogClock = analogClock;
		this.digitalClock = digitalClock;
		this.setDay = setDay;
		setDay.setBackground(Color.black);;
		

	}

	public void tickTackWeekAlarm() {

		Timer timer = new Timer(1000, e -> {
			weekAlarmclock.tickTack();
			analogClock.updateAngles();
			analogClock.repaint();
			digitalClock.updateDigitalClock(weekAlarmclock.getTime().toString());
		});
		timer.start();
	}

	public String getTimeController() {
		return weekAlarmclock.getTime().toString();
	}

	public void setMinuteWitController(String nyMinute) {

	}

	public void setSecondWitController(String nySecond) {

	}

	public void setHourWitController(String nyHour) {

	}

	public void setDayWitController(String nyDay) {

	}

	public void addAlarmWithcontroller(String alarmToAdd) {

	}

	public void removeAlarmWithcontroller(String alarmToRemove) {

	}

	public void checkAlarmWithcontroller(String alarmToCheck) {

	}

}
