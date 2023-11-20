package java13_Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical {

	@Override
	public void physioServices() {
		System.out.println("FH-----physioServices");
		}

	@Override
	public void oncologyServices() {
		System.out.println("FH-----oncologyServices");
}

	@Override
	public void dentalServices() {
		System.out.println("FH-----dentalServices");	
	}

	@Override
	public void dermaServices() {
		System.out.println("FH-----dermaServices");	

		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH-----pediaServices");	
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH-----cardioServices");	
		
	}

	@Override
	public void nueroServices() {
		System.out.println("FH-----nueroServices");	
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH-----orthoServices");	
		
	}

	@Override
	public void entServices() {
		System.out.println("FH-----entServices");	
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH-----emergencyServices");	
		
	}
	//Indivisual methods
	public void medicalInsurance() {
		System.out.println("FH-----medicalInsurance");	
		
	}
	public void medicalTraining() {
		System.out.println("FH-----medicalTraining");	
		
	}



	
}
