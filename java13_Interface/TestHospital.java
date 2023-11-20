package java13_Interface;

public class TestHospital {
	public static void main(String args[]) {
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.dermaServices();
		fh.emergencyServices();
	    fh.medicalInsurance();
	    fh.medicalTraining();
	}

}
