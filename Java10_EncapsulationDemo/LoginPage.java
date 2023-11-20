package Java10_EncapsulationDemo;

public class LoginPage {
	private String userName;
	private String password;
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println(un +":"+ pwd);
	}
	
	
}
