package model.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionTest {

	@Test
	public void testGetMapByLevelId() {
		
		Connection connect = new Connection();
		int map [][] = new int [40][22];
		int expected = 1;
		equals(connect.getMapByLevelId(expected, map));
	}

}
