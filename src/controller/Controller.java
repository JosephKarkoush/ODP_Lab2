package controller;

import counter.*;
import clock.*;
import time.*;

import java.awt.Color;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

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

	public void addLarm() {
		String textLarm = textBoxPanel.getString();
		Time nyTid = new Time(textLarm);
		Alarm alarm = new Alarm(nyTid);
		weekAlarmclock.addAlarm(alarm);
		alarm.addObserver(consolkPanel);
	}

	public void removeLarm() {
		String textLarm = textBoxPanel.getString();
		Time removeTid = new Time(textLarm);
		Alarm removeAlarm = new Alarm(removeTid);
		weekAlarmclock.removeAlarm(removeAlarm);
	}

	public void checkLarm() {
		String textLarm = textBoxPanel.getString();

		for (AlarmType larm : weekAlarmclock.getAlarms()) {

			if (larm.toString().equals(textLarm)) {
				System.out.println("jämför");
				if (!larm.isActive()) {
					consolkPanel.setConsoleText("false");
				} else {
					consolkPanel.setConsoleText("true");
				}
			}
		}

	}

	public void removeAllLarms() {
		weekAlarmclock.removeAllAlarms();
	}

	public void setActivInActive() {
		String textLarm = textBoxPanel.getString();

		for (AlarmType larm : weekAlarmclock.getAlarms()) {

			if (larm.toString().equals(textLarm)) {
				if (larm.isActive()) {
					larm.setActive(false);
				} else {
					larm.setActive(true);
				}
			}
		}

	}
	
	public void setLocalTime() {
		LocalTime localTime = LocalTime.now();
		Calendar calendar = Calendar.getInstance();
		TimeType localTimeObj = new Time(calendar.DAY_OF_WEEK-1,localTime.getHour(),localTime.getMinute(),localTime.getSecond());
		weekAlarmclock.setTime(localTimeObj);
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

	public void checkAlarms() {
		consolkPanel.setConsoleText(weekAlarmclock.getAlarms().toString());
	}

	public String getTimeController() {
		return weekAlarmclock.getTime().toString();
	}

	public void setDay() {
		String text = textBoxPanel.getString();
		int dayNumber = Integer.parseInt(text);
		TimeType nyTime = new Time(dayNumber, weekAlarmclock.getTime().getHour(), weekAlarmclock.getTime().getMinute(),
				weekAlarmclock.getTime().getSecond());
		weekAlarmclock.setTime(nyTime);

	}

	public void setHour() {
		analogClock.resetHourAngles();
		String text = textBoxPanel.getString();
		int hourNumber = Integer.parseInt(text);
		TimeType nyTime = new Time(weekAlarmclock.getTime().getDay(), hourNumber, weekAlarmclock.getTime().getMinute(),
				weekAlarmclock.getTime().getSecond());
		weekAlarmclock.setTime(nyTime);
		updateHourClock();

	}

	public void setMinute() {
		analogClock.resetMinuteAngles();
		String text = textBoxPanel.getString();
		int minuteNumber = Integer.parseInt(text);

		TimeType nyTime = new Time(weekAlarmclock.getTime().getDay(), weekAlarmclock.getTime().getHour(), minuteNumber,
				weekAlarmclock.getTime().getSecond());
		weekAlarmclock.setTime(nyTime);
		updateMinuteClock();
	}

	public void setSecond() {
		analogClock.resetSecondAngles();
		String text = textBoxPanel.getString();
		int secondNumber = Integer.parseInt(text);

		TimeType nyTime = new Time(weekAlarmclock.getTime().getDay(), weekAlarmclock.getTime().getHour(),
				weekAlarmclock.getTime().getMinute(), secondNumber);
		weekAlarmclock.setTime(nyTime);
		updateSecondClock();

	}

	public void updateHourClock() {
		int newHour = weekAlarmclock.getTime().getHour();
		for (int i = 0; i <= newHour; i++) {
			analogClock.updateHourAngle();
		}
		analogClock.repaint();
	}

	public void updateMinuteClock() {
		int newMinute = weekAlarmclock.getTime().getMinute();
		for (int i = 0; i <= newMinute; i++) {
			analogClock.updateMinuteAngle();
		}
		analogClock.repaint();
	}

	public void updateSecondClock() {
		int newSecond = weekAlarmclock.getTime().getSecond();
		for (int i = 0; i <= newSecond; i++) {
			analogClock.updateSecondAngle();
		}
		analogClock.repaint();
	}

	public int getHourController() {
		return weekAlarmclock.getTime().getHour();
	}

	public int getMinuteController() {
		return weekAlarmclock.getTime().getMinute();
	}

	public int getSecondController() {
		return weekAlarmclock.getTime().getSecond();
	}
}
