package game;


import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JFrame;

public class Main {
  	public static final int WIDTH = 1366;
  	public static final int HEIGHT = 768;
	public static void main(String[] args){
		JFrame Frame = new JFrame("Game");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setResizable(false);
		Frame.setLayout(new BorderLayout());
		Frame.add(new GamePanel(), BorderLayout.CENTER);
		Frame.pack();
		Frame.setLocation(0,0);
		Frame.setVisible(true);
		Frame.setSize(WIDTH,HEIGHT);
	}
	
	
	
		
	}
	

