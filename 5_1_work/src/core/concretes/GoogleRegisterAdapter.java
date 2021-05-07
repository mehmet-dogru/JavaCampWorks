package core.concretes;

import core.abstracts.RegisterService;
import google.GoogleRegister;

public class GoogleRegisterAdapter implements RegisterService {
	
	GoogleRegister googleRegister = new GoogleRegister();

	@Override
	public void registerToSystem(String email, String password) {
		googleRegister.register(email, password);
	}

	@Override
	public void loginToSystem(String email, String password) {
		googleRegister.login(email, password);
	}
	
}
