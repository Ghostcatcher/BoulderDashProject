package model.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.api.jdbc.Statement;

public class Connection {	

	private String                  user     = "root";
	private String                  password = "";
	private String                  url      = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";

	public int map [][] = new int [22][40];
	public int[][] getMapByLevelId (int idLevel, int resultTab[][]){
		try{
			java.sql.Connection connection = (java.sql.Connection) DriverManager.getConnection(this.url, this.user, this.password);
			Statement statement = (Statement) ((java.sql.Connection) connection).createStatement();
			ResultSet result = statement.executeQuery("CALL getMap1");

			for (int x = 0; x < 22; x++){
				for (int y = 0; y < 40; y++) {
					result.next();
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
