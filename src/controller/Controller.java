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
	private AnalogClock analogclock;

	public Controller(WeekAlarmClock weekAlarmclock, AnalogClock analogclock) {
		this.weekAlarmclock = weekAlarmclock;
		this.analogclock = analogclock;

	}

	public void tickTackWeekAlarm() {
		Timer timer = new Timer(1000, e -> {
			weekAlarmclock.tickTack();
			analogclock.updateAngles();
			
			
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
