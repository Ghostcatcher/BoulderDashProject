package model;

import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

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

	@Test
	public void testGetImage() {
		final Element element = new Element(1); 
		assertEquals(image, element.getImage());
		
	}

	@Test
	public void testSetImage() {
		this.image = image;
	}

	@Test
	public void testGetId() {
		final Element element = new Element(1); 
		final int expected = 1;
		assertEquals(expected, element.getId());
	}
	

	@Test
	public void idSpriteTest() throws IOException{
		final Element element = new Element(1); 
		int expected = 1;
		equals(element.idSprite(expected));
	}

}
