package clock;

import static org.junit.jupiter.api.Assertions.*;

import time.TimeType;
import time.Time;
import alarm.Alarm;
import alarm.AlarmManager;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		AlarmClockType cc = new WeekAlarmClock();
		
		TimeType tt = new Time(1,2,2,2);
		
		
		
		
		
		
		
		System.out.println(cc.getTime());
		
		cc.setTime(tt);
		
		
		
		
	}

}
