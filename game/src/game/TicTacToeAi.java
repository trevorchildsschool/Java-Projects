package game;
import java.util.*;

public class TicTacToeAi {
	Scanner input = new Scanner(System.in);
		//build methods
	String human;
	String computer;
	public void intro() {
		System.out.println("Welcome to Tic-Tac-Toe.");
		System.out.println("This will be a 1 vs 1 between you and a computer.");
		System.out.println("You will make your move by entering 0-8.");
		System.out.println("The number will correspond to the board shown.");
		System.out.println("\t\t 0 | 1 | 2 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 3 | 4 | 5 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 6 | 7 | 8 ");
		System.out.println("Get ready to lose. \n");
	}
	
	public String yes_no_response(String question) {
		String response = "";
		while (true) {
			System.out.println(question);
			response = input.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				return response;
			}
			else if (response.equalsIgnoreCase("no")) {
				break;
			}
		}
		return response;
	}
	
	public int get_number(String question, int low, int high) {
		while (true) {
			
			int numInput;
			try {
				System.out.println(question);
				numInput = input.nextInt();
				if (!(numInput >=low && numInput <=high)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
				return numInput;
			}catch(InputMismatchException e) { //input mismatch
				System.out.print("Invalid input; re-enter slot number:");
				input.nextLine();
				continue;
			}
			
		}
	}	

	public void pieces(String X, String O) {
		String go_first = yes_no_response("Do you need to make the first move? (yes/no):");
		if (go_first.equals("yes")) {
			human = X;
			computer = O;
		}
		else {
			human = O;
			computer = X;
		}
	}
		
	public String[] new_board(int NUM_SQUARES,String EMPTY) {
		String[] board = new String[NUM_SQUARES];
		for (int i = 0;i<NUM_SQUARES;i++) {
			board[i]=EMPTY;
		}
		
		
		return board;
	}
	
	public void display_board(String[] board) {
		System.out.println("\t\t\t+-----------+");
		System.out.println("\t\t\t| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("\t\t\t+-----------+");
		System.out.println("\t\t\t| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
		System.out.println("\t\t\t+-----------+");
		System.out.println("\t\t\t| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
		System.out.println("\t\t\t+-----------+");
	
		
	}
	
	public int[] legal_moves(String[] board,int NUM_SQUARES,String EMPTY) {
		int[] moves = new int [NUM_SQUARES];
		
		for (int i = 0;i<NUM_SQUARES; i++) {
			if (board[i] == EMPTY) {
				moves[i] = i;
			}
			else {
				moves[i] = -1;
			}
		}
		return moves;
		
	}
	
	public int human_move(String[] board,int NUM_SQUARES , String EMPTY) {
		int[] moves = legal_moves(board,NUM_SQUARES,EMPTY);
		int move = -1;
		while (true) {
			move = get_number("Where will you move? (0-8)", 0, NUM_SQUARES);
				for(int x:moves) {
					if (move == x){
						return move;
					}
				}
				System.out.println("That square is already occupied.");
		}
		
	}
	public String next_turn (String turn) {
		if (turn == "X") {
				return "O";
		}
		else {
		return "X";
	}
}	
	public String checkWinner(String[] board, String EMPTY ) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			// top row
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2: 
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}
				
		}
	
	for (int a = 0; a < 9; a++) {
		if (board[a] == EMPTY) {
			break;
		}
		else if (a == 8) {
			return "DRAW";
				
		}
	}
	return null;
	}
	
	
	
	
	
	public TicTacToeAi() {
		String X = "X";
		String O = "O";
		String EMPTY = " ";
		String TIE = "TIE";
		int NUM_SQUARES = 9;
		int move;
		String win = null;
		
		
		intro();
		pieces(X,O);
		String[] board = new_board(NUM_SQUARES,EMPTY);
		int[] legal_moves = legal_moves(board,NUM_SQUARES,EMPTY);
		for(int var: legal_moves);
		
		String turn = "X";
		while(win == null) {
			display_board(board);
			if (turn == human) {
				move = human_move(board,NUM_SQUARES , EMPTY);
				board[move] = human;
			}
			else  {
				move = human_move(board,NUM_SQUARES, EMPTY);
				board[move] = computer;
			}
			
			win = checkWinner(board,EMPTY);
			turn = next_turn(turn);
		}
		display_board(board);
		System.out.println(win);
		
		
		
	
		//String[] board = new_board(NUM_SQUARES,EMPTY);
		//for(String var: board) {
		
		//}//System.out.println("Player is " + human);
		//System.out.println("Bot is " + computer);
		
		//int i = get_number("pick a number between 0-8",0,8);
		//System.out.println(i);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new TicTacToeAi();
	}

}
