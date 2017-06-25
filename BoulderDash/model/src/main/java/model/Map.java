package model;

import java.awt.Point;

import model.dao.Connection;

public class Map implements IMap{
	private IElement[][] mapLevel1;
	static private int line = 40;
	static private int colomn = 22;
	static private int levelId = 1;
	
	public Map(){
		this.fillMapLevel();
	}
	
		public void fillMapLevel(){
			
		Connection connect = new Connection();
		this.mapLevel1 = new Element[line][colomn];
		int[][] table = new int[line][colomn];
		connect.getMapByLevelId(levelId, table);
		
		for(int i = 0; i < line; i++){
			
			for(int j = 0; j < colomn; j++){
					int id = table[i][j];
				Point position = new Point(i, j);
				mapLevel1[i][j] = new Element(id);
				
			}	
		}
	}


	
	public void setTable(Element[][] table) {
		this.mapLevel1 = table;
	}

	public IElement[][] getTable() {
		return mapLevel1;
	}

	public synchronized static int getLine() {
		return line;
	}

	public synchronized static int getColomn() {
		return colomn;
	}
	
	public synchronized IElement getValue(int a, int b){
		return mapLevel1[a][b];
	}
}