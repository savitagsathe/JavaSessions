package java13_Interface;

public interface USMedical {
	/*public void physioServices() {//method body not allowed in interface give error Abstract methods do not specify a body.So we have to give 
	 only method declaration.
	 }*/
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	public void dermaServices();
    public void emergencyServices();
}
