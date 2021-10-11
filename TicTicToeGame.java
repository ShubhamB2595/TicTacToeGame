package TicTacToeGame;	//correction
import java.util.Scanner;

public class TicTicToeGame {
	static char board[] = new char[10];
	//here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	createBoard();
		chooseLetter();
		
	}
	// this method createBoard for creating the empty board for 10 location
	public static void createBoard() {
		for(int i=1; i<=10; i++) {
			board[i] = ' ';		//assigning empty spaces to board 
		}
	}
	
	public static void chooseLetter() {
		char player = ' ';
		char computer = ' ';
		
		Scanner input = new Scanner(System.in);
		//int letter = (int) Math.floor(Math.random() * 10 % 2);
		System.out.println("Player please select letter: x or o ");
		char letter = input.next().charAt(0);
		if(letter == 'x' || letter == 'X') {
			System.out.println("Player selected: " + letter);
			player = letter;
			computer = 'o';
		}
		else if (letter == 'o' || letter == 'O') {
			System.out.println("Player selected: " + letter);
			player = 'o';
			computer = letter;
		}
		else {
			System.out.println("Player entered: " + letter);
			System.out.println("Please enter letter only X or O ");
		}
	}
	
}


/*
Shubham Review:
Should have git branch for each use case
package name should be proper
Should declare board  array globally
Method call should be there
Should have proper comments
should assign empty values to the array indexes
*/