package business.abstracts;

import entities.concretes.User;

public interface AuthService {
	void login(User user);
}
