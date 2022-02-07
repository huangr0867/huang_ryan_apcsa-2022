//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers (" ");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";

		int compNum = (int) (Math.random() * 3);
		
		if (compNum == 0) {
			compChoice = "R";
		}
		else if (compNum == 1) {
		    compChoice = "P";
		}
		else if (compNum == 2) {
			compChoice = "S";
		}
		
		if (playChoice.equals(compChoice)) {
			winner = "Draw";
		}
		else if ((compChoice.equals("P") && playChoice.equals("S")) || (compChoice.equals("S") && playChoice.equals("R")) || (compChoice.equals("R") && playChoice.equals("P"))) {
			winner = "Player";
		} else {
			winner = "Computer";
		}
		
		return winner;
	}

	public String toString()
	{
		String output="";
		
		if (compChoice.equals("R") && playChoice.equals("P")) {
			output = "player had P" + "\n" + "computer had R" + "\n" + "!Player Wins <<Paper Covers Rock>>!";
		}
		else if (compChoice.equals("P") && playChoice.equals("R")) {
			output = "player had R" + "\n" + "computer had P" + "\n" + "!Computer Wins <<Paper Covers Rock>>!";
		}
		else if (compChoice.equals("P") && playChoice.equals("S")) {
			output = "player had S" + "\n" + "computer had P" + "\n" + "!Player Wins <<Scissors Cut Paper>>!";
		}
		else if (compChoice.equals("S") && playChoice.equals("P")) {
			output = "player had P" + "\n" + "computer had S" + "\n" + "!Computer Wins <<Scissors Cut Paper>>!";
		}
			
		else if (compChoice.equals("R") && playChoice.equals("S")) {
			output = "player had S" + "\n" + "computer had R" + "\n" + "!Computer Wins <<Rock Breaks Scissors>>!";
		}
		else if (compChoice.equals("S") && playChoice.equals("R")) {
			output = "player had R" + "\n" + "computer had S" + "\n" + "!Player Wins <<Rock Breaks Scissors>>!";
		}
		else if ((compChoice.equals(playChoice))) {
			if (compChoice.equals("R")) {
				output = "player had R" + "\n" + "computer had R" + "\n" + "!Draw Game!";
			}
			if (compChoice.equals("P")) {
				output = "player had P" + "\n" + "computer had P" + "\n" + "!Draw Game!";
			}
			if (compChoice.equals("S")) {
				output = "player had S" + "\n" + "computer had S" + "\n" + "!Draw Game!";
			}
		}
		
		
		return output;
	}
}