package reference_impl;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ReferenceImplMain {
	public static void main(String... args) {
		SwingUtilities.invokeLater(() -> {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
			ReferenceImplGUI rig = new ReferenceImplGUI();
			rig.setVisible(true);
		});
	}
}
