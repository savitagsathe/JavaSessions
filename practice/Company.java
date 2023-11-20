package practice;

public class Company {
	private Company() {
		System.out.println("default constructor...");
	}
	
	public Company(int a) {
		System.out.println("one parameter constructor"+a);
	}
	public Company(int a, String b) {
		System.out.println("2 param const..."+(a+b));
	}
	
	public static void main(String args[]) {
		Company com=new Company(10,"savi");
		Company com1=new Company(10);
		//Company com3=new Company(10,20);
	}
}
