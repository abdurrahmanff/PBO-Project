package id.ac.its.fauzan231;

public class Rectangle extends Shape {
	
	// properti spesifik untuk kelas Rectangle
	protected double height;
	protected double width;
	
	public Rectangle() {
		super();
		this.height = 0.0;
		this.width = 0.0;
		System.out.println("[Rectangle]: Default Constructor");
	}
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
		System.out.println("[Rectangle]: Constructor 2");
	}
	
	public Rectangle(String color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
		System.out.println("[Rectangle]: Constructor 3");
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	@Override
	public double getCircumference() {
		return 2 * (getWidth() + getHeight());
	}
		
}
