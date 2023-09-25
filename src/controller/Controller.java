package controller;

import counter.*;
import clock.*;
import time.*;
import view.TextBoxPanel;

import javax.swing.Timer;

import alarm.*;
import view.*;

public class Controller {

	private WeekAlarmClock weekAlarmclock;
	private AnalogClock analogClock;
	private DigitalClock digitalClock;

	public Controller(WeekAlarmClock weekAlarmclock, AnalogClock analogClock,DigitalClock digitalClock) {
		this.weekAlarmclock = weekAlarmclock;
		this.analogClock = analogClock;
		this.digitalClock = digitalClock;

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

	public void settimeWitController() {

	}

	public void addAlarmWithcontroller(String alarmToAdd) {

	}

	public void removeAlarmWithcontroller(String alarmToRemove) {

	}

	public void checkAlarmWithcontroller(String alarmToCheck) {

	}

}
