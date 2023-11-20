package Java10_EncapsulationDemo;

public class LaunchBrowser {
	
	public void launcBrowser() {
		System.out.println("Launching browser");
	    checkRAM();
		checkOSCompatible();
		checkStorage();
		System.out.println("Chrome is launched");		
	}
	private void checkRAM() {
		System.out.println("checking RAM");
	}

	private void checkOSCompatible() {
		System.out.println("checkingOsCompatible");
	}
	
	private void checkStorage() {
		System.out.println("checking storage");
	}

	



}

/*
 1)here do I need to create object to access the checkRam or any other method when the main method is not present?
 =>no bcoz all the non static methods will get called by each other internally
 
 2)If I write the main() and i want to access all these methods in that then do I nedd to create the object to access them?
 =>We have to create the object why bcoz the main method static in nature 
 non static methods can be called within the class internally no need to create the object.E.g i can call the checkRam()inside the launchBrowser() method directly.
 
 
 What is the problem with this above code? I am creating a new class i.e TestBrowser and this class is having the main method and i want to call the methods 
 of launch browser class. The moment I write obj. all the methods i can see .What should I do?I have to make the checkRAM,checkOSCompatible and checkstorage method 
 as private it gets call inside the launchbrowser mathod internally. So i have to create the object of this class inside the TestBrowser class.The moment I write
 obj. I will get only access to the launchBrowser. I just want to launchbrowser internally what is happening i really dont bother about it.
 
 
 
 
 

 */