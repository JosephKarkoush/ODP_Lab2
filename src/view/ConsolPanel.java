package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import controller.Controller;

public class ConsolPanel extends JPanel implements Observer {
	private Controller controller;
	private JLabel consolResultnew = new JLabel("Consol Resultat", SwingConstants.CENTER);

	public ConsolPanel(Controller controller) {
		this.controller = controller;
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER, consolResultnew);
		consolResultnew.setFont(new Font("TimesRoman", Font.BOLD, 20));
	}

	public void setConsoleText(String newConsoleText) {
		consolResultnew.setText(newConsoleText);

	}

	@Override
	public void update(Observable o, Object arg) {
		setConsoleText("🔔Ring Ring Ring🔔");

	}
	
	public void msgbox(String errorString){
		   JOptionPane.showMessageDialog(null, errorString);
		}

}
