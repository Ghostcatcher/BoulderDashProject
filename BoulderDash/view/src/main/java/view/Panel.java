package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.IModel;
/**
 * <h1>The Panel Class</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */

public class Panel extends JPanel implements Observer {
	
	IModel model;
	
	public Panel(IModel model){
		this.model = model;
	}
	
	public void paintComponent(Graphics g){
		
		for(int i = 0; i < 40; i++){
			for(int j = 0; j < 22; j++){
				//g.drawImage(this.model.getMap().getTable()[j][i].getImage(), j*16+16, i*16+16, this);
				System.out.println("values map :" + this.model.getMap());
				System.out.println("values map and table :" + this.model.getMap().getTable());
				System.out.println("values map, table and image :" + this.model.getMap().getTable()[i][j].getImage());
				System.out.println("j : " + j);
				System.out.println("i :" + i);
				
				g.drawImage(this.model.getMap().getTable()[i][j].getImage(), i*16+16, j*16+16, this);
				//g.drawImage(model.getMap().getTable()[j][i].getImage().getSubimage(0, 0, 16, 16), j*16, i*16, this);
			}
		}
	}
	
	
	/**
	 *A method to update the observable
	 *
	 * @param o
     *            Observable object
     * @param arg
     * 			  Argument to notify the observer
	 */
	
	@Override
	public void update(Observable o, Object arg) {
		
		this.repaint();
		
	}
}