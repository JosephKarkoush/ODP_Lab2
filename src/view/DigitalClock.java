package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DigitalClock extends JPanel {
	
	JTextArea digtalClockShower = new JTextArea("Här är digitala tiden som ska visas");
	
	public DigitalClock() {
		setLayout(new BorderLayout());
		
		add(BorderLayout.CENTER, digtalClockShower);
		digtalClockShower.setSize(30, 30);
		
	}

}
