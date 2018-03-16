package game;

public class Main {
	boolean isrunning;
	private int FPS = 60;
	private long Targettime = 1000/FPS;
	
	public static void main(String[] args){
	
		Screen screen = new Screen();
		
	}
	
	
	public void Start(){
		isrunning = true;
		
		
	}
	public void running() {
		long Start,Elapsed,Wait;
		while(isrunning) {
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
		
	}
	

