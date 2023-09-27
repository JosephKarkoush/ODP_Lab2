package view;

import javax.swing.*;

import clock.WeekAlarmClock;
import controller.*;

public class MainFrame extends JFrame {

	
	
	JButton setDay = new JButton("set day");
	AnalogClock analogClock = new AnalogClock();
	DigitalClock digitalClock = new DigitalClock();
	Controller controller = new Controller(analogClock, digitalClock, setDay);
	private JPanel mainPanel = new MainPanel(analogClock, digitalClock, setDay);

	public MainFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controller.tickTackWeekAlarm();
		add(mainPanel);
		setSize(1000, 1000);
		setVisible(true);
	}
	

}
