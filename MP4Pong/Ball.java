package pongping;


import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
        int x = 300;
	int y = 250;
	int xa = 1;
	int ya = 1;
        private static final int DIAMETER = 30;
	private Game game;
        public int color = 0;
        int speed = 1;
        
        

	public Ball(Game game) {
		this.game = game;
	}
        
        //moves ball according to environment
	void move() {
		if (x + xa < 0)
                        if(game.n < 4){
                            game.n++;
                            x = 300;
                            y = 250;
                            xa = 1;
                            ya = 1;
                            speed = 1;
                        }
                        else
			game.gameOverLeft();
		if (x + xa > game.getWidth() - DIAMETER)
                        if(game.m < 4){
                            game.m++;
                            x = 300;
                            y = 250;
                            xa = -1;
                            ya = -1;
                            speed = 1;
                        }
                        else
			game.gameOverRight();
		if (y + ya < 0)
			ya = speed;
		if (y + ya > game.getHeight() - DIAMETER)
			ya = -speed;
                if(collision1()){
                        xa = speed++;
			x = game.racquet.getY() + 10;
                        
                        if(color < 4)
                            color++;
                        else
                            color = 0;
                        
                }
                if(collision2()){
                        xa = -speed++;
			x = game.racquet.getB() - DIAMETER;
                        if(color < 4)
                            color++;
                        else
                            color = 0;
                }
                

		x = x + xa;
		y = y + ya;
	}
        
        private boolean collision1() {
		return game.racquet.getBounds1().intersects(getBounds());
	}
        
        private boolean collision2() {
		return game.racquet.getBounds2().intersects(getBounds());
	}

	public void paint(Graphics2D g) {
		g.fillOval(x, y, DIAMETER, DIAMETER);
	}
        
        public Rectangle getBounds() {
		return new Rectangle(x, y, DIAMETER, DIAMETER);
	}
        
}
