package com.mini.inn;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Display extends Canvas {
	
	public static final int width = 800;
	public static final int height = 600;
	public static final String title = "Mini INN | Pre-Alpha 1.0";
	
	public static void main(String[] args) {
		
		Display game = new Display();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setTitle(title);
	}

}
