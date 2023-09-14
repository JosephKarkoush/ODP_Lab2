package clock;

import static org.junit.jupiter.api.Assertions.*;

import time.TimeType;
import time.Time;
import alarm.Alarm;
import alarm.AlarmManager;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void tickTackTest() {
		
		
		AlarmClockType cc = new WeekAlarmClock();
		
		cc.tickTack();
		cc.tickTack();
		assertEquals(cc.getTime().toString(), "Mon 00:00:02");
		System.out.println(cc.getTime());
	}
//-----------------------
	@Test
	void setTimeTest() {
		AlarmClockType cz = new WeekAlarmClock();
		TimeType tt = new Time("Mon 00:00:04");
		cz.setTime(tt);
		
		assertEquals(tt.getSecond(), 4);
		System.out.println(tt.getSecond());
	}
//------------------------
	@Test
	void setAlarmTest() {
		AlarmClockType cv = new WeekAlarmClock();
		TimeType timeO = new Time(0,0,0,4);
		Alarm larm = new Alarm(timeO);
		cv.addAlarm(larm);
		cv.tickTack();
		cv.tickTack();
		cv.tickTack();
		cv.tickTack();
		assertEquals(cv.getAlarms().toString(), "[Mon 00:00:04]");
		cv.removeAlarm(larm);
		assertEquals(cv.getAlarms().toString(), "[]");
	}
//------------------------
	@Test
	void otherFunctionTest() {
		AlarmClockType ct = new WeekAlarmClock();
		TimeType timeVC = new Time(0,0,0,2);
		Alarm larmVC = new Alarm(timeVC);
		TimeType timeO = new Time(0,0,0,4);
		Alarm larm = new Alarm(timeO);
		ct.addAlarm(larmVC);
		ct.addAlarm(larm);
		assertEquals(ct.getAlarms().toString(), "[Mon 00:00:04, Mon 00:00:02]");
		ct.removeAllAlarms();
		assertEquals(ct.getAlarms().toString(), "[]");	
		
		
	}

}
