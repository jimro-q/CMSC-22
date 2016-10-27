package pongping;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet {
        private static int B = 550;
        private static final int Y = 20;
        private static final int WIDTH = 10;
	private static final int HEIGHT[] = {300, 250, 200, 150, 100};
	int x = 100;
        
	int xa = 0;
        int a = 100;
        int aa = 0;
	private Game game;

	public Racquet(Game game) {
		this.game= game;
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getHeight()- HEIGHT[game.m])
			x = x + xa;
                if (a + aa > 0 && a + aa < game.getHeight()- HEIGHT[game.n])
			a = a + aa;
                        
	}

	public void paint(Graphics2D g) {
                B = game.getWidth() - 50;
		g.fillRect(Y, x, WIDTH, HEIGHT[game.m]);
                g.fillRect(B, a, WIDTH, HEIGHT[game.n]);
	}

	public void keyReleased1(KeyEvent e) {
		xa = 0;
	}
        
        public void keyReleased2(KeyEvent e) {
		aa = 0;
	}

	public void keyPressed1(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W)
			xa = -8;
		if (e.getKeyCode() == KeyEvent.VK_S)
			xa = 8;
        }
        public void keyPressed2(KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_UP)
                        aa = -8;
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                        aa = 8;
        }
        
        public Rectangle getBounds1() {
		return new Rectangle(Y, x, WIDTH, HEIGHT[game.m]);
	}
        
        public Rectangle getBounds2() {
                B = game.getWidth() - 50;
		return new Rectangle(B, a, WIDTH, HEIGHT[game.n]);
	}
        
        public int getY(){
            return Y;
        }
        
        public int getB(){
            return B;
        }
   }

