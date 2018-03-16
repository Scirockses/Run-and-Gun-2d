package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import game.GameStates.GameStateManager;

public class GamePanel extends JPanel implements Runnable, KeyListener,MouseListener,MouseMotionListener {
	private static final long serialVersionUID = 1L;
	boolean isrunning;
	private int FPS = 60;
	private long Targettime = 1000/FPS;
	private GameStateManager gsm;
	private Thread thread;
	public int MouseX;
	public int MouseY;
	public GamePanel(){
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
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
	
	public void mouseClicked(MouseEvent e) {
		gsm.mouseClicked(e.getButton());
		
	}
	
	public void mouseEntered(MouseEvent e) {
		
		
	}
	
	public void mouseExited(MouseEvent e) {

		
	}
	
	public void mousePressed(MouseEvent e) {
		gsm.mousePressed(e.getButton());
		
	}
	
	public void mouseReleased(MouseEvent e) {
		gsm.mouseReleased(e.getButton());
		
	}
	
	public void mouseDragged(MouseEvent e) {
		gsm.mouseDragged(e.getXOnScreen(),e.getYOnScreen());
		
	}
	
	public void mouseMoved(MouseEvent e) {
		gsm.mouseMoved(e.getX(), e.getY());
		
		
	}
	
	
	
	
	
}
