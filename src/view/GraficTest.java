package view;

import javax.swing.SwingUtilities;

import clock.WeekAlarmClock;
import controller.*;
import time.*;

public class GraficTest {

	public static void main(String[] args) {
		WeekAlarmClock weekAlarmClock = new WeekAlarmClock();
		AnalogClock analogClock = new AnalogClock();
		DigitalClock digitalClock = new DigitalClock();
		Controller controller = new Controller(weekAlarmClock, analogClock, digitalClock);
		controller.tickTackWeekAlarm();
		
		
		SwingUtilities.invokeLater(() -> new MainFrame());
		
		

		
		
		

	}

}
