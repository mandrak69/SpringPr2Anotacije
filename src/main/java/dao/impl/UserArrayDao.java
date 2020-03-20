package dao.impl;

import dao.Dao;
import model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserArrayDao implements Dao<User> {
	
    private final List<User> listOfUsers;

    public UserArrayDao() {
       listOfUsers = new ArrayList<User>();
    }

    public void save(User t) {
        listOfUsers.add(t);
    }

    public void printAll() {
        listOfUsers.stream().forEach(user -> {
            System.out.println(user.toString());
        });
    }

}
