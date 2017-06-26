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
 * 
 * A class that will display a panel for the user
 */

public class Panel extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6480438925747987256L;
	IModel model;

	public Panel(IModel model){
		this.model = model;
	}


	/** 
	 * 
	 * A method that will add objects to the panel
	 *
	 *@param g 
	 *				 a Graphics object that stores informations needed for basic rendering operations 
	 */
	public void paintComponent(Graphics g){

		for(int i = 0; i < 40; i++){
			for(int j = 0; j < 22; j++){
				g.drawImage(this.model.getMap().getTable()[i][j].getImage(), i*16+16, j*16+16, this);
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