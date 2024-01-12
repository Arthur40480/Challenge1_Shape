package fr.fms.graphic;

import java.awt.Graphics;

public abstract class Shape {
private Point center;

public Shape(int x, int y) {
	this.center = new Point(x,y);
}

public Shape(Point center) {
	this.center = new Point(center.getX(), center.getY());
}

public void setCenter(Point center) {
	this.center = center;
}

public Point getCenter() {
	return center;
}

public abstract void drawShape(Graphics g);

@Override
public String toString() {
	return " Shape [center = " + center + "]";
}

}
