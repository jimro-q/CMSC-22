package pongping;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {
        Ball ball = new Ball(this);
        Racquet racquet = new Racquet(this);
        List<KeyEvent> Pressed;
        int m = 0;
        int n = 0;
        
        
        //If left player lost
        public void gameOverLeft() {
		JOptionPane.showMessageDialog(this, "Right Player Won!", "GAME OVER", JOptionPane.YES_NO_OPTION);
		m = 0;
                n = 0; 
                ball = new Ball(this);
                racquet = new Racquet(this);
	}
        
        //If right player lost
        public void gameOverRight() {
		JOptionPane.showMessageDialog(this, "Left Player Won!", "GAME OVER", JOptionPane.YES_NO_OPTION);
		m = 0;
                n = 0;
                ball = new Ball(this);
                racquet = new Racquet(this);
                
	}
        
        //Constructor that adds a Key Listener for the racquets
        public Game() {
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { 
				racquet.keyReleased1(e);
                                
			}

			@Override
			public void keyPressed(KeyEvent e) {
                                //TODO need to be able to press multiple buttons
                                
				racquet.keyPressed1(e);                             
			}
		});
                addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { 
				racquet.keyReleased2(e);
                                
			}

			@Override
			public void keyPressed(KeyEvent e) {
                                //TODO need to be able to press multiple buttons
                                racquet.keyPressed2(e);                               
			}
		});
		setFocusable(true);
	}
        
        //moves both racquet and ball
        public void move(){
            ball.move();
            racquet.move();
        }
        
        //Paints a frame of the game
	@Override
	public void paint(Graphics g) {
                super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g2d.setColor(Color.RED);
                g2d.drawString(String.valueOf(m), 50, 50);
                g2d.setColor(Color.BLUE);
                g2d.drawString(String.valueOf(n), getWidth() - 110, 50);
                if(ball.color == 0)
                    g2d.setColor(Color.RED);
                else if(ball.color == 1)
                    g2d.setColor(Color.ORANGE);
                else if(ball.color == 2)
                    g2d.setColor(Color.CYAN);
                else if(ball.color == 3)
                    g2d.setColor(Color.YELLOW);
                else if(ball.color == 4)        
                    g2d.setColor(Color.PINK);
                ball.paint(g2d);
                g2d.setColor(Color.BLACK);
                racquet.paint(g2d);
		

		
	}
}

