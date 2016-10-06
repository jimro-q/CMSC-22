
public class Shape{

	private String color = "red";
	private boolean filled = true;

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

	public String toString(){
		String ans = "";
		ans += "A shape with a color of " + color + " and " ;

		if(filled == true)
			ans += "filled.";
		else
			ans += "not filled.";

		return ans;

	}

	
}