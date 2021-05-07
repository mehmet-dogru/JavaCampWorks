
import business.concretes.AuthManager;
import business.concretes.MailManager;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import core.concretes.GoogleRegisterAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleRegisterAdapter(), new MailManager(), new AuthManager(), new ValidationManager(new HibernateUserDao()));
		
		User user1 = new User(1,"Mehmet","Doðru","abc@gmail.com","123456");
		
		userManager.add(user1);
	
	}
}
