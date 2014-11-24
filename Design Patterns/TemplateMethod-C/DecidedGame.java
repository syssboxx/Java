package lesson27_Templatemethod;

public class DecidedGame extends Game {
	@Override
	protected void goToNextMove(Player one, Player two) {
		one.setScore(one.getScore() + 1);
	}
}
