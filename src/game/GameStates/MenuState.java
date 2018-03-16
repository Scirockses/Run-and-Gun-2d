package game.GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class MenuState extends GameState {
	private String[] Options = {"Play","Options","Quit"};
	private int CurrentSelection = 0;
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}

	public void init() {}
	public void tick() {
		
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
			g.drawString(Options[i], 1366 / 2 - 350, 100 + i * 150);
		}
	}

	
	public void keypressed(int k) {
		
		
	}

	
	public void keyreleased(int k) {
		
		
	}

	
}
