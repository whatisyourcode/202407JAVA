package controller;

public class LoginCommand {
	
	private String email; 
	private String password;
	private boolean rememeberEmail;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isRememeberEmail() {
		return rememeberEmail;
	}
	public void setRememeberEmail(boolean rememeberEmail) {
		this.rememeberEmail = rememeberEmail;
	}
	
	
}
