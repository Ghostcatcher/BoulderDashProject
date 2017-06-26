package view;

import static org.junit.Assert.*;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <h1>The Class ShowSpriteTest</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */

public class ShowSpriteTest {
	
	int posX ;
	int posY ;
	private Graphics g;
	private Point position;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
     * paintTest method to test the painted component
     * 
   * @param g
     *			  Graphic object to paint on a component
	 * @throws IOException 
     *
     */
	
	@Test
	public void paintTest() throws IOException {
		
		Point position = new Point();
		position.x = 14;
		position.y = 5;
		posX = 3;
		posY = 10;
		
		
		ShowSprite showSprite = new ShowSprite(1, 15, 14, position);
		
		this.position = position;
		
		BufferedImage img ;
		
		img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
		BufferedImage subimage = img.getSubimage(2, 4, 16, 16);
		System.out.println("subimage : " + subimage);
		System.out.println("position x : " + position.x);
		System.out.println("position y : " + position.y);
		System.out.println("posX : " + posX);
		System.out.println("posY : " + posY);
		
		g.drawImage(subimage, position.x , position.y, null);
		
	}
}
