
abstract public class Shape{

	protected String color = "red";
	protected boolean filled = true;

	Shape(){
		color = "green";
		filled = true;
	}

	Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){ return color; }

	public boolean isFilled(){ return filled; }

	public void setColor(String color){ this.color = color; }

	public void setFilled(boolean filled){ this.filled = filled; }

	abstract public String toString();

        abstract double getArea();
        
        abstract double getPerimeter();
        
        
        
	
}