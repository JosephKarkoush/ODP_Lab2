package view;

import javax.swing.*;

import clock.WeekAlarmClock;
import controller.*;

public class MainFrame extends JFrame {
	
	Controller controller = new Controller();
	ConsolPanel consolkPanel = new ConsolPanel(controller);
	TextBoxPanel textBoxPanel = new TextBoxPanel(controller);
	ButtonPanel buttonPanel = new ButtonPanel(controller);
	AnalogClock analogClock = new AnalogClock(controller);
	DigitalClock digitalClock = new DigitalClock(controller);
	
	private JPanel mainPanel = new MainPanel(analogClock, digitalClock, buttonPanel, textBoxPanel, consolkPanel);

	public MainFrame() {
		controller.SetController(analogClock, digitalClock, buttonPanel, textBoxPanel, consolkPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controller.tickTackWeekAlarm();
		add(mainPanel);
		setSize(1000, 1000);
		setVisible(true);
	}
	

}
