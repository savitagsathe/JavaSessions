package Java10_EncapsulationDemo;

public class Company {
	
	private String name;//class variables
	private int empCount;
	private String hq;
    
	
	public String ceoName;//you dont need to create getter and setter bcoz for public we can access directly by object name. Getter and setter is always for private variables
	
	
	//first of all this is the ugly code writting the main method within the same class which we written in company class.
	/*public static void main(String[] args) {
		Company obj=new Company();
		obj.name="IBM";
		obj.empCount=100;
		obj.hq="mumbai";
		
	}*/
	
	
	//getter and setter methods--->always public in nature
	public String getCompanyInfo()//getter of gettiing all the company info
	{//this is also encapsulation combining 3 private var. into one method to get the info
	  String info=name+empCount+hq;
	  return info;
	}


	public void setName(String name) {//local variable
		this.name=name;//this.classvariable=local variable. By this keyword we can access only and only classvariable not the local variable
	}
	
	public String getCeoName() {
		
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}

	public String getName()
	{
		return name;
	}
	
	
	
}



/*I am defining one company template.In that having variable 
private String name;
private int empCount;
private String hq;

-I will make those variables private in nature by adding the private access specifier.
-can i create the Object of company class.

   Company obj=new Company();
	obj.name="IBM";
	obj.empCount=100;
	
	-see here i can access these variables easily obj.name="IBM";
	
	-So within the class it really doesnt matter your varibles are private/public.The actual issue will come when you try to access all the company properties
	outside of the class.Within the same class we access evrything.
	
	-We should not create the main method inside the template classes.This is just a calling method. We have to create a separate class and call these.
	I am going to create separate class i.e: TestComp
	
	-So here iam going to create getter and setter methods here.But its not way we have to create everytime getter and setter method.lets talk about 
	various ways of creating public layer.Setter and getter are the methods and these are the public in nature.Bcoz publicly they are create and publicly 
	they can be access outside of the class.
	 
	-How to create public setter and getter lets see 
	creating a method
	
    public void setName(String name) {}
	-this method is saying give me the string varible .
	-String name this is the local/global variable. This is the local bcoz it is the part of method and following are the global variables bcoz its class variables
	private String name;
	private int empCount;
	private String hq;
	
	-The same name we are pass to the local variables i  want to give to the global variables .So how will i do that
	if i am writing i.e name=name
	
	public void setName(String name) {
		name=name;
	}

is this a right statement?

-the scope of the class variable is throughout the class but the problem here is that class variable and local varible both are having the same name. i.s name=name
the moment you write :

public void setName(String name) {
		name=name;
	}
	
-java give you one warning here i.e The assignment to variable name has no effect. Its saying local variable is giving value to local variable. not the local->global variable.
Java says to solve this problem either you have to change the local variable name. i.e name1 .But if there is 10 variables then you have maintain name1,2,3,4,5,6,7...10
-This is not the good practice to maintain the variables like that.We always maintain the variable with the same name .What we have to do is at left hand side we have to use one keyword
i.e. this keyword.

Q.What do you mean by this keyword.
=> This keyword always refer to the current class object.

-how we are accessing the class variable. By creating the object we are accessing it. Same thing we don't have to create object  this keyword representing the
 current class object.i.e the company class object
With this current class object you can access all the class variables. What is the statement this.name=name; (this.class/global variable=local variable).
-using this keyword i can access only and only class properties.I cannot access any local variable.
-We have set the value by using set method,but how i can get the value.So we will create getter i.e. getName().This will not take any parameter. 
-see i cannot access obj .name in testComp class but we can access obj.setName.
-now i have a 3variables so how many getter and setter we can create
here 3 getter and 3 setter we have to create.So 6 methods you have to create.Instead of that there is a short cut to add setter and getter methods.
right click on it ->goto source->click on generate getters and setters.It will show for which private variable you have to create .its depend on you 
its not compulsary for every variable you have to create it
-whenever you are set you have to pass the variable and whenever you get you have to return it.
-Its not a compulsary to use setter and getter everytime. What if i want to write:



-for public variable we dont have to create the seter and getter method.you have direct access for it.
-Its not compulsary to always follow the getter and setter. If I want to change the name of the method we can change.If we compbine 3 private 
variable with one public layer. This is also encapsulation.call this into the TestComp1 class. You have to exactly write same local and class variable name.

public String getCompanyInfo()
{
String info=name+empCount+hq;
}	

*/