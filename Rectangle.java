
public class Rectangle extends Shape{

	
	private double height;
	private double width;
	
	
	
	public Rectangle (ShapeDescription s)
	{
		super(s);
		height = s.getDoubles().get(0);
		width = s.getDoubles().get(1);
	}
	
	
	// overridden area method
	@Override
	public double getArea()
	{
		return height * width;
	}
	
	// overridden perimeter method
	@Override
	public double getPerimeter()
	{
		return (2.0 * height) + (2.0 * width);
	}
	
	// getters and setters
	public double getHeight() { return height; } 
	public double getWidth() {return width; }
	public void setHeight( double h ) { height = h; } 
	public void setWidth( double w ) { width = w; }
}

