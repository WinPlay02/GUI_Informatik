package aufgaben;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Sorge daf�r, dass der Text des Labels (von 3.) jetzt den Inhalt des
 * Textfeldes (4.) wiedergibt.
 */
public class Aufgabe7 {
	static JFrame jframe1 = null;

	public static void exec() {
		kill();
		jframe1 = new JFrame();
		jframe1.setSize(500, 500);
		jframe1.setTitle("GUI mit Swing");
		JLabel label1 = new JLabel("Dies ist ein Label");
		JTextField textfield1 = new JTextField(20);
		JPanel panel1 = new JPanel();
		JButton button1 = new JButton("Button");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText(textfield1.getText());
			}
		});
		panel1.add(textfield1);
		panel1.add(label1);
		panel1.add(button1);
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
		JTextField textfield1 = new JTextField(20);
		JPanel panel1 = new JPanel();
		JButton button1 = new JButton("Button");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText(textfield1.getText());
			}
		});
		panel1.add(textfield1);
		panel1.add(label1);
		panel1.add(button1);
		jframe1.add(panel1);
		jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe1.setVisible(true);
	}
}