
public abstract class Game {

	  //template method - game logic
	   public final void play(){

	      initialize();

	      startPlay();

	      endPlay();
	   }
	   
	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();
}
