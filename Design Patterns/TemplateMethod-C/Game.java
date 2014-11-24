package lesson27_Templatemethod;

public abstract class Game {

	private Player playerOne;
	private Player playerTwo;
	
	public final Player play(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		
		while (!isGameOver()) {
			goToNextMove(playerOne, playerTwo);
		}
		
		return determineWinner();
	}
	
	private boolean isGameOver() {
		return true;
	}
	
	private Player determineWinner() {
		if (playerOne.getScore() > playerTwo.getScore()) {
			return playerOne;
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			return playerTwo;
		}
		
		return null;
	}
	
	protected abstract void goToNextMove(Player one, Player two);
}
