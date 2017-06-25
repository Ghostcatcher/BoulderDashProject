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
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Graphics g;

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
		
		int posX = 0;
		int posY = 0;
		
		ShowSprite showSprite = new ShowSprite(1, posX, posY, position);
		
		BufferedImage img ;
		
		img = ImageIO.read(new File("C:\\Users\\Ghost64\\Desktop\\images\\blocks.png"));
		BufferedImage subimage = img.getSubimage(posX, posY, 16, 16);
		g.drawImage(subimage, position.x , position.y, null);
		
	}
}
