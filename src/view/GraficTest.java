package view;

import javax.swing.SwingUtilities;

public class GraficTest {

	public static void main(String[] args) {
		new MainFrame();
		SwingUtilities.invokeLater(() -> new MainFrame());

	}

}
