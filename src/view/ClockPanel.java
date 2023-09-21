package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ClockPanel extends JPanel {
	
	private JTabbedPane tabs = new JTabbedPane();
	private JPanel digitalclock = new DigitalClock();
	private JPanel analogclock = new AnalogClock();
	
	public ClockPanel() {
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER, analogclock);
		add(BorderLayout.CENTER, digitalclock);
		tabs.addTab("Analog Clock", analogclock);
		tabs.addTab("Digital Clock", digitalclock );
		
		add(tabs);
		
	}

}
