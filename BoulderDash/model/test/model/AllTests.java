package model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * <h1>The Class Alltests</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 *     
 *     Class alltests to launch all the tests from model at the same time
 */

@RunWith(Suite.class)
@SuiteClasses({ ElementTest.class, PlayerTest.class })
public class AllTests {

}
