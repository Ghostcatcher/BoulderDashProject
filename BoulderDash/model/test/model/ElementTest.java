package model;

import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.Element;

/**
 * <h1>The Class ElementTest</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 *     
 *     Class test to test the Element class
 */

public class ElementTest {
	
	BufferedImage image;
	private Object id;
	private Point position;
	private Element element; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	/**
	 *     Setup method setUp to make set up variables and objects
	 */
	@Before
	public void setUp() throws Exception {
		
		Point position = new Point();
		position.x = 9;
		position.y = 2;
		this.position = new Point();
		this.id = 2;

	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 *     testGetImage method to get the image of the element
	 */
	@Test
	public void testGetImage() {
		
		assertEquals(image, this.element.getImage());
		
	}

	/**
	 *     testSetImage method to set the image of the element
	 */
	@Test
	public void testSetImage() {
		this.image = image;
	}

	/**
	 *     testGetPosition method to get the position of the element
	 */
	
	/*
	@Test
	public void testGetPosition() {
		assertEquals(position.x, this.element.getPosition());
	}*/
	
	/**
	 *     testSetPosition method to set the position of the element
	 */
	
	/*
	@Test
	public void testSetPosition() {
		this.testGetPosition();
	}*/

	/**
	 *     testGetPosition method to get the id of the element
	 */
	
	@Test
	public void testGetId() {
		final int expected = 1;
		assertEquals(expected, this.element.getId());
	}

	@Test
	public Object testMain() {
		return this.id;
	}
}