package view;

import javax.swing.*;

import clock.WeekAlarmClock;
import controller.*;

public class MainFrame extends JFrame {

	
	
	
	AnalogClock analogClock = new AnalogClock();
	DigitalClock digitalClock = new DigitalClock();
	Controller controller = new Controller(analogClock, digitalClock);
	private JPanel mainPanel = new MainPanel(analogClock, digitalClock);

	public MainFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controller.tickTackWeekAlarm();
		add(mainPanel);
		setSize(1000, 1000);
		setVisible(true);
	}
	

}
