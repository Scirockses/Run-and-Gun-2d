package game;

public class Screen {

  public Screen(){
		super("Game");
		this.setSize(1366, 768);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
  
}
