package reference_impl;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import GUITaschenrechner.GuiTaschenrechner;
import aufgaben.Aufgabe1;
import aufgaben.Aufgabe2;
import aufgaben.Aufgabe3;
import aufgaben.Aufgabe4;
import aufgaben.Aufgabe5;
import aufgaben.Aufgabe6;
import aufgaben.Aufgabe7;

public class ReferenceImplGUI extends JFrame {

	private static final long serialVersionUID = 6666215981928937455L;
	private JPanel contentPane;

	protected JFrame trechner = null;

	public void killAufgabenThread() {
		Aufgabe1.kill();
		Aufgabe2.kill();
		Aufgabe3.kill();
		Aufgabe4.kill();
		Aufgabe5.kill();
		Aufgabe6.kill();
		Aufgabe7.kill();
	}

	public void updateLAF() {
		this.dispose();
		this.setVisible(true);
		SwingUtilities.updateComponentTreeUI(this);
		this.pack();
	}

	public ReferenceImplGUI() {
		setTitle("Referenz-Implementationen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(false);
		setLocationRelativeTo(null);
		setLocation(getLocation().x + 250, getLocation().y + 250);

		JLabel lblBeispielprogramm = new JLabel("Beispielprogramm");
		lblBeispielprogramm.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblBeispielprogramm, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Taschenrechner", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JButton button = new JButton("Beenden");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (trechner != null) {
					trechner.dispose();
					trechner = null;
				}
			}
		});
		panel_1.add(button, BorderLayout.EAST);

		JButton button_1 = new JButton("Starten");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (trechner != null) {
					trechner.dispose();
					trechner = null;
				}
				trechner = new GuiTaschenrechner("Project X", "*");
				trechner.setVisible(true);
			}
		});
		panel_1.add(button_1, BorderLayout.WEST);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Aufgaben", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 5, 0, 0));

		JButton btnAufgabe = new JButton("Aufgabe 1");
		btnAufgabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aufgabe1.exec();
			}
		});
		panel_2.add(btnAufgabe);

		JButton btnAufgabe_1 = new JButton("Aufgabe 2");
		btnAufgabe_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aufgabe2.exec();
			}
		});
		panel_2.add(btnAufgabe_1);

		JButton btnAufgabe_2 = new JButton("Aufgabe 3");
		btnAufgabe_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aufgabe3.exec();
			}
		});
		panel_2.add(btnAufgabe_2);

		JButton btnAufgabe_3 = new JButton("Aufgabe 4");
		btnAufgabe_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aufgabe4.exec();
			}
		});
		panel_2.add(btnAufgabe_3);

		JButton btnAufgabe_4 = new JButton("Aufgabe 5");
		btnAufgabe_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aufgabe5.exec();
			}
		});
		panel_2.add(btnAufgabe_4);

		JButton btnAufgabe_5 = new JButton("Aufgabe 6");
		btnAufgabe_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aufgabe6.exec();
			}
		});
		panel_2.add(btnAufgabe_5);

		JButton btnAufgabe_6 = new JButton("Aufgabe 7");
		btnAufgabe_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aufgabe7.exec();
			}
		});
		panel_2.add(btnAufgabe_6);

		Component horizontalGlue = Box.createHorizontalGlue();
		panel_2.add(horizontalGlue);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel_2.add(horizontalGlue_1);

		JButton button_2 = new JButton("Beenden");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				killAufgabenThread();
			}
		});
		panel_2.add(button_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(
				new TitledBorder(null, "L&F umschalten...", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnNewButton = new JButton("Native");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				updateLAF();
			}
		});

		JButton btnNewButton_1 = new JButton("Cross (Metal)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				updateLAF();
			}
		});
		panel_3.add(btnNewButton_1);
		panel_3.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Nimbus");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				updateLAF();
			}
		});
		panel_3.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("CDE/Motif");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				updateLAF();
			}
		});
		panel_3.add(btnNewButton_3);
		updateLAF();
	}
}