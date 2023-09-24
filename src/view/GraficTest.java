package view;

import javax.swing.SwingUtilities;

import clock.WeekAlarmClock;
import controller.*;
import time.*;

public class GraficTest {

	public static void main(String[] args) {
		
		WeekAlarmClock weekAlarmClock = new WeekAlarmClock();
		
		AnalogClock analogclock = new AnalogClock();
		Controller controller = new Controller(weekAlarmClock, analogclock);
		SwingUtilities.invokeLater(() -> new MainFrame(controller));
		
		

		
		
		

	}

}
