package fr.fms.graphic;

public class TestJob {
	
	public static void main (String[] args) {
		IJobImpl job = new IJobImpl ();
		job.addShape(1,new Circle(20, new Point(30,50)));
		job.addShape(1,new Circle(15, new Point(100,150)));
		job.addShape(2, new Square(50, new Point (200,200)));
		job.addShape(2, new Square(65, new Point (200,50)));
		job.addShape(3,new Circle (30, new Point(300, 300)));
		
		job.displayAll();
		System.out.println("...");
		
		job.deleteShape(1);
		job.moveShape(3,20,30);
		job.displayAll();
		
	}

}
