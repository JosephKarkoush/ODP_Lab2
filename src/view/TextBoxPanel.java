package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextBoxPanel extends JPanel {
	
	private JTextField textField = new JTextField("mata in tid");
	
	public TextBoxPanel(){
		setLayout( new BorderLayout());
		textField.setSize(50, 20);
		
		
		add(textField);
		
		
	}
	
	public String getString() {
		
		return textField.getText();
	}
	
}