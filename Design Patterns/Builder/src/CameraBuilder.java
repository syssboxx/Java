
public abstract class CameraBuilder {

	//=abstract builder
	protected Camera cam;
    
    public Camera getCamera(){
        return this.cam;
    }
     
    public void createNewCamera(){
        this.cam = new Camera();
    }
     
    public abstract void buildOpticalZome();
    public abstract void buildDigitalZome();
    public abstract void buildDisplay();
    public abstract void buildMemory();

}
