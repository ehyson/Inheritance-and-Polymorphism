
import java.util.Vector;
//import ShapeDescription.ShapeTypes;

public class FunWithShapes extends ShapeHandler{
	
	
	
	public FunWithShapes() throws ShapeException
	{
		
		super();
		
	}
	
	
	//what is going on with my shapes consturctors here
	//how do i use shape handler to read the shape.txt file 
	//in main do i instantiate a FunWithShapes object or ShapeHandler
	//what should be in my FunWithShapes constructor 
	
	
	private Vector<Double> areas;
	private Vector<Double> perimeters;
	
	
	
	public static void main(String[] args) throws ShapeException {
		
		/*
		try
		{
		FunWithShapes f = new FunWithShapes();
		f.convertDescriptionsToShapes();
		
		System.out.println( f.sumOverAreas() );
		System.out.println( f.sumOverPerimeters() );
		}
	    catch (Exception e) {
	    	System.out.println("Error in main");
	    	//print error message
	    }
		*/
		
		

		FunWithShapes f = new FunWithShapes();
		f.convertDescriptionsToShapes();
		
		System.out.println( f.sumOverAreas() );
		System.out.println( f.sumOverPerimeters() );
		
		
	}
	
	
	
	@Override 
	public void convertDescriptionsToShapes( )
	{
		areas = new Vector<Double>();
		perimeters = new Vector<Double>();
		
		for( int i = 0; i < shapeDescriptions.size(); i++)
		{
			if( shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.CIRCLE )
			{
				Circle c = new Circle( shapeDescriptions.get(i) );
				areas.add( c.getArea() );
				perimeters.add( c.getPerimeter() );
			}
			else if( shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.SQUARE )
			{
				Square s = new Square( shapeDescriptions.get(i) );
				areas.add( s.getArea() );
				perimeters.add( s.getPerimeter() );
			}
			else if( shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.RECTANGLE )
			{
				Rectangle r = new Rectangle( shapeDescriptions.get(i) );
				areas.add( r.getArea() );
				perimeters.add( r.getPerimeter() );
			}
			else if( shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.TRIANGLE )
			{
				Triangle t = new Triangle( shapeDescriptions.get(i) );
				areas.add( t.getArea() );
				perimeters.add( t.getPerimeter() );
			}
		}
	}
	
	
	@Override
	public double sumOverAreas()
	{
		double sum = 0;
		
		for( int i = 0; i < areas.size(); i++)
		{
			sum += areas.get(i);
		}
		
		return sum;
		
	}
	
	@Override 
	public double sumOverPerimeters()
	{
		double sum = 0;
		
		for( int i = 0; i < perimeters.size(); i++)
		{
			sum += perimeters.get(i);
		}
		
		return sum;
	}
	
	
}
