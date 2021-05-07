package dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();
	 
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullan�c� veri taban�na eklendi " + user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� veri taban�ndan silindi " + user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� veri taban�ndan g�ncellendi " + user.getName());
	}

	@Override
	public List<User> getAll() {
		return users;
	}
	
	
	
}
