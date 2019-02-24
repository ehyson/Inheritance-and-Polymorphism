
public class Square extends Shape{

	private double side_size;
	
	
	
	public Square (ShapeDescription s)
	{
		super(s);
		side_size = s.getDoubles().get(0);
	}
	
	
	// overridden function to calculate area
	@Override
	public double getArea()
	{
		return side_size * side_size;
	}
	
	// overridden function to calculate perimeter
	@Override
	public double getPerimeter()
	{
		return side_size * 4;
	}
}

