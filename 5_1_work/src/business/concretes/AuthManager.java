package business.concretes;

import business.abstracts.AuthService;
import entities.concretes.User;

public class AuthManager implements AuthService{

	@Override
	public void login(User user) {
		if(user.isVerification()) {
			System.out.println("Giriþ baþarýlý");
			System.out.println("Hoþgeldiniz " + user.getName()+" "+user.getSurname());
		}
	}

}
