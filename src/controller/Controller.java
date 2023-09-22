package controller;

import counter.*;
import clock.*;
import time.*;
import view.TextBoxPanel;

import javax.swing.Timer;

import alarm.*;
import view.*;

public class Controller {

	protected WeekAlarmClock weekAlarmclock;

	public Controller(WeekAlarmClock weekAlarmclock) {
		this.weekAlarmclock = weekAlarmclock;

	}

	public void tickTackWeekAlarm() {
		Timer timer = new Timer(1000, e -> {
			weekAlarmclock.tickTack();
			
			
		});
		timer.start();

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
