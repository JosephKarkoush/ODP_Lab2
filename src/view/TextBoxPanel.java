package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controller;

public class TextBoxPanel extends JPanel {
	
	private Controller controller;
	private JTextField textField = new JTextField();
	
	public TextBoxPanel(Controller controller){
		this.controller = controller;
		setLayout( new BorderLayout());
		textField.setSize(30, 10);
		
		add(BorderLayout.CENTER, textField);
		
	}
	
	public void setString(String text) {
		textField.setText(text);
	}
	
	public String getString() {
		
		return textField.getText();
	}
	
}
