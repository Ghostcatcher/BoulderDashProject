package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

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


public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8716106488637881630L;
	private Panel panel;
	/**
	 * Creates a new frame with a static size and a panel that has the size of the frame
	 * 
	 * @param model
	 * 				The model 
	 */

	public Frame(IModel model){
		this.setTitle("Boulderdash");
		this.setSize(680,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.getContentPane().addKeyListener(new KeyAdapter() {
			private BufferedImage img;
			/**
			 * A method to move the player in the map according to the different keypressed
			 * 
			 * @param e
			 *            This event occurs when a key press is followed by a key release       
			 * @throws IOException 
			 */
			public void keyPressed(KeyEvent e) {
				IElement[][] tempTable;
				tempTable = model.getMap().getTable();
				int i = 4;
				int y = 3;
				switch (e.getKeyCode()){
				case KeyEvent.VK_RIGHT:

					if(tempTable[i+1][y].getId()!= 2){
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(32, 128, 16, 16);
						model.getMap().setTable(tempTable);
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(48, 64, 16, 16);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(0, 0, 16, 16);
					}

					break;
				case KeyEvent.VK_LEFT:
					if(tempTable[i-1][y].getId()!= 2){
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(32, 128, 16, 16);
						model.getMap().setTable(tempTable);
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(48, 32, 16, 16);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(0, 0, 16, 16);
					}
					break;
				case KeyEvent.VK_UP:
					if(tempTable[i][y+1].getId()!= 2 && tempTable[i][y+1].getId()!= 3){
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(32, 128, 16, 16);
						model.getMap().setTable(tempTable);
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(32, 48, 16, 16);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(0, 0, 16, 16);
					}
					break;
				case KeyEvent.VK_DOWN:
					if(tempTable[i][y-1].getId()!= 2 && tempTable[i][y-1].getId()!= 3){
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\blocks.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(32, 128, 16, 16);
						model.getMap().setTable(tempTable);
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(32, 80, 16, 16);
						try {
							Thread.sleep(100);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							this.img = ImageIO.read(new File("C:\\Users\\Hugo\\Desktop\\player.png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						img.getSubimage(0, 0, 16, 16);
					}
					break;
				}
			}
		});


		panel = new Panel(model);
		this.setContentPane(panel);
		panel.setLayout(null);
		panel.setBounds(0, 0, 640, 480);
	}
}