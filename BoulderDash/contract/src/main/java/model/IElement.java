package model;

import java.awt.Point;

/**
 * <h1>The Interface IElement</h1>
 *
 * @author Hugo, Th�o, Eva and Geoffrey
 * @version 1.0
 */

import java.awt.image.BufferedImage;

public interface IElement {
	public BufferedImage getImage();
	public int getId();
	public Point getPosition();
}
