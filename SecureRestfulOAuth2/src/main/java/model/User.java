package model;

public class User {

	private int UserId;
	private String UserFirstName;
	private String UserLastName;
	private String UserEmail;
	private String UserPassword;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserFirstName() {
		return UserFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		UserFirstName = userFirstName;
	}
	public String getUserLastName() {
		return UserLastName;
	}
	public void setUserLastName(String userLastName) {
		UserLastName = userLastName;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	
}
