package Java10_EncapsulationDemo;

public class OOP_Encapsulation10 {

	public static void main(String[] args) {
	

	}
/*
 From last session we have seen few of the questions:
 Q.Can we overload a static method?
 =>of course we can overload a static method.
 
 Q.Can we overload the main method?
 =>yes we can overload the main method,but java will always check where exact signature is available.it will always go to that main method.
 It  means that main method always having name public static void main and one string parameter.
 
  Q.Can we do the object of some specific class in other class?
  =>yes we can do that.in different packages also we can see later.
  
  Q.What is mean by static variable and where  exactly it will be stored?
  =>It will always store inside CMM. It will be your meta space. It will always be there and its common memory allocation for all the objects.
  E.g:static int b=4;
  can we store the static method=>yes static methods also stored inside the metaspace/inside your common memory allocation.
  
  Q.Static variable and methods are the part of object?
  =>never. static variable and method will never be the part of object.Any work you are doing with respect to object it will never be a part of object.
  
  Q.Can I return multiple values from a function?
  =>yew we can in the form of Arraylist, in the form of some collection,in the form of static array.We can collect number of things together&then 
  we can do that.
  
  Q.Can we have multiple return statement inside the same function?
  =>one single function should have one single return statement at a time. I can have multiple return statement in the form of if-else condition or switch case statement ,
  but at a time function can return only and only one value.
  
  --------------------------------------------------------------------------------------------------------------------------------------------
 ENCAPSULATION:
 You have to explain what is actual meaning of encapsulation and why java has introduced this amazing feature?
 
 Q.What is encapsulation?
 =>encapsulation means wrapping/hiding something but what exactly you want to hide.If there is one class and in that having class variables and functions.
 so these variables I am making it private and these functions are available with public.These functions are calling internally to these private variables.
1st :
 I am creating a object of this class Test t=new Test(). Now tell me can i access t.these private variables inside other class.I cannot bcoz these 
 are declared with private access specifier. So any private property of the class i cannot access outside of the class.So where exactly I am going to create 
 the object.We are creating object  outside of the class.We are  not creating inside the class. Suppose There is a test class and having private variables 
 i.e private a; and created the object Test t=new Test();
 -There is a another class with the name Page. So can i access t.variable in page class .No we cannot this is the first thing.
 
 2nd:
 can i access these functions in page class which are public in nature. All the public methods i can easily access that. t.m1. This is exactly encapsulation we are achieving at class level
 
 -Encapsulation is saying you create one capsule. There is a private property of this class .It could be variables also or it could be methods also. 
 Then you have a public layer In this public layer you create number of methods.
 
 E.g:Laptop i can access the mouse and keybaord but cannot see the internal circuit,how many diods are there and ram size,mother board ,chip processing and 
 all the things Laptop guys have created one user interface keboard, monitor and mouse. you will access the monitor what exactly happening inside you should 
 not be bothered about it this is called encapsulation. same thing for ATM mmachine you just insert the card and get the money .You dont need to see internal 
 mechanism.
 
 ADVANTAGE:
 1)user friendly: user dont bother about internal structure
 2)Security :bcoz u dont have access to the implementation what kind of logic they have implemented
 
 Practical example explain at the time of interview:
 chrome is available on my machine and version is 90 suppose.i want to launch this browser and i just want to click on this browser icon to launch the browser.
 Internalyy  it will check which browser,which version is really compatible do you have enough ram space,do you have compatible with windows/mac machine
 do u need to upgrade this chrome or not.thare are multiple things internally you are doing it.If as a end user what is the public layer chrome icon and 
 end user will just click on it.internally what is happening is all private. do u really want to expose these methods to end user.they are not bother about 
 how exactly technically launching browser.
 
DEFINITION:
Q.If someone is asking u. What is encapsulation?
=>Encpasulation is one of the important feature of object oriented programming in java .Encapsulation is says that all your private properties should be warpped 
with public layer and these public layers could be anything  it may be geter and setter for the private variables also.It could be private methods which is
 wrapped by public method and should be exposed to user.Private methods and private variables cannot be exposed to user .User cannot access those things
but they can access these properties internally with the help of public layer .This is called encapsulation/data is encapsulated together in the form of private 
variables and the public layers.


  
  
  
 
 
 */
}

