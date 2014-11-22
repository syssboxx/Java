
public class Patient {

	private int id;
    private String name;
    private boolean emergencyCase;

	public Patient(int id, String name, boolean emergencyCase) {
	    this.id = id;
	    this.name = name;
	    this.emergencyCase = emergencyCase;
	 }

	/**
	 * @return the id
	 */
	public int getId() {
	    return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
	    this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
	    return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
	    this.name = name;
	}

	/**
	 * @return the emergencyCase
	 */
	public boolean isEmergencyCase() {
	    return emergencyCase;
	}

	/**
	 * @param emergencyCase the emergencyCase to set
	 */
	 public void setEmergencyCase(boolean emergencyCase) {
	    this.emergencyCase = emergencyCase;
	 }


}
