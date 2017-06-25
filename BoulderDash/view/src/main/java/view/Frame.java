package view;

import javax.swing.*;

import model.IModel;

/**
 * <h1>The Frame Class</h1>
 *
 * @author Hugo, Théo, Eva and Geoffrey
 * @version 1.0
 */


public class Frame extends JFrame {
	private Panel panel;
	

/**
 * Creates a new frame with a static size and a panel that has the size of the frame
 */
	
	public Frame(IModel model){
		this.setTitle("Boulderdash");
		this.setSize(680,430);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(true);
		
		panel = new Panel(model);
		this.setContentPane(panel);
		panel.setLayout(null);
		panel.setBounds(0, 0, 640, 480);
	}
	
}