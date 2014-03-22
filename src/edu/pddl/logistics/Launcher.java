package edu.pddl.logistics;

import javax.swing.UnsupportedLookAndFeelException;

import edu.pddl.logistics.ui.MainGUI;

public class Launcher {
	private Launcher()
	{}
	
	public static void main (String [] args) {
		try {
			MainGUI gui = new MainGUI();
			gui.setVisible(true);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
