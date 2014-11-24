
public class MacOsFactory implements AbstractButtonFactory{

	@Override
	public Button createButton() {
		System.out.println("Creating MAC OS  button...");
		return new MacButton();
	}

}
