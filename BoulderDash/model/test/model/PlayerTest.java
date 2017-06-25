package model;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Player;

/**
 * <h1>The Class PlayerTest</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 *     
 *     Class test to test the Player class
 */

public class PlayerTest {

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
	 *     Method MovementTest to make the player move
	 */
	@Test
	public void MovementTest() {
		
		Point position = new Point();
		position.x = 9;
		position.y = 2;
		new Player(5, position);
		
	}
}