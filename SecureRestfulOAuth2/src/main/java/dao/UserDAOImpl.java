package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


import model.User;

@Repository
public class UserDAOImpl extends JdbcDaoSupport implements UserDao {

	@Autowired
	public UserDAOImpl(DataSource dataSource) {

		setDataSource(dataSource);
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		getJdbcTemplate()
				.update("INSERT INTO USERS(UserFirstName,UserLastName,UserEmail,UserPassword)VALUES(?,?,?,?)",
						new Object[] { user.getUserFirstName(),
								user.getUserLastName(), user.getUserEmail(),
								user.getUserPassword() });

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> usersList() {
		// TODO Auto-generated method stub
		return null;
	}

}
