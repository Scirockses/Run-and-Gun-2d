package game.GameStates;

import java.awt.Graphics;
import java.util.Stack;

public class GameStateManager {
	public Stack<GameState> States;

	public GameStateManager(){
		States = new Stack<GameState>();
		States.push(new MenuState(this));
	}
	
	
	public void tick(){
		States.peek().tick();
	}
	public void draw(Graphics g){
		States.peek().draw(g);
	}
	public void keypressed(int k){
		States.peek().keypressed(k);
	}
	public void keyreleased(int k){
		States.peek().keyreleased(k);
	}
	public void mouseClicked(int k){
		States.peek().mouseClicked(k);
	}
	public void mousePressed(int k){
		States.peek().mousePressed(k);
	}
	public void mouseReleased(int k){
		States.peek().mouseReleased(k);
	}
	public void mouseDragged(int x,int y){
		States.peek().mouseDragged(x, y);
	}
	public void mouseMoved(int x,int y){
		States.peek().mouseMoved(x, y);
	}
	
	
	
	
}
