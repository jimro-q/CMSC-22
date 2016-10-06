
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    
    Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
        
    }
    
    Rectangle(double width, double length, String color, boolean filled){
       super(color, filled);
       this.length = length;
       this.width = width;
        
    }
    
    public double getLength(){ return length; }
    public void setLength(double length){ this.length = length;} 
    
    public double getWidth(){ return width; }
    public void setWidth(double width){ this.width = width;}
    
    public double getPerimeter(){ return 2 * (length + width); }
    public double getArea(){return length * width; }
    
    public String toString(){
        String ans = "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of ";
        ans += "a shape with a color of " + color + " and " ;

		if(filled == true)
			ans += "filled.";
		else
			ans += "not filled.";

		return ans;
    }
}
