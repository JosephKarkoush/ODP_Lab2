package clock;

import java.util.Collection;
import java.util.Observable;

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
