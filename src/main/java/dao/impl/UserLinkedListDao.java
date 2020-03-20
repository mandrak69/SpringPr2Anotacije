package dao.impl;

import dao.Dao;
import model.User;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserLinkedListDao implements Dao<User> {
	
    private final List<User> listOfUsers;

    public UserLinkedListDao() {
       listOfUsers = new LinkedList<User>();
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
