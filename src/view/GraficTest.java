package view;

import javax.swing.SwingUtilities;

import clock.WeekAlarmClock;
import controller.*;
import time.*;

public class GraficTest {

	public static void main(String[] args) {
		
		WeekAlarmClock weekAlarmClock = new WeekAlarmClock();
		Controller controller = new Controller(weekAlarmClock);
		SwingUtilities.invokeLater(() -> new MainFrame());
		
		

		
		
		

	}

}
