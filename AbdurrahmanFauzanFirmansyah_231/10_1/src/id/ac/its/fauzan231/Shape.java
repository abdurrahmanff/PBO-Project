package id.ac.its.fauzan231;

public abstract class Shape {

	protected String color;
	
	public Shape() {
		this.color = "Blue";
		System.out.println("[Shape]: Default Constructor");
	}
	
	public Shape(String color) {
		this.color = color;
		System.out.println("[Shape]: Constructor color");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	public abstract double getCircumference();
	
}
