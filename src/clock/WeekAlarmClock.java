package clock;

import java.util.Collection;

import alarm.AlarmManager;
import alarm.AlarmType;
import counter.CircularCounter;
import counter.CircularCounter.Direction;
import counter.CounterType;
import counter.DayCounter;
import counter.HourCounter;
import counter.MinuteCounter;
import counter.SecondCounter;
import counter.SettableCounter;
import counter.*;
import time.Time;
import time.TimeType;

public class WeekAlarmClock implements AlarmClockType {
	SettableCounterType dayC = new DayCounter();
	SettableCounterType hourC = new HourCounter(dayC);
	SettableCounterType minuteC = new MinuteCounter(hourC);
	SettableCounterType secondC = new SecondCounter(minuteC);
	AlarmManager alarmManage = new AlarmManager();

	@Override
	public void tickTack() {
		secondC.count();

		alarmManage.checkForAlarm(getTime());

	}

	@Override
	public void setTime(TimeType time) {

		int sec = time.getSecond();
		int min = time.getMinute();
		int hour = time.getHour();
		int day = time.getDay();
		dayC.setCount(day);
		hourC.setCount(hour);
		minuteC.setCount(min);
		secondC.setCount(sec);

	}

//	public void setDay(int daynumb) {
//		dayC.setCount(daynumb);
//	}
//
//	public void setHour(int hournumb) {
//		hourC.setCount(hournumb);
//	}
//
//	public void setMinute(int minnumb) {
//		minuteC.setCount(minnumb);
//	}
//
//	public void setSecond(int secnumb) {
//		secondC.setCount(secnumb);
//	}
//
//	public int getDay() {
//		return dayC.getCount();
//	}
//
//	public int getHour() {
//		return hourC.getCount();
//	}
//
//	public int getMinute() {
//		return minuteC.getCount();
//	}
//
//	public int getSecond() {
//		return secondC.getCount();
//	}

	@Override
	public void addAlarm(AlarmType larm) {
		alarmManage.addAlarm(larm);

	}

	@Override
	public void removeAlarm(AlarmType alarm) {
		alarmManage.removeAlarm(alarm);

	}

	@Override
	public void removeAllAlarms() {
		alarmManage.removeAllAlarms();

	}

	@Override
	public Collection<AlarmType> getAlarms() {

		return alarmManage.getAlarms();
	}

	@Override
	public TimeType getTime() {
		return new Time(dayC.getCount(), hourC.getCount(), minuteC.getCount(), secondC.getCount());
	}

	@Override
	public String toString() {
		return getTime().toString();
	}

}
