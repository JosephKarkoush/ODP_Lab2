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
		
		cc.tickTack();
		cc.tickTack();
		assertEquals(cc.getTime().toString(), "Mon 00:00:02");
		System.out.println(cc.getTime());
		
		TimeType tt = new Time("Mon 00:00:04");
		cc.setTime(tt);
		
		assertEquals(tt.getSecond(), 4);
		System.out.println(tt.getSecond());
		
	

		
		
		
		
		
		
		

		
		
		
		
	}

}
