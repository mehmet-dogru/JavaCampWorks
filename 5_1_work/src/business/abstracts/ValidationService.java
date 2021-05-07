package business.abstracts;

import entities.concretes.User;

public interface ValidationService {
	
	boolean nameLastCheck(User user);
	boolean passwordCheck(User user);
	boolean mailCheck(User user, String mail);
	boolean verify(User user);
	
}
