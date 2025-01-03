package test2;

public class Player implements Comparable<Player> {

	int playedId;
	String playerName;
	
	
	public Player(int playedId, String playerName) {
		super();
		this.playedId = playedId;
		this.playerName = playerName;
	}

	
	public int getPlayedId() {
		return playedId;
	}


	public void setPlayedId(int playedId) {
		this.playedId = playedId;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	@Override
	public String toString() {
		return "Player [playedId=" + playedId + ", playerName=" + playerName + "]";
	}


	@Override
	public int compareTo(Player o) {
		
		return this.playedId - o.playedId;
	}
	
	
	
}
