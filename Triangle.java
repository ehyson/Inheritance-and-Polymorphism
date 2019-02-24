
public class Triangle extends Shape{

	private double side1;
	private double side2;
	private double side3;
	

	
	public Triangle( ShapeDescription s)
	{
		super(s);
		side1 = s.getDoubles().get(0);
		side2 = s.getDoubles().get(1);
		side3 = s.getDoubles().get(2);
	}

	
	// Overridden area method
	@Override
	public double getArea()
	{
		try
		{
			double sum = (side1+side2+side3)/2.0;
			double area = sum * ((sum-side1)*(sum-side2)*(sum-side3));
			if (area >= 0)
			{
				return Math.sqrt(area);
			}
			else{
				System.out.println("Error in calculating the area of a triangle");
				return 0;
			}
		}
		catch (Exception a)
		{
			System.out.println("Error in calculating the area of a triangle");
			return 0;
		}
	}
	
	// Overridden perimeter method
	@Override
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	
	// getters and setters
	public double getSide1() { return side1; } 
	public double getSide2() {return side2; }
	public double getSide3() {return side3; }
	public void setSide1( double h ) { side1 = h; } 
	public void setSide2( double w ) { side2 = w; }
	public void setSide3( double g ) { side3 = g; }
	

}