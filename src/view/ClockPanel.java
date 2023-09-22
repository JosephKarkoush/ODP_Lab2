package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import controller.Controller;

public class ClockPanel extends JPanel {
	private Controller controller;
	private JTabbedPane tabs = new JTabbedPane();
	private JPanel digitalclock = new DigitalClock(controller);
	private JPanel analogclock = new AnalogClock(controller);
	
	public ClockPanel(Controller controller) {
		this.controller = controller;
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER, analogclock);
		add(BorderLayout.CENTER, digitalclock);
		tabs.addTab("Analog Clock", analogclock);
		tabs.addTab("Digital Clock", digitalclock );
		
		add(tabs);
		
	}

}
