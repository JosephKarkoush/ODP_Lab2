package view;

import javax.swing.SwingUtilities;

import clock.WeekAlarmClock;
import controller.*;
import time.*;

public class GraficTest {

	public static void main(String[] args) {
		WeekAlarmClock wc = new WeekAlarmClock();
		MainFrame mf = new MainFrame();
		Controller c = new Controller(wc, mf);
		
//		SwingUtilities.invokeLater(() -> new MainFrame());
		
		

		
		
		

	}

}
