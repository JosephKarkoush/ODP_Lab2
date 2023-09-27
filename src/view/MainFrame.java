package view;

import javax.swing.*;

import clock.WeekAlarmClock;
import controller.*;

public class MainFrame extends JFrame {

	ConsolPanel consolkPanel = new ConsolPanel();
	TextBoxPanel textBoxPanel = new TextBoxPanel();
	ButtonPanel buttonPanel = new ButtonPanel();
	AnalogClock analogClock = new AnalogClock();
	DigitalClock digitalClock = new DigitalClock();
	Controller controller = new Controller(analogClock, digitalClock, buttonPanel,textBoxPanel , consolkPanel);
	private JPanel mainPanel = new MainPanel(analogClock, digitalClock, buttonPanel, textBoxPanel, consolkPanel);

	public MainFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controller.tickTackWeekAlarm();
		add(mainPanel);
		setSize(1000, 1000);
		setVisible(true);
	}
	

}
