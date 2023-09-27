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
