import java.util.Comparator;
import java.util.PriorityQueue;


public class PatientQueueTest {

	public static void main(String[] args) {
	    PriorityQueue<Patient> patientQueue = new PriorityQueue<Patient>(10, new Comparator<Patient>() {
	        public int compare(Patient patient1, Patient patient2) {
	            return (patient1.isEmergencyCase() == patient2.isEmergencyCase()) ? (Integer.valueOf(patient1.getId()).compareTo(patient2.getId()))
	                                                                              : (patient1.isEmergencyCase() ? -1 : 1);
	        }
	    });

	    patientQueue.add(new Patient(1, "Patient1", false));
	    patientQueue.add(new Patient(2, "Patient2", false));
	    patientQueue.add(new Patient(3, "Patient3", true));
	    patientQueue.add(new Patient(4, "Patient4", false));
	    patientQueue.add(new Patient(5, "Patient5", true));

	    System.out.println();
	    System.out.print("Doctor's waiting for patients  : ");
	    while(true) {
	        Patient currentPatient = patientQueue.poll();
	        if(currentPatient == null) {
	            break;
	        }

	        System.out.print(currentPatient.getName() + " <-- ");
	    }
	    System.out.println();
	}

	
	
}
