package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import controller.Controller;

public class ConsolPanel extends JPanel {
	private Controller controller;
	private JLabel consolResultnew = new JLabel("Consol Resultat", SwingConstants.CENTER);

	public ConsolPanel(Controller controller) {
		this.controller = controller;
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER, consolResultnew);
		consolResultnew.setFont(new Font("TimesRoman", Font.BOLD, 35));
	}

}
