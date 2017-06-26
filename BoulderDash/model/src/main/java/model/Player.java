package model;


import controller.IController;
/**
 * <h1>The Class Player</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Player extends Character implements IController {
	Map mapLevel = new Map();
	

	public Player(int id) {
		super(id);
	}
}
