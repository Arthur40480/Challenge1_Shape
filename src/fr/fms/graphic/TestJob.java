package fr.fms.graphic;

public class TestJob {
	
	public static void main (String[] args) {
		IJobImpl job = new IJobImpl ();
		job.addShape(1,new Circle(1.5, new Point(5,5)));
		job.addShape(2, new Square(3.2, new Point (2,3)));
		job.addShape(3,new Circle (1.6,5,2));
		job.addShape(4,new Square(3.2,4,8));
		job.addShape(5, new Circle (1.5, new Point (10,15)));
		
		job.displayAll();
		System.out.println("...");
		
		job.deleteShape(1);
		job.moveShape(3,20,30);
		job.displayAll();
		
	}

}
