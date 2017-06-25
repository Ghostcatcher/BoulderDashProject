package model;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * <h1>The Class Element, mother class of Static and Mobile</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Element implements IElement {
	private int id;
	private BufferedImage image;
	private BufferedImage img;
	
	public Element(int id) throws IOException{
		this.id = id;
		this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\blocks.png"));
		this.image = img.getSubimage(0, 0, 16, 16);
		
		
		
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public synchronized void setImage(BufferedImage image) {
		this.image = image;
	}

	
	public synchronized int getId() {
		return this.id;
	}
	
	
	
}
