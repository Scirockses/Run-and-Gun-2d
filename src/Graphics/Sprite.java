package Graphics;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Sprite {
	private static Image Img;	
	
	
	public static Image Sprite(String path){
		try {
		Img = new ImageIcon(path).getImage();
		} catch(Exception e){
			e.printStackTrace();
		}
		return Img;
	}
	
	
	
	
}
