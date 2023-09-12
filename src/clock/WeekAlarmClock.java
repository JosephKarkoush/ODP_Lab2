package clock;

import java.util.Collection;

import alarm.AlarmManager;
import alarm.AlarmType;
import counter.CircularCounter;
import counter.CounterType;
import counter.DayCounter;
import counter.HourCounter;
import counter.MinuteCounter;
import counter.SecondCounter;
import time.Time;
import time.TimeType;

public class WeekAlarmClock implements AlarmClockType {
	CounterType dayC = new DayCounter();
	CounterType hourC = new HourCounter(dayC);
	CounterType minuteC = new MinuteCounter(hourC);
	CounterType secondC = new SecondCounter(minuteC);
	AlarmManager alarmManage = new AlarmManager();
	
	@Override
	public void tickTack() {
		secondC.count();
		
		alarmManage.checkForAlarm(getTime());
		
	}

	@Override
	public void setTime(TimeType time) {	
		setTime(time);
		
	}

	@Override
	public void addAlarm(AlarmType larm) {
		addAlarm(larm);
		
	}

	@Override
	public void removeAlarm(AlarmType alarm) {
		removeAlarm(alarm);
		
	}

	@Override
	public void removeAllAlarms() {
		removeAllAlarms();
		
	}

	@Override
	public Collection<AlarmType> getAlarms() {
		
		return getAlarms();
	}

	@Override
	public TimeType getTime() {
		return new Time(dayC.getCount(), hourC.getCount(), minuteC.getCount(), secondC.getCount());
	}
	

}
