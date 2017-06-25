package view;

import javax.swing.*;

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
		
		panel = new Panel(model);
		this.setContentPane(panel);
		panel.setLayout(null);
		panel.setBounds(0, 0, 640, 480);
	}
	
}