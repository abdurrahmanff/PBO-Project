package id.ac.its.fauzan231;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		this.radius = 0.0;
		System.out.println("[Circle]: Default Constructor");
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		System.out.println("[Circle]: Constructor 1");
	}
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		System.out.println("[Circle]: Constructor 2");
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 3.14 * getRadius() * getRadius();
	}
	
	@Override
	public double getCircumference () {
		return 2 * 3.14 * getRadius();
	}
}
