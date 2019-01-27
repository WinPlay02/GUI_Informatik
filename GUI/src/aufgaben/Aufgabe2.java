package aufgaben;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Füge dem Fenster ein Panel hinzu.
 */
public class Aufgabe2 {
	static JFrame jframe1 = null;

	public static void exec() {
		kill();
		jframe1 = new JFrame();
		jframe1.setSize(500, 500);
		jframe1.setTitle("GUI mit Swing");
		JPanel panel1 = new JPanel();
		jframe1.add(panel1);
		jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe1.setVisible(true);
	}

	public static void kill() {
		if (jframe1 != null) {
			jframe1.dispose();
			jframe1 = null;
		}
	}

	public static void main(String... args) {
		JFrame jframe1 = new JFrame();
		jframe1.setSize(500, 500);
		jframe1.setTitle("GUI mit Swing");
		JPanel panel1 = new JPanel();
		jframe1.add(panel1);
		jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe1.setVisible(true);
	}
}