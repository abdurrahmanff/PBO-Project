package id.ac.its.zydhan118;

public class Shape {

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
	
	public double getArea() {
		return 0.0;
	}
	
	public double getCircumference() {
		return 0.0;
	}
	
}
