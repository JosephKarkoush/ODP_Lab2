package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;

public class MainPanel extends JPanel {




	public MainPanel(AnalogClock analogClock, DigitalClock digitalClock, JButton setDay) {
		setLayout(new GridLayout(2, 2));

		
		 JPanel clockPanel = new ClockPanel(analogClock, digitalClock);
		 JPanel consolkPanel = new ConsolPanel();
		 JPanel textBoxPanel = new TextBoxPanel();
		 JPanel buttonPanel = new ButtonPanel(setDay);
		
		
		this.add(clockPanel);
		this.add(buttonPanel);
		this.add(consolkPanel);
		this.add(textBoxPanel);

	}
}
