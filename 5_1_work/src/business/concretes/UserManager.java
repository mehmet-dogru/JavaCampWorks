package business.concretes;

import java.util.List;

import business.abstracts.AuthService;
import business.abstracts.MailService;
import business.abstracts.UserService;
import business.abstracts.ValidationService;
import core.abstracts.RegisterService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	RegisterService registerService;
	private MailService mailService;
	private AuthService authService;
	private ValidationService validationService;
	
	public UserManager(UserDao userDao, RegisterService registerService, MailService mailService,
			AuthService authService, ValidationService validationService) {
		super();
		this.userDao = userDao;
		this.registerService = registerService;
		this.mailService = mailService;
		this.authService = authService;
		this.validationService = validationService;
	}

	@Override
	public void add(User user) {
		if (validationService.verify(user)) {
			userDao.add(user);
			mailService.send(user);
			authService.login(user);
			System.out.println("Kayýt Baþarýlý");
		}
		else
			System.out.println("Kayýt baþarýsýz");
			
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}
	
	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
}
