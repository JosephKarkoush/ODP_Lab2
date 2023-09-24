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

	public Controller(WeekAlarmClock weekAlarmclock) {
		this.weekAlarmclock = weekAlarmclock;

	}

	public void tickTackWeekAlarm() {
		weekAlarmclock.tickTack();

	}
	
	public String getTimeController() {
		return weekAlarmclock.toString();
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
