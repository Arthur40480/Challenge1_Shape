package fr.fms.graphic;

public class Square extends Shape {
	private double side;

	public Square(double side, int x, int y) {
		super(x, y);
		this.setSide(side);
	}

	public Square(double side, Point center) {
		super(center);
		this.setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (side < 0)
			side = 1;
		else
			this.side = side;
	}
	
	public double area() {
		return this.side * this.side;
	}
	
	public double perimeter() {
		return 4 * side;
	}
	
	@Override
	public String toString() {
		return "Square side : " + side + super.toString();
	}
}
