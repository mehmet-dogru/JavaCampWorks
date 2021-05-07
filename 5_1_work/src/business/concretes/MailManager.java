package business.concretes;

import java.util.Scanner;

import business.abstracts.MailService;
import entities.concretes.User;

public class MailManager implements MailService{

	@Override
	public void send(User user) {
		System.out.println("Doðrulama maili - " +user.getEmail() +" adresine gönderildi.");
		Scanner code = new Scanner(System.in);
		System.out.println("Doðrulama kodunu giriniz: ");
		int codeText = code.nextInt();
		verifyMailController(user, codeText);
	}

	@Override
	public boolean verifyMailController(User user, int code) {
		if (code==1) {
			System.out.println("Hesabýnýz doðrulanýyor giriþ sayfasýna yönlendiriliyorsunuz");
			user.setVerification(true);
			return true;
		}
		
		System.out.println("Doðrulama yapýlamadý.");
		return false;
	}

}
