public class ShapeTester{
	
	public static void main(String[] args){

		Shape polygon = new Shape();

		System.out.println(polygon);

		polygon = new Shape("indigo", false);

		System.out.println(polygon);

		System.out.println(polygon.isFilled());
		System.out.println(polygon.getColor());

		polygon.setColor("blood");

		System.out.println(polygon);

		polygon.setFilled(true);

		System.out.println(polygon);               
                
                Circle round = new Circle(4.75);
 
                System.out.println(round.getArea());
                System.out.println(round.getPerimeter());
                
                System.out.println(round);
                
                Square squer = new Square();
                
                System.out.println(squer.getArea());
                System.out.println(squer.getPerimeter());
                
                //should have the same value
                System.out.println();
                System.out.println(squer.getWidth());
                System.out.println(squer.getLength());
                System.out.println(squer.getSide());
                
                System.out.println();
                System.out.println(polygon);

	}
}