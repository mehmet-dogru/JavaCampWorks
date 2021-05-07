package business.concretes;

import business.abstracts.AuthService;
import entities.concretes.User;

public class AuthManager implements AuthService{

	@Override
	public void login(User user) {
		if(user.isVerification()) {
			System.out.println("Giri� ba�ar�l�");
			System.out.println("Ho�geldiniz " + user.getName()+" "+user.getSurname());
		}
	}

}
