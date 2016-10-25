import java.awt.*;
import static java.awt.TextArea.SCROLLBARS_NONE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class BatoBatoPik extends Frame{
	
		private Label lblChoice;
		private CheckboxGroup cbg;
		private Checkbox paper;
		private Checkbox scissors;
		private Checkbox rock;
		private Checkbox lizard;
		private Checkbox spock;
		private TextArea txtResult;
		private Button pak;
		private String[] choices = {"ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK"};
		private int oppChoice;
		private int choice;
                private TextArea score, oppScore = new TextArea(1,1);
                private int scr, oppscr = 0;
                private Dialog winner;
                private Button ganern;
                private Button ganernlost;
                private boolean justWon = false;
                private boolean justLost = false;
	
		BatoBatoPik(){
			setLayout(new FlowLayout());
			
			lblChoice = new Label("Your Choice: ");
			CheckboxGroup cbg = new CheckboxGroup();
			paper = new Checkbox("Paper", cbg, false);
			rock =  new Checkbox("Rock", cbg, false);
			scissors = new Checkbox("Scissors", cbg, false);
			lizard =  new Checkbox("Lizard", cbg, false);
			spock =  new Checkbox("Spock", cbg, false);
			txtResult = new TextArea("Result: ", 5, 30, SCROLLBARS_NONE);
                        txtResult.setEditable(false);
			pak = new Button("RockPaperScissorsSpockLizard");
                        score = new TextArea("0", 1, 1, SCROLLBARS_NONE);
                        oppScore = new TextArea("0", 1, 1, SCROLLBARS_NONE);
                        score.setEditable(false);
                        oppScore.setEditable(false);
                        winner = new Dialog(this, "GAME OVER");
                        ganern = new Button("You won!    Retry?");
                        ganernlost = new Button("You lost!    Retry?");
                        
			
			pak.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent a) {
	                if(paper.getState() == true || rock.getState() == true || 
	                scissors.getState() == true || lizard.getState() == true || 
	                spock.getState() == true){
	                	if(rock.getState() == true)
	                		choice = 0;
	                	if(paper.getState() == true)
	                		choice = 1;
	                	if(scissors.getState() == true)
	                		choice = 2;
	                	if(lizard.getState() == true)
	                		choice = 3;
	                	if(spock.getState() == true)
	                		choice = 4;
                                Random rand = new Random();
	                	oppChoice = rand.nextInt(4);
	                	if(oppChoice == choice){
                                    txtResult.setText("Result: \n\nPlayer chose " + choices[choice] + 
	                			         "\nOpponent chose " + choices[oppChoice] 
                                                         + "\n\n DRAW!");
                                }
                                else if(getWinner(choice, oppChoice) == true){
	                		txtResult.setText("Result: \n\nPlayer chose " + choices[choice] + 
	                			         "\nOpponent chose " + choices[oppChoice] 
                                                         + "\n\n YOU WIN THIS ROUND!");
                                        String n = "" + ++scr;
                                        score.setText(n);
                                }
                                else if(getWinner(choice, oppChoice) == false){
	                		txtResult.setText("Result: \n\nPlayer chose " + choices[choice] + 
	                			         "\nOpponent chose " + choices[oppChoice] 
                                                         + "\n\n YOU LOST THIS ROUND!");
                                        String n = "" + ++oppscr;
                                        oppScore.setText(n);
                                }
                                
                                
                                if(scr == 3){
                                    if(justLost){
                                        winner.remove(ganernlost);
                                        justLost = false;
                                    }
                                    winner.add(ganern);
                                    winner.setVisible(true);
                                    scr = 0;
                                    oppscr = 0;
                                    justWon = true;
                                    String n = "" + scr;
                                    score.setText(n);
                                    String m = "" + oppscr;
                                    oppScore.setText(m);
                                }
                                
                                else if(oppscr == 3){
                                    if(justWon){
                                        winner.remove(ganern);
                                        justWon = false;
                                    }
                                    winner.add(ganernlost);
                                    winner.setVisible(true);
                                    scr = 0;
                                    oppscr = 0;
                                    justLost = true;
                                    String n = "" + oppscr;
                                    oppScore.setText(n);
                                    String m = "" + scr;
                                    score.setText(m);
                                }
                                
	                }
	            }
	        });
                        
                        ganern.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                winner.dispose();
                            }
                        });
                        ganernlost.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                winner.dispose();
                            }
                        });

			
			
			
			
			add(lblChoice);
			
			add(rock);
			add(paper);
			add(scissors);
			add(lizard);
			add(spock);
                        add(txtResult);
			add(pak);
                        add(new Label("Player's Score"));
                        add(score);
                        add(new Label("Opponent's Score"));
                        add(oppScore);
			
                        winner.setSize(200, 150);
			setTitle("BatoPapelGuntingSpockButiki");
			setSize(450, 260);
			setVisible(true);
                        addWindowListener(new WindowAdapter(){
                            public void windowClosing(WindowEvent we){
                            System.exit(0);
                        }
                        });
                        winner.addWindowListener(new WindowAdapter(){
                            public void windowClosing(WindowEvent we){
                            System.exit(0);
                        }
                        });
			
			
		}
		
		public boolean getWinner(int player, int opponent){
			if(opponent == 0 && player == 2 || opponent == 0 && player == 3)
				return false;
			if(opponent == 1 && player == 0 || opponent == 1 && player == 4)
				return false;
			if(opponent == 2 && player == 1 || opponent == 2 && player == 3)
				return false;
			if(opponent == 3 && player == 2 || opponent == 3 && player == 4)
				return false;
			if(opponent == 4 && player == 0 || opponent == 4 && player == 2)
				return false;
			else
			return true;
		}
	
	public static void main(String[] args){
		new BatoBatoPik();
		
		
	}

}
