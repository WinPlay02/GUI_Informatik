package aufgaben;

import javax.swing.JFrame;

/**
 * Erstelle eine einfaches Fenster mit dem Titel "GUI mit Swing"
 */
public class Aufgabe1 {
	static JFrame jframe1 = null;

	public static void exec() {
		kill();
		jframe1 = new JFrame();
		jframe1.setSize(500, 500);
		jframe1.setTitle("GUI mit Swing");
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
		jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe1.setVisible(true);
	}
}
