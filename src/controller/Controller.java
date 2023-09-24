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
	private MainFrame mainframe;
	

	public Controller(WeekAlarmClock weekAlarmclock, MainFrame mainframe) {
		this.weekAlarmclock = weekAlarmclock;
		this.mainframe = mainframe;

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
