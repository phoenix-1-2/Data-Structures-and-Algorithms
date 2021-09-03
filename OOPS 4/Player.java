
public class Player {

	private String playerName;
	private char playerSymbol;

	public Player(String playerName,char playerSymbol) {
		setPlayerName(playerName);
		setPlayerSymbol(playerSymbol);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		if(playerName!=" " || !playerName.isEmpty())
			this.playerName = playerName;
	}

	public char getPlayerSymbol() {
		return playerSymbol;
	}

	public void setPlayerSymbol(char playerSymbol) {
		if(playerSymbol!=' ')
			this.playerSymbol = playerSymbol;
	}
}
