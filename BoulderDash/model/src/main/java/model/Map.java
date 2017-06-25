package model;

import model.dao.Connection;

public class Map implements IMap{
	private IElement[][] mapLevel;
	static private int line = 40;
	static private int colomn = 23;
	static private int levelId = 1;
	
	public Map(){
		this.fillMapLevel();
	}
	
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
}