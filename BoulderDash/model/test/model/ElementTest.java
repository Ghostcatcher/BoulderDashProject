package model;

import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Class ElementTest</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 *     
 *     Class ElementTest to do a test on the Element class
 */

public class ElementTest {
	
	BufferedImage image;
	private Object id;
	private Point position;

	@Before
	public void setUp() throws Exception {
		
		Point position = new Point();
		position.x = 9;
		position.y = 2;
		this.position = new Point();
		this.id = 2;

	}

	/**
	 *     A test method to get the image
	 */
	
	@Test
	public void testGetImage() {
		final Element element = new Element(1); 
		assertEquals(image, element.getImage());
		
	}

	@Test
	public void testSetImage() {
		this.image = image;
	}

	/**
	 *     A test method to get the id of the element
	 */
	
	@Test
	public void testGetId() {
		final Element element = new Element(1); 
		final int expected = 1;
		assertEquals(expected, element.getId());
	}
	
	/**
	 *     A test method to verify the id of the sprite used
	 */
	
	@Test
	public void idSpriteTest() throws IOException{
		final Element element = new Element(1); 
		int expected = 1;
		equals(element.idSprite(expected));
	}
}