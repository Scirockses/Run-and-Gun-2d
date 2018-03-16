package game.GameStates;

import java.awt.Graphics;

public abstract class GameState {

	protected GameStateManager gsm;
	public GameState(GameStateManager gsm){
		this.gsm = gsm;
		init();
	}
	public abstract void init();
	public abstract void tick();
	public abstract void draw(Graphics g);
	public abstract void keypressed(int k);
	public abstract void keyreleased(int k);
	public abstract void mouseClicked(int k);
	public abstract void mousePressed(int k);
	public abstract void mouseReleased(int k);
	public abstract void mouseDragged(int x,int y);
	public abstract void mouseMoved(int x,int y);
}
