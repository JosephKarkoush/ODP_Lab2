package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Controller;

public class TextBoxPanel extends JPanel {

	private Controller controller;
	private JTextField textField = new JTextField();
	private JLabel info = new JLabel("Please Write the Time Here", SwingConstants.CENTER);

	public TextBoxPanel(Controller controller) {
		this.controller = controller;
		setLayout(new BorderLayout());
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setFont(new Font("Arial", Font.BOLD, 50));
		textField.setBackground(Color.red);
		textField.setForeground(Color.white);
		info.setFont(new Font("Arial", Font.BOLD, 30));
		info.setBackground(Color.red);
		
		add(textField, BorderLayout.CENTER);
		add(info, BorderLayout.NORTH);

	}

	public void setString(String text) {
		textField.setText(text);
	}

	public String getString() {

		return textField.getText();
	}

}
