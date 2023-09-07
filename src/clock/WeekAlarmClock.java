package clock;

import java.util.Collection;

import alarm.AlarmType;
import counter.CircularCounter;
import counter.CounterType;
import counter.HourCounter;
import counter.MinuteCounter;
import counter.SecondCounter;
import time.TimeType;

public class WeekAlarmClock implements AlarmClockType {

	CounterType hourC = new HourCounter();
	CounterType minuteC = new MinuteCounter(hourC);
	CounterType secondC = new SecondCounter(minuteC);
	
	
	@Override
	public void tickTack() {
		secondC.count();
		
	}

	@Override
	public void setTime(TimeType time) {
		
		
	}

	@Override
	public void addAlarm(AlarmType larm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAlarm(AlarmType alarm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllAlarms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<AlarmType> getAlarms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TimeType getTime() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
