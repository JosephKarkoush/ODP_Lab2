package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

import controller.Controller;

public class MainPanel extends JPanel {
	private Controller controller;
	private JPanel clockPanel = new ClockPanel(controller);

	private JPanel consolkPanel = new ConsolPanel();
	private JPanel textBoxPanel = new TextBoxPanel();
	
	private JPanel buttonPanel = new ButtonPanel(textBoxPanel);
	
	public MainPanel(Controller controller) {
		this.controller = controller;
		setLayout(new GridLayout(2,2));
		
		this.add(clockPanel);
		this.add(buttonPanel);
		this.add(consolkPanel);
		this.add(textBoxPanel);
	
	}
}
