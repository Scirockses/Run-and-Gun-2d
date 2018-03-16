package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import game.GameStates.GameStateManager;

public class GamePanel extends JPanel implements Runnable, KeyListener {
	private static final long serialVersionUID = 1L;
	boolean isrunning;
	private int FPS = 60;
	private long Targettime = 1000/FPS;
	private GameStateManager gsm;
	private Thread thread;
	public GamePanel(){
		addKeyListener(this);
		setFocusable(true);
		
		setPreferredSize (new Dimension(WIDTH,HEIGHT));
		Start();
		
	}
	public void Start(){
		isrunning = true;
		gsm = new GameStateManager();
		thread = new Thread(this);
		thread.start();
		
		
	}
	public void run() {
		long Start,Elapsed,Wait;
		while(isrunning) {
			tick();
			repaint();
			Start = System.nanoTime();
			Elapsed = System.nanoTime() - Start;
			Wait = Targettime - Elapsed /1000;
			if (Wait <= 0){
				Wait = 5;
			}
				try {
					Thread.sleep(Wait);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
			
		}
	public void tick(){
		gsm.tick();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.clearRect(0, 0, WIDTH, HEIGHT);
		gsm.draw(g);
	}

	public void keyPressed(KeyEvent e) {
		gsm.keypressed(e.getKeyCode());
	}


	public void keyReleased(KeyEvent e) {
		gsm.keyreleased(e.getKeyCode());
	}


	public void keyTyped(KeyEvent e) {
		
	}
	
	
	
	
	
	
}
