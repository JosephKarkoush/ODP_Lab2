package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextBoxPanel extends JPanel {
	
	private JTextField textField = new JTextField("mata in tid");
	
	public TextBoxPanel(){
		setLayout( new BorderLayout());
		
		
		add(BorderLayout.CENTER, textField);
		
		
	}
	
	public String getString() {
		
		return textField.getText();
	}
	
}
