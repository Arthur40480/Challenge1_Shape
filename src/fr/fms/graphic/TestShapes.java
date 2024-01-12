package fr.fms.graphic;

public class TestShapes {

	public static void main(String[] args) {
		Circle c1 = new Circle(20.0,3,7);
		System.out.println(c1);
		
		Square s1 = new Square(30,3,7);
		System.out.println(s1);
		
		Point p = new Point(30,15);
		Circle c2 = new Circle(10.5,p);
		System.out.println(c2);
		
		

	}

}