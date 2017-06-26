
package model;

import java.awt.Point;

import model.dao.Connection;

/**
 * <h1>The Class Map</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 * 
 * A class that creates another 2d table and fills it with data from the database
 */

public class Map implements IMap{
	private IElement[][] mapLevel;
	static private int line = 40;
	static private int colomn = 23;
	static private int levelId = 1;
	
	public Map(){
		this.fillMapLevel();
	}
	
	/**
	* The methods that fills the second 2d table with data from the first one
	* 
	*/
	public void fillMapLevel(){
			
		Connection connect = new Connection();
		this.mapLevel = new Element[line][colomn];
		int[][] table = new int[line][colomn];
		connect.getMapByLevelId(levelId, table);
		
		for(int i = 0; i < line; i++){
			
			for(int j = 0; j < colomn; j++){
					int id = table[i][j];
				mapLevel[i][j] = new Element(id);
				
			}	
		}
	}


	
	public void setTable(IElement[][] table) {
		this.mapLevel = table;
	}

	public IElement[][] getTable() {
		return mapLevel;
	}

	public synchronized static int getLine() {
		return line;
	}

	public synchronized static int getColomn() {
		return colomn;
	}
	
	public synchronized IElement getValue(int a, int b){
		return mapLevel[a][b];
	}
}