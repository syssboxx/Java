
public class NormalBehaviour implements Behaviour{

	@Override
	public int moveCommand() {
		System.out.println("\tNormal Behaviour: if find another robot ignore it");
		return 0;
	}

}
