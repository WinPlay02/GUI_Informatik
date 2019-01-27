package aufgaben;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Füge ein Label hinzu, dass die Aufschrift "Dies ist ein Label" trägt.
 */
public class Aufgabe3 {
	static JFrame jframe1 = null;

	public static void exec() {
		kill();
		jframe1 = new JFrame();
		jframe1.setSize(500, 500);
		jframe1.setTitle("GUI mit Swing");
		JLabel label1 = new JLabel("Dies ist ein Label");
		JPanel panel1 = new JPanel();
		panel1.add(label1);
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
		JLabel label1 = new JLabel("Dies ist ein Label");
		JPanel panel1 = new JPanel();
		panel1.add(label1);
		jframe1.add(panel1);
		jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe1.setVisible(true);
	}
}