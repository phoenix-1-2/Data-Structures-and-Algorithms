
public class Board {
	
	private char[][] board ;
	private int boardSize;
	private char player1Symbol,player2Symbol;
	private int countCells;
	public  static final int PLAYER_1_WINS = 1;
	public  static final int PLAYER_2_WINS = 2;
	public  static final int DRAW = 3;
	public  static final int INVALID = 4;
	public  static final int INCOMPLETE = 5;
	
	
	
	public Board(char player1Symbol,char player2Symbol) {
		this.boardSize = 3;
		board = new char[boardSize][boardSize];
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				board[i][j] = ' ';
			}
		}
		this.player1Symbol = player1Symbol;
		this.player2Symbol = player2Symbol;
		this.countCells = 0;
	}
	public int move(char playerSymbol,int x,int y) {
		if(x>=boardSize || y>=boardSize || x<0 || y<0 ) {
			return Board.INVALID;
		}
		if(board[x][y] !=' ') {
			return Board.INVALID;
		}
		
		board[x][y] = playerSymbol;
		countCells++;
		
		if(board[x][0] == board[x][1] && board[x][2]==board[x][1]) {
			return playerSymbol==player1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
		}
		if(board[0][y] == board[1][y] && board[0][y]==board[2][y]) {
			return playerSymbol==player1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
		}
		if( board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1] == board[2][2] ) {
			return playerSymbol==player1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
		}
		if( board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1] == board[2][0] ) {
			return playerSymbol==player1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
		}
		if(countCells==boardSize*boardSize) {
			return DRAW;
		}
		return INCOMPLETE;

	}
	public void print() {
		System.out.println("-------------");
		for(int i=0;i<boardSize;i++){
			for(int j=0;j<boardSize;j++) {
				System.out.print("| " + board[i][j] +" |" );
			}
			System.out.println();
		}
		System.out.println("-------------");
	}

}
