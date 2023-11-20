package Java10_EncapsulationDemo;

import JavaProgram.Practice;

public class LoginTest {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.setUserName("savita123@gmail.com");//post API
		lp.setPassword("savita123$");
		
		//System.out.println(lp.getUsername());
		//System.out.println(lp.getPassword());
		
		lp.doLogin(lp.getUserName(), lp.getPassword());//get API
		//advantage is that lets see this is 1st user.For 2nd user we can create using same template
		
		//2nd user:
		/*LoginPage lp1=new LoginPage();
		lp.doLogin(lp1.getUsername(), lp1.getPassword());
		output will be 
		savita123@gmail.com:savita123$
		null:null    so we have to set the value*/
		
		LoginPage lp1=new LoginPage();
		lp1.setUserName("savit123@gmail.com");
		lp1.setPassword("savi123$");
		lp1.doLogin(lp1.getUserName(),lp1.getPassword());
		
		//3rd use case: if 1st user want to update the password
		lp.setPassword("savita2019");//this is the advantage you will get you can update also. put API
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		
		
		lp.doLogin(lp.getUserName(), lp.getPassword());


	}

}
