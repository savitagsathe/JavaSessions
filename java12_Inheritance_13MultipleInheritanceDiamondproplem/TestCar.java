package java12_Inheritance_13MultipleInheritanceDiamondproplem;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.stop();//inherited method
		b.refuel();//inherited method
		b.start();//overridden method
		b.autoParking();//individual method
		BMW.getName();
		Car.getName();
		
		System.out.println(b.speed);
		
		
		Car c=new Car();
		c.start();//parent class start() get called bcoz dont have child class access to parent
		c.stop();
		c.refuel();
		//c.autoparking(); not allowed its indivisual() of BMW not exposed to others
		
		//child class object can be refered by parent class ref. variblae
		new BMW();
		//can i write=>yes .This is called top casting.converting small box to large its top casting
		Car c1=new BMW();
		c1.stop();
		c1.refuel();
		c1.start();//which method will call praent/child?child class always preference and we r driving the BMW not Car.So BMW start() get called
		//c1.autoParking();//not allowed to parent class its individual() of BMW
		
		//DOwnCasting:parent object can be referred by child class ref.variable
		
		//BMW b1=new Car(); Error: Type mismatch: cannot convert from Car to BMW.every car is a BMW this is wrong statement
		//BMW b2=(BMW) new Car();//type cast into BMW will give error:Type mismatch: cannot convert from Car to BMW
		//converting big box to small its down casting.Here we are cutting big box into small and putting into small box but its changing the state of the object
		//thats why its not giving compile time error but giving runtime.so we never use downcasting.there is no such usecase for downcasting.It will always 
		//give classCastException

	
		BMW b2=(BMW)new Car();
		//multiple inheriitance
		c.engine();
		//child class object can be reffered by grand parent class ref variable
		Vehicle v1=new BMW();
		//v1.start();//start() cant access bcoz parent cant access child properties
		v1.engine();
		
		//downcasting at compile time with grand parents-forcefully converting vehicle into BMW
		BMW b3=(BMW)new Vehicle();//compile allowed but runtime will throw classCastException
		
		//siblings inheritance 
        Audi a=new Audi();
        a.childlock();
        a.start();
        a.stop();
        a.refuel();//all the above are inherited method from parent
        //a.autoparking()//cant access bcoz this BMW sibligs () cant access
        //b.childlock()//cant access bcoz its a feature audi which is sibling
        
        //casting between siblings
        //BMW b3=(BMW)new Audi();//compile time also not allowed downcasting between siblings.Means castion between sibling not allowed at all
	}

}
/*
 
 Q.here which start() will get called Car class or BMW?
 =>The preference always given to the child class methods.So here BMW's method get called.
 
 -This is called overridden method.In car class iam having a start() and In BMW also iam having Start().First of all what is the need of this .BMW says i dont like your start
 method its quite outdated and we are providing auto start().We will write the businesss logic accordingly.We are not going to use parent class start().
 thats why it is the overridden method i have written.
 
 -There one technique to check the overridden method
 Write @override annotation .If it is not giving any error then its overridden method. 
  @Override
	public void start() {
		System.out.println("bmw----------start");
	}

- It is not compulsary to use this annotation.It is always good practice to write it bcoz if someone is checking your code they will immediately get to know this is the 
overridden method from parent class


Q.Can i call b.autoparking() here
=>of course we can bcoz its a individual method of BMW.

-now i told you yesterday there are 3 types of methods 1)individual 2)inherited and overridden method
        b.stop();//inherited method
        b.refuel();//inherited method
        ->means inherit parent class method no need to write agian same method
        
		b.start();//overridden method
		->overridden means in dont like your method i will implement new feature overhere
		
		b.autoParking();//individual method
		->indepenedent/separate method of BMW
		
Q.Can I create the object of car class?
=>yew we can
Car c=new Car();
c.start();
which start() will get called.Here parent cannot take any property form child .So car having its own start() and it will get callled.

following methods are accessible bcoz they are parent class methods
c.stop();
c.refuel();

but can i access c.autoparking ?
=>no bcoz BMW did lot of hardwork to do it .So it will not exposed to others. So parent cannot access any property of child.Strictly not allowed in java.

Q.Can we create child class object without any reference?
new BMW();
=>yes
java says fine child class object can be refered by parent class ref. variblae
Car c1=new BMW();//child class object refered by parent class ref.varible like WEbDriver driver=new ChromeDriver();

-in java this is called top casting.

Q.What do you mean by Top casting?
=>child class object refered by parent class ref.varible

       Car c1=new BMW();
		c1.stop();//parent class method call
		c1.refuel();//parent class method call
		c1.start();//which method will call praent/child?child class always preference and we r driving the BMW not Car.So BMW start() get called
		c1.autoParking// can i access autoparking?
		=>I cannot .Autoparking is not accessible to parent class but why .Waht is the reason?
		-stop() and refuel are inherited so its allowed
		-start() is ooverridden() so its allowed
		-autoParking is individual() .So java will apply security check on this this is called ref. type check.
		
DownCasting:
parent class object can be reffered by child class ref. variable.
//new car();


		


*/