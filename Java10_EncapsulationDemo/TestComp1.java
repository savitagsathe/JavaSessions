package Java10_EncapsulationDemo;

import JavaProgram.Practice;

public class TestComp1 {

	public static void main(String[] args) {
		//any private var. we cant access outside the class so accessing via setter and getter()
		Company obj=new Company();
		 
		obj.setName("Syntel");
		obj.setEmpCount(100);
		obj.setHq("pune");
		obj.ceoName="mayur";
		 
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpCount());
		System.out.println(obj.getHq());
		System.out.println(obj.ceoName);
		
		System.out.println(obj.getCompanyInfo());
		
		
		}

	
	
	
	/*
	 now here 
	 Q.can i access company class obj.name?
	 =>Any private property i cannot access outside the class this is the first thing.
	 
	 Q.Then how can access private varibles outside the class?
	 =>first of all this is the ugly code writting the main method within the same class which we written in company class.So commenting that.Within the class
	 we can access anything private,public,protected
	 
	 Q.can i 
	 
	 */
}
