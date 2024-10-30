package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	//instance 
	private double length; 
	private double width; 
	
	public Rectangle(double length, double width) {
		this.length = length; 
		this.width = width; 
	}	
	public double Area() { 
		double Area = (length * width);
		return Area; 
	}	
	public double Perimeter() { 
		double Perimeter = ((2*length) + (2*width));
		return Perimeter;
		
	}
	public void Draw() {
		StdDraw.setCanvasSize(500, 500);
		Color shart = new Color(100, 4, 55);
		StdDraw.setPenColor(shart);
		StdDraw.filledRectangle(length, length, width, width);
	}
	public void Draw1() {
		StdDraw.setCanvasSize(500, 500);
		Color vibes = new Color(20, 45, 55);
		StdDraw.setPenColor(vibes);
		StdDraw.filledRectangle(length, length, width, width);
	}
		
	public void describe() {
		System.out.println("The rectangle has a length of " + this.length + " and has a width of " + this.width + " and is mega cool ");
	}
	
	
	public static void main(String[] args) {
		Rectangle Sof = new Rectangle(0.03, 0.70);
		Sof.Area();
		Sof.Perimeter();
		Sof.Draw();
		Sof.describe(); 
		
		Rectangle Hol = new Rectangle(0.02, 0.55); 
		Hol.Area();
		Hol.Perimeter();
		Hol.Draw1();
		Hol.describe();

	}

}
