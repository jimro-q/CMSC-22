public class Square extends Rectangle{
    private double side; 
    
    Square(){
        super();
        side = 1.0;
    }
    
    Square(double side){
        super(side, side);   
        this.side = side;
    }
    
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }
    
    public double getSide(){return side;}
    public void setSide(){this.side = side;}
    
    public double getLength(){ return side; }
    public void setLength(double side){ this.side = side;} 
    
    public double getWidth(){ return side; }
    public void setWidth(double width){ this.side = side;}
    
    public String toString(){
        return "A Square with side = " + side + ", which is a subclass of " + super.toString();
    }
    
}
