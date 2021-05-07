package business.abstracts;

import entities.concretes.User;

public interface MailService {
	void send(User user);
	boolean verifyMailController(User user, int code); 
}
