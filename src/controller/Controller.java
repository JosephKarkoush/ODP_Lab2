package controller;

import counter.*;
import clock.*;
import time.*;
import view.TextBoxPanel;
import alarm.*;
import view.*;

public class Controller {

	private WeekAlarmClock weekAlarmclock;

	public Controller(WeekAlarmClock weekAlarmclock) {
		this.weekAlarmclock = weekAlarmclock;
		
		while(true) {
			weekAlarmclock.tickTack();
			
		}

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
