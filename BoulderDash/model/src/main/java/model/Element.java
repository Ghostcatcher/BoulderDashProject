package model;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * <h1>The Class Element, mother class of Static and Mobile </h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Element implements IElement {
	private int id;
	private BufferedImage image;
	private BufferedImage img;

	public Element(int id){
		try{
			this.id = id;
			this.img = idSprite(id);
		}

		catch(Exception e){
			e.printStackTrace();
		}
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

	/**
	 *The method to display the sprite with the Id of the element
	 *
	 * @param id
	 *            The id of the object
	 */
	public BufferedImage idSprite(int id) throws IOException{
		switch (id)
		{
		case 1:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
			this.image = img.getSubimage(16, 128, 16, 16);
			break;
		case 2:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
			this.image = img.getSubimage(0, 128, 16, 16);
			break;
		case 3:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
			this.image = img.getSubimage(48, 128, 16, 16);
			break;
		case 4:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
			this.image = img.getSubimage(64, 128, 16, 16);
			break;
		case 5:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\player.png"));
			this.image = img.getSubimage(32, 0, 16, 16);
			break; 
		case 6:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
			this.image = img.getSubimage(144, 128, 16, 16);
			break;
		case 7:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
			this.image = img.getSubimage(160, 128, 16, 16);
			break;
		case 8:
			this.img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
			this.image = img.getSubimage(32, 128, 16, 16);
			break;
		}
		return image;
	}
}


