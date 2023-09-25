package view;

import javax.swing.*;
import controller.*;

public class MainFrame extends JFrame {
	
	private JPanel mainPanel = new MainPanel();

	public MainFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(mainPanel);
		setSize(1000, 1000);
		setVisible(true);
	}
	

}
