package chapter7;

public class TestCircle {
	
	public static void main(String[] args) 
	{//
		
		Circle spot = new Circle(5); 
		
		spot.setRadius(3);
		
		System.out.println(" Circle radius: " + spot.getRadius());
		
		System.out.println("\n Circle circumference: " + spot.Circumference() + "\n");
		
		Circle.displayAreaFormula();

	}


	
	
}