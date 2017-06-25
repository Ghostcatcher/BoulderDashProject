package view;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <h1>The Class ViewFacadeTest</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 * 
 * A test class to test the display of a message
 */

public class ViewFacadeTest {

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

	@Test
	public void testDisplayMessage() {
		
		final String message = "this is a test";		//sets a message in a String
		JOptionPane.showMessageDialog(null, message);	//displays the message on the panel
		
	}
}