
public class Circle extends Shape{

	private double radius;
	
	
	public Circle(ShapeDescription s) 
	{
		  super(s);
	      radius = s.getDoubles().get(0);
	}
	
	

	
	
	// method to calculate the area of a circle
	@Override
	public double getArea()
	{
		double square = radius * radius;
		square = square * Math.PI;
		return square;
	}
	
	// method to calculate the perimeter of a circle
	@Override
	public double getPerimeter()
	{
		double pi = Math.PI;
		double p = 2.0 * pi * radius;
		return p;
	}
	
	// getter and setter for radius
	public double getRadius () { return radius; }
	public void setRadius (double r) { radius = r; }
	
}

