package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	private JPanel clockPanel = new ClockPanel();
	private JPanel buttonPanel = new ButtonPanel();
	private JPanel consolkPanel = new ConsolPanel();
	private JPanel textBoxPanel = new TextBoxPanel();
	
	
	public MainPanel() {
		setLayout(new GridLayout(2,2));
		
		this.add(clockPanel);
		this.add(buttonPanel);
		this.add(consolkPanel);
		this.add(textBoxPanel);
	
	}
}
