import java.util.Scanner;

public class TicTacToe {

	private Player player1,player2;
	private Board board;

	public void startGame() {
		// taking player input
		Scanner scanner = new Scanner(System.in);
		player1  = takePlayerInput(1);
		player2 = takePlayerInput(2);
		while(player1.getPlayerSymbol() == player2.getPlayerSymbol()) {
			System.out.println("Player-2 Symbol Already Taken!! Pick Another One!!");
			char symbol = scanner.next().charAt(0);
			player2.setPlayerSymbol(symbol);
		}
		// board set up
		board = new Board(player1.getPlayerSymbol(), player2.getPlayerSymbol());
		
		// 
		int status = Board.INCOMPLETE;
		boolean player1Turn = true;
		while(status==Board.INCOMPLETE || status == Board.INVALID) {
			
			if(player1Turn) {
				System.out.println("Player-1 " + player1.getPlayerName() +"'s Turn:");
				System.out.println("Enter x:");
				int x = scanner.nextInt();
				System.out.println("Enter y:");
				int y = scanner.nextInt();
				status = board.move(player1.getPlayerSymbol(), x, y);
				if(status!=Board.INVALID) {
					board.print();
					player1Turn=false;
				}
				else {
					System.out.println("Invalid Move!! Please Try Again");
				}
				
			}
			else {
				
				System.out.println("Player-2 " + player2.getPlayerName() +"'s Turn:");
				System.out.println("Enter x:");
				int x = scanner.nextInt();
				System.out.println("Enter y:");
				int y = scanner.nextInt();
				status = board.move(player2.getPlayerSymbol(), x, y);
				if(status!=Board.INVALID) {
					board.print();
					player1Turn=true;
				}
				else {
					System.out.println("Invalid Move!! Please Try Again");
				}
				
			}
			
		}
		if(status==Board.PLAYER_1_WINS) {
			System.out.println("Player-1 "+ player1.getPlayerName() +" wins!!" );
		}else if(status==Board.PLAYER_2_WINS) {
			System.out.println("Player-2 "+ player2.getPlayerName() +" wins!!" );
		}
		else {
			System.out.println("Draw !!");
		}

	}

	public Player takePlayerInput(int num) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Player-"+num+"'s name :" );
		String playerName = scanner.nextLine();
		System.out.println("Enter Player-"+num+"'s symbol :" );
		char playerSymbol  = scanner.next().charAt(0);
		return new Player(playerName, playerSymbol);
	}
}
