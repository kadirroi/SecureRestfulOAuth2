package dao;

import java.util.List;

import model.User;

public interface UserDao {

	
	void insertUser(User user);
	void updateUser(User user);
	void removeUser(int userId);
	User getUser(int userId);
	List<User>usersList();
	
}
