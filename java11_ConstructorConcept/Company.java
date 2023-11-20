package java11_ConstructorConcept;

public class Company {
	
	private Company() {
		
		
	}
	
	/*
	 Q.Can I create constructor private in nature?
	=>Whenever we create the object of this in the TestUser classs it will show the error "The constructor Company() is not visible"
	 Whenever you have requirement to restrict the object creation of the particular class.Make that constructor private in nature.
	 In selenium we dont have such usecase.
	 -real time usecase suppose Iam a java developer developing some feature but its not completed fully and deployed to the production by mistake.So the company 
	 page is deployed so the user can start creating the page .So we have to make the company constructor private in nature so the user cant access features/functions
	  of the class.Once the feature is reay then we can make it public.
	 -So the usecase of private constructor is that the complete restriction of creating the object of the class.
	
	 */

}
