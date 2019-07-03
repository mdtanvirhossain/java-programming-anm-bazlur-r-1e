package programming.practice.chapter6.oop.ATM;

public class ATM {
	
	private String username;
	private String password;
	
	
	public ATM() {
		
	}
	
	public ATM(String username, String password) {
		//super();
		this.username = username;
		this.password = password;
	}
	
	
	public boolean checkAuthentication() {
		if(username.equals("tanvir")  && password.equals("1234")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
