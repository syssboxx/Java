
public class CameraMaker {

	// = Director
	
	private CameraBuilder camBuilder = null;
    
    public void setCameraBuilder(CameraBuilder camBuilder){
        this.camBuilder = camBuilder;
    }
     
    public Camera getCamera(){
        return this.camBuilder.getCamera();
    }
     
    public void constructCamera(){
        this.camBuilder.createNewCamera();
        this.camBuilder.buildDigitalZome();
        this.camBuilder.buildOpticalZome();
        this.camBuilder.buildDisplay();
        this.camBuilder.buildMemory();
    }

}
