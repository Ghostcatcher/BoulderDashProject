package model.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.api.jdbc.Statement;

/**
 * <h1>The Class connection</h1>
 *
 * @author Hugo, Th�o, Eva and Geoffrey
 * @version 1.0
 * 
 * A connection class to connect to the database and store datas
 */

public class Connection {	

	private String                  user     = "root";
	private String                  password = "";
	private String                  url      = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";

	public int map [][] = new int [40][22];
	
	/**
	 *The method to get the data from the database and store them in a 2d table
	 *
	 * @param idLevel
	 *            The id of the level
	 * @param resultTab
	 *            The 2d table
	 */
	
	public int[][] getMapByLevelId (int idLevel, int resultTab[][]){
		try{
			java.sql.Connection connection = (java.sql.Connection) DriverManager.getConnection(this.url, this.user, this.password);
			Statement statement = (Statement) ((java.sql.Connection) connection).createStatement();
			ResultSet result = statement.executeQuery("CALL getMap3");
			for (int y = 0; y < 22; y++) {
				for (int x = 0; x < 40; x++){
					result.next();
					@SuppressWarnings("unused")
					int res = result.getInt(1);
					//TEST DISPLAY VALUE
					//System.out.println("x = " + x + " y = " + y + " elemId = " + res ); 
					resultTab[x][y] = Integer.parseInt(result.getObject(1).toString());	
				}
			}
			result.close();
			statement.close();
		}
		catch(Exception e){
			//System.out.println(e);
			e.printStackTrace();
		}
		return resultTab;
	}
}