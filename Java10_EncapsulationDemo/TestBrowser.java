package Java10_EncapsulationDemo;

import JavaProgram.Practice;

public class TestBrowser {
	public static void main(String args[]) {
		LaunchBrowser obj=new LaunchBrowser();
		obj.launcBrowser();
		
		
		
	}

	/*
	 I want to call the methods of LaunchBrowser so inside the main() I have to create the object of LaunchBrowser.The moment i write obj. It will show all the methods
	 i.e launchBrowser() ,checkRam() ,checkOsCompatible() and checkStorage(). So user is totally confused which method i have to access.If you give the complete 
	 open ATM machine to the specific user.Will you able to withdraw cash immediately? No, right . ATM machine is completely  open an you really dont know where you
	 want to insert the credit/debit card then how exactly iam getting the cash.Same thing overhere do I want to launch the checkRam() ,checkOsCompatible() or 
	 any other method.If i call the launchBrowser() it will call other methods one by one.
	 -It will print output:
	 checking RAM
     checkingOsCompatible
     checkStorage
     
     -How restrict these methods to expose to the user bcoz these all are decxlared as public.So we have to make them as private and i will make the
      launchBrowser() as public. So the moment i write obj. it will show the launchBrowser() only.So the user is clear to access the method.Think about the person who totally
     dont know the technical things they just want to go the google and search on the net.They will call the launchBrowser() and internall will call other methods
      
-Output:
Launch browser
checking RAM
checkingOsCompatible
checkStorage
Browser is launched

-



-is it a best practice creating class.bcoz every method is not important for the user.So you have to wrapp it.

Q.Any practical example?
=> Page object model is a pure example of encapsulation.If someone creating a POM without private varibles then its a violation of POM. In POM we are 
creating a private variable for login and accessing them via public methods.
	 
	 */
}
