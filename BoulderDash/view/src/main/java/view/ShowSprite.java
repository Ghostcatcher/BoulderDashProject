package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.*;

/**
 * <h1>The Class ShowSprite</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class ShowSprite extends JFrame implements IShowSprite{

	private static final long serialVersionUID = 1L;
	public int posX;
	public int posY;
	public int choice;
	public Point position;
	
	/**
     * Show a sprite
     * 
     * @param choice
     *            Choose the sprite to use (1 -> Blocks / 2 -> Player)
     * @param posX
     * 			  Select the position X in the sprite
     * @param posY
     *			  Select the position Y in the sprite          
     */
	
	public ShowSprite(int choice, int posX, int posY, Point position){
		this.posX = posX;
		this.posY = posY;
		this.choice = choice;
		this.position = position;
	}
	/**
     * A method that will add objects to the panel
     * 
     * @param g
     *            Graphic object to paint on a component
     */
	
	public void paint(Graphics g){
		
		BufferedImage img = null;
		BufferedImage img2 = null;
		
		
		try {
			
			if (choice == 1){
				img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
				System.out.println("choice2 : " + choice);
			}
				
		
			
			else{
				img2 = ImageIO.read(new File("/model/sprites/player.png"));
			}
				
			
		
		}catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("error : " + e.getMessage());
			System.out.println("error image  width: " + img.getWidth());
			System.out.println("error image  height: " + img.getHeight());
		}
		
		g.clearRect(0, 0, 680, 540);
		
		if (choice == 1){
			
			BufferedImage subimage = img.getSubimage(posX, posY, 16, 16);
			System.out.println("okay subimage  width: " + subimage.getWidth());
			System.out.println("okay subimage  height: " + subimage.getHeight());
			g.drawImage(subimage, position.x, position.y, null);
		}
		
		
		else {
			
			BufferedImage subimage2 = img2.getSubimage(posX, posY, 16, 16);
			System.out.println("okay subimage2  width: " + subimage2.getWidth());
			System.out.println("okay subimage2  height: " + subimage2.getHeight());
			g.drawImage(subimage2, position.x, position.y, null);
			
		}
	}
}