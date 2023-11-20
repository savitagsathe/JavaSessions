package java11_ConstructorConcept;

public class TestUser {
	public static void main(String args[]) {
		//User u1=new User();//giving error bcoz in user i dont have any defualt cons..The constructor User() is undefined
		User u1=new User("savi",34,"Pune");//error gone match the signature
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.getCity());
		u1.setName("Tom");
		System.out.println(u1.getName());
		
		//Company comp=new Company();
	
	}

}

/*
User u1=new User();//giving error bcoz in user i dont have any defualt cons..The constructor User() is undefined
The biggest advantage of constructor here is we cannot create any random objects.Whenever you want to create the object you have to certain value.
respective constructor will be called.

So the following private variables how we can access here.So what should i do?
    private String name;
	private int age;
	private String city;
	
the moment I write u1. i.e 	System.out.println(u1.);
i cannot see the private properties.

Do I need to create getter and setter together or only getter?
=>I have to create only getter .So can I say constructor is working as setter for me. now create getter metghod in user classs
	
-Now when i try to capture u1.getName() i can access that

What will be the output at line number 7?
=>you will get savi as output

This is the biggest advantages of construtor it will help you to create the what type of object you want to create.Otherwise end user will start creating 'n'
number of objects without passing anything.Whenever you want to cfeate the object you have to pass certain informastion to me .Waht type of information taht 
i have already defined in my user class template.So this constructor will behave like a template for me for the object creation.
It mrans what type of object you want to create name and age otherwise it wont allow you to create the object of this class.
Waht exactly java devlopers do whenever they want to create the cons..

Q.Why we are using constructor?
=>Constructor will help to create the type of object. you can avoild creating unnecessary objects

Q.Can I have my business logic inside the constructor?
=>most of the people write business logic inside the constructor.can i write the registration/logout feature inside the constructor.It looks so ugly.
The business logic/feature should be defined function.
Consructor will help you to perform certain things E.g:If you want to set up any class variable,If you want to call your parent class constructor.with the help 
of constructor we can do.

-The constructor will help me to achieve the encapsulation.Yesterday we see encapsulation in the form of private variables are getting accessed by public
 getter and setter
today these variables we are going to set via constructors and these constructors are public in nature so anyone can create the object of that particular class
and internally we are assigning the value.So the constructor is helping me et the class variables.So can we achieve getters with constructor?=>no you need a getter

Q. is it compulsary to create a setter if you have already created constructor in your class ?
=>we dont need .We can omitsetter methods.if you want you can do it.but can we avoid getters?=>wwe cannot avoid getters.otherwise how will you get the values 
bcoz these are private in nature you cannot access directly.You need atleast one public getter to get them.

-now i will create a one setter in user class.What is the practical usecase for this.
public void setName(String name) {
		this.name=name;
	}
	=>suppose the user savi want to update her name how it will do.With the put call if you understand RestAPI .Do you have any mechanism if you dont have setter.
	bcoz with the help of constructor i cannot update it now .So in this case I have to change the name savi->tom.So i hhave to call setName mathods
	u1.setName("Tom")
	System.out.println(u1.getName());
	output: Tom
	
	-We can omit setter methods its depends on your usecase but sometime we see people have created constructor ans setter also. Constructor is one time activity 
	when you are trying to create it user later on when you want to update you can use setter methods.
	
	Q.Can you omit the Constructor and supply getter and setter only?
	=>No its not a good practice bcoz otherwise how will you restrict it.If you dont create the constructor the default constructor will always be there
	it means you are trying to create 'n'  number of objects unnecessary.Problem with this when you give the liberty to user, user is not trying to set anything
	and you have varibles 100 varibles. so its a unnecessary memory wastage.We can mould the application but what is the best practice in terms of memory 
	utilization that is important.
	
	


*/