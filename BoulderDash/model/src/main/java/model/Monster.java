package model;

import java.awt.Point;

import view.ShowSprite;
/**
 * <h1>The Class Monster</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */
public class Monster extends Character{
	Map mapLevel = new Map();

	public Monster(int id, Point position) {
		super(id, position);
	}

	/**
	 * Move the monster with a specific IA depending of his id            
	 */

	public void MovementIA() throws InterruptedException{
		Point p = getPosition().getLocation();
		if (getId() == 6){
			if(mapLevel.getValue(p.x+1, p.y).getId() == 8 || mapLevel.getValue(p.x+1, p.y).getId() == 5 ){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x+1, p.y);
				new ShowSprite(1,144,144,p); 
				Thread.sleep(100);

			}
			else if (mapLevel.getValue(p.x, p.y-1).getId() == 8 || mapLevel.getValue(p.x, p.y-1).getId() == 5){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x, p.y-1);
				new ShowSprite(1,144,160,p); 
				Thread.sleep(100);
			}

			else if (mapLevel.getValue(p.x-1, p.y).getId() == 8 || mapLevel.getValue(p.x-1, p.y).getId() == 5){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x-1, p.y);
				new ShowSprite(1,144,176,p); 
				Thread.sleep(100);
			}
			else if (mapLevel.getValue(p.x, p.y+1).getId() == 8 || mapLevel.getValue(p.x-1, p.y+1).getId() == 5){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x, p.y+1);
				new ShowSprite(1,144,128,p); 
				Thread.sleep(100);
			}
		}
		if (getId() == 7){		

			if (mapLevel.getValue(p.x-1, p.y).getId() == 8 || mapLevel.getValue(p.x-1, p.y).getId() == 5){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x-1, p.y);
				new ShowSprite(1,160,176,p); 
			}
			else if (mapLevel.getValue(p.x, p.y-1).getId() == 8 || mapLevel.getValue(p.x, p.y-1).getId() == 5){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x, p.y-1);
				new ShowSprite(1,160,160,p); 
				Thread.sleep(100);
			}
			else if (mapLevel.getValue(p.x-1, p.y).getId() == 8 || mapLevel.getValue(p.x-1, p.y).getId() == 5){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x-1, p.y);
				new ShowSprite(1,160,176,p); 
				Thread.sleep(100);
			}
			else if (mapLevel.getValue(p.x, p.y+1).getId() == 8 || mapLevel.getValue(p.x-1, p.y+1).getId() == 5){
				new ShowSprite(1,32,128,p);
				getPosition().setLocation(p.x, p.y+1);
				new ShowSprite(1,160,128,p); 
				Thread.sleep(100);
			}
		}
	}
}

