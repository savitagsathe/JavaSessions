package java11_ConstructorConcept;

public class Employee {
	//We cannot create same name multiple classes within same package but allows in different package
	//What is constructor?
	//Construc.... is having the same name as the class name(constr cannot have any random name but function can have any random name.Constructor should be defined with class body)
	//construc....doesnt have any return type(no void/ any return .If we write void it will not give any error but this is not good coding)
	//but function may or may not return
	//Consr.....is not a function. 
    //Const... can be overloadded
	//Constructor will be called when you create the object of the class.
	//constru.....wil help to create the type of object
	//with constructor you can avoid creating of unnecessary objects
	//bussiness logic/feature should be defined within the functions/methods.never write inside the constructor
	//duplicate consructor are not allowed
	
	//Constructr overloading
	public  Employee(){//0 parameter means----default cons...
	System.out.println("default cons..");	  
	  }
	
	  public Employee(int a){//1 parameter cons...
	  System.out.println("1 param constructor...."+a);
	  }
	  
	  public Employee(int a, String b){//2 parameter cons...
		  System.out.println("2 param constructor...."+(a+b));

	  }
	 
	  public static void main(String args[]) {
		  Employee e1=new Employee();//it will call default cons
		  Employee e2=new Employee(10);//it will call 1 param constructor
		  Employee e3=new Employee(10,"Savi");// will call 2param cons..
		 // Employee e4=new Employee(10,10); give error bcoz respective cons.. is not present
		  
	  }

	
	
/*
 Dont you thing we have created the same class as "Employee" in the other package.So can i create one more "Employee" class in the same package?
 =>I cannot create the same class in same package.If you try to create one more class "Employee" under ConstructorConcept package  where "Employee"
 class is already available then i cannnot create one more "Employee" class under the same package. But the same name calsses can be created in different 
 packages. Thats why able to create Employee class overhere.If you try to create the one more Employee class in this package it will give you error.
 
 
 Q.What is constructor?
 //Construc.... is having the same name as the class name
  constructor cannot have any random name.Function can have any name whatever customize function name you can give.But constor have restricted should have name as class name
  //Cons....doesnt have any return type
   It means do i need to write any void here => No.Constructor dont have any return type no void and no return
   
   //Consr.....is not a function. 
   //but function may or may not return
    So it will never return anything but,function can return.yes function can return but function may or may not return.But for constructor there is allways no return
    //Const... can be overloadded
    
   
  Q.How to define constructor?
  =>
  public Employee(){
  
  }
  
  
 if you try to write Will it give error?
 public void Employee(){
  
  }
  =>no it will not give any error bcoz it will behave like a function now. The moment if you see any return type before class name you will get to know this is a function
  but,if you consider it as function its a bad practice.Bad means employee is a class name and the same name we are giving to method/function. Althogh its not giving 
  you any error it will give you warning  "This method has a constructor name". This means its looks ugly and java doesnt like this.Do not follow this practice.
  
 Q.Can I overload the Constructor?
 =>of course we can overload the constructor.Duplicate constructor is not allowed means creating exactly same 2 same constructor.
 
 public Employee(){
  
  }
  public Employee(){
  
  }
 although its a method overloading but we have to differentiate by passing differeent parameters
 public Employee(){//0 parameter means----default cons...
  
  }
 public Employee(int a){//1 parameter cons...
	  
	  }
	  
	  public Employee(int a, String b){//2 parameter cons...
	  
	  }
	  
	  
	  Q.How to call function and how to call constructor?
	  =>Very minute difference you have to understand that the function will be called By creating an object& with the help of object ref.varaiable 
	  we have to call the functions but how we can call constructor?
	  Constructor will be called when you create the object of the same class.
	  
	  Q.Who will call the constructor?
	  =>never say constructor will be
	   called by the object.you are not using any object ref. to call the constructor.this object ref. you have to use
	  to call the function.Constructor will get called by java the moment you create the object of the class.
	  
	  
	  
	  
	  
	  
 */
}
