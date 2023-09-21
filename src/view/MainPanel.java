package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	private JPanel clockPanel = new ClockPanel();

	private JPanel consolkPanel = new ConsolPanel();
	private JPanel textBoxPanel = new TextBoxPanel();
	
	private JPanel buttonPanel = new ButtonPanel(textBoxPanel);
	
	public MainPanel() {
		setLayout(new GridLayout(2,2));
		
		this.add(clockPanel);
		this.add(buttonPanel);
		this.add(consolkPanel);
		this.add(textBoxPanel);
	
	}
}
