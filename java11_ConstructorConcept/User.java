package java11_ConstructorConcept;

public class User {
	private String name;
	private int age;
	private String city;
	
	//constru.. is helping to set the class vars like setter
	public User(String name, int age, String city) {//full parameterized constructor
		//this.class var= local var
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity() {
		return city;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	/*
	- Lets see for eccommerce site I want to handdle the user and having variables 
	 private String name;
	private int age;
	private String city;
	
-now create the constructor. right click on the eitor->source->generate constructor using fields means using class var.->select how many con.. you want to create select the fields.
-This keywork is used to initialize the class variable into the methods/constructors	
	 */

}

