package game.GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import com.sun.glass.events.KeyEvent;

import game.Main;

public class MenuState extends GameState {
	private String[] Options = {"Play","Options","Quit"};
	private int CurrentSelection = 50;
	private int mx,my;
	int k;
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}

	public void init() {}
	public void tick() {
			System.out.print(my);
	}

	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		for(int i = 0; i < Options.length; i++){
		if(i == CurrentSelection){
				g.setColor(Color.green);
			}else{
				g.setColor(Color.black);
			}
			g.setFont(new Font("Arial", Font.PLAIN,72));
			 int e = 100;
			 if (i == 1){
			 e = 150;
			 }
			g.drawString(Options[i], Main.WIDTH / 2 - e,  i * 150 + Main.HEIGHT / 3);
			
		}
	}
	
	
	public void keypressed(int k) {
		
		
	}

	
	public void keyreleased(int k) {
		
		
	}

	
	public void mouseClicked(int k) {
		
		
	}

	
	public void mousePressed(int k) {
		
	}

	
	public void mouseReleased(int k) {
		if (k == MouseEvent.BUTTON1){
		if (CurrentSelection == 0){
			//game
		}else if (CurrentSelection == 1){
			//options
		}else if (CurrentSelection == 2){
			System.exit(0);
		}
		}
	}

	
	public void mouseDragged(int x, int y) {
		
		
	}

	
	public void mouseMoved(int x, int y) {
		mx = x;
		my = y;
		if (my >= 312 && my <= 512){
			CurrentSelection = 1;
		}else if (my >= 162 && my <= 362){
			CurrentSelection = 0;
		}else if (my >= 462 && my <= 662){
			CurrentSelection = 2;
		}else{
			CurrentSelection = 50;
		}
		
	}

	
}
