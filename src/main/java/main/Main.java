package main;

import config.AppConfig;
import dao.impl.UserLinkedListDao;
import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Service;

public class Main {

	private static int pom = 1;
	
	@Autowired
	User user;
	
	@Autowired
	Service<User> service;
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Main main = (Main) ctx.getBean("main");
		// dohvatio usera preko @Autowired
		main.make(main.user);
		main.service.saveUser(main.user);

		// dohvatam usera preko contexta
		// u oba slucaja i pored new() ne dobijam novog vec isti objekat
		// mozda dto...

		User user1 = (User) ctx.getBean("user");
		main.make(user1);
		main.service.saveUser(user1);

		User user2 = (User) ctx.getBean("user");
		main.make(user2);
		main.service.saveUser(user2);

		User user3 = (User) ctx.getBean("user");
		main.make(user3);
		main.service.saveUser(user3);

		main.service.printAll();
		
		
		

	}

	private User make(User user) {
		System.out.println("dosao" + user);
		String ime = "user";
		user.setFirstName(ime + pom);
		user.setLastName(ime + pom);
		user.setPassword(ime + pom);
		user.setUserName(ime + pom++);
		return user;
	}

	

	
}
