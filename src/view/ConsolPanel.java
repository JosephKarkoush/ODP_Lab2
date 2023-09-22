package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ConsolPanel extends JPanel {

	private JLabel consolResultnew = new JLabel("Consol Resultat", SwingConstants.CENTER);

	public ConsolPanel() {
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER, consolResultnew);
		consolResultnew.setFont(new Font("TimesRoman", Font.BOLD, 35));
	}

}
