package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import controller.Controller;

public class ClockPanel extends JPanel {
	private Controller controller;
	private JTabbedPane tabs = new JTabbedPane();
	private JPanel digitalclock = new DigitalClock();
	private JPanel analogclock = new AnalogClock();
	
	public ClockPanel(Controller controller) {
		this.controller = controller;
		setLayout(new BorderLayout());
		tabs.addTab("Analog Clock", analogclock);
		tabs.addTab("Digital Clock", digitalclock );
		add(BorderLayout.CENTER, analogclock);
		add(BorderLayout.CENTER, digitalclock);
		
		add(tabs);
		
	}

}
