
public class Circle extends Shape {
    private double radius;
    
    Circle(){
        super();
        this.radius = 1.0;
    }
    
    Circle(double radius){
        super();
        this.radius = radius;
    }
        
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius; 
    }
    public void setRadius(double radius){ 
        this.radius = radius;
    }
    
    public double getArea(){ 
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){ 
        return 2*radius*Math.PI;
    }
    
    @Override
    public String toString(){
        {
		String ans = "A Circle with radius = " + radius + ", which is a subclass of ";
		ans += "a shape with a color of " + color + " and " ;

		if(filled == true)
			ans += "filled.";
		else
			ans += "not filled.";

		return ans;

	}
    }
    
    
}
