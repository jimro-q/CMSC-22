package pongping;
import javax.swing.JFrame;
public class PongPing {

    //Game: Two players play pong and whoever gets 5 points first wins
    //      As one player gains a point, his/her racquet grows shorter
    public static void main(String[] args) throws InterruptedException {
                JFrame frame = new JFrame("Pong Ping");
                Game game = new Game();
                frame.add(game);
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(true);
                
                while(true){
                    game.move();
                    game.repaint();
                    Thread.sleep(10);
                  
                }
    }
    
}
