package view;

import static org.junit.Assert.*;

import java.awt.Graphics;

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
     *
     */
	
	@Test
	public Graphics paintTest(Graphics g) {
		
		return this.g;
		
	}
}
