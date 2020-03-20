package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dao.Dao;
import model.User;
import service.Service;

@Component
public class UserServiceImpl implements Service<User> {
	@Autowired
	@Qualifier(value = "userArrayDao")
	private Dao<User> dao;

	public UserServiceImpl() {

	}

	public void saveUser(User user) {
		dao.save(user);
	}

	public void printAll() {
		dao.printAll();
	}

	public Dao<User> getDao() {
		return dao;
	}

	public void setDao(Dao<User> dao) {
		this.dao = dao;
	}
	
}
