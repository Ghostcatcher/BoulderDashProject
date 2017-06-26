package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import model.IElement;
import model.IModel;

/**
 * <h1>The Frame Class</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 * 
 * A class to create a frame for the user
 */


public class Frame extends JFrame implements IFrame, KeyListener{
	/**
	 * 
	 */
	private IModel model;
	private Panel panel;

	private static final long serialVersionUID = 8716106488637881630L;
	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	/**
	 * Creates a new frame with a static size and a panel that has the size of the frame
	 * 
	 * @param model
	 * 				The model 
	 */

	public Frame(IModel model){
		this.model = model;
		this.setTitle("Boulderdash");
		this.setSize(680,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);


		panel = new Panel(model);
		this.setContentPane(panel);
		panel.setLayout(null);
		panel.setBounds(0, 0, 640, 480);
		addKeyListener(this);
	}
	/**
	 * A method to move the player in the map according to the different keypressed
	 * 
	 * @param arg0
	 *            This event occurs when a key press is followed by a key release       
	 * @throws IOException 
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		IElement[][] tempTable;
		tempTable = model.getMap().getTable();
		int i = 0;
		int y = 0;
		for(int pd = 0; pd < 40; pd++){
			for(int j = 0; j < 22; j++){
				if(tempTable[pd][j].getId() == 5){
					i = pd;
					y = j;
					}
				}
		}

		switch (e.getKeyCode()){
		case 39:

			if(tempTable[i+1][y].getId()!= 2 && tempTable[i][y+1].getId()!= 3){
				try {
					tempTable[i][y].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png")).getSubimage(32, 128, 16, 16));
					tempTable[i][y].setId(8);
					tempTable[i+1][y].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png")).getSubimage(16, 48, 16, 16));
					tempTable[i+1][y].setId(5);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			break;
		case 37:
			if(tempTable[i-1][y].getId()!= 2 && tempTable[i][y+1].getId()!= 3){
				try {
					tempTable[i][y].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png")).getSubimage(32, 128, 16, 16));
					tempTable[i][y].setId(8);
					tempTable[i-1][y].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png")).getSubimage(48, 32, 16, 16));
					tempTable[i-1][y].setId(5);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			break;
		case 40:
			if(tempTable[i][y+1].getId()!= 2 && tempTable[i][y+1].getId()!= 3){
				try {
					tempTable[i][y].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png")).getSubimage(32, 128, 16, 16));
					tempTable[i][y].setId(8);
					tempTable[i][y+1].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png")).getSubimage(32, 48, 16, 16));
					tempTable[i][y+1].setId(5);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			break;
		case 38:
			if(tempTable[i][y-1].getId()!= 2 && tempTable[i][y-1].getId()!= 3){
				try {
					tempTable[i][y].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png")).getSubimage(32, 128, 16, 16));
					tempTable[i][y].setId(8);
					tempTable[i][y-1].setImage(ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png")).getSubimage(32, 80, 16, 16));
					tempTable[i][y-1].setId(5);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			}
			model.getMap().setTable(tempTable);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}