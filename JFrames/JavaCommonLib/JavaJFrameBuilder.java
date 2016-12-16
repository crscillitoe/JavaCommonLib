package JavaCommonLib;

import java.awt.Component;

import javax.swing.JFrame;

public class JavaJFrameBuilder {

	/**
	 * Returns a generic JFrame with some normal defaulted options.
	 * @param name Name of the window
	 * @param width Width of the window
	 * @param height Height of the window
	 * @return a JFrame object that is not visible, that has its defaultCloseOperation set properly.
	 */
	public static JFrame buildFrame(String name , int width , int height) {
		JFrame f = new JFrame(name);
		f.setSize(width, height);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		return f;
		
	}

	/**
	 * Allows the user to add any variable number of components in one function call.
	 * @param f
	 * @param c
	 */
	public static void add(JFrame f , Component...c) {
		for(Component co : c) {
			f.add(co);
		}
	}
	
}
