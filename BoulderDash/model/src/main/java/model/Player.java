package model;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.IController;
/**
 * <h1>The Class Player</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Player extends Character implements IController {
	Map mapLevel = new Map();
	

	public Player(int id) {
		super(id);
	}
	
	/**
	 * A method to move the player in the map according to the different keypressed
	 * 
	 * @param e
	 *            This event occurs when a key press is followed by a key release       
	 * @throws IOException 
	 */
	
	public void Movement(KeyEvent e) throws InterruptedException, IOException {
		switch (e.getKeyCode()){
		case KeyEvent.VK_RIGHT:
			if(map.getValue(position.x+1, position.y).getId()!= 2){
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
				this.image = img.getSubimage(32, 128, 16, 16);
				getPosition().setLocation(position.x+1, position.y);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(48, 64, 16, 16);
				Thread.sleep(100);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(0, 0, 16, 16);
			}

			break;
		case KeyEvent.VK_LEFT:
			if(mapLevel.getValue(position.x-1, position.y).getId() != 2){
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
				this.image = img.getSubimage(32, 128, 16, 16);
				getPosition().setLocation(position.x-1, position.y);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(48, 32, 16, 16);
				Thread.sleep(100);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(0, 0, 16, 16);
			}
			break;
		case KeyEvent.VK_UP:
			if(mapLevel.getValue(position.x, position.y+1).getId() != 2 && mapLevel.getValue(position.x, position.y+1).getId() != 3){
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
				this.image = img.getSubimage(32, 128, 16, 16);
				getPosition().setLocation(position.x, position.y+1);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(32, 48, 16, 16);
				Thread.sleep(100);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(0, 0, 16, 16);
			}
			break;
		case KeyEvent.VK_DOWN:
			if(mapLevel.getValue(position.x, position.y-1).getId() != 2 && mapLevel.getValue(position.x, position.y-1).getId() != 3){
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
				this.image = img.getSubimage(32, 128, 16, 16);
				getPosition().setLocation(position.x, position.y-1);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(32, 80, 16, 16);
				Thread.sleep(100);
				this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
				this.image = img.getSubimage(0, 0, 16, 16);
			}
			break;
		}
	}
}
