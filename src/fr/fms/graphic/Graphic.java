/**
 * Programme permettant l'affichage de plusieurs formes géométriques
 * 
 * @author El babili - 2023
 * 
 */

package fr.fms.graphic;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;
	private IJobImpl IJobImpl;
	
	public Graphic(IJobImpl jobImpl) {
		super("Voici nos formes géométriques !");			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);		
		setLocationRelativeTo(null);	
		setVisible(true);
		this.IJobImpl = jobImpl;
	}
	
	@Override	//le repère commence en haut à gauche (0,0)
	public void paint(Graphics g) {	
		super.paint(g);
		IJobImpl.drawShape(g);
			
//		g.fillOval(50, 50, 35, 35);	// x , y , largeur , hauteur (diamètre)
//		g.drawOval(150, 50, 45, 70);
//		g.drawRect(50, 150, 50, 50);
//		g.fillRect(150, 150, 70, 50);		
//		
//		Graphics2D g2d = (Graphics2D)g;
//		g2d.setPaint(new GradientPaint(0, 0, Color.GREEN, 50, 50, Color.RED,true));
//		g2d.fillRect(250, 50, 70, 50);		
//		
//		g2d.fillOval(250,150,55,55);		
	}
	
	public static void main(String[] args) {
		IJobImpl job = new IJobImpl ();
		job.addShape(1, new Circle(20, new Point(30,50)));
		job.addShape(2, new Square(50, new Point(200,200)));
		job.addShape(3, new Square(65, new Point(200,50)));
		job.addShape(4, new Circle (30, new Point (300,300)));
		job.addShape(5, new Circle (15, new Point (100,150)));
		
		job.displayAll();
		System.out.println("...");
		
//		job.deleteShape(1);
//		job.moveShape(3,20,30);
//		job.displayAll();
		
		new Graphic(job);
	}
}
