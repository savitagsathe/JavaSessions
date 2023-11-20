package java12_Inheritance_13MultipleInheritanceDiamondproplem;

public class Car extends Vehicle {
	int speed=100;
	public void start() {
		System.out.println("Car----Start");
		
	}
	
	public void stop()
	{
		System.out.println("Car----Stop");
	}

	public void refuel() {
		System.out.println("Car--------Refuel");
	}
	
	public static void getName() {
		System.out.println("Car---getName");
	}
	
	
	/*
	 What is inheritance?
	 
	 =>Inheritance means inherit the properties from your parent.Child can inherit the properties form parents,garnd parents, grand to grand parents.
	 
	E.g: Car is a parent class and having 3 sub classes BMW,Audi and honda.Parent class have 3 properties .So the child class can directly access these 3 properties of parent
	 they dont need to create these features once again.
	-BMW child is also having its own 3 features. So total 6 features child have.Same for Audi and Honda.
	-So remember BMW is inheriting the properties from Car.So child can accesss the properties from parent but parent cannot inherit from child.
	
	
	
	Q.can siblings inherit the things means audi,BMW and honda with each other?
	=>siblings inheritance not allowed in java.
	
	Q.Now I have one more class here that is Truck and its having its own features.Can BMW be the child of truck?Its already a child of Car and having 
	already parent.	can BMW have one more parent as a truck is this allowed?
	=>No this is not allowed.This is called multiple inheritance in java. It wil create a diamond .This is called a diamond problem means multiple inheritance.
	This is not allowed in java at all in the form of class to class. But we can achieve in the form of interface.
	
	What do you mean by multiple inheritance?
	=>multiple inheritance means having a multiple parent for one child creating a diamond this is called multiple inhectance in java.
	
	Can we achieve multilevel inheritance in java?
	=>Its allowed in jave.Multilevel means level by level. Lets see car is having parent vehicle having automobile having Mechanical. 
	
	-If car is having its own method and BMW is saying fine i cannot access your method its a very old.We want to enhance this feature in BMW.
    Car is having key start but BMW is saying we want automatic start .This is called method overiding .It means iam not going to inherit your
    methods iam going to override that method.
    
    -So the there is difference between inherited and overridden method .They both are coming from parent to child only but,i can inherit the properties
     form the parent  means inheritance .If i dont like the properties of parent i will create my own this is called method overriding.Child can 
     override all the features from the parent but parent cannot override the features from the child.parent cannot access anything form the child 
     they cannot inherit and override also.
    -At the child level there are 3 methods remember:
    1.Inherited methods
    2.overridden methods
    3.indivisual methods
    
    -This is the main crucks of OOPS
   ---------------------------------------------------------------------------------------------------------------------------------------------------
  Q.  Can i do the following method as final
   public final void start() {
		System.out.println("Car----Start");
		
	} 
	=> yes Final method cannot be overriden. there r 2 usecases for final. The moment i made my method as final that means this method i cannot ooverride
	
	ii)Final class cannot be inherited.this is the 3rdd variation of final
	//final is used to prevent inheritance/method overriding
	 
	 Practical example:
	 I want to design a webpage class and in that i create the logo method and i want all the child classes homepage,login page each and everyone they are 
	 not allowed to  overload this method final Logo.Dont you think its really good example final keyword with method.otherwise homepage will extend page class 
	 and  homepage will start to override. it means any java developer can change the logo on homepage,serach page have different logo, registration page have
	  different logo is it a good practice . No entire application we should have a common logo.Thats why when i declare this page class.
	  I will declare a this method with a final keyword.It means no one  can override.
	 
	 E.g 2: Footer link and privacy policy at the bottom is common for all the pages.no one can change privacy policy link
	 
  -----------------------------------------------------------------------------------------------------------------------------------------------------
  Q.Can we override static methods?
  =>first tell me can I overload the static method? overloading allowed but staic method never be overridden.
	public static void getName() {
		System.out.println("Car---getName");
	}
	
	-Same method write in BMW.java with @override annotation it will give error."The method getName() of type BMW must override or implement a supertype method".
	
	If i removed @override from the BMW is it allowed =>yes its allowed bcoz its a separate/indivisual method of BMW which is static in nature.
	So this concept is not called method overriding but this concept is called method hiding.You cannot override the static method from parent to child but
	child can have exactly same method inside the child classs just like the parent class but this is just like the method overiding this is called method hiding.
	-So method hiding is achieved at static level.static method cannot be overridden,but overloading is allowed.
	
	Q.I want to call BMW getName() which is static in nature.How will i call?
	=>By the class name we can call it BMW.getName(); So BMW method will get called.When I want to call Car class method.Car.getName().So car class method get 
	called.
	
	Q.Can I inhert the static method from car into BMW
	=>static method can be inherited but cannot be overridden.Parent property i can inherit whether it is static or non static
	
	Q.I declared speed variable in Car class can i inherit it?
	=>yes.System.out.println(b.speed);
	-now same variables declaring into BMW class. means its not a variable overriding. At the runtime java will take BMW speed if there no any it will inherit from the parent
	
	Q.Now i want to restrict all the car should have maximum speed 100 only.What should i do ?
	=>suppose in the parent class(car) i declared int final speed=100; and in the child(BMW) int speed =200; 
	calling syso(b.speed); //output 200 henceproof varibes cannot overridden its have its individual variables.
	
	now comment BMW int speed =2
	00; what will be the output calling syso(b.speed);//100 inherited from parent
	but now BMW says i will make b.speed=200; //this is ot allowed bcoz its final in parent noone can change this.it want to enable you should have your own.
	
	can i make int static final speed=100; //you can do and access with class name
		
	----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	

	 */
}
