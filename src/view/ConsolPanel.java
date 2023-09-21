package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ConsolPanel extends JPanel {
	
	private JTextArea consolfield = new JTextArea("Consolen är här!");
	
	
	public ConsolPanel() {
		add(consolfield);
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER, consolfield);	}
}
