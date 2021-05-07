package business.concretes;

import java.util.Scanner;

import business.abstracts.MailService;
import entities.concretes.User;

public class MailManager implements MailService{

	@Override
	public void send(User user) {
		System.out.println("Do�rulama maili - " +user.getEmail() +" adresine g�nderildi.");
		Scanner code = new Scanner(System.in);
		System.out.println("Do�rulama kodunu giriniz: ");
		int codeText = code.nextInt();
		verifyMailController(user, codeText);
	}

	@Override
	public boolean verifyMailController(User user, int code) {
		if (code==1) {
			System.out.println("Hesab�n�z do�rulan�yor giri� sayfas�na y�nlendiriliyorsunuz");
			user.setVerification(true);
			return true;
		}
		
		System.out.println("Do�rulama yap�lamad�.");
		return false;
	}

}
