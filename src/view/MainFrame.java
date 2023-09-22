package view;

import javax.swing.*;
import controller.*;

public class MainFrame extends JFrame {
	
	private Controller mainController;
	private JPanel mainPanel = new MainPanel(mainController);

	public MainFrame(Controller mainController) {
		this.mainController = mainController;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(mainPanel);
		setSize(1000, 1000);
		setVisible(true);
	}

}
