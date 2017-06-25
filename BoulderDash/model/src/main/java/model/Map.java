<<<<<<< HEAD
package model;

import java.io.IOException;

import model.dao.Connection;

public class Map implements IMap{
	private IElement[][] mapLevel;
	static private int line = 22;
	static private int colomn = 40;
	static private int levelId = 1;
	
	public Map() throws IOException{
		this.fillMapLevel();
	}
	
	public void fillMapLevel() throws IOException{
		
		Connection connect = new Connection();
		this.mapLevel = new Element[50][50];
		int[][] table = new int[line][colomn];
		table = connect.getMapByLevelId(levelId, table);
		
		for(int i = 0; i <= line; i++){	
			
			for(int j = 0; j < colomn; j++){
				int id = table[i][j];
				mapLevel[i][j] = new Element(id);
								
			}	
		}
	}
	
	public void setTable(Element[][] table) {
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
=======
package model;

import java.io.IOException;
import model.dao.Connection;

/**
 * <h1>The Class Map</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */

public class Map implements IMap{
	private IElement[][] mapLevel;
	static private int line = 40;
	static private int colomn = 22;
	static private int levelId = 1;
	
	public Map() throws IOException{
		this.fillMapLevel();
	}
	
	public void fillMapLevel() throws IOException{
		Connection connect = new Connection();
		this.mapLevel = new Element[50][50]; 
		int[][] table = new int[line][colomn];
		table = connect.getMapByLevelId(levelId, table);
		for(int i = 0; i <= line; i++){
			for(int j = 0; j <= colomn; j++){
				mapLevel[i][j] = new Element(1);
			}
		}
	}
	
	/*
		public void fillMapLevel(){
		Connection connect = new Connection();
		this.mapLevel = new Element[line][colomn];
		int[][] table = new int[line][colomn];
		connect.getMapByLevelId(levelId, table);
		for(int i = 0; i < line; i++){
			for(int j = 0; j < colomn; j++){
				Point position = new Point(i, j);
				int id = table[i][j];
				mapLevel[i][j] = new Element(id, position);
			}	
		}
	}

	*/
	
	public void setTable(Element[][] table) {
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
>>>>>>> branch 'master' of https://github.com/Ghostcatcher/BoulderDashProject.git
}