package TicTacToeGame;	//correction

public class TicTicToeGame {
	static char board[] = new char[10];
	//here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createBoard();
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
		
		int letter = (int) Math.floor(Math.random() * 10 % 2);
		if(letter == 1) {
			System.out.println("Player selected x");
			player = 'x';
			computer = 'o';
		}
		else {
			System.out.println("Player selected o");
			player = 'o';
			computer = 'x';
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