
public class AgressiveBehaviour implements Behaviour {

	@Override
	public int moveCommand() {
		System.out.println("\tAgressive Behaviour: if find another robot attack it");
		return 1;
	}

}
