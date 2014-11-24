
public class DefensiveBehaviour implements Behaviour {

	@Override
	public int moveCommand() {
		System.out.println("\tDefensive Behaviour: if find another robot run from it");
		return -1;
	}

}
