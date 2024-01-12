package fr.fms.graphic;

import java.awt.Graphics;

public class Circle extends Shape implements IShape{

private double radius;

public Circle(double radius,int x, int y) {
	super(x,y);
	setRadius(radius);
}

public Circle(double radius,Point center) {
	super(center);
	setRadius(radius);
}

public Circle() {
	super(0,0);
	setRadius(1);
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	if (radius < 0) radius = 1;
	else this.radius = radius;
}

public double area() {
	return Math.PI * this.radius * this.radius;
}

public double perimeter() {
	return 2 * Math.PI * this.radius;
}

public void drawShape(Graphics g) {
	int radiusSelected = (int) this.getRadius();
	g.fillOval(this.getCenter().getX(), this.getCenter().getY(), radiusSelected * 2, radiusSelected * 2);
}

@Override
public String toString() {
	return "Circle : radius = " + radius + super.toString();
}

}
