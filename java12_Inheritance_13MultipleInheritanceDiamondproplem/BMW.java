package java12_Inheritance_13MultipleInheritanceDiamondproplem;

//public class BMW extends Car, Truck{ multiple inheritance not allowed bcoz BMW already have CAr parent another truck cant be have him
	public class BMW extends Car{
	int speed=200;
	
	@Override
	public void start() {
		System.out.println("bmw----------start");
	}

	public void autoParking() {//seprate feature of bmw
		System.out.println("bmw------------autoParking");
	}
	
	/*public static void getName() {
		System.out.println("Car---getName");
	}*/
}


/*
Q.What method overriding if someone is asking you?
=>Method overriding will happen between parent and child. Yuo cannot achieve it into same class that is the overloading concept.
Method overriding says that when you have a method in the parent class and the same method in child class with
1.with the same name
2.with same number of parameters+same type of parameter+with same sequence of parameters
3.with the same return type
-Method overriding also called Plymorphism bcoz same method having diffrent forms but, what type of polymorphism?
=>this dynamic/runtime polymorphism bcoz copiler is not executing it at the runtime 

Eg: If i write 
car.java
public void start(int a) {
		System.out.println("Car----Start");
	}
	

BMW.java
public void start() {
		System.out.println("Car----Start");
	}
	//BMW will start givenig error bcoz start() should be zero parameterized
	  "The method start() of type BMW must override or implement a supertype method"
	 
	
3.The same return type
If write in car.java
	
	public int start(int i) {
		System.out.println("Car----Start");
		return i ;
	}
	
BMW.java
public void start() {
		System.out.println("Car----Start");
	}
	
	Is it not a method overriding. No bcoz number of argument  should be same in BMW then it will become overriding
	
	
	
A]If write in car.java
	
	public int start(int i) {
		System.out.println("Car----Start");
		return i ;
	}
	
BMW.java
public void start(String a) {
		System.out.println("Car----Start");
	}
	
	Is it not a method overriding. No bcoz return return type is string and in another its a integer
	
	
B]If write in car.java
	
	public int start(int b,String a) {
		System.out.println("Car----Start");
		return i ;
	}
	
BMW.java
public void start(String a,int b) {
		System.out.println("Car----Start");
	}
	
	Is it not a method overriding. No bcoz argument sequence is different. int b,String a  and 	String a,int b
	

Q.What is Polymorphism if someone is asking you?
=>you should always explain method overloading and ovrriding bcoz these are coming under polymorphism.
*/