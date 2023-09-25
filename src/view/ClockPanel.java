package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import controller.Controller;

public class ClockPanel extends JPanel {

	
	private JTabbedPane tabs = new JTabbedPane();

	
	public ClockPanel(AnalogClock analogClock, DigitalClock digitalClock) {
		
		setLayout(new BorderLayout());
		
		add(BorderLayout.CENTER, analogClock);
		add(BorderLayout.CENTER, digitalClock);
		tabs.addTab("Analog Clock", analogClock);
		tabs.addTab("Digital Clock", digitalClock );
		
		add(tabs);
		
	}

}
